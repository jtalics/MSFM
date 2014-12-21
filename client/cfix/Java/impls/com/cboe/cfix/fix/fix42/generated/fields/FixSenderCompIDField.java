package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixSenderCompIDField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [49] (known as SenderCompID).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;

public abstract class FixSenderCompIDField implements FixFieldIF
{   
    public static final int    TagID         =  49;
    public static final String TagIDAsString = "49";
    public static final char[] TagIDAsChars  = {'4','9'};
    public static final String TagName       = "SenderCompID";
    public static final String TagFixType    = "STRING";

    public static FixSenderCompIDField create(final char[] array, final int offset, final int length)
    {
        return create(new String(array, offset, length));
    }

    public static FixSenderCompIDField create(final String paramString)
    {
        return new FixSenderCompIDField()
        {   public String  valueString = paramString;
            public char[]  valueChars  = paramString.toCharArray();
            public char[]  getValueAsChars()                 {return valueChars;}                   
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
    public abstract char[] getValueAsChars();
}
