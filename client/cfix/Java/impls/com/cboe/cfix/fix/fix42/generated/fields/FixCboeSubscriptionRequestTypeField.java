package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixCboeSubscriptionRequestTypeField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [9463] (known as CboeSubscriptionRequestType).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;

public abstract class FixCboeSubscriptionRequestTypeField implements FixFieldIF
{   
    public static final int    TagID         =  9463;
    public static final String TagIDAsString = "9463";
    public static final char[] TagIDAsChars  = {'9','4','6','3'};
    public static final String TagName       = "CboeSubscriptionRequestType";
    public static final String TagFixType    = "STRING";

    public static FixCboeSubscriptionRequestTypeField create(final char[] array, final int offset, final int length)
    {
        return create(new String(array, offset, length));
    }

    public static FixCboeSubscriptionRequestTypeField create(final String paramString)
    {
        return new FixCboeSubscriptionRequestTypeField()
        {   public String  valueString = paramString;
            public boolean hasValue()                        {return valueString != null;}
            public String  getValue()                        {return valueString;}
            public String  getValueDescription()             {return valueString;}
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
