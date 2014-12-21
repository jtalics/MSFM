package com.cboe.application.supplier.proxy;

import com.cboe.domain.instrumentorExtension.MethodInstrumentorExtension;
import com.cboe.domain.instrumentorExtension.MethodInstrumentorExtensionFactory;
import com.cboe.domain.instrumentorExtension.QueueInstrumentorExtension;
import com.cboe.domain.supplier.proxy.CallbackInterceptor;
import com.cboe.idl.cmiCallbackV2.CMIOrderBookConsumer;
import com.cboe.infrastructureServices.foundationFramework.utilities.Log;
import com.cboe.instrumentationService.factories.InstrumentorAlreadyCreatedException;
import com.cboe.instrumentationService.instrumentors.Instrumentor;
import com.cboe.interfaces.callback.OrderBookV2Consumer;

/**
 * Generated by Java Grinder
 * @author Java Grinder
 */
public class OrderBookV2ConsumerInterceptor extends CallbackInterceptor implements OrderBookV2Consumer
{

    MethodInstrumentorExtension acceptBookDepth0;
    CMIOrderBookConsumer cmiObject;

    /**
     * Create a new instance of ths interceptor for the provided BObject.
     * Create a cache of the instrumentors necessary for instrumentation.
     */
    public OrderBookV2ConsumerInterceptor(CMIOrderBookConsumer o)
    {
        this.cmiObject = o;
    }

    /**
     */
    public void startInstrumentation(String prefix, boolean privateOnly)
    {
        try
        {
            StringBuilder name = new StringBuilder(prefix.length()+Instrumentor.NAME_DELIMITER.length()+20);
            name.append(prefix).append(Instrumentor.NAME_DELIMITER).append("acceptBookDepth0");
            acceptBookDepth0 = MethodInstrumentorExtensionFactory.createMethodInstrumentor(name.toString(), null, privateOnly);
        } catch (InstrumentorAlreadyCreatedException e)
        {
            Log.exception(e);
        }
    }

    /**
     *
     */
    public void removeInstrumentation()
    {
        if(acceptBookDepth0 != null)
        {
            MethodInstrumentorExtensionFactory.removeMethodInstrumentor(acceptBookDepth0.getName());
            acceptBookDepth0 = null;
        }
    }

    /**
     *
     */
    public void addQueueInstrumentorRelation(QueueInstrumentorExtension queueInstrumentorExtension)
    {
        if(acceptBookDepth0 != null)
        {
            acceptBookDepth0.addQueueInstrumentorRelation(queueInstrumentorExtension);
        }
    }

    /**
     */
    public void acceptBookDepth(com.cboe.idl.cmiMarketData.BookDepthStruct[] param0, int param1, short param2)
    {
        boolean exception = false;
        if (acceptBookDepth0 != null)
        {
            acceptBookDepth0.beforeMethodCall();
        }
        try
        {
            cmiObject.acceptBookDepth(param0, param1, param2);
        }
        catch (RuntimeException ex)
        {
            exception = true;
            throw ex;
        } finally
        {
            if (acceptBookDepth0 != null)
            {
                acceptBookDepth0.incCalls(1);
                acceptBookDepth0.afterMethodCall();
                if (exception)
                {
                    acceptBookDepth0.incExceptions(1);
                }
            }
        }
    }
}