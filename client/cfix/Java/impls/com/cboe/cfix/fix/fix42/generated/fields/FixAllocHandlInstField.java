package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixAllocHandlInstField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [209] (known as AllocHandlInst).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixAllocHandlInstField implements FixFieldIF, HasIntValueIF
{   
    public static final int    TagID         =  209;
    public static final String TagIDAsString = "209";
    public static final char[] TagIDAsChars  = {'2','0','9'};
    public static final String TagName       = "AllocHandlInst";
    public static final String TagFixType    = "INT";
    public static final char[]  taggedchars_value0 = {'2','0','9', EQUALSchar, ZEROchar, SOHchar};
    public static final char[]  taggedchars_value1 = {'2','0','9', EQUALSchar, ONEchar,  SOHchar};

    public static final int     Match                        = 1;
    public static final String  string_Match                 = "1";
    public static final String  tagged_Match                 = TagIDAsString + EQUALS + string_Match + SOH;
    public static final char[]  taggedchars_Match            = {'2','0','9', EQUALSchar, '1', SOHchar};
    public static final String  text_Match                   = "Match";
    public static final int     Forward                      = 2;
    public static final String  string_Forward               = "2";
    public static final String  tagged_Forward               = TagIDAsString + EQUALS + string_Forward + SOH;
    public static final char[]  taggedchars_Forward          = {'2','0','9', EQUALSchar, '2', SOHchar};
    public static final String  text_Forward                 = "Forward";
    public static final int     ForwardAndMatch              = 3;
    public static final String  string_ForwardAndMatch       = "3";
    public static final String  tagged_ForwardAndMatch       = TagIDAsString + EQUALS + string_ForwardAndMatch + SOH;
    public static final char[]  taggedchars_ForwardAndMatch  = {'2','0','9', EQUALSchar, '3', SOHchar};
    public static final String  text_ForwardAndMatch         = "ForwardAndMatch";

    private static FixAllocHandlInstField flyweightMatch;
    public static final FixAllocHandlInstField flyweightMatch()
    {
        if (flyweightMatch == null)
        {
            synchronized(FixAllocHandlInstField.class)
            {
                if (flyweightMatch == null)
                {
                    flyweightMatch  = new FixAllocHandlInstField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Match;}
                     public String  getValueDescription()             {return text_Match;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Match).append("|").append(text_Match).append("]").toString();}
                     public boolean isMatch()                         {return true;}
                     public int     intValue()                        {return Match;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Match);}
                    };
                }
            }
        }

        return flyweightMatch;
    }

    private static FixAllocHandlInstField flyweightForward;
    public static final FixAllocHandlInstField flyweightForward()
    {
        if (flyweightForward == null)
        {
            synchronized(FixAllocHandlInstField.class)
            {
                if (flyweightForward == null)
                {
                    flyweightForward  = new FixAllocHandlInstField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Forward;}
                     public String  getValueDescription()             {return text_Forward;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Forward).append("|").append(text_Forward).append("]").toString();}
                     public boolean isForward()                       {return true;}
                     public int     intValue()                        {return Forward;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Forward);}
                    };
                }
            }
        }

        return flyweightForward;
    }

    private static FixAllocHandlInstField flyweightForwardAndMatch;
    public static final FixAllocHandlInstField flyweightForwardAndMatch()
    {
        if (flyweightForwardAndMatch == null)
        {
            synchronized(FixAllocHandlInstField.class)
            {
                if (flyweightForwardAndMatch == null)
                {
                    flyweightForwardAndMatch  = new FixAllocHandlInstField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_ForwardAndMatch;}
                     public String  getValueDescription()             {return text_ForwardAndMatch;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_ForwardAndMatch).append("|").append(text_ForwardAndMatch).append("]").toString();}
                     public boolean isForwardAndMatch()               {return true;}
                     public int     intValue()                        {return ForwardAndMatch;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_ForwardAndMatch);}
                    };
                }
            }
        }

        return flyweightForwardAndMatch;
    }


    public boolean isMatch()             {return false;}
    public boolean isForward()           {return false;}
    public boolean isForwardAndMatch()   {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixAllocHandlInstField create(char[] array, int offset, int length)
    {
        int param = IntegerHelper.parseInt(array, offset, length);
        if (param == IntegerHelper.INVALID_VALUE)
        {
            return null;
        }
        return create(param);
    }

    public static FixAllocHandlInstField create(final int param)
    {
        switch (param)
        {                                                                                           
            case Match:           return flyweightMatch();
            case Forward:         return flyweightForward();
            case ForwardAndMatch: return flyweightForwardAndMatch();
        }
                                                                                                    
        return null;
    }                                                                                               
}
