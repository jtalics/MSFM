package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixMiscFeeTypeField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [139] (known as MiscFeeType).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixMiscFeeTypeField implements FixFieldIF, HasCharValueIF
{   
    public static final int    TagID         =  139;
    public static final String TagIDAsString = "139";
    public static final char[] TagIDAsChars  = {'1','3','9'};
    public static final String TagName       = "MiscFeeType";
    public static final String TagFixType    = "CHAR";

    public static final char    Regulatory                   = '1';
    public static final String  string_Regulatory            = "1";
    public static final String  tagged_Regulatory            = TagIDAsString + EQUALS + string_Regulatory + SOH;
    public static final char[]  taggedchars_Regulatory       = {'1','3','9', EQUALSchar, '1', SOHchar};
    public static final String  text_Regulatory              = "Regulatory";
    public static final char    Tax                          = '2';
    public static final String  string_Tax                   = "2";
    public static final String  tagged_Tax                   = TagIDAsString + EQUALS + string_Tax + SOH;
    public static final char[]  taggedchars_Tax              = {'1','3','9', EQUALSchar, '2', SOHchar};
    public static final String  text_Tax                     = "Tax";
    public static final char    LocalCommission              = '3';
    public static final String  string_LocalCommission       = "3";
    public static final String  tagged_LocalCommission       = TagIDAsString + EQUALS + string_LocalCommission + SOH;
    public static final char[]  taggedchars_LocalCommission  = {'1','3','9', EQUALSchar, '3', SOHchar};
    public static final String  text_LocalCommission         = "LocalCommission";
    public static final char    ExchangeFees                 = '4';
    public static final String  string_ExchangeFees          = "4";
    public static final String  tagged_ExchangeFees          = TagIDAsString + EQUALS + string_ExchangeFees + SOH;
    public static final char[]  taggedchars_ExchangeFees     = {'1','3','9', EQUALSchar, '4', SOHchar};
    public static final String  text_ExchangeFees            = "ExchangeFees";
    public static final char    Stamp                        = '5';
    public static final String  string_Stamp                 = "5";
    public static final String  tagged_Stamp                 = TagIDAsString + EQUALS + string_Stamp + SOH;
    public static final char[]  taggedchars_Stamp            = {'1','3','9', EQUALSchar, '5', SOHchar};
    public static final String  text_Stamp                   = "Stamp";
    public static final char    Levy                         = '6';
    public static final String  string_Levy                  = "6";
    public static final String  tagged_Levy                  = TagIDAsString + EQUALS + string_Levy + SOH;
    public static final char[]  taggedchars_Levy             = {'1','3','9', EQUALSchar, '6', SOHchar};
    public static final String  text_Levy                    = "Levy";
    public static final char    Other                        = '7';
    public static final String  string_Other                 = "7";
    public static final String  tagged_Other                 = TagIDAsString + EQUALS + string_Other + SOH;
    public static final char[]  taggedchars_Other            = {'1','3','9', EQUALSchar, '7', SOHchar};
    public static final String  text_Other                   = "Other";
    public static final char    Markup                       = '8';
    public static final String  string_Markup                = "8";
    public static final String  tagged_Markup                = TagIDAsString + EQUALS + string_Markup + SOH;
    public static final char[]  taggedchars_Markup           = {'1','3','9', EQUALSchar, '8', SOHchar};
    public static final String  text_Markup                  = "Markup";
    public static final char    ConsumptionTax               = '9';
    public static final String  string_ConsumptionTax        = "9";
    public static final String  tagged_ConsumptionTax        = TagIDAsString + EQUALS + string_ConsumptionTax + SOH;
    public static final char[]  taggedchars_ConsumptionTax   = {'1','3','9', EQUALSchar, '9', SOHchar};
    public static final String  text_ConsumptionTax          = "ConsumptionTax";

    private static FixMiscFeeTypeField flyweightRegulatory;
    public static final FixMiscFeeTypeField flyweightRegulatory()
    {
        if (flyweightRegulatory == null)
        {
            synchronized(FixMiscFeeTypeField.class)
            {
                if (flyweightRegulatory == null)
                {
                    flyweightRegulatory  = new FixMiscFeeTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Regulatory;}
                     public String  getValueDescription()             {return text_Regulatory;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Regulatory).append("|").append(text_Regulatory).append("]").toString();}
                     public boolean isRegulatory()                    {return true;}
                     public char    charValue()                       {return Regulatory;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Regulatory);}
                    };
                }
            }
        }

        return flyweightRegulatory;
    }

    private static FixMiscFeeTypeField flyweightTax;
    public static final FixMiscFeeTypeField flyweightTax()
    {
        if (flyweightTax == null)
        {
            synchronized(FixMiscFeeTypeField.class)
            {
                if (flyweightTax == null)
                {
                    flyweightTax  = new FixMiscFeeTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Tax;}
                     public String  getValueDescription()             {return text_Tax;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Tax).append("|").append(text_Tax).append("]").toString();}
                     public boolean isTax()                           {return true;}
                     public char    charValue()                       {return Tax;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Tax);}
                    };
                }
            }
        }

        return flyweightTax;
    }

    private static FixMiscFeeTypeField flyweightLocalCommission;
    public static final FixMiscFeeTypeField flyweightLocalCommission()
    {
        if (flyweightLocalCommission == null)
        {
            synchronized(FixMiscFeeTypeField.class)
            {
                if (flyweightLocalCommission == null)
                {
                    flyweightLocalCommission  = new FixMiscFeeTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_LocalCommission;}
                     public String  getValueDescription()             {return text_LocalCommission;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_LocalCommission).append("|").append(text_LocalCommission).append("]").toString();}
                     public boolean isLocalCommission()               {return true;}
                     public char    charValue()                       {return LocalCommission;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_LocalCommission);}
                    };
                }
            }
        }

        return flyweightLocalCommission;
    }

    private static FixMiscFeeTypeField flyweightExchangeFees;
    public static final FixMiscFeeTypeField flyweightExchangeFees()
    {
        if (flyweightExchangeFees == null)
        {
            synchronized(FixMiscFeeTypeField.class)
            {
                if (flyweightExchangeFees == null)
                {
                    flyweightExchangeFees  = new FixMiscFeeTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_ExchangeFees;}
                     public String  getValueDescription()             {return text_ExchangeFees;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_ExchangeFees).append("|").append(text_ExchangeFees).append("]").toString();}
                     public boolean isExchangeFees()                  {return true;}
                     public char    charValue()                       {return ExchangeFees;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_ExchangeFees);}
                    };
                }
            }
        }

        return flyweightExchangeFees;
    }

    private static FixMiscFeeTypeField flyweightStamp;
    public static final FixMiscFeeTypeField flyweightStamp()
    {
        if (flyweightStamp == null)
        {
            synchronized(FixMiscFeeTypeField.class)
            {
                if (flyweightStamp == null)
                {
                    flyweightStamp  = new FixMiscFeeTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Stamp;}
                     public String  getValueDescription()             {return text_Stamp;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Stamp).append("|").append(text_Stamp).append("]").toString();}
                     public boolean isStamp()                         {return true;}
                     public char    charValue()                       {return Stamp;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Stamp);}
                    };
                }
            }
        }

        return flyweightStamp;
    }

    private static FixMiscFeeTypeField flyweightLevy;
    public static final FixMiscFeeTypeField flyweightLevy()
    {
        if (flyweightLevy == null)
        {
            synchronized(FixMiscFeeTypeField.class)
            {
                if (flyweightLevy == null)
                {
                    flyweightLevy  = new FixMiscFeeTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Levy;}
                     public String  getValueDescription()             {return text_Levy;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Levy).append("|").append(text_Levy).append("]").toString();}
                     public boolean isLevy()                          {return true;}
                     public char    charValue()                       {return Levy;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Levy);}
                    };
                }
            }
        }

        return flyweightLevy;
    }

    private static FixMiscFeeTypeField flyweightOther;
    public static final FixMiscFeeTypeField flyweightOther()
    {
        if (flyweightOther == null)
        {
            synchronized(FixMiscFeeTypeField.class)
            {
                if (flyweightOther == null)
                {
                    flyweightOther  = new FixMiscFeeTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Other;}
                     public String  getValueDescription()             {return text_Other;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Other).append("|").append(text_Other).append("]").toString();}
                     public boolean isOther()                         {return true;}
                     public char    charValue()                       {return Other;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Other);}
                    };
                }
            }
        }

        return flyweightOther;
    }

    private static FixMiscFeeTypeField flyweightMarkup;
    public static final FixMiscFeeTypeField flyweightMarkup()
    {
        if (flyweightMarkup == null)
        {
            synchronized(FixMiscFeeTypeField.class)
            {
                if (flyweightMarkup == null)
                {
                    flyweightMarkup  = new FixMiscFeeTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Markup;}
                     public String  getValueDescription()             {return text_Markup;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Markup).append("|").append(text_Markup).append("]").toString();}
                     public boolean isMarkup()                        {return true;}
                     public char    charValue()                       {return Markup;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Markup);}
                    };
                }
            }
        }

        return flyweightMarkup;
    }

    private static FixMiscFeeTypeField flyweightConsumptionTax;
    public static final FixMiscFeeTypeField flyweightConsumptionTax()
    {
        if (flyweightConsumptionTax == null)
        {
            synchronized(FixMiscFeeTypeField.class)
            {
                if (flyweightConsumptionTax == null)
                {
                    flyweightConsumptionTax  = new FixMiscFeeTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_ConsumptionTax;}
                     public String  getValueDescription()             {return text_ConsumptionTax;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_ConsumptionTax).append("|").append(text_ConsumptionTax).append("]").toString();}
                     public boolean isConsumptionTax()                {return true;}
                     public char    charValue()                       {return ConsumptionTax;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_ConsumptionTax);}
                    };
                }
            }
        }

        return flyweightConsumptionTax;
    }


    public boolean isRegulatory()        {return false;}
    public boolean isTax()               {return false;}
    public boolean isLocalCommission()   {return false;}
    public boolean isExchangeFees()      {return false;}
    public boolean isStamp()             {return false;}
    public boolean isLevy()              {return false;}
    public boolean isOther()             {return false;}
    public boolean isMarkup()            {return false;}
    public boolean isConsumptionTax()    {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixMiscFeeTypeField create(char[] array, int offset, int length)
    {
        if (length == 1)
        {
            return create(array[offset]);
        }

        return null;
    }

    public static FixMiscFeeTypeField create(final char param)
    {
        switch (param)
        {                                                                                           
            case Regulatory:      return flyweightRegulatory();
            case Tax:             return flyweightTax();
            case LocalCommission: return flyweightLocalCommission();
            case ExchangeFees:    return flyweightExchangeFees();
            case Stamp:           return flyweightStamp();
            case Levy:            return flyweightLevy();
            case Other:           return flyweightOther();
            case Markup:          return flyweightMarkup();
            case ConsumptionTax:  return flyweightConsumptionTax();
        }
                                                                                                    
        return null;
    }                                                                                               
}
