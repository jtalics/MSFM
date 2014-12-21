package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixBeginStringField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [8] (known as BeginString).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;

public abstract class FixBeginStringField implements FixFieldIF
{   
    public static final int    TagID         =  8;
    public static final String TagIDAsString = "8";
    public static final char[] TagIDAsChars  = {'8'};
    public static final String TagName       = "BeginString";
    public static final String TagFixType    = "STRING";

    public static final String  Fix42              = "FIX.4.2";
    public static final String  string_Fix42       = Fix42;
    public static final char[]  chars_Fix42        = {'F','I','X','.','4','.','2'};
    public static final String  tagged_Fix42       = TagIDAsString + EQUALS + string_Fix42 + SOH;
    public static final char[]  taggedchars_Fix42  = {'8', EQUALSchar, 'F','I','X','.','4','.','2', SOHchar};
    public static final String  text_Fix42         = "Fix42";

    private static FixBeginStringField flyweightFix42;
    public static final FixBeginStringField flyweightFix42()
    {
        if (flyweightFix42 == null)
        {
            synchronized(FixBeginStringField.class)
            {
                if (flyweightFix42 == null)
                {
                    flyweightFix42  = new FixBeginStringField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Fix42;}
                     public String  getValueDescription()             {return text_Fix42;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Fix42).append("|").append(text_Fix42).append("]").toString();}
                     public boolean isFix42()                         {return true;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Fix42);}
                    };
                }
            }
        }

        return flyweightFix42;
    }


    public boolean isFix42()   {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixBeginStringField create(char[] array, int offset, int length)
    {
        return create(new String(array, offset, length));
    }

    public static FixBeginStringField create(final String paramString)
    {                                                                                               
        if (Fix42.equals(paramString)) return flyweightFix42();
        return null;
    }                                                                                               
}
