package com.cboe.application.supplier;

import com.cboe.domain.supplier.BaseSupplier;
import com.cboe.application.supplier.proxy.RecapConsumerProxy;
import com.cboe.interfaces.domain.session.BaseSessionManager;
/**
 * RecapSupplier extends the ChannelAdapter framework to provide a multithreaded
 * multichanneled event dispatcher functionality to the CAS callback supplier.
 *
 * It is important to note that the channel key can be any hashable object.
 *
 * @author Keith A. Korecky
 * @version 06/29/1999
 */

public class RecapSupplier extends UserSessionMarketDataBaseSupplier
{
    public RecapSupplier(BaseSessionManager sessionManager)
    {
        super(sessionManager);
    }

    public String getListenerClassName()
    {
        return RecapConsumerProxy.class.getName();
    }
}
