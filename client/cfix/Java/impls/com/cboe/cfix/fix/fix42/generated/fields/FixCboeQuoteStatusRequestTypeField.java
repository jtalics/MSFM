package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixCboeQuoteStatusRequestTypeField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [5349] (known as CboeQuoteStatusRequestType).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixCboeQuoteStatusRequestTypeField implements FixFieldIF, HasCharValueIF
{   
    public static final int    TagID         =  5349;
    public static final String TagIDAsString = "5349";
    public static final char[] TagIDAsChars  = {'5','3','4','9'};
    public static final String TagName       = "CboeQuoteStatusRequestType";
    public static final String TagFixType    = "CHAR";

    public static final char    TradeNotification              = 'a';
    public static final String  string_TradeNotification       = "a";
    public static final String  tagged_TradeNotification       = TagIDAsString + EQUALS + string_TradeNotification + SOH;
    public static final char[]  taggedchars_TradeNotification  = {'5','3','4','9', EQUALSchar, 'a', SOHchar};
    public static final String  text_TradeNotification         = "TradeNotification";

    private static FixCboeQuoteStatusRequestTypeField flyweightTradeNotification;
    public static final FixCboeQuoteStatusRequestTypeField flyweightTradeNotification()
    {
        if (flyweightTradeNotification == null)
        {
            synchronized(FixCboeQuoteStatusRequestTypeField.class)
            {
                if (flyweightTradeNotification == null)
                {
                    flyweightTradeNotification  = new FixCboeQuoteStatusRequestTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_TradeNotification;}
                     public String  getValueDescription()             {return text_TradeNotification;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_TradeNotification).append("|").append(text_TradeNotification).append("]").toString();}
                     public boolean isTradeNotification()             {return true;}
                     public char    charValue()                       {return TradeNotification;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_TradeNotification);}
                    };
                }
            }
        }

        return flyweightTradeNotification;
    }


    public boolean isTradeNotification()   {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixCboeQuoteStatusRequestTypeField create(char[] array, int offset, int length)
    {
        if (length == 1)
        {
            return create(array[offset]);
        }

        return null;
    }

    public static FixCboeQuoteStatusRequestTypeField create(final char param)
    {
        switch (param)
        {                                                                                           
            case TradeNotification: return flyweightTradeNotification();
        }
                                                                                                    
        return null;
    }                                                                                               
}