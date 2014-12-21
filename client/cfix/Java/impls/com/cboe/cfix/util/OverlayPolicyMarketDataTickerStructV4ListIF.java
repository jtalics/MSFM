package com.cboe.cfix.util;

import com.cboe.interfaces.cfix.OverlayPolicyMarketDataListIF;
import com.cboe.interfaces.cfix.CfixMarketDataConsumer;
import com.cboe.idl.cmiMarketData.TickerStructV4;
import com.cboe.exceptions.*;

/**
 * Created by IntelliJ IDEA.
 * User: Beniwalv
 * Date: Aug 1, 2010
 * Time: 8:21:57 AM
 * To change this template use File | Settings | File Templates.
 */
public interface OverlayPolicyMarketDataTickerStructV4ListIF extends OverlayPolicyMarketDataListIF
{
    public void add(CfixMarketDataConsumer cfixMarketDataConsumer, TickerStructV4 struct) throws SystemException, CommunicationException, AuthorizationException, DataValidationException, NotFoundException;
    public void add(CfixMarketDataConsumer cfixMarketDataConsumer, TickerStructV4[] structs, int offset, int length) throws SystemException, CommunicationException, AuthorizationException, DataValidationException, NotFoundException;
}
