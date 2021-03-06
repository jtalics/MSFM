package com.cboe.application.subscription.test;

import com.cboe.domain.util.SessionKeyContainer;
import com.cboe.exceptions.DataValidationException;
import com.cboe.idl.cmiErrorCodes.DataValidationCodes;
import com.cboe.interfaces.application.subscription.SubscriptionService;
import com.cboe.application.shared.ServicesHelper;
import junit.framework.Test;
import junit.framework.TestSuite;

public class UnitTestRecapSubscription extends UnitTestSessionClassSubscription
{
    public void testSingleListenerForProductSubscriptionReject()
            throws Exception
    {
        Object listener = new Object();
        subscriptionService.addRecapClassInterest(listener,sessionName,classKey);
        assertChannelSubscriptionTrue();
        try
        {
            subscriptionService.addRecapProductInterest(listener,sessionName,classKey,productKey);
            fail("Should raise an DataValidationException");
        }
        catch(DataValidationException expected)
        {
            if(expected.details.error != DataValidationCodes.LISTENER_ALREADY_REGISTERED)
            {
                fail("Should contain error code:"+DataValidationCodes.LISTENER_ALREADY_REGISTERED);
            }
            else
            {
                assertTrue(true);
            }
        }
        subscriptionService.removeRecapProductInterest(listener,sessionName,classKey,productKey);
        assertChannelSubscriptionTrue();
        subscriptionService.removeRecapClassInterest(listener,sessionName,classKey);
        assertChannelSubscriptionFalse();
    }

    public void testSingleListenerForClassSubscriptionReject()
            throws Exception
    {
        Object listener = new Object();
        subscriptionService.addRecapProductInterest(listener,sessionName,classKey,productKey);
        assertChannelSubscriptionTrue();
        try
        {
            subscriptionService.addRecapClassInterest(listener,sessionName,classKey);
            fail("Should raise an DataValidationException");
        }
        catch(DataValidationException expected)
        {
            if(expected.details.error != DataValidationCodes.LISTENER_ALREADY_REGISTERED)
            {
                fail("Should contain error code:"+DataValidationCodes.LISTENER_ALREADY_REGISTERED);
            }
            else
            {
                assertTrue(true);
            }
        }
        subscriptionService.removeRecapProductInterest(listener,sessionName,classKey,productKey);
        assertChannelSubscriptionFalse();
    }

    public void testSingleListenerForProductSubAndClassUnSub()
            throws Exception
    {
        Object listener = new Object();
        subscriptionService.addRecapProductInterest(listener,sessionName,classKey,productKey);
        assertChannelSubscriptionTrue();
        subscriptionService.addRecapProductInterest(listener,sessionName,classKey,productKey+2);
        assertChannelSubscriptionTrue();
        subscriptionService.removeRecapClassInterest(listener,sessionName,classKey);
        assertChannelSubscriptionFalse();
    }

    public void testMultipleProductSubscriptions()
            throws Exception
    {
        Object listener = new Object();
        subscriptionService.addRecapProductInterest(listener,sessionName,classKey,productKey);
        assertChannelSubscriptionTrue();
        subscriptionService.addRecapProductInterest(listener,sessionName,classKey,productKey+2);
        assertChannelSubscriptionTrue();
        subscriptionService.removeRecapProductInterest(listener,sessionName,classKey,productKey);
        assertChannelSubscriptionTrue();
        subscriptionService.removeRecapProductInterest(listener,sessionName,classKey,productKey+2);
        assertChannelSubscriptionFalse();
        subscriptionService.addRecapProductInterest(listener,sessionName,classKey,productKey);
        assertChannelSubscriptionTrue();
        subscriptionService.addRecapProductInterest(listener,sessionName,classKey,productKey+2);
        assertChannelSubscriptionTrue();
        subscriptionService.removeRecapClassInterest(listener,sessionName,classKey);
        assertChannelSubscriptionFalse();
    }

    public void testMultipleListenersForClassSubscription()
            throws Exception
    {
        Object listener1 = new Object();
        subscriptionService.addRecapClassInterest(listener1,sessionName,classKey);
        assertChannelSubscriptionTrue();
        Object listener2 = new Object();
        subscriptionService.addRecapClassInterest(listener2,sessionName,classKey);
        assertChannelSubscriptionTrue();
        subscriptionService.removeRecapClassInterest(listener1, sessionName, classKey);
        assertChannelSubscriptionTrue();
        subscriptionService.removeRecapClassInterest(listener2, sessionName, classKey);
        assertChannelSubscriptionFalse();
    }

    public void testMultipleGroupSubscription()
            throws Exception
    {
        SubscriptionService subscriptionService2 = getNewSubscriptionService();
        Object listener1 = new Object();
        subscriptionService.addRecapClassInterest(listener1,sessionName,classKey);
        assertChannelSubscriptionTrue();
        Object listener2 = new Object();
        subscriptionService2.addRecapClassInterest(listener2,sessionName,classKey);
        assertChannelSubscriptionTrue();
        subscriptionService.removeRecapClassInterest(listener1,sessionName,classKey);
        assertChannelSubscriptionTrue();
        subscriptionService2.removeRecapClassInterest(listener2,sessionName,classKey);
        assertChannelSubscriptionFalse();
    }

    public void testDefaultSubscription()
            throws Exception
    {
        Object listener = new Object();
        assertTrue(subscriptionCollectionService.getSessionClassSubscriptionCollection(new SessionKeyContainer(sessionName,classKey)).getTextMessagingSubscription().isDefaultSubscription());
        subscriptionService.addRecapClassInterest(listener,sessionName,classKey);
        assertTrue(subscriptionCollectionService.getSessionClassSubscriptionCollection(new SessionKeyContainer(sessionName,classKey)).getTextMessagingSubscription().channelSubscribed());
        subscriptionService.removeRecapClassInterest(listener,sessionName,classKey);
        assertFalse(subscriptionCollectionService.getSessionClassSubscriptionCollection(new SessionKeyContainer(sessionName,classKey)).getTextMessagingSubscription().channelSubscribed());
        subscriptionService.addSessionClassInterest(listener, sessionName, classKey);
        assertTrue(subscriptionCollectionService.getSessionClassSubscriptionCollection(new SessionKeyContainer(sessionName,classKey)).getTextMessagingSubscription().channelSubscribed());
        subscriptionService.addRecapClassInterest(listener,sessionName,classKey);
        assertTrue(subscriptionCollectionService.getSessionClassSubscriptionCollection(new SessionKeyContainer(sessionName,classKey)).getTextMessagingSubscription().channelSubscribed());
        subscriptionService.removeRecapClassInterest(listener,sessionName,classKey);
        assertTrue(subscriptionCollectionService.getSessionClassSubscriptionCollection(new SessionKeyContainer(sessionName,classKey)).getTextMessagingSubscription().channelSubscribed());
        subscriptionService.removeSessionClassInterest(listener, sessionName, classKey);
        assertFalse(subscriptionCollectionService.getSessionClassSubscriptionCollection(new SessionKeyContainer(sessionName,classKey)).getTextMessagingSubscription().channelSubscribed());
        SubscriptionService subscriptionService2 = getNewSubscriptionService();
        Object listener2 = new Object();
        subscriptionService2.addRecapClassInterest(listener2,sessionName,classKey);
        assertTrue(subscriptionCollectionService.getSessionClassSubscriptionCollection(new SessionKeyContainer(sessionName,classKey)).getTextMessagingSubscription().channelSubscribed());
        subscriptionService.addRecapClassInterest(listener, sessionName, classKey);
        subscriptionService2.removeRecapClassInterest(listener2, sessionName, classKey);
        assertTrue(subscriptionCollectionService.getSessionClassSubscriptionCollection(new SessionKeyContainer(sessionName,classKey)).getTextMessagingSubscription().channelSubscribed());
        subscriptionService.removeRecapClassInterest(listener, sessionName, classKey);
        assertFalse(subscriptionCollectionService.getSessionClassSubscriptionCollection(new SessionKeyContainer(sessionName,classKey)).getTextMessagingSubscription().channelSubscribed());
    }

    public void testCleanUp()
            throws Exception
    {
        Object listener = new Object();
        subscriptionService.addRecapClassInterest(listener, sessionName, classKey);
        assertChannelSubscriptionTrue();
        assertTrue(subscriptionCollectionService.getSessionClassSubscriptionCollection(new SessionKeyContainer(sessionName,classKey)).getTextMessagingSubscription().channelSubscribed());
        ServicesHelper.getSubscriptionServiceHome().remove(sessionManager);
        assertFalse(subscriptionCollectionService.getSessionClassSubscriptionCollection(new SessionKeyContainer(sessionName,classKey)).getAuctionSubscription().channelSubscribed());
        assertFalse(subscriptionCollectionService.getSessionClassSubscriptionCollection(new SessionKeyContainer(sessionName,classKey)).getTextMessagingSubscription().channelSubscribed());
        assertFalse(subscriptionCollectionService.getUserSubscriptionCollection(userStructV2).getOrderSubscription().channelSubscribed());
        assertFalse(subscriptionCollectionService.getUserSubscriptionCollection(userStructV2).getQuoteSubscription().channelSubscribed());
        assertFalse(subscriptionCollectionService.getUserSubscriptionCollection(userStructV2).getUserTimeoutWarningSubscription().channelSubscribed());
        assertFalse(subscriptionCollectionService.getUserSubscriptionCollection(userStructV2).getPropertySubscription().channelSubscribed());
        assertFalse(subscriptionCollectionService.getUserSubscriptionCollection(userStructV2).getTextMessagingSubscription().channelSubscribed());
        assertFalse(subscriptionCollectionService.getProductTypeSubscriptionCollection(productType).getTextMessagingSubscription().channelSubscribed());
        assertFalse(subscriptionCollectionService.getFirmSubscriptionCollection(exchangeFirmStructContainer).getOrderSubscription().channelSubscribed());
        assertFalse(subscriptionCollectionService.getFirmSubscriptionCollection(exchangeFirmStructContainer).getQuoteSubscription().channelSubscribed());
    }

    protected void assertChannelSubscriptionTrue()
    {
        assertTrue(subscriptionCollectionService.getSessionClassSubscriptionCollection(new SessionKeyContainer(sessionName,classKey)).getRecapSubscription().channelSubscribed());
    }

    protected void assertChannelSubscriptionFalse()
    {
        assertFalse(subscriptionCollectionService.getSessionClassSubscriptionCollection(new SessionKeyContainer(sessionName,classKey)).getRecapSubscription().channelSubscribed());
    }

    public static Test suite() {
        return new TestSuite(UnitTestRecapSubscription.class);
    }
}
