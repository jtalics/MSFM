package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixCboeLegalMarketField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [9316] (known as CboeLegalMarket).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;

public abstract class FixCboeLegalMarketField implements FixFieldIF, HasBooleanValueIF
{   
    public static final int    TagID         =  9316;
    public static final String TagIDAsString = "9316";
    public static final char[] TagIDAsChars  = {'9','3','1','6'};
    public static final String TagName       = "CboeLegalMarket";
    public static final String TagFixType    = "BOOLEAN";

    public static final boolean YesLegal              = true;
    public static final String  string_YesLegal       = FIX_YES;
    public static final String  tagged_YesLegal       = TagIDAsString + EQUALS + string_YesLegal + SOH;
    public static final char    char_YesLegal         = 'Y';
    public static final char[]  taggedchars_YesLegal  = {'9','3','1','6', EQUALSchar, 'Y', SOHchar};
    public static final String  text_YesLegal         = "YesLegal";
    public static final boolean NotLegal              = false;
    public static final String  string_NotLegal       = FIX_NO;
    public static final String  tagged_NotLegal       = TagIDAsString + EQUALS + string_NotLegal + SOH;
    public static final char    char_NotLegal         = 'N';
    public static final char[]  taggedchars_NotLegal  = {'9','3','1','6', EQUALSchar, 'N', SOHchar};
    public static final String  text_NotLegal         = "NotLegal";

    private static FixCboeLegalMarketField flyweightYesLegal;
    public static final FixCboeLegalMarketField flyweightYesLegal()
    {
        if (flyweightYesLegal == null)
        {
            synchronized(FixCboeLegalMarketField.class)
            {
                if (flyweightYesLegal == null)
                {
                    flyweightYesLegal  = new FixCboeLegalMarketField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_YesLegal;}
                     public String  getValueDescription()             {return text_YesLegal;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_YesLegal).append("|").append(text_YesLegal).append("]").toString();}
                     public boolean isYesLegal()                      {return true;}
                     public boolean booleanValue()                    {return YesLegal;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_YesLegal);}
                    };
                }
            }
        }

        return flyweightYesLegal;
    }

    private static FixCboeLegalMarketField flyweightNotLegal;
    public static final FixCboeLegalMarketField flyweightNotLegal()
    {
        if (flyweightNotLegal == null)
        {
            synchronized(FixCboeLegalMarketField.class)
            {
                if (flyweightNotLegal == null)
                {
                    flyweightNotLegal  = new FixCboeLegalMarketField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_NotLegal;}
                     public String  getValueDescription()             {return text_NotLegal;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_NotLegal).append("|").append(text_NotLegal).append("]").toString();}
                     public boolean isNotLegal()                      {return true;}
                     public boolean booleanValue()                    {return NotLegal;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_NotLegal);}
                    };
                }
            }
        }

        return flyweightNotLegal;
    }


    public boolean isYesLegal()   {return false;}
    public boolean isNotLegal()   {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixCboeLegalMarketField create(char[] array, int offset, int length)
    {
        if (length == 1)
        {                                                                                           
            if (array[offset] == char_YesLegal) return flyweightYesLegal();
            if (array[offset] == char_NotLegal) return flyweightNotLegal();
        }
        return null;
    }

    public static final char[] truefalse_Flyweight  = new char[] {FixFieldIF.FIX_YESchar, FixFieldIF.FIX_NOchar};
    public static FixCboeLegalMarketField create(boolean param)
    {
        return create(truefalse_Flyweight, param ? 0 : 1, 1);
    }                                                                                               
}
