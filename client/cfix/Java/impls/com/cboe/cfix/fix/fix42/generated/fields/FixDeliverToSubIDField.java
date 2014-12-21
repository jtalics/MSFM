package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixDeliverToSubIDField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [129] (known as DeliverToSubID).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;

public abstract class FixDeliverToSubIDField implements FixFieldIF
{   
    public static final int    TagID         =  129;
    public static final String TagIDAsString = "129";
    public static final char[] TagIDAsChars  = {'1','2','9'};
    public static final String TagName       = "DeliverToSubID";
    public static final String TagFixType    = "STRING";

    public static FixDeliverToSubIDField create(final char[] array, final int offset, final int length)
    {
        return create(new String(array, offset, length));
    }

    public static FixDeliverToSubIDField create(final String paramString)
    {
        return new FixDeliverToSubIDField()
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
