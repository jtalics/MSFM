package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixMaturityDayField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [205] (known as MaturityDay).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixMaturityDayField implements FixFieldIF, HasIntValueIF
{   
    public static final int    TagID         =  205;
    public static final String TagIDAsString = "205";
    public static final char[] TagIDAsChars  = {'2','0','5'};
    public static final String TagName       = "MaturityDay";
    public static final String TagFixType    = "INT";
    public static final char[]  taggedchars_value0 = {'2','0','5', EQUALSchar, ZEROchar, SOHchar};
    public static final char[]  taggedchars_value1 = {'2','0','5', EQUALSchar, ONEchar,  SOHchar};

    public static FixMaturityDayField create(final char[] array, final int offset, final int length)
    {
        int param = IntegerHelper.parseInt(array, offset, length);
        if (param == IntegerHelper.INVALID_VALUE)
        {
            return null;
        }
        return create(param);
    }

    public static FixMaturityDayField create(final int param)
    {
        return new FixMaturityDayField()
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
