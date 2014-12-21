package com.cboe.consumers.internalPresentation;

import com.cboe.idl.cmiCallback.*;
import com.cboe.util.*;
import com.cboe.util.event.*;
import com.cboe.infrastructureServices.foundationFramework.*;
import com.cboe.interfaces.internalCallback.*;
import com.cboe.presentation.common.logging.GUILoggerHome;

/**
 * Factory used to create CMIRecapConsumers.
 *
 * @author Keith A. Korecky
 * @version 06/29/1999
 */

public class RecapConsumerFactory
{
    /**
     * RecapConsumerFactory constructor.
     *
     * @author Keith A. Korecky
     */
    public RecapConsumerFactory()
    {
        super();
    }

    /**
     * This method creates a new CMIRecapConsumer callback Corba object.
     *
     * @author Keith A. Korecky
     *
     * @param channelType the event channel type to publish on.
     * @param eventProcessor the event channel to publish on.
     */
    public static CMIRecapConsumer create(EventChannelAdapter eventProcessor)
    {
        try
        {
            RecapConsumer recapConsumer = new RecapConsumerImpl(eventProcessor);
            POA_CMIRecapConsumer_tie poaObj = new POA_CMIRecapConsumer_tie(recapConsumer);
            return CMIRecapConsumerHelper.narrow(POAHelper.connect(poaObj, null));
        }
        catch (Exception e)
        {
            GUILoggerHome.find().exception(e, "RecapConsumerFactory.create");
            return null;
        }
    }
}
