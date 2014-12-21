package com.cboe.interfaces.application;

import com.cboe.exceptions.DataValidationException;
import com.cboe.interfaces.domain.session.BaseSessionManager;
import com.cboe.util.channel.ChannelListener;

/**
 * This is the common interface for the CurrentMarketV3ConsumerProxyHome
 */
public interface CurrentMarketV3ConsumerProxyHome extends BaseProxyHome
{
    /**
     * Name that will be used for this home.
     */
    public final static String HOME_NAME = "CurrentMarketV3ConsumerProxyHome";

  /**
   * Creates an instance of the market data generator home.
   *
   * @return reference to ChannelListener -- > CurrentMarketConsumerProxy
   *
   */
  public ChannelListener create(com.cboe.idl.cmiCallbackV3.CMICurrentMarketConsumer consumer, BaseSessionManager sessionManager, short queuePolicy)
          throws DataValidationException;
}
