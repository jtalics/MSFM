package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixSettlmntTypField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [63] (known as SettlmntTyp).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixSettlmntTypField implements FixFieldIF, HasCharValueIF
{   
    public static final int    TagID         =  63;
    public static final String TagIDAsString = "63";
    public static final char[] TagIDAsChars  = {'6','3'};
    public static final String TagName       = "SettlmntTyp";
    public static final String TagFixType    = "CHAR";

    public static final char    Regular                    = '0';
    public static final String  string_Regular             = "0";
    public static final String  tagged_Regular             = TagIDAsString + EQUALS + string_Regular + SOH;
    public static final char[]  taggedchars_Regular        = {'6','3', EQUALSchar, '0', SOHchar};
    public static final String  text_Regular               = "Regular";
    public static final char    Cash                       = '1';
    public static final String  string_Cash                = "1";
    public static final String  tagged_Cash                = TagIDAsString + EQUALS + string_Cash + SOH;
    public static final char[]  taggedchars_Cash           = {'6','3', EQUALSchar, '1', SOHchar};
    public static final String  text_Cash                  = "Cash";
    public static final char    NextDay                    = '2';
    public static final String  string_NextDay             = "2";
    public static final String  tagged_NextDay             = TagIDAsString + EQUALS + string_NextDay + SOH;
    public static final char[]  taggedchars_NextDay        = {'6','3', EQUALSchar, '2', SOHchar};
    public static final String  text_NextDay               = "NextDay";
    public static final char    Tplus2                     = '3';
    public static final String  string_Tplus2              = "3";
    public static final String  tagged_Tplus2              = TagIDAsString + EQUALS + string_Tplus2 + SOH;
    public static final char[]  taggedchars_Tplus2         = {'6','3', EQUALSchar, '3', SOHchar};
    public static final String  text_Tplus2                = "Tplus2";
    public static final char    Tplus3                     = '4';
    public static final String  string_Tplus3              = "4";
    public static final String  tagged_Tplus3              = TagIDAsString + EQUALS + string_Tplus3 + SOH;
    public static final char[]  taggedchars_Tplus3         = {'6','3', EQUALSchar, '4', SOHchar};
    public static final String  text_Tplus3                = "Tplus3";
    public static final char    Tplus4                     = '5';
    public static final String  string_Tplus4              = "5";
    public static final String  tagged_Tplus4              = TagIDAsString + EQUALS + string_Tplus4 + SOH;
    public static final char[]  taggedchars_Tplus4         = {'6','3', EQUALSchar, '5', SOHchar};
    public static final String  text_Tplus4                = "Tplus4";
    public static final char    Future                     = '6';
    public static final String  string_Future              = "6";
    public static final String  tagged_Future              = TagIDAsString + EQUALS + string_Future + SOH;
    public static final char[]  taggedchars_Future         = {'6','3', EQUALSchar, '6', SOHchar};
    public static final String  text_Future                = "Future";
    public static final char    WhenIssued                 = '7';
    public static final String  string_WhenIssued          = "7";
    public static final String  tagged_WhenIssued          = TagIDAsString + EQUALS + string_WhenIssued + SOH;
    public static final char[]  taggedchars_WhenIssued     = {'6','3', EQUALSchar, '7', SOHchar};
    public static final String  text_WhenIssued            = "WhenIssued";
    public static final char    SellersOption              = '8';
    public static final String  string_SellersOption       = "8";
    public static final String  tagged_SellersOption       = TagIDAsString + EQUALS + string_SellersOption + SOH;
    public static final char[]  taggedchars_SellersOption  = {'6','3', EQUALSchar, '8', SOHchar};
    public static final String  text_SellersOption         = "SellersOption";
    public static final char    Tplus5                     = '9';
    public static final String  string_Tplus5              = "9";
    public static final String  tagged_Tplus5              = TagIDAsString + EQUALS + string_Tplus5 + SOH;
    public static final char[]  taggedchars_Tplus5         = {'6','3', EQUALSchar, '9', SOHchar};
    public static final String  text_Tplus5                = "Tplus5";

    private static FixSettlmntTypField flyweightRegular;
    public static final FixSettlmntTypField flyweightRegular()
    {
        if (flyweightRegular == null)
        {
            synchronized(FixSettlmntTypField.class)
            {
                if (flyweightRegular == null)
                {
                    flyweightRegular  = new FixSettlmntTypField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Regular;}
                     public String  getValueDescription()             {return text_Regular;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Regular).append("|").append(text_Regular).append("]").toString();}
                     public boolean isRegular()                       {return true;}
                     public char    charValue()                       {return Regular;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Regular);}
                    };
                }
            }
        }

        return flyweightRegular;
    }

    private static FixSettlmntTypField flyweightCash;
    public static final FixSettlmntTypField flyweightCash()
    {
        if (flyweightCash == null)
        {
            synchronized(FixSettlmntTypField.class)
            {
                if (flyweightCash == null)
                {
                    flyweightCash  = new FixSettlmntTypField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Cash;}
                     public String  getValueDescription()             {return text_Cash;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Cash).append("|").append(text_Cash).append("]").toString();}
                     public boolean isCash()                          {return true;}
                     public char    charValue()                       {return Cash;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Cash);}
                    };
                }
            }
        }

        return flyweightCash;
    }

    private static FixSettlmntTypField flyweightNextDay;
    public static final FixSettlmntTypField flyweightNextDay()
    {
        if (flyweightNextDay == null)
        {
            synchronized(FixSettlmntTypField.class)
            {
                if (flyweightNextDay == null)
                {
                    flyweightNextDay  = new FixSettlmntTypField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_NextDay;}
                     public String  getValueDescription()             {return text_NextDay;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_NextDay).append("|").append(text_NextDay).append("]").toString();}
                     public boolean isNextDay()                       {return true;}
                     public char    charValue()                       {return NextDay;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_NextDay);}
                    };
                }
            }
        }

        return flyweightNextDay;
    }

    private static FixSettlmntTypField flyweightTplus2;
    public static final FixSettlmntTypField flyweightTplus2()
    {
        if (flyweightTplus2 == null)
        {
            synchronized(FixSettlmntTypField.class)
            {
                if (flyweightTplus2 == null)
                {
                    flyweightTplus2  = new FixSettlmntTypField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Tplus2;}
                     public String  getValueDescription()             {return text_Tplus2;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Tplus2).append("|").append(text_Tplus2).append("]").toString();}
                     public boolean isTplus2()                        {return true;}
                     public char    charValue()                       {return Tplus2;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Tplus2);}
                    };
                }
            }
        }

        return flyweightTplus2;
    }

    private static FixSettlmntTypField flyweightTplus3;
    public static final FixSettlmntTypField flyweightTplus3()
    {
        if (flyweightTplus3 == null)
        {
            synchronized(FixSettlmntTypField.class)
            {
                if (flyweightTplus3 == null)
                {
                    flyweightTplus3  = new FixSettlmntTypField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Tplus3;}
                     public String  getValueDescription()             {return text_Tplus3;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Tplus3).append("|").append(text_Tplus3).append("]").toString();}
                     public boolean isTplus3()                        {return true;}
                     public char    charValue()                       {return Tplus3;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Tplus3);}
                    };
                }
            }
        }

        return flyweightTplus3;
    }

    private static FixSettlmntTypField flyweightTplus4;
    public static final FixSettlmntTypField flyweightTplus4()
    {
        if (flyweightTplus4 == null)
        {
            synchronized(FixSettlmntTypField.class)
            {
                if (flyweightTplus4 == null)
                {
                    flyweightTplus4  = new FixSettlmntTypField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Tplus4;}
                     public String  getValueDescription()             {return text_Tplus4;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Tplus4).append("|").append(text_Tplus4).append("]").toString();}
                     public boolean isTplus4()                        {return true;}
                     public char    charValue()                       {return Tplus4;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Tplus4);}
                    };
                }
            }
        }

        return flyweightTplus4;
    }

    private static FixSettlmntTypField flyweightFuture;
    public static final FixSettlmntTypField flyweightFuture()
    {
        if (flyweightFuture == null)
        {
            synchronized(FixSettlmntTypField.class)
            {
                if (flyweightFuture == null)
                {
                    flyweightFuture  = new FixSettlmntTypField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Future;}
                     public String  getValueDescription()             {return text_Future;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Future).append("|").append(text_Future).append("]").toString();}
                     public boolean isFuture()                        {return true;}
                     public char    charValue()                       {return Future;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Future);}
                    };
                }
            }
        }

        return flyweightFuture;
    }

    private static FixSettlmntTypField flyweightWhenIssued;
    public static final FixSettlmntTypField flyweightWhenIssued()
    {
        if (flyweightWhenIssued == null)
        {
            synchronized(FixSettlmntTypField.class)
            {
                if (flyweightWhenIssued == null)
                {
                    flyweightWhenIssued  = new FixSettlmntTypField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_WhenIssued;}
                     public String  getValueDescription()             {return text_WhenIssued;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_WhenIssued).append("|").append(text_WhenIssued).append("]").toString();}
                     public boolean isWhenIssued()                    {return true;}
                     public char    charValue()                       {return WhenIssued;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_WhenIssued);}
                    };
                }
            }
        }

        return flyweightWhenIssued;
    }

    private static FixSettlmntTypField flyweightSellersOption;
    public static final FixSettlmntTypField flyweightSellersOption()
    {
        if (flyweightSellersOption == null)
        {
            synchronized(FixSettlmntTypField.class)
            {
                if (flyweightSellersOption == null)
                {
                    flyweightSellersOption  = new FixSettlmntTypField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_SellersOption;}
                     public String  getValueDescription()             {return text_SellersOption;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_SellersOption).append("|").append(text_SellersOption).append("]").toString();}
                     public boolean isSellersOption()                 {return true;}
                     public char    charValue()                       {return SellersOption;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_SellersOption);}
                    };
                }
            }
        }

        return flyweightSellersOption;
    }

    private static FixSettlmntTypField flyweightTplus5;
    public static final FixSettlmntTypField flyweightTplus5()
    {
        if (flyweightTplus5 == null)
        {
            synchronized(FixSettlmntTypField.class)
            {
                if (flyweightTplus5 == null)
                {
                    flyweightTplus5  = new FixSettlmntTypField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Tplus5;}
                     public String  getValueDescription()             {return text_Tplus5;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Tplus5).append("|").append(text_Tplus5).append("]").toString();}
                     public boolean isTplus5()                        {return true;}
                     public char    charValue()                       {return Tplus5;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Tplus5);}
                    };
                }
            }
        }

        return flyweightTplus5;
    }


    public boolean isRegular()         {return false;}
    public boolean isCash()            {return false;}
    public boolean isNextDay()         {return false;}
    public boolean isTplus2()          {return false;}
    public boolean isTplus3()          {return false;}
    public boolean isTplus4()          {return false;}
    public boolean isFuture()          {return false;}
    public boolean isWhenIssued()      {return false;}
    public boolean isSellersOption()   {return false;}
    public boolean isTplus5()          {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixSettlmntTypField create(char[] array, int offset, int length)
    {
        if (length == 1)
        {
            return create(array[offset]);
        }

        return null;
    }

    public static FixSettlmntTypField create(final char param)
    {
        switch (param)
        {                                                                                           
            case Regular:       return flyweightRegular();
            case Cash:          return flyweightCash();
            case NextDay:       return flyweightNextDay();
            case Tplus2:        return flyweightTplus2();
            case Tplus3:        return flyweightTplus3();
            case Tplus4:        return flyweightTplus4();
            case Future:        return flyweightFuture();
            case WhenIssued:    return flyweightWhenIssued();
            case SellersOption: return flyweightSellersOption();
            case Tplus5:        return flyweightTplus5();
        }
                                                                                                    
        return null;
    }                                                                                               
}