package com.cboe.application.supplier.proxy;

import com.cboe.domain.instrumentorExtension.MethodInstrumentorExtension;
import com.cboe.domain.instrumentorExtension.MethodInstrumentorExtensionFactory;
import com.cboe.domain.instrumentorExtension.QueueInstrumentorExtension;
import com.cboe.domain.supplier.proxy.CallbackInterceptor;
import com.cboe.idl.cmiCallback.CMIQuoteStatusConsumer;
import com.cboe.infrastructureServices.foundationFramework.utilities.Log;
import com.cboe.instrumentationService.factories.InstrumentorAlreadyCreatedException;
import com.cboe.instrumentationService.instrumentors.Instrumentor;
import com.cboe.interfaces.callback.QuoteStatusConsumer;

/**
 * Generated by Java Grinder
 * @author Java Grinder
 */
public class QuoteStatusConsumerInterceptor extends CallbackInterceptor implements QuoteStatusConsumer
{


    MethodInstrumentorExtension acceptQuoteStatus3;


    MethodInstrumentorExtension acceptQuoteFilledReport2;


    MethodInstrumentorExtension acceptQuoteCancelReport1;

    MethodInstrumentorExtension acceptQuoteBustReport0;
    CMIQuoteStatusConsumer cmiObject;

    /**
     * Create a new instance of ths interceptor for the provided BObject.
     * Create a cache of the instrumentors necessary for instrumentation.
     */
    public QuoteStatusConsumerInterceptor(CMIQuoteStatusConsumer o)
    {
        this.cmiObject = o;
    }

    /**
     */
    public void startInstrumentation(String prefix, boolean privateOnly)
    {
        try
        {
            StringBuilder name = new StringBuilder(prefix.length()+Instrumentor.NAME_DELIMITER.length()+24);
            name.append(prefix).append(Instrumentor.NAME_DELIMITER).append("acceptQuoteBustReport0");
            acceptQuoteBustReport0 = MethodInstrumentorExtensionFactory.createMethodInstrumentor(name.toString(), null, privateOnly);
            name.setLength(0);
            name.append(prefix).append(Instrumentor.NAME_DELIMITER).append("acceptQuoteCancelReport1");
            acceptQuoteCancelReport1 = MethodInstrumentorExtensionFactory.createMethodInstrumentor(name.toString(), null, privateOnly);
            name.setLength(0);
            name.append(prefix).append(Instrumentor.NAME_DELIMITER).append("acceptQuoteFilledReport2");
            acceptQuoteFilledReport2 = MethodInstrumentorExtensionFactory.createMethodInstrumentor(name.toString(), null, privateOnly);
            name.setLength(0);
            name.append(prefix).append(Instrumentor.NAME_DELIMITER).append("acceptQuoteStatus3");
            acceptQuoteStatus3 = MethodInstrumentorExtensionFactory.createMethodInstrumentor(name.toString(), null, privateOnly);
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
        if(acceptQuoteBustReport0 != null)
        {
            MethodInstrumentorExtensionFactory.removeMethodInstrumentor(acceptQuoteBustReport0.getName());
            acceptQuoteBustReport0 = null;
        }
        if(acceptQuoteCancelReport1 != null)
        {
            MethodInstrumentorExtensionFactory.removeMethodInstrumentor(acceptQuoteCancelReport1.getName());
            acceptQuoteCancelReport1 = null;
        }
        if(acceptQuoteFilledReport2 != null)
        {
            MethodInstrumentorExtensionFactory.removeMethodInstrumentor(acceptQuoteFilledReport2.getName());
            acceptQuoteFilledReport2 = null;
        }
        if(acceptQuoteStatus3 != null)
        {
            MethodInstrumentorExtensionFactory.removeMethodInstrumentor(acceptQuoteStatus3.getName());
            acceptQuoteStatus3 = null;
        }
    }

    /**
     *
     */
    public void addQueueInstrumentorRelation(QueueInstrumentorExtension queueInstrumentorExtension)
    {
        if(acceptQuoteBustReport0 != null)
        {
            acceptQuoteBustReport0.addQueueInstrumentorRelation(queueInstrumentorExtension);
        }
        if(acceptQuoteCancelReport1 != null)
        {
            acceptQuoteCancelReport1.addQueueInstrumentorRelation(queueInstrumentorExtension);
        }
        if(acceptQuoteFilledReport2 != null)
        {
            acceptQuoteFilledReport2.addQueueInstrumentorRelation(queueInstrumentorExtension);
        }
        if(acceptQuoteStatus3 != null)
        {
            acceptQuoteStatus3.addQueueInstrumentorRelation(queueInstrumentorExtension);
        }
    }

    /**
     */
    public void acceptQuoteBustReport(com.cboe.idl.cmiQuote.QuoteBustReportStruct param0)
    {
        boolean exception = false;
        if (acceptQuoteBustReport0 != null)
        {
            acceptQuoteBustReport0.beforeMethodCall();
        }
        try
        {
            cmiObject.acceptQuoteBustReport(param0);
        } catch (RuntimeException ex)
        {
            exception = true;
            throw ex;
        } finally
        {
            if (acceptQuoteBustReport0 != null)
            {
                acceptQuoteBustReport0.incCalls(1);
                acceptQuoteBustReport0.afterMethodCall();
                if (exception)
                {
                    acceptQuoteBustReport0.incExceptions(1);
                }
            }
        }
    }

    /**
     */
    public void acceptQuoteCancelReport(com.cboe.idl.cmiQuote.QuoteCancelReportStruct param0)
    {
        boolean exception = false;
        if (acceptQuoteCancelReport1 != null)
        {
            acceptQuoteCancelReport1.beforeMethodCall();
        }
        try
        {
            cmiObject.acceptQuoteCancelReport(param0);
        } catch (RuntimeException ex)
        {
            exception = true;
            throw ex;
        } finally
        {
            if (acceptQuoteCancelReport1 != null)
            {
                acceptQuoteCancelReport1.incCalls(1);
                acceptQuoteCancelReport1.afterMethodCall();
                if (exception)
                {
                    acceptQuoteCancelReport1.incExceptions(1);
                }
            }
        }
    }

    /**
     */
    public void acceptQuoteFilledReport(com.cboe.idl.cmiQuote.QuoteFilledReportStruct param0)
    {
        boolean exception = false;
        if (acceptQuoteFilledReport2 != null)
        {
            acceptQuoteFilledReport2.beforeMethodCall();
        }
        try
        {
            cmiObject.acceptQuoteFilledReport(param0);
        } catch (RuntimeException ex)
        {
            exception = true;
            throw ex;
        } finally
        {
            if (acceptQuoteFilledReport2 != null)
            {
                acceptQuoteFilledReport2.incCalls(1);
                acceptQuoteFilledReport2.afterMethodCall();
                if (exception)
                {
                    acceptQuoteFilledReport2.incExceptions(1);
                }
            }
        }
    }

    /**
     */
    public void acceptQuoteStatus(com.cboe.idl.cmiQuote.QuoteDetailStruct[] param0)
    {
        boolean exception = false;
        if (acceptQuoteStatus3 != null)
        {
            acceptQuoteStatus3.beforeMethodCall();
        }
        try
        {
            cmiObject.acceptQuoteStatus(param0);
        } catch (RuntimeException ex)
        {
            exception = true;
            throw ex;
        } finally
        {
            if (acceptQuoteStatus3 != null)
            {
                acceptQuoteStatus3.incCalls(1);
                acceptQuoteStatus3.afterMethodCall();
                if (exception)
                {
                    acceptQuoteStatus3.incExceptions(1);
                }
            }
        }
    }
}