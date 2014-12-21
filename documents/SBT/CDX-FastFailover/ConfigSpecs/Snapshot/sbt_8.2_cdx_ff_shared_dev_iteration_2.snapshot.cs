# The CHECKEDOUT directive should always be first

element * CHECKEDOUT

#
# Only work on the /main in these vobs
element /models/... /main/LATEST
element /documents/... /main/LATEST
element /quality_assurance/... /main/LATEST
element /dte_admin/... /main/LATEST
element /api/... /main/LATEST
element /web_dte/... /main/LATEST
element /InfraVerity/documents/... /main/LATEST
element /InfraVerity/config_specs/... /main/LATEST
element /scripts/... /main/LATEST
element /SecurityService/release/certificates/... .../certificates/LATEST
element /SecurityService/release/certificates/... /main/LATEST

element * COMPONENT
element * JDK_SOLARIS_1.6.0_13 -nocheckout
element * JDK_x86_1.6.0_13     -nocheckout
element * JDK_SOLARIS_1.5.0_18 -nocheckout
element * JDK_x86_1.5.0_18     -nocheckout
element * JRE_WINDOWS_MOD1_1.6.0_10 -nocheckout
element * JRE_WINDOWS_MOD1_1.5.0_08 -nocheckout
element * JRE_WINDOWS_MOD1_1.5.0_03  -nocheckout

###############################################################################
# Excerpt from QAIDLBASE_INITIAL_RELEASE_0.1.14.unix.cs - BEGIN
# Resolves dependency on 
# /dte_admin/config_specs/idlbase/QAIDLBASE_INITIAL_RELEASE_0.1.14.unix.cs
###############################################################################
element * .../idlbase_0.1_initial_release/QAIDLBASE_INITIAL_RELEASE_0.1.14 -nocheckout
element * /main/IDLBASE_0.1 -nocheckout
element /idlbase/... /main/0 -nocheckout
################################################################################
# Excerpt from QAIDLBASE_INITIAL_RELEASE_0.1.14.unix.cs - END
################################################################################

###############################################################################
# Excerpt from QACMI_RELEASE_ONE_0.13.6.unix.cs - BEGIN
# Resolves depdency on /dte_admin/config_specs/cmi/QACMI_RELEASE_ONE_0.13.6.unix.cs
###############################################################################
element * .../cmi_0.13_release_one/QACMI_RELEASE_ONE_0.13.6 -nocheckout
element * /main/QACMI_0.13 -nocheckout
element /cmi/... /main/0 -nocheckout
################################################################################
# Excerpt from QACMI_RELEASE_ONE_0.13.6.unix.cs - END
################################################################################

################################################################################
# EXCERPT FROM QAINFRA_THIRTEEN_ONE_13.0.4.7.unix.cs - BEGIN
# Resolves depdency on 
# /dte_admin/config_specs/infra/QAINFRA_THIRTEEN_ONE_13.0.3.47.unix.cs
################################################################################
element * FRAMEWORK_1.5.0            -nocheckout
element * GRIZZLY_FRAMEWORK_1.9.5    -nocheckout
element * GRIZZLY_FRAMEWORK_1.9.0    -nocheckout
element * AUTHAPI_5.0.3.172          -nocheckout
element * JETTY_6.1.11

element * .../infra_11.2_thirteen_one/QAINFRA_THIRTEEN_ONE_13.0.4.7 -nocheckout
element * .../infra_13.0_crit/QAINFRA_CRIT_13.0.4 -nocheckout
element * /main/QAINFRA_13.0 -nocheckout

element * /main/QAINFRA_12.0 -nocheckout
element SessionManagementService/... /main/0 -nocheckout
element /DirectoryService/... /main/0 -nocheckout
element /build/... /main/0 -nocheckout
element /LoggingService/... /main/0 -nocheckout
element /tools/... /main/0 -nocheckout
element /common/... /main/0 -nocheckout
element /SecurityService/... /main/0 -nocheckout
element /Rollout/... /main/0 -nocheckout
element /objectwave/... /main/0 -nocheckout
element /SystemManagement/... /main/0 -nocheckout
element /MessagingSystem/... /main/0 -nocheckout
element /InfraVerity/... /main/0 -nocheckout
element /infrastructure/... /main/0 -nocheckout
element /FoundationFramework/... /main/0 -nocheckout

################################################################################
# EXCERPT FROM QAINFRA_THIRTEEN_ONE_13.0.4.7.unix.cs - END
################################################################################

###############################################################################
# Excerpt from QAMSGCODEC_RELEASE_ONE_0.0.11.unix.cs - BEGIN
# Resolves depdency on
# /dte_admin/config_specs/msgcodec/QAMSGCODEC_RELEASE_ONE_0.0.11.unix.cs
###############################################################################
element * .../msgcodec_0.0_release_one/QAMSGCODEC_RELEASE_ONE_0.0.11 -nocheckout
element * /main/MSGCODEC_0.0 -nocheckout
element MsgCodec/... /main/0 -nocheckout
###############################################################################
# Excerpt from QAMSGCODEC_RELEASE_ONE_0.0.11.unix.cs - END
###############################################################################

##########################################
#### Third party includes

element * JGL_3.1.0                  -nocheckout
element * COMMONS_NET_1.4.0
element * STYLEREPORTPRO_7.0         -nocheckout
element * JAVAMAIL_1.3.2
element * APACHE_ANT_1.6.2           -nocheckout
element * CRIMSON_1.1.3              -nocheckout
element * COMMONS_NET_1.4.0          -nocheckout
element * COMMONS_DIGESTER_1.7       -nocheckout
element * COMMONS_BEANUTILS_1.7.0    -nocheckout
element * COMMONS_COLLECTIONS_3.1    -nocheckout
element * COMMONS_LOGGING_1.0.4      -nocheckout
element * ITEXT_1.3                  -nocheckout
element * POI_2.5.1                  -nocheckout
element * JFREE_JCOMMON_1.0.0_RC1    -nocheckout
element * JFREE_JFREECHART_1.0.0_RC1 -nocheckout
element * JASPERREPORTS_MOD1_3.0.5   -nocheckout
element * JASPERREPORTS_3.0.5        -nocheckout
element * SQL92_PARSER_1.0.2         -nocheckout
element * INSTALLANYWHERE_MOD1_7.1.3 -nocheckout
element * JCACHE_1.0_DEV_3           -nocheckout
element * EHCACHE_1.2.4              -nocheckout
element * JUNIT_4.7                  -nocheckout
element * MOCKITO_1.8.2              -nocheckout

# CFN STOCK NASDAQ
element * QACFNSTOCKIDL_0.0             -nocheckout

##########################################
# APPIA RELEASE TO USE
##########################################

element /appia/... APPIA_3.2

##########################################
# HAPS - note that it is /vobs/cboe/printing
##########################################
element /printing/... QAHAPS_2.5
##########################################
# HAPS - note that it is /vobs/cboe/printing
##########################################

#This is temporary for development, should be above when integrated
element /appia/... /main/APPIA_1.0.13
element /appia/... /main/0

#BRANCH
element * .../sbt_8.2_cdx_ff_shared_dev_iteration_2/LATEST

mkbranch sbt_8.2_cdx_ff_shared_dev_iteration_2
element * .../sbt_8.2_fast_failover_shared_dev/LATEST
end mkbranch sbt_8.2_cdx_ff_shared_dev_iteration_2

mkbranch sbt_8.2_cdx_ff_shared_dev_iteration_2
element * .../sbt_8.0_help_desk_enhancements/SBT_HELP_DESK_ENHANCEMENTS_8.2.91.2.6
end mkbranch sbt_8.2_cdx_ff_shared_dev_iteration_2

mkbranch sbt_8.2_cdx_ff_shared_dev_iteration_2
element * .../sbt_8.1_eight_three_integ/CBOEDIR_EIGHT_THREE_INTEG_8.2.91.2
end mkbranch sbt_8.2_cdx_ff_shared_dev_iteration_2

mkbranch sbt_8.2_cdx_ff_shared_dev_iteration_2
element * .../sbt_8.2_crit/CBOEDIR_CRIT_8.2.91
end mkbranch sbt_8.2_cdx_ff_shared_dev_iteration_2

mkbranch sbt_8.2_cdx_ff_shared_dev_iteration_2
element * /main/CBOEDIR_8.2
element /domain/... /main/0
element /server/... /main/0
element /sysAdminClient/... /main/0
element /simulator/... /main/0
element /client/... /main/0
element /gui/... /main/0
element /linkage/... /main/0
element /fixclient/... /main/0
element /coppelia/... /main/0
element /stock/... /main/0
element /FixAppia/... /main/0
element /cfix/... /main/0
element /sbtcommon/... /main/0
element /serverptd/... /main/0
element /ohs/... /main/0
element /CommonFacilities/... /main/0
element /appServices/... /main/0
element /eis/... /main/0
element /applappl/... /main/0
element /connectionServer/... /main/0
element /message/... /main/0
element /ecMonitor/... /main/0
element /jcache/... /main/0
end mkbranch sbt_8.2_cdx_ff_shared_dev_iteration_2

################################################################################
# Load Rules
################################################################################
load \appia\lib\appia.jar
load \appia\lib\appia_oe.jar
load \appia\lib\apping2.jar
load \appia\lib\configurator.jar
load \appia\lib\fixometer.jar
load \appia\lib\jdom.jar
load \appia\lib\jython.jar
load \appia\lib\xercesImpl.jar
load \appia\lib\xml-apis.jar
load \appia\lib\protocols\FIX.jar
load \printing\release\hapsIDL.jar
load \IDL\cfn\stock\release
load \client\release\client_idl.jar
load \client\release\client_impls.jar
load \client\release\client_internal_idl.jar
load \client\release\client_interceptors.jar
load \client\release\client_interfaces.jar
load \common\release\jars\common.jar
load \DirectoryService\release\jars\DirectoryService.jar
load \FoundationFramework\release\jars\FoundationFramework.jar
load \infrastructure\release\ffimpl.jar
load \infrastructure\release\ffpersist.jar
load \infrastructure\release\infrastructure.jar
load \InfraVerity\release\jars\InfraUtility.jar
load \InfraVerity\release\jars\InfraVerity.jar
load \InfraVerity\release\jars\InfraVerityIDL.jar
load \InfraVerity\release\jars\InfraVerityIDLClasses.jar
load \InfraVerity\release\jars\js.jar
load \InfraVerity\release\jars\jstools.jar
load \InfraVerity\release\jars\ojdbc14.jar
load \InfraVerity\release\jars\testclasses12.jar
load \LoggingService\release\jars\LoggingService.jar
load \LoggingService\release\jars\LoggingServiceIDLClasses.jar
load \MessagingSystem\release\jars\MessagingSystem.jar
load \MessagingSystem\release\jars\MessagingSystemIDL.jar
load \objectwave\release\objectwave.jar
load \Rollout\release
load \SecurityService\release\jars\SecurityAdminServiceHelp.jar
load \SecurityService\release\jars\SecurityService.jar
load \SecurityService\release\jars\SecurityServiceIDLClasses.jar
load \SessionManagementService\release\SessionManagementService.jar
load \SystemManagement\release\jars\SystemManagement.jar
load \SystemManagement\release\jars\SystemManagementIDLClasses.jar
load \tools\hsqldb\hsqldb.jar
load \tools\jakarta\jakarta-oro-2.0.6.jar
load \tools\jakarta\jakarta-regexp-1.2.jar
load \tools\java\classes\concurrency.jar
load \tools\java\jars\activation.jar
load \tools\java\jars\fscontext.jar
load \tools\java\jars\jawall.jar
load \tools\java\jars\jhall.jar
load \tools\java\jars\jndi.jar
load \tools\java\jars\junit37.jar
load \tools\java\jars\mail.jar
load \tools\java\jars\providerutil.jar
load \tools\java\jars\xml4j.jar
load \tools\java\jms1.0.2b\lib
load \tools\jgl\jars
load \tools\NBIO\nbio-release\seda\jars
load \tools\netscape
load \tools\XMLParser\JWSDP-1.3\jaxb\lib\jaxb-api.jar
load \tools\Jetty\Jetty-5.1.1\lib
load \cmi\release\jars\cmi_idl.jar
load \idlbase\omg\release\jars\OMGServiceClasses.jar
load \idlbase\omg\release\jars\OMGBaseClasses.jar
load \idlbase\idlcompiler\release
load \jcache\release
load \MsgCodec\release
load \ohs\integration\interfaces
load \ohs\integration\impls
load \ohs\drivers\impls
load \ohs\domain\interfaces
load \ohs\domain\impls
load \ohs\core\common
load \sysAdminClient\Java
load \sysAdminClient\ics\release\ics_idl.jar
load \sysAdminClient\release\sysAdminClient_idl.jar
load \simulator\Java
load \serverptd\Java
load \linkage\Java\integrationServices\serviceAdapters\businessServices
load \linkage\Java\integrationServices\serviceAdapters\appia
load \linkage\Java\integrationServices\messageHandlerFramework
load \linkage\Java\integrationServices\fixUtilities
load \linkage\Java\interfaces
load \linkage\Java\impls
load \server\Java\test
load \server\Java\interceptors
load \server\Java\status
load \server\Java\proxies
load \server\Java\impls
load \server\message\Java
load \server\eis\Java
load \server\connectionServer\Java
load \server\applappl\Java
load \server\Java\extensions-impls
load \server\Java\extensions
load \server\Java\common
load \server\Java\interfaces
load \server\release\server_idl.jar
load \CommonFacilities\Java
load \domain\Java
load \domain\event\Java
load \domain\event\release\event_impls.jar
load \domain\event\release\event_idl.jar
load \domain\release\domain_xml.jar
load \domain\release\domain_idl.jar
load \server\ecMonitor\Java
load \server\release\server_interceptors.jar
load \server\message\release
load \tools\release\jars
load \tpt_tools\jcache\run_dir\jcache.jar
load \tpt_tools\ehcache\run_dir\ehcache.jar
load \ohs\lib
load \server\properties
load \FoundationFramework\Java
load \ohs\properties
