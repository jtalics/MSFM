package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixAllocStatusField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [87] (known as AllocStatus).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixAllocStatusField implements FixFieldIF, HasIntValueIF
{   
    public static final int    TagID         =  87;
    public static final String TagIDAsString = "87";
    public static final char[] TagIDAsChars  = {'8','7'};
    public static final String TagName       = "AllocStatus";
    public static final String TagFixType    = "INT";
    public static final char[]  taggedchars_value0 = {'8','7', EQUALSchar, ZEROchar, SOHchar};
    public static final char[]  taggedchars_value1 = {'8','7', EQUALSchar, ONEchar,  SOHchar};

    public static final int     Accepted                       = 0;
    public static final String  string_Accepted                = "0";
    public static final String  tagged_Accepted                = TagIDAsString + EQUALS + string_Accepted + SOH;
    public static final char[]  taggedchars_Accepted           = {'8','7', EQUALSchar, '0', SOHchar};
    public static final String  text_Accepted                  = "Accepted";
    public static final int     Rejected                       = 1;
    public static final String  string_Rejected                = "1";
    public static final String  tagged_Rejected                = TagIDAsString + EQUALS + string_Rejected + SOH;
    public static final char[]  taggedchars_Rejected           = {'8','7', EQUALSchar, '1', SOHchar};
    public static final String  text_Rejected                  = "Rejected";
    public static final int     PartiallyAccepted              = 2;
    public static final String  string_PartiallyAccepted       = "2";
    public static final String  tagged_PartiallyAccepted       = TagIDAsString + EQUALS + string_PartiallyAccepted + SOH;
    public static final char[]  taggedchars_PartiallyAccepted  = {'8','7', EQUALSchar, '2', SOHchar};
    public static final String  text_PartiallyAccepted         = "PartiallyAccepted";
    public static final int     Received                       = 3;
    public static final String  string_Received                = "3";
    public static final String  tagged_Received                = TagIDAsString + EQUALS + string_Received + SOH;
    public static final char[]  taggedchars_Received           = {'8','7', EQUALSchar, '3', SOHchar};
    public static final String  text_Received                  = "Received";

    private static FixAllocStatusField flyweightAccepted;
    public static final FixAllocStatusField flyweightAccepted()
    {
        if (flyweightAccepted == null)
        {
            synchronized(FixAllocStatusField.class)
            {
                if (flyweightAccepted == null)
                {
                    flyweightAccepted  = new FixAllocStatusField()
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

    private static FixAllocStatusField flyweightRejected;
    public static final FixAllocStatusField flyweightRejected()
    {
        if (flyweightRejected == null)
        {
            synchronized(FixAllocStatusField.class)
            {
                if (flyweightRejected == null)
                {
                    flyweightRejected  = new FixAllocStatusField()
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

    private static FixAllocStatusField flyweightPartiallyAccepted;
    public static final FixAllocStatusField flyweightPartiallyAccepted()
    {
        if (flyweightPartiallyAccepted == null)
        {
            synchronized(FixAllocStatusField.class)
            {
                if (flyweightPartiallyAccepted == null)
                {
                    flyweightPartiallyAccepted  = new FixAllocStatusField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_PartiallyAccepted;}
                     public String  getValueDescription()             {return text_PartiallyAccepted;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_PartiallyAccepted).append("|").append(text_PartiallyAccepted).append("]").toString();}
                     public boolean isPartiallyAccepted()             {return true;}
                     public int     intValue()                        {return PartiallyAccepted;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_PartiallyAccepted);}
                    };
                }
            }
        }

        return flyweightPartiallyAccepted;
    }

    private static FixAllocStatusField flyweightReceived;
    public static final FixAllocStatusField flyweightReceived()
    {
        if (flyweightReceived == null)
        {
            synchronized(FixAllocStatusField.class)
            {
                if (flyweightReceived == null)
                {
                    flyweightReceived  = new FixAllocStatusField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Received;}
                     public String  getValueDescription()             {return text_Received;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Received).append("|").append(text_Received).append("]").toString();}
                     public boolean isReceived()                      {return true;}
                     public int     intValue()                        {return Received;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Received);}
                    };
                }
            }
        }

        return flyweightReceived;
    }


    public boolean isAccepted()            {return false;}
    public boolean isRejected()            {return false;}
    public boolean isPartiallyAccepted()   {return false;}
    public boolean isReceived()            {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixAllocStatusField create(char[] array, int offset, int length)
    {
        int param = IntegerHelper.parseInt(array, offset, length);
        if (param == IntegerHelper.INVALID_VALUE)
        {
            return null;
        }
        return create(param);
    }

    public static FixAllocStatusField create(final int param)
    {
        switch (param)
        {                                                                                           
            case Accepted:          return flyweightAccepted();
            case Rejected:          return flyweightRejected();
            case PartiallyAccepted: return flyweightPartiallyAccepted();
            case Received:          return flyweightReceived();
        }
                                                                                                    
        return null;
    }                                                                                               
}
