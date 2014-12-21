package com.cboe.application.supplier.proxy;

import com.cboe.domain.instrumentorExtension.MethodInstrumentorExtension;
import com.cboe.domain.instrumentorExtension.MethodInstrumentorExtensionFactory;
import com.cboe.domain.instrumentorExtension.QueueInstrumentorExtension;
import com.cboe.domain.supplier.proxy.CallbackInterceptor;
import com.cboe.idl.cmiCallbackV2.CMICurrentMarketConsumer;
import com.cboe.infrastructureServices.foundationFramework.utilities.Log;
import com.cboe.instrumentationService.factories.InstrumentorAlreadyCreatedException;
import com.cboe.instrumentationService.instrumentors.Instrumentor;
import com.cboe.interfaces.callback.CurrentMarketV2Consumer;

/**
 * Generated by Java Grinder
 * @author Java Grinder
 */
public class CurrentMarketV2ConsumerInterceptor extends CallbackInterceptor implements CurrentMarketV2Consumer
{

    MethodInstrumentorExtension acceptCurrentMarket0;
    CMICurrentMarketConsumer cmiObject;

    /**
     * Create a new instance of ths interceptor for the provided BObject.
     * Create a cache of the instrumentors necessary for instrumentation.
     */
    public CurrentMarketV2ConsumerInterceptor(CMICurrentMarketConsumer o)
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
            name.append(prefix).append(Instrumentor.NAME_DELIMITER).append("acceptCurrentMarket0");
            acceptCurrentMarket0 = MethodInstrumentorExtensionFactory.createMethodInstrumentor(name.toString(), null, privateOnly);
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
        if(acceptCurrentMarket0 != null)
        {
            MethodInstrumentorExtensionFactory.removeMethodInstrumentor(acceptCurrentMarket0.getName());
            acceptCurrentMarket0 = null;
        }
    }

    /**
     *
     */
    public void addQueueInstrumentorRelation(QueueInstrumentorExtension queueInstrumentorExtension)
    {
        if(acceptCurrentMarket0 != null)
        {
            acceptCurrentMarket0.addQueueInstrumentorRelation(queueInstrumentorExtension);
        }
    }

    /**
     */
    public void acceptCurrentMarket(com.cboe.idl.cmiMarketData.CurrentMarketStruct[] param0, int param1, short param2)
    {
        boolean exception = false;
        if (acceptCurrentMarket0 != null)
        {
            acceptCurrentMarket0.beforeMethodCall();
        }
        try
        {
            cmiObject.acceptCurrentMarket(param0, param1, param2);
        }
        catch (RuntimeException ex)
        {
            exception = true;
            throw ex;
        } finally
        {
            if (acceptCurrentMarket0 != null)
            {
                acceptCurrentMarket0.incCalls(1);
                acceptCurrentMarket0.afterMethodCall();
                if (exception)
                {
                    acceptCurrentMarket0.incExceptions(1);
                }
            }
        }
    }
}