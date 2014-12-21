package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixCboeApplicationQueueActionRequestField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [6700] (known as CboeApplicationQueueActionRequest).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixCboeApplicationQueueActionRequestField implements FixFieldIF, HasCharValueIF
{   
    public static final int    TagID         =  6700;
    public static final String TagIDAsString = "6700";
    public static final char[] TagIDAsChars  = {'6','7','0','0'};
    public static final String TagName       = "CboeApplicationQueueActionRequest";
    public static final String TagFixType    = "CHAR";

    public static final char    NormalProcessing              = '0';
    public static final String  string_NormalProcessing       = "0";
    public static final String  tagged_NormalProcessing       = TagIDAsString + EQUALS + string_NormalProcessing + SOH;
    public static final char[]  taggedchars_NormalProcessing  = {'6','7','0','0', EQUALSchar, '0', SOHchar};
    public static final String  text_NormalProcessing         = "NormalProcessing";
    public static final char    FlushQueue                    = '1';
    public static final String  string_FlushQueue             = "1";
    public static final String  tagged_FlushQueue             = TagIDAsString + EQUALS + string_FlushQueue + SOH;
    public static final char[]  taggedchars_FlushQueue        = {'6','7','0','0', EQUALSchar, '1', SOHchar};
    public static final String  text_FlushQueue               = "FlushQueue";
    public static final char    OverlayLast                   = '2';
    public static final String  string_OverlayLast            = "2";
    public static final String  tagged_OverlayLast            = TagIDAsString + EQUALS + string_OverlayLast + SOH;
    public static final char[]  taggedchars_OverlayLast       = {'6','7','0','0', EQUALSchar, '2', SOHchar};
    public static final String  text_OverlayLast              = "OverlayLast";
    public static final char    EndSubscription               = '3';
    public static final String  string_EndSubscription        = "3";
    public static final String  tagged_EndSubscription        = TagIDAsString + EQUALS + string_EndSubscription + SOH;
    public static final char[]  taggedchars_EndSubscription   = {'6','7','0','0', EQUALSchar, '3', SOHchar};
    public static final String  text_EndSubscription          = "EndSubscription";

    private static FixCboeApplicationQueueActionRequestField flyweightNormalProcessing;
    public static final FixCboeApplicationQueueActionRequestField flyweightNormalProcessing()
    {
        if (flyweightNormalProcessing == null)
        {
            synchronized(FixCboeApplicationQueueActionRequestField.class)
            {
                if (flyweightNormalProcessing == null)
                {
                    flyweightNormalProcessing  = new FixCboeApplicationQueueActionRequestField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_NormalProcessing;}
                     public String  getValueDescription()             {return text_NormalProcessing;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_NormalProcessing).append("|").append(text_NormalProcessing).append("]").toString();}
                     public boolean isNormalProcessing()              {return true;}
                     public char    charValue()                       {return NormalProcessing;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_NormalProcessing);}
                    };
                }
            }
        }

        return flyweightNormalProcessing;
    }

    private static FixCboeApplicationQueueActionRequestField flyweightFlushQueue;
    public static final FixCboeApplicationQueueActionRequestField flyweightFlushQueue()
    {
        if (flyweightFlushQueue == null)
        {
            synchronized(FixCboeApplicationQueueActionRequestField.class)
            {
                if (flyweightFlushQueue == null)
                {
                    flyweightFlushQueue  = new FixCboeApplicationQueueActionRequestField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_FlushQueue;}
                     public String  getValueDescription()             {return text_FlushQueue;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_FlushQueue).append("|").append(text_FlushQueue).append("]").toString();}
                     public boolean isFlushQueue()                    {return true;}
                     public char    charValue()                       {return FlushQueue;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_FlushQueue);}
                    };
                }
            }
        }

        return flyweightFlushQueue;
    }

    private static FixCboeApplicationQueueActionRequestField flyweightOverlayLast;
    public static final FixCboeApplicationQueueActionRequestField flyweightOverlayLast()
    {
        if (flyweightOverlayLast == null)
        {
            synchronized(FixCboeApplicationQueueActionRequestField.class)
            {
                if (flyweightOverlayLast == null)
                {
                    flyweightOverlayLast  = new FixCboeApplicationQueueActionRequestField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_OverlayLast;}
                     public String  getValueDescription()             {return text_OverlayLast;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_OverlayLast).append("|").append(text_OverlayLast).append("]").toString();}
                     public boolean isOverlayLast()                   {return true;}
                     public char    charValue()                       {return OverlayLast;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_OverlayLast);}
                    };
                }
            }
        }

        return flyweightOverlayLast;
    }

    private static FixCboeApplicationQueueActionRequestField flyweightEndSubscription;
    public static final FixCboeApplicationQueueActionRequestField flyweightEndSubscription()
    {
        if (flyweightEndSubscription == null)
        {
            synchronized(FixCboeApplicationQueueActionRequestField.class)
            {
                if (flyweightEndSubscription == null)
                {
                    flyweightEndSubscription  = new FixCboeApplicationQueueActionRequestField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_EndSubscription;}
                     public String  getValueDescription()             {return text_EndSubscription;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_EndSubscription).append("|").append(text_EndSubscription).append("]").toString();}
                     public boolean isEndSubscription()               {return true;}
                     public char    charValue()                       {return EndSubscription;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_EndSubscription);}
                    };
                }
            }
        }

        return flyweightEndSubscription;
    }


    public boolean isNormalProcessing()   {return false;}
    public boolean isFlushQueue()         {return false;}
    public boolean isOverlayLast()        {return false;}
    public boolean isEndSubscription()    {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixCboeApplicationQueueActionRequestField create(char[] array, int offset, int length)
    {
        if (length == 1)
        {
            return create(array[offset]);
        }

        return null;
    }

    public static FixCboeApplicationQueueActionRequestField create(final char param)
    {
        switch (param)
        {                                                                                           
            case NormalProcessing: return flyweightNormalProcessing();
            case FlushQueue:       return flyweightFlushQueue();
            case OverlayLast:      return flyweightOverlayLast();
            case EndSubscription:  return flyweightEndSubscription();
        }
                                                                                                    
        return null;
    }                                                                                               
}
