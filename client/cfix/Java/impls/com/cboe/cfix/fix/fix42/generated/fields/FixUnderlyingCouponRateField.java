package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixUnderlyingCouponRateField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [435] (known as UnderlyingCouponRate).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;

public abstract class FixUnderlyingCouponRateField implements FixFieldIF, HasDoubleValueIF
{   
    public static final int    TagID         =  435;
    public static final String TagIDAsString = "435";
    public static final char[] TagIDAsChars  = {'4','3','5'};
    public static final String TagName       = "UnderlyingCouponRate";
    public static final String TagFixType    = "DOUBLE";
    public static final char[]  taggedchars_value0 = {'4','3','5', EQUALSchar, ZEROchar, SOHchar};
    public static final char[]  taggedchars_value1 = {'4','3','5', EQUALSchar, ONEchar,  SOHchar};

    public static FixUnderlyingCouponRateField create(final char[] array, final int offset, final int length)
    {
        return create(Double.parseDouble(new String(array, offset, length)));
    }

    public static FixUnderlyingCouponRateField create(final double param)
    {
        return new FixUnderlyingCouponRateField()
        {   public final double value = param;
            public boolean hasValue()                        {return true;}
            public String  getValue()                        {return Double.toString(value);}
            public double  doubleValue()                     {return value;}
        };
    }
    
    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}
}