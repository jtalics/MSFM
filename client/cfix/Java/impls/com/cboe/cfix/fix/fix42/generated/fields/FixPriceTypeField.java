package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixPriceTypeField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [423] (known as PriceType).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixPriceTypeField implements FixFieldIF, HasIntValueIF
{   
    public static final int    TagID         =  423;
    public static final String TagIDAsString = "423";
    public static final char[] TagIDAsChars  = {'4','2','3'};
    public static final String TagName       = "PriceType";
    public static final String TagFixType    = "INT";
    public static final char[]  taggedchars_value0 = {'4','2','3', EQUALSchar, ZEROchar, SOHchar};
    public static final char[]  taggedchars_value1 = {'4','2','3', EQUALSchar, ONEchar,  SOHchar};

    public static FixPriceTypeField create(final char[] array, final int offset, final int length)
    {
        int param = IntegerHelper.parseInt(array, offset, length);
        if (param == IntegerHelper.INVALID_VALUE)
        {
            return null;
        }
        return create(param);
    }

    public static FixPriceTypeField create(final int param)
    {
        return new FixPriceTypeField()
        {   public final int value = param;
            public boolean hasValue()                                    {return true;}
            public String  getValue()                                    {return StringHelper.intToString(value);}
            public int     intValue()                                    {return value;}
            public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, value);}
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
