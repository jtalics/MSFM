package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixIOISharesField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [27] (known as IOIShares).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;

public abstract class FixIOISharesField implements FixFieldIF
{   
    public static final int    TagID         =  27;
    public static final String TagIDAsString = "27";
    public static final char[] TagIDAsChars  = {'2','7'};
    public static final String TagName       = "IOIShares";
    public static final String TagFixType    = "STRING";

    public static final String  Small               = "S";
    public static final String  string_Small        = Small;
    public static final char[]  chars_Small         = {'S'};
    public static final String  tagged_Small        = TagIDAsString + EQUALS + string_Small + SOH;
    public static final char[]  taggedchars_Small   = {'2','7', EQUALSchar, 'S', SOHchar};
    public static final String  text_Small          = "Small";
    public static final String  Medium              = "M";
    public static final String  string_Medium       = Medium;
    public static final char[]  chars_Medium        = {'M'};
    public static final String  tagged_Medium       = TagIDAsString + EQUALS + string_Medium + SOH;
    public static final char[]  taggedchars_Medium  = {'2','7', EQUALSchar, 'M', SOHchar};
    public static final String  text_Medium         = "Medium";
    public static final String  Large               = "L";
    public static final String  string_Large        = Large;
    public static final char[]  chars_Large         = {'L'};
    public static final String  tagged_Large        = TagIDAsString + EQUALS + string_Large + SOH;
    public static final char[]  taggedchars_Large   = {'2','7', EQUALSchar, 'L', SOHchar};
    public static final String  text_Large          = "Large";

    private static FixIOISharesField flyweightSmall;
    public static final FixIOISharesField flyweightSmall()
    {
        if (flyweightSmall == null)
        {
            synchronized(FixIOISharesField.class)
            {
                if (flyweightSmall == null)
                {
                    flyweightSmall  = new FixIOISharesField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Small;}
                     public String  getValueDescription()             {return text_Small;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Small).append("|").append(text_Small).append("]").toString();}
                     public boolean isSmall()                         {return true;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Small);}
                    };
                }
            }
        }

        return flyweightSmall;
    }

    private static FixIOISharesField flyweightMedium;
    public static final FixIOISharesField flyweightMedium()
    {
        if (flyweightMedium == null)
        {
            synchronized(FixIOISharesField.class)
            {
                if (flyweightMedium == null)
                {
                    flyweightMedium  = new FixIOISharesField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Medium;}
                     public String  getValueDescription()             {return text_Medium;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Medium).append("|").append(text_Medium).append("]").toString();}
                     public boolean isMedium()                        {return true;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Medium);}
                    };
                }
            }
        }

        return flyweightMedium;
    }

    private static FixIOISharesField flyweightLarge;
    public static final FixIOISharesField flyweightLarge()
    {
        if (flyweightLarge == null)
        {
            synchronized(FixIOISharesField.class)
            {
                if (flyweightLarge == null)
                {
                    flyweightLarge  = new FixIOISharesField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Large;}
                     public String  getValueDescription()             {return text_Large;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Large).append("|").append(text_Large).append("]").toString();}
                     public boolean isLarge()                         {return true;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Large);}
                    };
                }
            }
        }

        return flyweightLarge;
    }


    public boolean isSmall()    {return false;}
    public boolean isMedium()   {return false;}
    public boolean isLarge()    {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixIOISharesField create(char[] array, int offset, int length)
    {
        return create(new String(array, offset, length));
    }

    public static FixIOISharesField create(final String paramString)
    {                                                                                               
        if (Small.equals(paramString)) return flyweightSmall();
        if (Medium.equals(paramString)) return flyweightMedium();
        if (Large.equals(paramString)) return flyweightLarge();
        return new FixIOISharesField()
        {       public String  valueString = paramString;
                public boolean hasValue()                        {return valueString != null;}
                public String  getValue()                        {return valueString;}
                public String  getValueDescription()             {return valueString;}
        };
    }                                                                                               
}