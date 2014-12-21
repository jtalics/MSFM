package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixAllocLinkTypeField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [197] (known as AllocLinkType).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixAllocLinkTypeField implements FixFieldIF, HasIntValueIF
{   
    public static final int    TagID         =  197;
    public static final String TagIDAsString = "197";
    public static final char[] TagIDAsChars  = {'1','9','7'};
    public static final String TagName       = "AllocLinkType";
    public static final String TagFixType    = "INT";
    public static final char[]  taggedchars_value0 = {'1','9','7', EQUALSchar, ZEROchar, SOHchar};
    public static final char[]  taggedchars_value1 = {'1','9','7', EQUALSchar, ONEchar,  SOHchar};

    public static final int     FxNetting              = 0;
    public static final String  string_FxNetting       = "0";
    public static final String  tagged_FxNetting       = TagIDAsString + EQUALS + string_FxNetting + SOH;
    public static final char[]  taggedchars_FxNetting  = {'1','9','7', EQUALSchar, '0', SOHchar};
    public static final String  text_FxNetting         = "FxNetting";
    public static final int     FxSwap                 = 1;
    public static final String  string_FxSwap          = "1";
    public static final String  tagged_FxSwap          = TagIDAsString + EQUALS + string_FxSwap + SOH;
    public static final char[]  taggedchars_FxSwap     = {'1','9','7', EQUALSchar, '1', SOHchar};
    public static final String  text_FxSwap            = "FxSwap";

    private static FixAllocLinkTypeField flyweightFxNetting;
    public static final FixAllocLinkTypeField flyweightFxNetting()
    {
        if (flyweightFxNetting == null)
        {
            synchronized(FixAllocLinkTypeField.class)
            {
                if (flyweightFxNetting == null)
                {
                    flyweightFxNetting  = new FixAllocLinkTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_FxNetting;}
                     public String  getValueDescription()             {return text_FxNetting;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_FxNetting).append("|").append(text_FxNetting).append("]").toString();}
                     public boolean isFxNetting()                     {return true;}
                     public int     intValue()                        {return FxNetting;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_FxNetting);}
                    };
                }
            }
        }

        return flyweightFxNetting;
    }

    private static FixAllocLinkTypeField flyweightFxSwap;
    public static final FixAllocLinkTypeField flyweightFxSwap()
    {
        if (flyweightFxSwap == null)
        {
            synchronized(FixAllocLinkTypeField.class)
            {
                if (flyweightFxSwap == null)
                {
                    flyweightFxSwap  = new FixAllocLinkTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_FxSwap;}
                     public String  getValueDescription()             {return text_FxSwap;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_FxSwap).append("|").append(text_FxSwap).append("]").toString();}
                     public boolean isFxSwap()                        {return true;}
                     public int     intValue()                        {return FxSwap;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_FxSwap);}
                    };
                }
            }
        }

        return flyweightFxSwap;
    }


    public boolean isFxNetting()   {return false;}
    public boolean isFxSwap()      {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixAllocLinkTypeField create(char[] array, int offset, int length)
    {
        int param = IntegerHelper.parseInt(array, offset, length);
        if (param == IntegerHelper.INVALID_VALUE)
        {
            return null;
        }
        return create(param);
    }

    public static FixAllocLinkTypeField create(final int param)
    {
        switch (param)
        {                                                                                           
            case FxNetting: return flyweightFxNetting();
            case FxSwap:    return flyweightFxSwap();
        }
                                                                                                    
        return null;
    }                                                                                               
}
