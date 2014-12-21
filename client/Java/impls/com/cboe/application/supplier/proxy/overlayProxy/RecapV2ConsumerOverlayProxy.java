package com.cboe.application.supplier.proxy.overlayProxy;

import com.cboe.application.shared.ServicesHelper;
import com.cboe.application.supplier.proxy.RecapV2ConsumerProxy;
import com.cboe.idl.cmiCallbackV2.CMIRecapConsumer;
import com.cboe.idl.cmiConstants.QueueActions;
import com.cboe.idl.cmiMarketData.RecapStruct;
import com.cboe.infrastructureServices.foundationFramework.utilities.Log;
import com.cboe.interfaces.domain.session.BaseSessionManager;
import com.cboe.util.InvalidThreadPoolStateException;
import com.cboe.util.ThreadPool;
import com.cboe.util.channel.ChannelEvent;

public class RecapV2ConsumerOverlayProxy extends RecapV2ConsumerProxy
{
    protected RecapOverlayHelper overlayHelper;
    protected boolean isFinished = false;
    protected short action = QueueActions.OVERLAY_LAST;
    protected RecapOverlayThreadCommand command;
    protected ThreadPool threadPool;

    public RecapV2ConsumerOverlayProxy(CMIRecapConsumer recapConsumer, BaseSessionManager sessionManager)
    {
        super(recapConsumer, sessionManager, QueueActions.OVERLAY_LAST);
        overlayHelper = new RecapOverlayHelper();
    }

    public void initialize()
    {
        command = new RecapOverlayThreadCommand(this, overlayHelper);
        threadPool = ServicesHelper.getUserSessionMarketDataOverlayThreadPool(sessionManager);
    }


    public short getAction()
    {
        return action;
    }


    /**
     * This method is called by ChannelThreadCommand.  It takes the passed
     * EventChannelEvent, parses out the relevant data for the proxied object,
     * and calls the proxied objects callback method passing in the appropriate
     * data.
     *
     * @param event the ChannelEvent containing the data to send the listener.
     */
    public void channelUpdate(ChannelEvent event)
    {
        if (event != null)
        {
            RecapStruct[] recaps = (RecapStruct[])event.getEventData();
            int overlay = overlayHelper.addRecaps(recaps);
            if(overlay == 0)
            {
                try
                {
                    threadPool.schedule(command);
                }
                catch(InvalidThreadPoolStateException e)
                {
                    Log.exception("Exception in ThreadPool.schedule: " + e.getMessage(),e);
                }
            }
        }
    }

    public void cleanUp()
    {
        super.cleanUp();
        overlayHelper = null;
        command = null;
    }
}