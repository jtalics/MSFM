package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixMDUpdateTypeField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [265] (known as MDUpdateType).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixMDUpdateTypeField implements FixFieldIF, HasIntValueIF
{   
    public static final int    TagID         =  265;
    public static final String TagIDAsString = "265";
    public static final char[] TagIDAsChars  = {'2','6','5'};
    public static final String TagName       = "MDUpdateType";
    public static final String TagFixType    = "INT";
    public static final char[]  taggedchars_value0 = {'2','6','5', EQUALSchar, ZEROchar, SOHchar};
    public static final char[]  taggedchars_value1 = {'2','6','5', EQUALSchar, ONEchar,  SOHchar};

    public static final int     FullRefresh                     = 0;
    public static final String  string_FullRefresh              = "0";
    public static final String  tagged_FullRefresh              = TagIDAsString + EQUALS + string_FullRefresh + SOH;
    public static final char[]  taggedchars_FullRefresh         = {'2','6','5', EQUALSchar, '0', SOHchar};
    public static final String  text_FullRefresh                = "FullRefresh";
    public static final int     IncrementalRefresh              = 1;
    public static final String  string_IncrementalRefresh       = "1";
    public static final String  tagged_IncrementalRefresh       = TagIDAsString + EQUALS + string_IncrementalRefresh + SOH;
    public static final char[]  taggedchars_IncrementalRefresh  = {'2','6','5', EQUALSchar, '1', SOHchar};
    public static final String  text_IncrementalRefresh         = "IncrementalRefresh";

    private static FixMDUpdateTypeField flyweightFullRefresh;
    public static final FixMDUpdateTypeField flyweightFullRefresh()
    {
        if (flyweightFullRefresh == null)
        {
            synchronized(FixMDUpdateTypeField.class)
            {
                if (flyweightFullRefresh == null)
                {
                    flyweightFullRefresh  = new FixMDUpdateTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_FullRefresh;}
                     public String  getValueDescription()             {return text_FullRefresh;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_FullRefresh).append("|").append(text_FullRefresh).append("]").toString();}
                     public boolean isFullRefresh()                   {return true;}
                     public int     intValue()                        {return FullRefresh;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_FullRefresh);}
                    };
                }
            }
        }

        return flyweightFullRefresh;
    }

    private static FixMDUpdateTypeField flyweightIncrementalRefresh;
    public static final FixMDUpdateTypeField flyweightIncrementalRefresh()
    {
        if (flyweightIncrementalRefresh == null)
        {
            synchronized(FixMDUpdateTypeField.class)
            {
                if (flyweightIncrementalRefresh == null)
                {
                    flyweightIncrementalRefresh  = new FixMDUpdateTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_IncrementalRefresh;}
                     public String  getValueDescription()             {return text_IncrementalRefresh;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_IncrementalRefresh).append("|").append(text_IncrementalRefresh).append("]").toString();}
                     public boolean isIncrementalRefresh()            {return true;}
                     public int     intValue()                        {return IncrementalRefresh;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_IncrementalRefresh);}
                    };
                }
            }
        }

        return flyweightIncrementalRefresh;
    }


    public boolean isFullRefresh()          {return false;}
    public boolean isIncrementalRefresh()   {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixMDUpdateTypeField create(char[] array, int offset, int length)
    {
        int param = IntegerHelper.parseInt(array, offset, length);
        if (param == IntegerHelper.INVALID_VALUE)
        {
            return null;
        }
        return create(param);
    }

    public static FixMDUpdateTypeField create(final int param)
    {
        switch (param)
        {                                                                                           
            case FullRefresh:        return flyweightFullRefresh();
            case IncrementalRefresh: return flyweightIncrementalRefresh();
        }
                                                                                                    
        return null;
    }                                                                                               
}
