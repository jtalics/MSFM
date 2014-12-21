package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixCorporateActionField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [292] (known as CorporateAction).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixCorporateActionField implements FixFieldIF, HasCharValueIF
{   
    public static final int    TagID         =  292;
    public static final String TagIDAsString = "292";
    public static final char[] TagIDAsChars  = {'2','9','2'};
    public static final String TagName       = "CorporateAction";
    public static final String TagFixType    = "CHAR";

    public static final char    ExDividend                  = 'A';
    public static final String  string_ExDividend           = "A";
    public static final String  tagged_ExDividend           = TagIDAsString + EQUALS + string_ExDividend + SOH;
    public static final char[]  taggedchars_ExDividend      = {'2','9','2', EQUALSchar, 'A', SOHchar};
    public static final String  text_ExDividend             = "ExDividend";
    public static final char    ExDistribution              = 'B';
    public static final String  string_ExDistribution       = "B";
    public static final String  tagged_ExDistribution       = TagIDAsString + EQUALS + string_ExDistribution + SOH;
    public static final char[]  taggedchars_ExDistribution  = {'2','9','2', EQUALSchar, 'B', SOHchar};
    public static final String  text_ExDistribution         = "ExDistribution";
    public static final char    ExRights                    = 'C';
    public static final String  string_ExRights             = "C";
    public static final String  tagged_ExRights             = TagIDAsString + EQUALS + string_ExRights + SOH;
    public static final char[]  taggedchars_ExRights        = {'2','9','2', EQUALSchar, 'C', SOHchar};
    public static final String  text_ExRights               = "ExRights";
    public static final char    New                         = 'D';
    public static final String  string_New                  = "D";
    public static final String  tagged_New                  = TagIDAsString + EQUALS + string_New + SOH;
    public static final char[]  taggedchars_New             = {'2','9','2', EQUALSchar, 'D', SOHchar};
    public static final String  text_New                    = "New";
    public static final char    ExInterest                  = 'E';
    public static final String  string_ExInterest           = "E";
    public static final String  tagged_ExInterest           = TagIDAsString + EQUALS + string_ExInterest + SOH;
    public static final char[]  taggedchars_ExInterest      = {'2','9','2', EQUALSchar, 'E', SOHchar};
    public static final String  text_ExInterest             = "ExInterest";

    private static FixCorporateActionField flyweightExDividend;
    public static final FixCorporateActionField flyweightExDividend()
    {
        if (flyweightExDividend == null)
        {
            synchronized(FixCorporateActionField.class)
            {
                if (flyweightExDividend == null)
                {
                    flyweightExDividend  = new FixCorporateActionField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_ExDividend;}
                     public String  getValueDescription()             {return text_ExDividend;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_ExDividend).append("|").append(text_ExDividend).append("]").toString();}
                     public boolean isExDividend()                    {return true;}
                     public char    charValue()                       {return ExDividend;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_ExDividend);}
                    };
                }
            }
        }

        return flyweightExDividend;
    }

    private static FixCorporateActionField flyweightExDistribution;
    public static final FixCorporateActionField flyweightExDistribution()
    {
        if (flyweightExDistribution == null)
        {
            synchronized(FixCorporateActionField.class)
            {
                if (flyweightExDistribution == null)
                {
                    flyweightExDistribution  = new FixCorporateActionField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_ExDistribution;}
                     public String  getValueDescription()             {return text_ExDistribution;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_ExDistribution).append("|").append(text_ExDistribution).append("]").toString();}
                     public boolean isExDistribution()                {return true;}
                     public char    charValue()                       {return ExDistribution;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_ExDistribution);}
                    };
                }
            }
        }

        return flyweightExDistribution;
    }

    private static FixCorporateActionField flyweightExRights;
    public static final FixCorporateActionField flyweightExRights()
    {
        if (flyweightExRights == null)
        {
            synchronized(FixCorporateActionField.class)
            {
                if (flyweightExRights == null)
                {
                    flyweightExRights  = new FixCorporateActionField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_ExRights;}
                     public String  getValueDescription()             {return text_ExRights;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_ExRights).append("|").append(text_ExRights).append("]").toString();}
                     public boolean isExRights()                      {return true;}
                     public char    charValue()                       {return ExRights;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_ExRights);}
                    };
                }
            }
        }

        return flyweightExRights;
    }

    private static FixCorporateActionField flyweightNew;
    public static final FixCorporateActionField flyweightNew()
    {
        if (flyweightNew == null)
        {
            synchronized(FixCorporateActionField.class)
            {
                if (flyweightNew == null)
                {
                    flyweightNew  = new FixCorporateActionField()
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

    private static FixCorporateActionField flyweightExInterest;
    public static final FixCorporateActionField flyweightExInterest()
    {
        if (flyweightExInterest == null)
        {
            synchronized(FixCorporateActionField.class)
            {
                if (flyweightExInterest == null)
                {
                    flyweightExInterest  = new FixCorporateActionField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_ExInterest;}
                     public String  getValueDescription()             {return text_ExInterest;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_ExInterest).append("|").append(text_ExInterest).append("]").toString();}
                     public boolean isExInterest()                    {return true;}
                     public char    charValue()                       {return ExInterest;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_ExInterest);}
                    };
                }
            }
        }

        return flyweightExInterest;
    }


    public boolean isExDividend()       {return false;}
    public boolean isExDistribution()   {return false;}
    public boolean isExRights()         {return false;}
    public boolean isNew()              {return false;}
    public boolean isExInterest()       {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixCorporateActionField create(char[] array, int offset, int length)
    {
        if (length == 1)
        {
            return create(array[offset]);
        }

        return null;
    }

    public static FixCorporateActionField create(final char param)
    {
        switch (param)
        {                                                                                           
            case ExDividend:     return flyweightExDividend();
            case ExDistribution: return flyweightExDistribution();
            case ExRights:       return flyweightExRights();
            case New:            return flyweightNew();
            case ExInterest:     return flyweightExInterest();
        }
                                                                                                    
        return null;
    }                                                                                               
}
