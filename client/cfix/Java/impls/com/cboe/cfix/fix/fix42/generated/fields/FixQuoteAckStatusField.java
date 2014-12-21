package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixQuoteAckStatusField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [297] (known as QuoteAckStatus).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixQuoteAckStatusField implements FixFieldIF, HasIntValueIF
{   
    public static final int    TagID         =  297;
    public static final String TagIDAsString = "297";
    public static final char[] TagIDAsChars  = {'2','9','7'};
    public static final String TagName       = "QuoteAckStatus";
    public static final String TagFixType    = "INT";
    public static final char[]  taggedchars_value0 = {'2','9','7', EQUALSchar, ZEROchar, SOHchar};
    public static final char[]  taggedchars_value1 = {'2','9','7', EQUALSchar, ONEchar,  SOHchar};

    public static final int     Accepted                             = 0;
    public static final String  string_Accepted                      = "0";
    public static final String  tagged_Accepted                      = TagIDAsString + EQUALS + string_Accepted + SOH;
    public static final char[]  taggedchars_Accepted                 = {'2','9','7', EQUALSchar, '0', SOHchar};
    public static final String  text_Accepted                        = "Accepted";
    public static final int     CanceledForSymbol                    = 1;
    public static final String  string_CanceledForSymbol             = "1";
    public static final String  tagged_CanceledForSymbol             = TagIDAsString + EQUALS + string_CanceledForSymbol + SOH;
    public static final char[]  taggedchars_CanceledForSymbol        = {'2','9','7', EQUALSchar, '1', SOHchar};
    public static final String  text_CanceledForSymbol               = "CanceledForSymbol";
    public static final int     CanceledForSecurityType              = 2;
    public static final String  string_CanceledForSecurityType       = "2";
    public static final String  tagged_CanceledForSecurityType       = TagIDAsString + EQUALS + string_CanceledForSecurityType + SOH;
    public static final char[]  taggedchars_CanceledForSecurityType  = {'2','9','7', EQUALSchar, '2', SOHchar};
    public static final String  text_CanceledForSecurityType         = "CanceledForSecurityType";
    public static final int     CanceledForUnderlying                = 3;
    public static final String  string_CanceledForUnderlying         = "3";
    public static final String  tagged_CanceledForUnderlying         = TagIDAsString + EQUALS + string_CanceledForUnderlying + SOH;
    public static final char[]  taggedchars_CanceledForUnderlying    = {'2','9','7', EQUALSchar, '3', SOHchar};
    public static final String  text_CanceledForUnderlying           = "CanceledForUnderlying";
    public static final int     CanceledAll                          = 4;
    public static final String  string_CanceledAll                   = "4";
    public static final String  tagged_CanceledAll                   = TagIDAsString + EQUALS + string_CanceledAll + SOH;
    public static final char[]  taggedchars_CanceledAll              = {'2','9','7', EQUALSchar, '4', SOHchar};
    public static final String  text_CanceledAll                     = "CanceledAll";
    public static final int     Rejected                             = 5;
    public static final String  string_Rejected                      = "5";
    public static final String  tagged_Rejected                      = TagIDAsString + EQUALS + string_Rejected + SOH;
    public static final char[]  taggedchars_Rejected                 = {'2','9','7', EQUALSchar, '5', SOHchar};
    public static final String  text_Rejected                        = "Rejected";
    public static final int     QrmOnly                              = 6;
    public static final String  string_QrmOnly                       = "6";
    public static final String  tagged_QrmOnly                       = TagIDAsString + EQUALS + string_QrmOnly + SOH;
    public static final char[]  taggedchars_QrmOnly                  = {'2','9','7', EQUALSchar, '6', SOHchar};
    public static final String  text_QrmOnly                         = "QrmOnly";

    private static FixQuoteAckStatusField flyweightAccepted;
    public static final FixQuoteAckStatusField flyweightAccepted()
    {
        if (flyweightAccepted == null)
        {
            synchronized(FixQuoteAckStatusField.class)
            {
                if (flyweightAccepted == null)
                {
                    flyweightAccepted  = new FixQuoteAckStatusField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Accepted;}
                     public String  getValueDescription()             {return text_Accepted;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Accepted).append("|").append(text_Accepted).append("]").toString();}
                     public boolean isAccepted()                      {return true;}
                     public int     intValue()                        {return Accepted;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Accepted);}
                    };
                }
            }
        }

        return flyweightAccepted;
    }

    private static FixQuoteAckStatusField flyweightCanceledForSymbol;
    public static final FixQuoteAckStatusField flyweightCanceledForSymbol()
    {
        if (flyweightCanceledForSymbol == null)
        {
            synchronized(FixQuoteAckStatusField.class)
            {
                if (flyweightCanceledForSymbol == null)
                {
                    flyweightCanceledForSymbol  = new FixQuoteAckStatusField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_CanceledForSymbol;}
                     public String  getValueDescription()             {return text_CanceledForSymbol;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_CanceledForSymbol).append("|").append(text_CanceledForSymbol).append("]").toString();}
                     public boolean isCanceledForSymbol()             {return true;}
                     public int     intValue()                        {return CanceledForSymbol;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_CanceledForSymbol);}
                    };
                }
            }
        }

        return flyweightCanceledForSymbol;
    }

    private static FixQuoteAckStatusField flyweightCanceledForSecurityType;
    public static final FixQuoteAckStatusField flyweightCanceledForSecurityType()
    {
        if (flyweightCanceledForSecurityType == null)
        {
            synchronized(FixQuoteAckStatusField.class)
            {
                if (flyweightCanceledForSecurityType == null)
                {
                    flyweightCanceledForSecurityType  = new FixQuoteAckStatusField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_CanceledForSecurityType;}
                     public String  getValueDescription()             {return text_CanceledForSecurityType;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_CanceledForSecurityType).append("|").append(text_CanceledForSecurityType).append("]").toString();}
                     public boolean isCanceledForSecurityType()       {return true;}
                     public int     intValue()                        {return CanceledForSecurityType;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_CanceledForSecurityType);}
                    };
                }
            }
        }

        return flyweightCanceledForSecurityType;
    }

    private static FixQuoteAckStatusField flyweightCanceledForUnderlying;
    public static final FixQuoteAckStatusField flyweightCanceledForUnderlying()
    {
        if (flyweightCanceledForUnderlying == null)
        {
            synchronized(FixQuoteAckStatusField.class)
            {
                if (flyweightCanceledForUnderlying == null)
                {
                    flyweightCanceledForUnderlying  = new FixQuoteAckStatusField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_CanceledForUnderlying;}
                     public String  getValueDescription()             {return text_CanceledForUnderlying;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_CanceledForUnderlying).append("|").append(text_CanceledForUnderlying).append("]").toString();}
                     public boolean isCanceledForUnderlying()         {return true;}
                     public int     intValue()                        {return CanceledForUnderlying;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_CanceledForUnderlying);}
                    };
                }
            }
        }

        return flyweightCanceledForUnderlying;
    }

    private static FixQuoteAckStatusField flyweightCanceledAll;
    public static final FixQuoteAckStatusField flyweightCanceledAll()
    {
        if (flyweightCanceledAll == null)
        {
            synchronized(FixQuoteAckStatusField.class)
            {
                if (flyweightCanceledAll == null)
                {
                    flyweightCanceledAll  = new FixQuoteAckStatusField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_CanceledAll;}
                     public String  getValueDescription()             {return text_CanceledAll;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_CanceledAll).append("|").append(text_CanceledAll).append("]").toString();}
                     public boolean isCanceledAll()                   {return true;}
                     public int     intValue()                        {return CanceledAll;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_CanceledAll);}
                    };
                }
            }
        }

        return flyweightCanceledAll;
    }

    private static FixQuoteAckStatusField flyweightRejected;
    public static final FixQuoteAckStatusField flyweightRejected()
    {
        if (flyweightRejected == null)
        {
            synchronized(FixQuoteAckStatusField.class)
            {
                if (flyweightRejected == null)
                {
                    flyweightRejected  = new FixQuoteAckStatusField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Rejected;}
                     public String  getValueDescription()             {return text_Rejected;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Rejected).append("|").append(text_Rejected).append("]").toString();}
                     public boolean isRejected()                      {return true;}
                     public int     intValue()                        {return Rejected;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Rejected);}
                    };
                }
            }
        }

        return flyweightRejected;
    }

    private static FixQuoteAckStatusField flyweightQrmOnly;
    public static final FixQuoteAckStatusField flyweightQrmOnly()
    {
        if (flyweightQrmOnly == null)
        {
            synchronized(FixQuoteAckStatusField.class)
            {
                if (flyweightQrmOnly == null)
                {
                    flyweightQrmOnly  = new FixQuoteAckStatusField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_QrmOnly;}
                     public String  getValueDescription()             {return text_QrmOnly;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_QrmOnly).append("|").append(text_QrmOnly).append("]").toString();}
                     public boolean isQrmOnly()                       {return true;}
                     public int     intValue()                        {return QrmOnly;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_QrmOnly);}
                    };
                }
            }
        }

        return flyweightQrmOnly;
    }


    public boolean isAccepted()                  {return false;}
    public boolean isCanceledForSymbol()         {return false;}
    public boolean isCanceledForSecurityType()   {return false;}
    public boolean isCanceledForUnderlying()     {return false;}
    public boolean isCanceledAll()               {return false;}
    public boolean isRejected()                  {return false;}
    public boolean isQrmOnly()                   {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixQuoteAckStatusField create(char[] array, int offset, int length)
    {
        int param = IntegerHelper.parseInt(array, offset, length);
        if (param == IntegerHelper.INVALID_VALUE)
        {
            return null;
        }
        return create(param);
    }

    public static FixQuoteAckStatusField create(final int param)
    {
        switch (param)
        {                                                                                           
            case Accepted:                return flyweightAccepted();
            case CanceledForSymbol:       return flyweightCanceledForSymbol();
            case CanceledForSecurityType: return flyweightCanceledForSecurityType();
            case CanceledForUnderlying:   return flyweightCanceledForUnderlying();
            case CanceledAll:             return flyweightCanceledAll();
            case Rejected:                return flyweightRejected();
            case QrmOnly:                 return flyweightQrmOnly();
        }
                                                                                                    
        return new FixQuoteAckStatusField()
        {       public int     value = param;
                public boolean hasValue()                                    {return true;}
                public String  getValue()                                    {return StringHelper.intToString(value);}
                public int     intValue()                                    {return QrmOnly;}
                public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, value);}
        };
    }                                                                                               
}
