package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixRoutingTypeField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [216] (known as RoutingType).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixRoutingTypeField implements FixFieldIF, HasIntValueIF
{   
    public static final int    TagID         =  216;
    public static final String TagIDAsString = "216";
    public static final char[] TagIDAsChars  = {'2','1','6'};
    public static final String TagName       = "RoutingType";
    public static final String TagFixType    = "INT";
    public static final char[]  taggedchars_value0 = {'2','1','6', EQUALSchar, ZEROchar, SOHchar};
    public static final char[]  taggedchars_value1 = {'2','1','6', EQUALSchar, ONEchar,  SOHchar};

    public static final int     TargetFirm              = 1;
    public static final String  string_TargetFirm       = "1";
    public static final String  tagged_TargetFirm       = TagIDAsString + EQUALS + string_TargetFirm + SOH;
    public static final char[]  taggedchars_TargetFirm  = {'2','1','6', EQUALSchar, '1', SOHchar};
    public static final String  text_TargetFirm         = "TargetFirm";
    public static final int     TargetList              = 2;
    public static final String  string_TargetList       = "2";
    public static final String  tagged_TargetList       = TagIDAsString + EQUALS + string_TargetList + SOH;
    public static final char[]  taggedchars_TargetList  = {'2','1','6', EQUALSchar, '2', SOHchar};
    public static final String  text_TargetList         = "TargetList";
    public static final int     BlockFirm               = 3;
    public static final String  string_BlockFirm        = "3";
    public static final String  tagged_BlockFirm        = TagIDAsString + EQUALS + string_BlockFirm + SOH;
    public static final char[]  taggedchars_BlockFirm   = {'2','1','6', EQUALSchar, '3', SOHchar};
    public static final String  text_BlockFirm          = "BlockFirm";
    public static final int     BlockList               = 4;
    public static final String  string_BlockList        = "4";
    public static final String  tagged_BlockList        = TagIDAsString + EQUALS + string_BlockList + SOH;
    public static final char[]  taggedchars_BlockList   = {'2','1','6', EQUALSchar, '4', SOHchar};
    public static final String  text_BlockList          = "BlockList";

    private static FixRoutingTypeField flyweightTargetFirm;
    public static final FixRoutingTypeField flyweightTargetFirm()
    {
        if (flyweightTargetFirm == null)
        {
            synchronized(FixRoutingTypeField.class)
            {
                if (flyweightTargetFirm == null)
                {
                    flyweightTargetFirm  = new FixRoutingTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_TargetFirm;}
                     public String  getValueDescription()             {return text_TargetFirm;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_TargetFirm).append("|").append(text_TargetFirm).append("]").toString();}
                     public boolean isTargetFirm()                    {return true;}
                     public int     intValue()                        {return TargetFirm;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_TargetFirm);}
                    };
                }
            }
        }

        return flyweightTargetFirm;
    }

    private static FixRoutingTypeField flyweightTargetList;
    public static final FixRoutingTypeField flyweightTargetList()
    {
        if (flyweightTargetList == null)
        {
            synchronized(FixRoutingTypeField.class)
            {
                if (flyweightTargetList == null)
                {
                    flyweightTargetList  = new FixRoutingTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_TargetList;}
                     public String  getValueDescription()             {return text_TargetList;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_TargetList).append("|").append(text_TargetList).append("]").toString();}
                     public boolean isTargetList()                    {return true;}
                     public int     intValue()                        {return TargetList;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_TargetList);}
                    };
                }
            }
        }

        return flyweightTargetList;
    }

    private static FixRoutingTypeField flyweightBlockFirm;
    public static final FixRoutingTypeField flyweightBlockFirm()
    {
        if (flyweightBlockFirm == null)
        {
            synchronized(FixRoutingTypeField.class)
            {
                if (flyweightBlockFirm == null)
                {
                    flyweightBlockFirm  = new FixRoutingTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_BlockFirm;}
                     public String  getValueDescription()             {return text_BlockFirm;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_BlockFirm).append("|").append(text_BlockFirm).append("]").toString();}
                     public boolean isBlockFirm()                     {return true;}
                     public int     intValue()                        {return BlockFirm;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_BlockFirm);}
                    };
                }
            }
        }

        return flyweightBlockFirm;
    }

    private static FixRoutingTypeField flyweightBlockList;
    public static final FixRoutingTypeField flyweightBlockList()
    {
        if (flyweightBlockList == null)
        {
            synchronized(FixRoutingTypeField.class)
            {
                if (flyweightBlockList == null)
                {
                    flyweightBlockList  = new FixRoutingTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_BlockList;}
                     public String  getValueDescription()             {return text_BlockList;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_BlockList).append("|").append(text_BlockList).append("]").toString();}
                     public boolean isBlockList()                     {return true;}
                     public int     intValue()                        {return BlockList;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_BlockList);}
                    };
                }
            }
        }

        return flyweightBlockList;
    }


    public boolean isTargetFirm()   {return false;}
    public boolean isTargetList()   {return false;}
    public boolean isBlockFirm()    {return false;}
    public boolean isBlockList()    {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixRoutingTypeField create(char[] array, int offset, int length)
    {
        int param = IntegerHelper.parseInt(array, offset, length);
        if (param == IntegerHelper.INVALID_VALUE)
        {
            return null;
        }
        return create(param);
    }

    public static FixRoutingTypeField create(final int param)
    {
        switch (param)
        {                                                                                           
            case TargetFirm: return flyweightTargetFirm();
            case TargetList: return flyweightTargetList();
            case BlockFirm:  return flyweightBlockFirm();
            case BlockList:  return flyweightBlockList();
        }
                                                                                                    
        return null;
    }                                                                                               
}