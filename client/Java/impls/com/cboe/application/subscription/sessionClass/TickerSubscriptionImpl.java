package com.cboe.application.subscription.sessionClass;

import com.cboe.application.shared.ServicesHelper;
import com.cboe.application.subscription.SubscriptionAbstractCollection;
import com.cboe.exceptions.AuthorizationException;
import com.cboe.exceptions.CommunicationException;
import com.cboe.exceptions.DataValidationException;
import com.cboe.exceptions.SystemException;
import com.cboe.interfaces.domain.SessionKeyWrapper;
import com.cboe.interfaces.events.IECTickerConsumerHome;
import com.cboe.util.ChannelKey;
import com.cboe.util.ChannelType;

public class TickerSubscriptionImpl extends SessionClassSubscriptionImpl
{
    protected IECTickerConsumerHome tickerConsumerHome;

    public TickerSubscriptionImpl(SessionKeyWrapper sessionClass, SubscriptionAbstractCollection subscriptionCollection)
    {
        super(sessionClass, subscriptionCollection);
        tickerConsumerHome = ServicesHelper.getTickerConsumerHome();
    }
    public void subscribeChannel()
            throws SystemException, CommunicationException, AuthorizationException, DataValidationException
    {
        ChannelKey channelKey = new ChannelKey(ChannelType.TICKER_BY_CLASS, Integer.valueOf(sessionClass.getKey()));
        tickerConsumerHome.addFilter(channelKey);
        channelKey = new ChannelKey(ChannelType.TICKER_BY_CLASS_SEQ, Integer.valueOf(sessionClass.getKey()));
        tickerConsumerHome.addFilter(channelKey);
        setSubscriptionFlag(true);
    }

    public void unsubscribeChannel()
            throws SystemException, CommunicationException, AuthorizationException, DataValidationException
    {
        ChannelKey channelKey = new ChannelKey(ChannelType.TICKER_BY_CLASS, Integer.valueOf(sessionClass.getKey()));
        tickerConsumerHome.removeFilter(channelKey);
        channelKey = new ChannelKey(ChannelType.TICKER_BY_CLASS_SEQ, Integer.valueOf(sessionClass.getKey()));
        tickerConsumerHome.removeFilter(channelKey);
        setSubscriptionFlag(false);
    }
}