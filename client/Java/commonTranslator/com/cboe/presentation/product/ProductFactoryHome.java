package com.cboe.presentation.product;

import com.cboe.presentation.common.exceptionHandling.DefaultExceptionHandlerHome;

/**
 * Date: June 23, 2010
 */
public class ProductFactoryHome
{
    private static ProductFactoryInterface factory;

    public static void create(String className)
    {
        try
        {
            Class theClass = Class.forName(className);
            create(theClass);
        }
        catch (Exception e)
        {
            DefaultExceptionHandlerHome.find().process(e);
        }
    }

    public static void create(Class theClass)
    {
        try
        {
            Class interfaceClass = com.cboe.presentation.product.ProductFactoryInterface.class;

            Object newOBJ = theClass.newInstance();

            if (interfaceClass.isInstance(newOBJ))
            {
                factory = (ProductFactoryInterface) newOBJ;
            }
            else
            {
                throw new IllegalArgumentException("ProductFactoryHome: class '" + theClass +
                        "' does not support interface '"+interfaceClass+"'");
            }
        }
        catch (Exception e)
        {
            DefaultExceptionHandlerHome.find().process(e);
        }
    }

    public static ProductFactoryInterface find()
    {
        if(factory != null)
        {
            return factory;
        }
        else
        {
            throw new IllegalStateException("ProductFactoryHome: Create has not been called yet.");
        }
    }
}
