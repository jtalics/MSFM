package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixBidRequestTransTypeField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [374] (known as BidRequestTransType).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixBidRequestTransTypeField implements FixFieldIF, HasCharValueIF
{   
    public static final int    TagID         =  374;
    public static final String TagIDAsString = "374";
    public static final char[] TagIDAsChars  = {'3','7','4'};
    public static final String TagName       = "BidRequestTransType";
    public static final String TagFixType    = "CHAR";

    public static final char    New                 = 'N';
    public static final String  string_New          = "N";
    public static final String  tagged_New          = TagIDAsString + EQUALS + string_New + SOH;
    public static final char[]  taggedchars_New     = {'3','7','4', EQUALSchar, 'N', SOHchar};
    public static final String  text_New            = "New";
    public static final char    Cancel              = 'C';
    public static final String  string_Cancel       = "C";
    public static final String  tagged_Cancel       = TagIDAsString + EQUALS + string_Cancel + SOH;
    public static final char[]  taggedchars_Cancel  = {'3','7','4', EQUALSchar, 'C', SOHchar};
    public static final String  text_Cancel         = "Cancel";

    private static FixBidRequestTransTypeField flyweightNew;
    public static final FixBidRequestTransTypeField flyweightNew()
    {
        if (flyweightNew == null)
        {
            synchronized(FixBidRequestTransTypeField.class)
            {
                if (flyweightNew == null)
                {
                    flyweightNew  = new FixBidRequestTransTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_New;}
                     public String  getValueDescription()             {return text_New;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_New).append("|").append(text_New).append("]").toString();}
                     public boolean isNew()                           {return true;}
                     public char    charValue()                       {return New;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_New);}
                    };
                }
            }
        }

        return flyweightNew;
    }

    private static FixBidRequestTransTypeField flyweightCancel;
    public static final FixBidRequestTransTypeField flyweightCancel()
    {
        if (flyweightCancel == null)
        {
            synchronized(FixBidRequestTransTypeField.class)
            {
                if (flyweightCancel == null)
                {
                    flyweightCancel  = new FixBidRequestTransTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Cancel;}
                     public String  getValueDescription()             {return text_Cancel;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Cancel).append("|").append(text_Cancel).append("]").toString();}
                     public boolean isCancel()                        {return true;}
                     public char    charValue()                       {return Cancel;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Cancel);}
                    };
                }
            }
        }

        return flyweightCancel;
    }


    public boolean isNew()      {return false;}
    public boolean isCancel()   {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixBidRequestTransTypeField create(char[] array, int offset, int length)
    {
        if (length == 1)
        {
            return create(array[offset]);
        }

        return null;
    }

    public static FixBidRequestTransTypeField create(final char param)
    {
        switch (param)
        {                                                                                           
            case New:    return flyweightNew();
            case Cancel: return flyweightCancel();
        }
                                                                                                    
        return null;
    }                                                                                               
}
