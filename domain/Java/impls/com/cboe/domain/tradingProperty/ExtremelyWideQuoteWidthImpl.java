//
// -----------------------------------------------------------------------------------
// Source file: ExtremelyWideQuoteWidthImpl.java
//
// PACKAGE: com.cboe.domain.tradingProperty;
//
// -----------------------------------------------------------------------------------
// Copyright (c) 2000-2005 The Chicago Board Options Exchange. All Rights Reserved.
// -----------------------------------------------------------------------------------
package com.cboe.domain.tradingProperty;

import java.util.*;

import com.cboe.exceptions.DataValidationException;

import com.cboe.interfaces.domain.property.Property;
import com.cboe.interfaces.domain.tradingProperty.TradingPropertyType;
import com.cboe.interfaces.domain.tradingProperty.ExtremelyWideQuoteWidth;

import com.cboe.infrastructureServices.foundationFramework.utilities.Log;

/**
 * Represents a TradingProperty for an Exchange Prescribed Width
 */
public class ExtremelyWideQuoteWidthImpl extends AbstractTradingProperty
        implements ExtremelyWideQuoteWidth
{
    private TradingPropertyType tradingPropertyType;

    /**
     * @param tradingPropertyType type of TradingProperty that this instance represents. Since this TradingProperty
     * implementation class type can represent the data for multiple TradingProperty types, it must be told
     * which type this instance represents.
     * @param sessionName that this TradingProperty is for
     * @param classKey that this TradingProperty is for
     */
    public ExtremelyWideQuoteWidthImpl(TradingPropertyType tradingPropertyType,
                                       String sessionName, int classKey)
    {
        super(tradingPropertyType.getName(), sessionName, classKey);
        this.tradingPropertyType = tradingPropertyType;
    }

    /**
     * @param tradingPropertyType type of TradingProperty that this instance represents. Since this TradingProperty
     * implementation class type can represent the data for multiple TradingProperty types, it must be told
     * which type this instance represents.
     * @param sessionName that this TradingProperty is for
     * @param classKey that this TradingProperty is for
     * @param property to initialize with
     */
    public ExtremelyWideQuoteWidthImpl(TradingPropertyType tradingPropertyType, String sessionName, int classKey,
                                       Property property)
            throws DataValidationException
    {
        super(sessionName, classKey, property);
        this.tradingPropertyType = tradingPropertyType;
    }

    /**
     * @param tradingPropertyType type of TradingProperty that this instance represents. Since this TradingProperty
     * implementation class type can represent the data for multiple TradingProperty types, it must be told
     * which type this instance represents.
     * @param sessionName that this TradingProperty is for
     * @param classKey that this TradingProperty is for
     * @param minimumBidRange
     * @param maximumBidRange
     * @param maximumAllowableSpread
     */
    public ExtremelyWideQuoteWidthImpl(TradingPropertyType tradingPropertyType,
                                       String sessionName, int classKey,
                                       double minimumBidRange, double maximumBidRange,
                                       double maximumAllowableSpread)
    {
        this(tradingPropertyType, sessionName, classKey);
        setMinimumBidRange(minimumBidRange);
        setMaximumBidRange(maximumBidRange);
        setMaximumAllowableSpread(maximumAllowableSpread);
    }

    /**
     * @param tradingPropertyType type of TradingProperty that this instance represents. Since this TradingProperty
     * implementation class type can represent the data for multiple TradingProperty types, it must be told
     * which type this instance represents.
     * @param sessionName that this TradingProperty is for
     * @param classKey that this TradingProperty is for
     * @param value String to parse field values from
     */
    public ExtremelyWideQuoteWidthImpl(TradingPropertyType tradingPropertyType,
                                       String sessionName, int classKey, String value)
    {
        super(tradingPropertyType.getName(), sessionName, classKey, value);
        this.tradingPropertyType = tradingPropertyType;
    }

    /**
     * Compares based on getMinimumBidRange()
     */
    public int compareTo(Object object)
    {
        int result;
        double myValue = getMinimumBidRange();
        double theirValue = ((ExtremelyWideQuoteWidth) object).getMinimumBidRange();
        result = (myValue < theirValue ? -1 : (myValue == theirValue ? 0 : 1));
        return result;
    }

    /**
     * Overriden to return the getMinimumBidRange(), converted to a String, then the hashCode obtained of the
     * resulting String.
     */ 
    public int hashCode()
    {
        return Double.toString(getMinimumBidRange()).hashCode();
    }

    /**
     * @see com.cboe.interfaces.domain.tradingProperty.TradingProperty#getTradingPropertyType()
     */
    public TradingPropertyType getTradingPropertyType()
    {
        return tradingPropertyType;
    }

    /**
     * Returns the getMinimumBidRange() as a String.
     */
    public String getPropertyName()
    {
        return Double.toString(getMinimumBidRange());
    }

    /**
     * Returns the super's double1 attribute
     */
    public double getMinimumBidRange()
    {
        return getDouble1();
    }

    /**
     * Sets the super's double1 attribute
     */
    public void setMinimumBidRange(double minBid)
    {
        if(Log.isDebugOn())
        {
            Log.debug("ExtremelyWideQuoteWidthGroupImpl>> Saving minimumBidRange value = " + minBid);
        }

        setDouble1(minBid);
    }

    /**
     * Returns the super's double2 attribute
     */
    public double getMaximumBidRange()
    {
        return getDouble2();
    }

    /**
     * Sets the super's double2 attribute
     */
    public void setMaximumBidRange(double maxBid)
    {
        if(Log.isDebugOn())
        {
            Log.debug("ExtremelyWideQuoteWidthGroupImpl>> Saving maximumBidRange value = " + maxBid);
        }

        setDouble2(maxBid);
    }

    /**
     * Returns the super's double3 attribute
     */
    public double getMaximumAllowableSpread()
    {
        return getDouble3();
    }

    /**
     * Sets the super's double3 attribute
     */
    public void setMaximumAllowableSpread(double maxSpread)
    {
        if(Log.isDebugOn())
        {
            Log.debug("ExtremelyWideQuoteWidthGroupImpl>> Saving maximumAllowableSpread value = " + maxSpread);
        }

        setDouble3(maxSpread);
    }

    /**
     * Allows the Trading Property to determine the order of the PropertyDescriptor's. This implementation will just
     * return a comparator that will sort by the desired property descriptor order from the BeanInfo.
     * @return comparator to use for sorting the returned PropertyDescriptor's from getPropertyDescriptors().
     */
    protected Comparator getPropertyDescriptorSortComparator()
    {
        String[] forcedEntries = {"minimumBidRange", "maximumBidRange", "maximumAllowableSpread"};
        return new ForcedPropertyDescriptorComparator(forcedEntries);
    }
}