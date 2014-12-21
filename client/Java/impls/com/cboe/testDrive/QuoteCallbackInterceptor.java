package com.cboe.testDrive;
import com.cboe.interfaces.callback.QuoteStatusConsumer;
import com.cboe.infrastructureServices.instrumentationService.*;
import com.cboe.infrastructureServices.foundationFramework.*;
import com.cboe.idl.cmiQuote.QuoteCancelReportStruct;
/**
* Generated by Java Grinder
* @author Java Grinder
*/
public class QuoteCallbackInterceptor extends BOInterceptor implements QuoteStatusConsumer
{
    Instrumentor acceptQuoteCancelReport3;

    Instrumentor acceptQuoteStatus2;


    Instrumentor acceptQuoteFilledReport1;



    Instrumentor acceptQuoteBustReport0;
    QuoteStatusConsumer bObjectImpl = (QuoteStatusConsumer)getBObject();
    /**
     * Create a new instance of ths interceptor for the provided BObject.
     * Create a cache of the instrumentors necessary for instrumentation.
     */
    public QuoteCallbackInterceptor(BObject bo)
    {
        super(bo);
        String className = bo.getClass().getName();
        acceptQuoteBustReport0 = createInstrumentor("acceptQuoteBustReport0", className +"::acceptQuoteBustReport(Lcom.cboe.idl.cmiQuote.QuoteBustReportStruct;)V");
        acceptQuoteFilledReport1 = createInstrumentor("acceptQuoteFilledReport1", className +"::acceptQuoteFilledReport(Lcom.cboe.idl.cmiQuote.QuoteFilledReportStruct;)V");
        acceptQuoteStatus2 = createInstrumentor("acceptQuoteStatus2", className +"::acceptQuoteStatus(Lcom.cboe.idl.cmiQuote.QuoteDetailStruct;)V");
        acceptQuoteCancelReport3 = createInstrumentor("acceptQuoteCancelReport3", className +"::acceptQuoteCancelReport(Lcom.cboe.idl.cmiQuote.QuoteCancelReportStruct;)V");
    }
    /**
     */
    public void acceptQuoteBustReport( com.cboe.idl.cmiQuote.QuoteBustReportStruct param0)
    {
        long time = 0;
        boolean exception = false;
        String methodID = "acceptQuoteBustReport0";
        Instrumentor in = acceptQuoteBustReport0;
        try
        {
            time = System.currentTimeMillis();
            preProcess(in);
            bObjectImpl.acceptQuoteBustReport(param0);
        }
        catch(RuntimeException ex)
        {
            in.incError(ex);
            systemLog(ex, methodID);
            exception = true;
            throw ex;
        }
        finally
        {
            postProcess(time, methodID, acceptQuoteBustReport0, exception);
        }
    }
    /**
     */
    public void acceptQuoteFilledReport( com.cboe.idl.cmiQuote.QuoteFilledReportStruct param0)
    {
        long time = 0;
        boolean exception = false;
        String methodID = "acceptQuoteFilledReport1";
        Instrumentor in = acceptQuoteFilledReport1;
        try
        {
            time = System.currentTimeMillis();
            preProcess(in);
            bObjectImpl.acceptQuoteFilledReport(param0);
        }
        catch(RuntimeException ex)
        {
            in.incError(ex);
            systemLog(ex, methodID);
            exception = true;
            throw ex;
        }
        finally
        {
            postProcess(time, methodID, acceptQuoteFilledReport1, exception);
        }
    }
    /**
     */
    public void acceptQuoteStatus( com.cboe.idl.cmiQuote.QuoteDetailStruct [] param0)
    {
        long time = 0;
        boolean exception = false;
        String methodID = "acceptQuoteStatus2";
        Instrumentor in = acceptQuoteStatus2;
        try
        {
            time = System.currentTimeMillis();
            preProcess(in);
            bObjectImpl.acceptQuoteStatus(param0);
        }
        catch(RuntimeException ex)
        {
            in.incError(ex);
            systemLog(ex, methodID);
            exception = true;
            throw ex;
        }
        finally
        {
            postProcess(time, methodID, acceptQuoteStatus2, exception);
        }
    }

    public void acceptQuoteCancelReport(QuoteCancelReportStruct struct)
    {
        long time = 0;
        boolean exception = false;
        String methodID = "acceptQuoteCancelReport3";
        Instrumentor in = acceptQuoteCancelReport3;
        try
        {
            time = System.currentTimeMillis();
            preProcess(in);
            bObjectImpl.acceptQuoteCancelReport(struct);
        }
        catch(RuntimeException ex)
        {
            in.incError(ex);
            systemLog(ex, methodID);
            exception = true;
            throw ex;
        }
        finally
        {
            postProcess(time, methodID, acceptQuoteCancelReport3, exception);
        }
    }
}