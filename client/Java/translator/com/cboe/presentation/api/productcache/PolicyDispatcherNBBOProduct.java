//
// -----------------------------------------------------------------------------------
// Source file: PolicyDispatcherNBBOProduct.java
//
// PACKAGE: com.cboe.presentation.api.productcache
//
// -----------------------------------------------------------------------------------
// Copyright (c) 2000-2009 The Chicago Board Options Exchange. All Rights Reserved.
// -----------------------------------------------------------------------------------
package com.cboe.presentation.api.productcache;

import java.util.concurrent.TimeUnit;

import com.cboe.idl.cmiMarketData.NBBOStructV4;
import com.cboe.presentation.common.logging.GUILoggerBusinessProperty;
import com.cboe.presentation.common.logging.GUILoggerHome;
import com.cboe.util.ChannelKey;
import com.cboe.util.channel.ChannelEvent;

/**
 * Publisher policy used to publish to the IEC (channel {@link ProductCacheAPI#PUBLISH_NBBO_BY_PRODUCT})
 * the NBBO product from the product cache at a metronom pace 
 * defined by the SbtTraderGui.properties in the section cacheproduct.
 * 
 * @author Eric Maheo
 *
 */
public class PolicyDispatcherNBBOProduct extends AbstractPolicyDispatcherCommand<NBBOStructV4>
{

    /** Property name for the policy dispatcher NBBO product located in the productcache section of the SbtTraderGui.properties. */
    public static final String NBBO_V4_TIMER_PROPERTY = "nbboV4TimerMillis";
    /** Runnable that will execute the task. */
    private final Runnable runTask;
    
    public PolicyDispatcherNBBOProduct(){
        super(NBBO_V4_TIMER_PROPERTY);
        runTask = new Task();
    }
    
    @Override
    public void dispatchEvent(NBBOStructV4 event)
    {
        ChannelKey channelKey = new ChannelKey(ProductCacheAPI.PUBLISH_NBBO_BY_PRODUCT , event.productKey);
        ChannelEvent channelEvent = eventChannel.getChannelEvent(this, channelKey, event);
        eventChannel.dispatch(channelEvent);
    }


    @Override
    public void startDispatching()
    {
        if(GUILoggerHome.find().isInformationOn() &&
                GUILoggerHome.find().isPropertyOn(GUILoggerBusinessProperty.MARKET_QUERY))
             {
                 GUILoggerHome.find().information(getLoggingPrefix()+".startDispatching()",
                                           GUILoggerBusinessProperty.MARKET_QUERY,
                                           "starting the dispatcher");
             }
        TIMER.scheduleWithFixedDelay(runTask, START_DELAY, frequencyTask, TimeUnit.MILLISECONDS);
    }
    
    /**
     * Task that represent the policy and that is being executed by the timer.
     */
    private class Task implements Runnable {
        
        @Override
        public void run(){
            //query the cache and get the latest updates to dispatch them into IEC.
            try {
                NBBOStructV4[] list = (NBBOStructV4[]) ProductCacheAPI.getInstance().getNBBOProductCache().getLatestUpdates();
                for (NBBOStructV4 obj: list){
                    dispatchEvent(obj);
                }
            }catch (Throwable t){
                GUILoggerHome.find().exception(t);
            }
        }
    }
 
    /**
     * 
     * @return the name of the class.
     */
    private String getLoggingPrefix(){
        return "PolicyDispatcherNBBOProduct";
    }
}