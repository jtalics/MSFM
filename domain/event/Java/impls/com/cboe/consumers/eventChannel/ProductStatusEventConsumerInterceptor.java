package com.cboe.consumers.eventChannel;

import com.cboe.idl.product.ProductClassStructV3;
import com.cboe.idl.product.ProductStructV4;
import com.cboe.idl.product.ProductOpenInterestStruct;
import com.cboe.idl.product.LinkageIndicatorResultStruct;
import com.cboe.idl.product.ProductInformationStruct;
import com.cboe.interfaces.events.ProductStatusConsumer;
import com.cboe.infrastructureServices.instrumentationService.*;
import com.cboe.infrastructureServices.foundationFramework.*;
import com.cboe.infrastructureServices.foundationFramework.utilities.Log;
import com.cboe.instrumentationService.instrumentors.MethodInstrumentor;
import com.cboe.instrumentationService.instrumentors.Instrumentor;
import com.cboe.instrumentationService.factories.MethodInstrumentorFactory;
import com.cboe.instrumentationService.factories.InstrumentorAlreadyCreatedException;

/**
 * Generated by Java Grinder
 * @author Java Grinder
 */
public class ProductStatusEventConsumerInterceptor implements ProductStatusConsumer
{


    MethodInstrumentor priceAdjustmentUpdatedNotice6;


    MethodInstrumentor priceAdjustmentAppliedNotice5;


    MethodInstrumentor allAdjustmentsAppliedNotice4;


    MethodInstrumentor updateReportingClass3;


    MethodInstrumentor updateProductStrategy2;

    MethodInstrumentor updateQPEIndicator7;
    MethodInstrumentor updateProductClass1;
    MethodInstrumentor updateLinkageIndicator8;

    private ProductStatusConsumer delegate;

    MethodInstrumentor updateProduct0;
    private MethodInstrumentorFactory methodInstrumentorFactory;
    MethodInstrumentor updateProductOpenInterest8;

    /**
     * Create a new instance of ths interceptor for the provided BObject.
     * Create a cache of the instrumentors necessary for instrumentation.
     */
    public ProductStatusEventConsumerInterceptor(Object bo)
    {
        setDelegate(bo);
    }

    private MethodInstrumentorFactory getMethodInstrumentorFactory()
    {
        if (methodInstrumentorFactory == null)
        {
            methodInstrumentorFactory = FoundationFramework.getInstance().getInstrumentationService().getMethodInstrumentorFactory();
        }
        return methodInstrumentorFactory;
    }

    public void startInstrumentation(boolean privateOnly)
    {
        try
        {
            StringBuilder name = new StringBuilder(70);
            name.append("ProductStatusEventConsumerInterceptor").append(Instrumentor.NAME_DELIMITER).append("updateProduct0");
            updateProduct0 = getMethodInstrumentorFactory().create(name.toString(), null);
            getMethodInstrumentorFactory().register(updateProduct0);
            updateProduct0.setPrivate(privateOnly);
            name.setLength(0);
            name.append("ProductStatusEventConsumerInterceptor").append(Instrumentor.NAME_DELIMITER).append("updateProductClass1");
            updateProductClass1 = getMethodInstrumentorFactory().create(name.toString(), null);
            getMethodInstrumentorFactory().register(updateProductClass1);
            updateProductClass1.setPrivate(privateOnly);
            name.setLength(0);
            name.append("ProductStatusEventConsumerInterceptor").append(Instrumentor.NAME_DELIMITER).append("updateProductStrategy2");
            updateProductStrategy2 = getMethodInstrumentorFactory().create(name.toString(), null);
            getMethodInstrumentorFactory().register(updateProductStrategy2);
            updateProductStrategy2.setPrivate(privateOnly);
            name.setLength(0);
            name.append("ProductStatusEventConsumerInterceptor").append(Instrumentor.NAME_DELIMITER).append("updateReportingClass3");
            updateReportingClass3 = getMethodInstrumentorFactory().create(name.toString(), null);
            getMethodInstrumentorFactory().register(updateReportingClass3);
            updateReportingClass3.setPrivate(privateOnly);
            name.setLength(0);
            name.append("ProductStatusEventConsumerInterceptor").append(Instrumentor.NAME_DELIMITER).append("allAdjustmentsAppliedNotice4");
            allAdjustmentsAppliedNotice4 = getMethodInstrumentorFactory().create(name.toString(), null);
            getMethodInstrumentorFactory().register(allAdjustmentsAppliedNotice4);
            allAdjustmentsAppliedNotice4.setPrivate(privateOnly);
            name.setLength(0);
            name.append("ProductStatusEventConsumerInterceptor").append(Instrumentor.NAME_DELIMITER).append("priceAdjustmentAppliedNotice5");
            priceAdjustmentAppliedNotice5 = getMethodInstrumentorFactory().create(name.toString(), null);
            getMethodInstrumentorFactory().register(priceAdjustmentAppliedNotice5);
            priceAdjustmentAppliedNotice5.setPrivate(privateOnly);
            name.setLength(0);
            name.append("ProductStatusEventConsumerInterceptor").append(Instrumentor.NAME_DELIMITER).append("priceAdjustmentUpdatedNotice6");
            priceAdjustmentUpdatedNotice6 = getMethodInstrumentorFactory().create(name.toString(), null);
            getMethodInstrumentorFactory().register(priceAdjustmentUpdatedNotice6);
            priceAdjustmentUpdatedNotice6.setPrivate(privateOnly);
            name.setLength(0);
            name.append("ProductStatusConsumerProxy").append(Instrumentor.NAME_DELIMITER).append("updateQPEIndicator7");
            updateQPEIndicator7 = getMethodInstrumentorFactory().create(name.toString(), null);
            getMethodInstrumentorFactory().register(updateQPEIndicator7);
            updateQPEIndicator7.setPrivate(privateOnly);
            name.setLength(0);
            name.append("ProductStatusEventConsumerInterceptor").append(Instrumentor.NAME_DELIMITER).append("updateProductOpenInterest8");
            updateProductOpenInterest8 = getMethodInstrumentorFactory().create(name.toString(), null);
            getMethodInstrumentorFactory().register(updateProductOpenInterest8);
            updateProductOpenInterest8.setPrivate(privateOnly);
            name.setLength(0);
            name.append("ProductStatusConsumerProxy").append(Instrumentor.NAME_DELIMITER).append("updateLinkageIndicator8");
            updateLinkageIndicator8 = getMethodInstrumentorFactory().create(name.toString(), null);
            getMethodInstrumentorFactory().register(updateQPEIndicator7);
            updateLinkageIndicator8.setPrivate(privateOnly);
        } catch (InstrumentorAlreadyCreatedException ex)
        {
            Log.exception(ex);
        }
    }

    /**
     *
     */
    public void removeInstrumentation()
    {
        getMethodInstrumentorFactory().unregister(updateProduct0);
        updateProduct0 = null;
        getMethodInstrumentorFactory().unregister(updateProductClass1);
        updateProductClass1 = null;
        getMethodInstrumentorFactory().unregister(updateProductStrategy2);
        updateProductStrategy2 = null;
        getMethodInstrumentorFactory().unregister(updateReportingClass3);
        updateReportingClass3 = null;
        getMethodInstrumentorFactory().unregister(allAdjustmentsAppliedNotice4);
        allAdjustmentsAppliedNotice4 = null;
        getMethodInstrumentorFactory().unregister(priceAdjustmentAppliedNotice5);
        priceAdjustmentAppliedNotice5 = null;
        getMethodInstrumentorFactory().unregister(priceAdjustmentUpdatedNotice6);
        priceAdjustmentUpdatedNotice6 = null;
        getMethodInstrumentorFactory().unregister(updateProductOpenInterest8);
        updateProductOpenInterest8 = null;
        getMethodInstrumentorFactory().unregister(updateLinkageIndicator8);
        updateLinkageIndicator8 = null;
    }

    /**
     */
    public void updateProduct(com.cboe.idl.cmiProduct.ProductStruct param0,com.cboe.idl.product.ProductInformationStruct param1)
    {
        boolean exception = false;
        if (updateProduct0 != null)
        {
            updateProduct0.beforeMethodCall();
        }
        try
        {
            delegate.updateProduct(param0, param1);
        } catch (RuntimeException ex)
        {
            exception = true;
            throw ex;
        } finally
        {
            if (updateProduct0 != null)
            {
                updateProduct0.incCalls(1);
                updateProduct0.afterMethodCall();
                if (exception)
                {
                    updateProduct0.incExceptions(1);
                }
            }
        }
    }

    private void setDelegate(Object delegate)
    {
        this.delegate = (ProductStatusConsumer) delegate;
    }

    /**
     */
    public void updateProductClass(com.cboe.idl.product.ProductClassStruct param0)
    {
        boolean exception = false;
        if (updateProductClass1 != null)
        {
            updateProductClass1.beforeMethodCall();
        }
        try
        {
            delegate.updateProductClass(param0);
        } catch (RuntimeException ex)
        {
            exception = true;
            throw ex;
        } finally
        {
            if (updateProductClass1 != null)
            {
                updateProductClass1.incCalls(1);
                updateProductClass1.afterMethodCall();
                if (exception)
                {
                    updateProductClass1.incExceptions(1);
                }
            }
        }
    }

    /**
     */
    public void updateProductStrategy(com.cboe.idl.cmiStrategy.StrategyStruct param0)
    {
        boolean exception = false;
        if (updateProductStrategy2 != null)
        {
            updateProductStrategy2.beforeMethodCall();
        }
        try
        {
            delegate.updateProductStrategy(param0);
        } catch (RuntimeException ex)
        {
            exception = true;
            throw ex;
        } finally
        {
            if (updateProductStrategy2 != null)
            {
                updateProductStrategy2.incCalls(1);
                updateProductStrategy2.afterMethodCall();
                if (exception)
                {
                    updateProductStrategy2.incExceptions(1);
                }
            }
        }
    }


    public void updateQPEIndicator(int classKey, boolean indicator) {
         boolean exception = false;
        if (updateQPEIndicator7 != null)
        {
            updateQPEIndicator7.beforeMethodCall();
        }
        try
        {
            delegate.updateQPEIndicator(classKey,indicator );
        } catch (Exception ex)
        {
            exception = true;
            throw new RuntimeException(ex.toString());
        } finally
        {
            if (updateQPEIndicator7 != null)
            {
                updateQPEIndicator7.incCalls(1);
                updateQPEIndicator7.afterMethodCall();
                if (exception)
                {
                    updateQPEIndicator7.incExceptions(1);
                }
            }
        }
    }

    /**
     */
    public void updateReportingClass(com.cboe.idl.cmiProduct.ReportingClassStruct param0)
    {
        boolean exception = false;
        if (updateReportingClass3 != null)
        {
            updateReportingClass3.beforeMethodCall();
        }
        try
        {
            delegate.updateReportingClass(param0);
        } catch (RuntimeException ex)
        {
            exception = true;
            throw ex;
        } finally
        {
            if (updateReportingClass3 != null)
            {
                updateReportingClass3.incCalls(1);
                updateReportingClass3.afterMethodCall();
                if (exception)
                {
                    updateReportingClass3.incExceptions(1);
                }
            }
        }
    }

    /**
     */
    public void allAdjustmentsAppliedNotice()
    {
        boolean exception = false;
        if (allAdjustmentsAppliedNotice4 != null)
        {
            allAdjustmentsAppliedNotice4.beforeMethodCall();
        }
        try
        {
            delegate.allAdjustmentsAppliedNotice();
        } catch (RuntimeException ex)
        {
            exception = true;
            throw ex;
        } finally
        {
            if (allAdjustmentsAppliedNotice4 != null)
            {
                allAdjustmentsAppliedNotice4.incCalls(1);
                allAdjustmentsAppliedNotice4.afterMethodCall();
                if (exception)
                {
                    allAdjustmentsAppliedNotice4.incExceptions(1);
                }
            }
        }
    }

    /**
     */
    public void priceAdjustmentAppliedNotice(com.cboe.idl.cmiProduct.PendingAdjustmentStruct param0)
    {
        boolean exception = false;
        if (priceAdjustmentAppliedNotice5 != null)
        {
            priceAdjustmentAppliedNotice5.beforeMethodCall();
        }
        try
        {
            delegate.priceAdjustmentAppliedNotice(param0);
        } catch (RuntimeException ex)
        {
            exception = true;
            throw ex;
        } finally
        {
            if (priceAdjustmentAppliedNotice5 != null)
            {
                priceAdjustmentAppliedNotice5.incCalls(1);
                priceAdjustmentAppliedNotice5.afterMethodCall();
                if (exception)
                {
                    priceAdjustmentAppliedNotice5.incExceptions(1);
                }
            }
        }
    }

    /**
     */
    public void priceAdjustmentUpdatedNotice(com.cboe.idl.cmiProduct.PendingAdjustmentStruct param0)
    {
        boolean exception = false;
        if (priceAdjustmentUpdatedNotice6 != null)
        {
            priceAdjustmentUpdatedNotice6.beforeMethodCall();
        }
        try
        {
            delegate.priceAdjustmentUpdatedNotice(param0);
        } catch (RuntimeException ex)
        {
            exception = true;
            throw ex;
        } finally
        {
            if (priceAdjustmentUpdatedNotice6 != null)
            {
                priceAdjustmentUpdatedNotice6.incCalls(1);
                priceAdjustmentUpdatedNotice6.afterMethodCall();
                if (exception)
                {
                    priceAdjustmentUpdatedNotice6.incExceptions(1);
                }
            }
        }
    }

    public void updateLinkageIndicator(LinkageIndicatorResultStruct[] param0)
    {
         boolean exception = false;
        if (updateLinkageIndicator8 != null)
        {
            updateLinkageIndicator8.beforeMethodCall();
        }
        try
        {
            delegate.updateLinkageIndicator(param0);
        } catch (RuntimeException ex)
        {
            exception = true;
            throw ex;
        } finally
        {
            if (updateLinkageIndicator8 != null)
            {
                updateLinkageIndicator8.incCalls(1);
                updateLinkageIndicator8.afterMethodCall();
                if (exception)
                {
                    updateLinkageIndicator8.incExceptions(1);
                }
            }
        }
    }
    /* (non-Javadoc)
     * @see com.cboe.idl.consumers.ProductUpdateConsumerOperations#updateProductClassV3(com.cboe.idl.product.ProductClassStructV3)
     */
    public void updateProductClassV3(ProductClassStructV3 arg0)
    {
        // TODO Auto-generated method stub
        // TODO To be implemented on OHS EOD/Reporting project

    }

    /* (non-Javadoc)
     * @see com.cboe.idl.consumers.ProductUpdateConsumerOperations#updateProductV4(com.cboe.idl.product.ProductStructV4)
     */
    public void updateProductV4(ProductStructV4 arg0)
    {
        // TODO To be implemented on OHS EOD/Reporting project
      // TODO Auto-generated method stub

    }
    /**
     * @param classKey
     * @param openInterestForProducts
     */
    public void updateProductOpenInterest(int classKey, ProductOpenInterestStruct[] openInterestForProducts)
    {
        boolean exception = false;
        if (updateProductOpenInterest8!= null)
        {
            updateProductOpenInterest8.beforeMethodCall();
        }
        try
        {
            delegate.updateProductOpenInterest(classKey, openInterestForProducts);
        } catch (RuntimeException ex)
        {
            exception = true;
            throw ex;
        } finally
        {
            if (updateProductOpenInterest8!= null)
            {
                updateProductOpenInterest8.incCalls(1);
                updateProductOpenInterest8.afterMethodCall();
                if (exception)
                {
                    updateProductOpenInterest8.incExceptions(1);
                }
            }
        }
    }

}