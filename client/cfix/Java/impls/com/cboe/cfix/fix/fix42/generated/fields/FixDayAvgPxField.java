package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixDayAvgPxField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [426] (known as DayAvgPx).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;
import com.cboe.idl.cmiUtil.*;

public abstract class FixDayAvgPxField implements FixFieldIF, HasPriceStructValueIF
{   
    public static final int    TagID         =  426;
    public static final String TagIDAsString = "426";
    public static final char[] TagIDAsChars  = {'4','2','6'};
    public static final String TagName       = "DayAvgPx";
    public static final String TagFixType    = "PRICE";
    public static final char[]  taggedchars_value0 = {'4','2','6', EQUALSchar, ZEROchar, SOHchar};
    public static final char[]  taggedchars_value1 = {'4','2','6', EQUALSchar, ONEchar,  SOHchar};

    public static FixDayAvgPxField create(final char[] array, final int offset, final int length)
    {
        return create(PriceHelper.createPriceStruct(array, offset, length));
    }

    public static FixDayAvgPxField create(final PriceStruct param)
    {
        return new FixDayAvgPxField()
        {   public final PriceStruct value = param;
            public boolean hasValue()                        {return true;}
            public String  getValue()                        {return PriceHelper.toString(value);}
            public PriceStruct priceStructValue()            {return value;}
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
