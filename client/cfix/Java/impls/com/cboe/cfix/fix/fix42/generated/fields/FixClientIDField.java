package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixClientIDField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [109] (known as ClientID).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;

public abstract class FixClientIDField implements FixFieldIF
{   
    public static final int    TagID         =  109;
    public static final String TagIDAsString = "109";
    public static final char[] TagIDAsChars  = {'1','0','9'};
    public static final String TagName       = "ClientID";
    public static final String TagFixType    = "STRING";

    public static FixClientIDField create(final char[] array, final int offset, final int length)
    {
        return create(new String(array, offset, length));
    }

    public static FixClientIDField create(final String paramString)
    {
        return new FixClientIDField()
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
