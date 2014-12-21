package com.cboe.application.cas;

import com.cboe.interfaces.application.UserAccessV6;
import com.cboe.interfaces.application.SessionManagerV6;
import com.cboe.idl.cmiUser.UserLogonStruct;
import com.cboe.idl.cmiCallback.CMIUserSessionAdmin;
import com.cboe.idl.cmiConstants.LoginSessionTypes;
import com.cboe.idl.cmiConstants.UserRoles;
import com.cboe.idl.cmiErrorCodes.AuthenticationCodes;
import com.cboe.idl.user.SessionProfileUserStructV2;
import com.cboe.idl.cmiV6.UserSessionManagerV6Helper;
import com.cboe.idl.cmiV6.UserSessionManagerV6;
import com.cboe.exceptions.*;
import com.cboe.infrastructureServices.foundationFramework.utilities.Log;
import com.cboe.infrastructureServices.foundationFramework.BOHome;
import com.cboe.util.ExceptionBuilder;
import com.cboe.application.shared.ServicesHelper;
import com.cboe.application.shared.POANameHelper;
import com.cboe.application.shared.RemoteConnectionFactory;
import com.cboe.delegates.application.UserSessionManagerV6Delegate;

/**
 * Created by IntelliJ IDEA.
 * User: beniwalv
 * Date: Oct 26, 2007
 */
public class UserAccessV6Impl extends UserAccessBaseImpl implements UserAccessV6{

    public UserAccessV6Impl(char sessionMode, int heartbeatTimeout, String cmiVersion) {
		super(sessionMode, heartbeatTimeout, cmiVersion);
	}

    public UserSessionManagerV6 logon(UserLogonStruct logonStruct, short sessionType,
                                      CMIUserSessionAdmin cmiListener, boolean gmdTextMessaging)
				 throws  SystemException, CommunicationException, AuthorizationException,
                         AuthenticationException, DataValidationException, NotFoundException
    {
        if (Log.isDebugOn())
        {
            Log.debug(this, "Logging on user = " + logonStruct.userId + " login mode = " + logonStruct.loginMode
                    + " sessionType = " + sessionType + " gmdTextMessage = " + gmdTextMessaging);
        }

        int sessionKey;
        String sessionId;
        CMIUserSessionAdmin clientListener;
        SessionManagerV6      sessionManager;

        boolean sessionCreated = false;
		UserLogonHelper.checkLogoutInProgressPreLogin(logonStruct.userId);
		// check if CAS is initialized and business day is started
		UserLogonHelper.checkValidCASState(true);
		// check heartbeat callback
		clientListener = checkValidListener(cmiListener);
		// check cmi version and login mode
		checkLogonStruct(logonStruct);
		// verify user password
		sessionId = UserLogonHelper.verifyPassword(logonStruct);
		sessionKey = UserLogonHelper.registerWithSMS(logonStruct, sessionId);
		try
		{
		    sessionManager = createUserSessionManagerV6(logonStruct, sessionId, sessionKey,
		                                                                   clientListener, gmdTextMessaging, sessionType);
		    sessionCreated = true;
		    return bindUserSession(sessionManager);
		}
		catch(SystemException e)
		{
		    Log.exception(this, "user:" + logonStruct.userId, e);
		    UserLogonHelper.cleanupSession(clientListener, sessionKey);
		    throw e;
		}
		catch(CommunicationException e)
		{
		    Log.exception(this, "user:" + logonStruct.userId, e);
		    UserLogonHelper.cleanupSession(clientListener, sessionKey);
		    throw e;
		}
		catch(AuthorizationException e)
		{
		    Log.exception(this, "user:" + logonStruct.userId, e);
		    UserLogonHelper.cleanupSession(clientListener, sessionKey);
		    throw e;
		}
		catch(DataValidationException e)
		{
		    Log.exception(this, "user:" + logonStruct.userId, e);
		    UserLogonHelper.cleanupSession(clientListener, sessionKey);
		    throw e;
		}
		catch(org.omg.CORBA.NO_PERMISSION e)
		{
		    Log.exception(this, "user:" + logonStruct.userId, e);
		    UserLogonHelper.cleanupSession(clientListener, sessionKey);
		    throw ExceptionBuilder.authenticationException("User not authorized to login",
		                                                   AuthenticationCodes.UNKNOWN_USER);
		}
		catch(NotFoundException e)
		{
		    Log.exception(this, "user:" + logonStruct.userId, e);
		    UserLogonHelper.cleanupSession(clientListener, sessionKey);
		    throw ExceptionBuilder.authenticationException("User not found", AuthenticationCodes.UNKNOWN_USER);
		}
		catch(Exception e)
		{
		    Log.exception(this, "user:" + logonStruct.userId, e);
		    UserLogonHelper.cleanupSession(clientListener, sessionKey);
		    throw ExceptionBuilder.systemException("Fatal exception during logon", 0);
		}
		finally
		{
		    UserLogonHelper.checkLogoutInProgressPostLogin(logonStruct.userId, clientListener, sessionKey,
		                                                   sessionCreated);
		}

	}

	protected SessionManagerV6 createUserSessionManagerV6(UserLogonStruct logonStruct, String sessionId,
												            int sessionKey, CMIUserSessionAdmin clientListener,
												            boolean gmdTextMessaging, short sessionType)
				throws SystemException, CommunicationException, AuthorizationException,
					   NotFoundException, DataValidationException
    {

        if (Log.isDebugOn())
        {
            Log.debug(this, "Getting user settings for " + logonStruct.userId + " from the user service");
        }
        SessionProfileUserStructV2 sessionProfileUser = ServicesHelper.getUserService().getSessionProfileUserInformationV2(logonStruct.userId);

        //OMT users are not permitted to login as secondary session login types
        if(sessionProfileUser.userInfo.role == UserRoles.BOOTH_OMT || sessionProfileUser.userInfo.role == UserRoles.CROWD_OMT || sessionProfileUser.userInfo.role == UserRoles.DISPLAY_OMT || sessionProfileUser.userInfo.role == UserRoles.HELP_DESK_OMT)
        {
        	if(sessionType == LoginSessionTypes.SECONDARY)
        	{
        		throw ExceptionBuilder.authorizationException("OMT users are not permitted to login using secondary login types", 0);
        	}
        }

        if (Log.isDebugOn())
        {
            Log.debug(this, "Creating CAS V6 session for user " + logonStruct.userId);
        }
        SessionManagerV6 sessionManager = ServicesHelper.createSessionManagerV6(sessionProfileUser, sessionId, sessionKey,
        																		  clientListener, sessionType, gmdTextMessaging);
        // SPOW
        registerSPOWHeartBeatCallback();

        StringBuilder successful = new StringBuilder(logonStruct.userId.length()+35);
        successful.append("CAS login successful for user ").append(logonStruct.userId);
        Log.information(this, successful.toString());
        return sessionManager;

	}

	protected UserSessionManagerV6 bindUserSession(SessionManagerV6 sessionManager)
    		throws  SystemException, CommunicationException, AuthorizationException,
    				AuthenticationException, DataValidationException
    {
		UserSessionManagerV6Delegate delegate = new UserSessionManagerV6Delegate(sessionManager);
        // Get the existing POA name
		String poaName = POANameHelper.getPOAName((BOHome) ServicesHelper.getSessionManagerHome());
        // Connect to POA and activate CORBA servant
		org.omg.CORBA.Object obj = (org.omg.CORBA.Object) RemoteConnectionFactory.find().register_object(delegate, poaName);
        // Register with RemoteSessionManagerHome
		UserSessionManagerV6 corbaObj = UserSessionManagerV6Helper.narrow(obj);
		sessionManager.setRemoteDelegate(corbaObj);
        return corbaObj;
	}

}