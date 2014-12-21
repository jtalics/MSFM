package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixAllocTransTypeField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [71] (known as AllocTransType).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixAllocTransTypeField implements FixFieldIF, HasCharValueIF
{   
    public static final int    TagID         =  71;
    public static final String TagIDAsString = "71";
    public static final char[] TagIDAsChars  = {'7','1'};
    public static final String TagName       = "AllocTransType";
    public static final String TagFixType    = "CHAR";

    public static final char    New                                       = '0';
    public static final String  string_New                                = "0";
    public static final String  tagged_New                                = TagIDAsString + EQUALS + string_New + SOH;
    public static final char[]  taggedchars_New                           = {'7','1', EQUALSchar, '0', SOHchar};
    public static final String  text_New                                  = "New";
    public static final char    Replace                                   = '1';
    public static final String  string_Replace                            = "1";
    public static final String  tagged_Replace                            = TagIDAsString + EQUALS + string_Replace + SOH;
    public static final char[]  taggedchars_Replace                       = {'7','1', EQUALSchar, '1', SOHchar};
    public static final String  text_Replace                              = "Replace";
    public static final char    Cancel                                    = '2';
    public static final String  string_Cancel                             = "2";
    public static final String  tagged_Cancel                             = TagIDAsString + EQUALS + string_Cancel + SOH;
    public static final char[]  taggedchars_Cancel                        = {'7','1', EQUALSchar, '2', SOHchar};
    public static final String  text_Cancel                               = "Cancel";
    public static final char    Preliminary                               = '3';
    public static final String  string_Preliminary                        = "3";
    public static final String  tagged_Preliminary                        = TagIDAsString + EQUALS + string_Preliminary + SOH;
    public static final char[]  taggedchars_Preliminary                   = {'7','1', EQUALSchar, '3', SOHchar};
    public static final String  text_Preliminary                          = "Preliminary";
    public static final char    Calculated                                = '4';
    public static final String  string_Calculated                         = "4";
    public static final String  tagged_Calculated                         = TagIDAsString + EQUALS + string_Calculated + SOH;
    public static final char[]  taggedchars_Calculated                    = {'7','1', EQUALSchar, '4', SOHchar};
    public static final String  text_Calculated                           = "Calculated";
    public static final char    CalculatedWithoutPreliminary              = '5';
    public static final String  string_CalculatedWithoutPreliminary       = "5";
    public static final String  tagged_CalculatedWithoutPreliminary       = TagIDAsString + EQUALS + string_CalculatedWithoutPreliminary + SOH;
    public static final char[]  taggedchars_CalculatedWithoutPreliminary  = {'7','1', EQUALSchar, '5', SOHchar};
    public static final String  text_CalculatedWithoutPreliminary         = "CalculatedWithoutPreliminary";

    private static FixAllocTransTypeField flyweightNew;
    public static final FixAllocTransTypeField flyweightNew()
    {
        if (flyweightNew == null)
        {
            synchronized(FixAllocTransTypeField.class)
            {
                if (flyweightNew == null)
                {
                    flyweightNew  = new FixAllocTransTypeField()
                    {public boolean hasValue()                         {return true;}
                     public String  getValue()                         {return string_New;}
                     public String  getValueDescription()              {return text_New;}
                     public String  toString()                         {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_New).append("|").append(text_New).append("]").toString();}
                     public boolean isNew()                            {return true;}
                     public char    charValue()                        {return New;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_New);}
                    };
                }
            }
        }

        return flyweightNew;
    }

    private static FixAllocTransTypeField flyweightReplace;
    public static final FixAllocTransTypeField flyweightReplace()
    {
        if (flyweightReplace == null)
        {
            synchronized(FixAllocTransTypeField.class)
            {
                if (flyweightReplace == null)
                {
                    flyweightReplace  = new FixAllocTransTypeField()
                    {public boolean hasValue()                         {return true;}
                     public String  getValue()                         {return string_Replace;}
                     public String  getValueDescription()              {return text_Replace;}
                     public String  toString()                         {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Replace).append("|").append(text_Replace).append("]").toString();}
                     public boolean isReplace()                        {return true;}
                     public char    charValue()                        {return Replace;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Replace);}
                    };
                }
            }
        }

        return flyweightReplace;
    }

    private static FixAllocTransTypeField flyweightCancel;
    public static final FixAllocTransTypeField flyweightCancel()
    {
        if (flyweightCancel == null)
        {
            synchronized(FixAllocTransTypeField.class)
            {
                if (flyweightCancel == null)
                {
                    flyweightCancel  = new FixAllocTransTypeField()
                    {public boolean hasValue()                         {return true;}
                     public String  getValue()                         {return string_Cancel;}
                     public String  getValueDescription()              {return text_Cancel;}
                     public String  toString()                         {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Cancel).append("|").append(text_Cancel).append("]").toString();}
                     public boolean isCancel()                         {return true;}
                     public char    charValue()                        {return Cancel;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Cancel);}
                    };
                }
            }
        }

        return flyweightCancel;
    }

    private static FixAllocTransTypeField flyweightPreliminary;
    public static final FixAllocTransTypeField flyweightPreliminary()
    {
        if (flyweightPreliminary == null)
        {
            synchronized(FixAllocTransTypeField.class)
            {
                if (flyweightPreliminary == null)
                {
                    flyweightPreliminary  = new FixAllocTransTypeField()
                    {public boolean hasValue()                         {return true;}
                     public String  getValue()                         {return string_Preliminary;}
                     public String  getValueDescription()              {return text_Preliminary;}
                     public String  toString()                         {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Preliminary).append("|").append(text_Preliminary).append("]").toString();}
                     public boolean isPreliminary()                    {return true;}
                     public char    charValue()                        {return Preliminary;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Preliminary);}
                    };
                }
            }
        }

        return flyweightPreliminary;
    }

    private static FixAllocTransTypeField flyweightCalculated;
    public static final FixAllocTransTypeField flyweightCalculated()
    {
        if (flyweightCalculated == null)
        {
            synchronized(FixAllocTransTypeField.class)
            {
                if (flyweightCalculated == null)
                {
                    flyweightCalculated  = new FixAllocTransTypeField()
                    {public boolean hasValue()                         {return true;}
                     public String  getValue()                         {return string_Calculated;}
                     public String  getValueDescription()              {return text_Calculated;}
                     public String  toString()                         {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Calculated).append("|").append(text_Calculated).append("]").toString();}
                     public boolean isCalculated()                     {return true;}
                     public char    charValue()                        {return Calculated;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Calculated);}
                    };
                }
            }
        }

        return flyweightCalculated;
    }

    private static FixAllocTransTypeField flyweightCalculatedWithoutPreliminary;
    public static final FixAllocTransTypeField flyweightCalculatedWithoutPreliminary()
    {
        if (flyweightCalculatedWithoutPreliminary == null)
        {
            synchronized(FixAllocTransTypeField.class)
            {
                if (flyweightCalculatedWithoutPreliminary == null)
                {
                    flyweightCalculatedWithoutPreliminary  = new FixAllocTransTypeField()
                    {public boolean hasValue()                         {return true;}
                     public String  getValue()                         {return string_CalculatedWithoutPreliminary;}
                     public String  getValueDescription()              {return text_CalculatedWithoutPreliminary;}
                     public String  toString()                         {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_CalculatedWithoutPreliminary).append("|").append(text_CalculatedWithoutPreliminary).append("]").toString();}
                     public boolean isCalculatedWithoutPreliminary()   {return true;}
                     public char    charValue()                        {return CalculatedWithoutPreliminary;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_CalculatedWithoutPreliminary);}
                    };
                }
            }
        }

        return flyweightCalculatedWithoutPreliminary;
    }


    public boolean isNew()                            {return false;}
    public boolean isReplace()                        {return false;}
    public boolean isCancel()                         {return false;}
    public boolean isPreliminary()                    {return false;}
    public boolean isCalculated()                     {return false;}
    public boolean isCalculatedWithoutPreliminary()   {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixAllocTransTypeField create(char[] array, int offset, int length)
    {
        if (length == 1)
        {
            return create(array[offset]);
        }

        return null;
    }

    public static FixAllocTransTypeField create(final char param)
    {
        switch (param)
        {                                                                                           
            case New:                          return flyweightNew();
            case Replace:                      return flyweightReplace();
            case Cancel:                       return flyweightCancel();
            case Preliminary:                  return flyweightPreliminary();
            case Calculated:                   return flyweightCalculated();
            case CalculatedWithoutPreliminary: return flyweightCalculatedWithoutPreliminary();
        }
                                                                                                    
        return null;
    }                                                                                               
}
