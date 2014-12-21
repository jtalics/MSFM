package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixBenchmarkField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [219] (known as Benchmark).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixBenchmarkField implements FixFieldIF, HasCharValueIF
{   
    public static final int    TagID         =  219;
    public static final String TagIDAsString = "219";
    public static final char[] TagIDAsChars  = {'2','1','9'};
    public static final String TagName       = "Benchmark";
    public static final String TagFixType    = "CHAR";

    public static final char    Curve                     = '1';
    public static final String  string_Curve              = "1";
    public static final String  tagged_Curve              = TagIDAsString + EQUALS + string_Curve + SOH;
    public static final char[]  taggedchars_Curve         = {'2','1','9', EQUALSchar, '1', SOHchar};
    public static final String  text_Curve                = "Curve";
    public static final char    FiveYear                  = '2';
    public static final String  string_FiveYear           = "2";
    public static final String  tagged_FiveYear           = TagIDAsString + EQUALS + string_FiveYear + SOH;
    public static final char[]  taggedchars_FiveYear      = {'2','1','9', EQUALSchar, '2', SOHchar};
    public static final String  text_FiveYear             = "FiveYear";
    public static final char    Old5                      = '3';
    public static final String  string_Old5               = "3";
    public static final String  tagged_Old5               = TagIDAsString + EQUALS + string_Old5 + SOH;
    public static final char[]  taggedchars_Old5          = {'2','1','9', EQUALSchar, '3', SOHchar};
    public static final String  text_Old5                 = "Old5";
    public static final char    TenYear                   = '4';
    public static final String  string_TenYear            = "4";
    public static final String  tagged_TenYear            = TagIDAsString + EQUALS + string_TenYear + SOH;
    public static final char[]  taggedchars_TenYear       = {'2','1','9', EQUALSchar, '4', SOHchar};
    public static final String  text_TenYear              = "TenYear";
    public static final char    Old10                     = '5';
    public static final String  string_Old10              = "5";
    public static final String  tagged_Old10              = TagIDAsString + EQUALS + string_Old10 + SOH;
    public static final char[]  taggedchars_Old10         = {'2','1','9', EQUALSchar, '5', SOHchar};
    public static final String  text_Old10                = "Old10";
    public static final char    ThirtyYear                = '6';
    public static final String  string_ThirtyYear         = "6";
    public static final String  tagged_ThirtyYear         = TagIDAsString + EQUALS + string_ThirtyYear + SOH;
    public static final char[]  taggedchars_ThirtyYear    = {'2','1','9', EQUALSchar, '6', SOHchar};
    public static final String  text_ThirtyYear           = "ThirtyYear";
    public static final char    Old30                     = '7';
    public static final String  string_Old30              = "7";
    public static final String  tagged_Old30              = TagIDAsString + EQUALS + string_Old30 + SOH;
    public static final char[]  taggedchars_Old30         = {'2','1','9', EQUALSchar, '7', SOHchar};
    public static final String  text_Old30                = "Old30";
    public static final char    ThreeMolibor              = '8';
    public static final String  string_ThreeMolibor       = "8";
    public static final String  tagged_ThreeMolibor       = TagIDAsString + EQUALS + string_ThreeMolibor + SOH;
    public static final char[]  taggedchars_ThreeMolibor  = {'2','1','9', EQUALSchar, '8', SOHchar};
    public static final String  text_ThreeMolibor         = "ThreeMolibor";
    public static final char    SixMolibor                = '9';
    public static final String  string_SixMolibor         = "9";
    public static final String  tagged_SixMolibor         = TagIDAsString + EQUALS + string_SixMolibor + SOH;
    public static final char[]  taggedchars_SixMolibor    = {'2','1','9', EQUALSchar, '9', SOHchar};
    public static final String  text_SixMolibor           = "SixMolibor";

    private static FixBenchmarkField flyweightCurve;
    public static final FixBenchmarkField flyweightCurve()
    {
        if (flyweightCurve == null)
        {
            synchronized(FixBenchmarkField.class)
            {
                if (flyweightCurve == null)
                {
                    flyweightCurve  = new FixBenchmarkField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Curve;}
                     public String  getValueDescription()             {return text_Curve;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Curve).append("|").append(text_Curve).append("]").toString();}
                     public boolean isCurve()                         {return true;}
                     public char    charValue()                       {return Curve;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Curve);}
                    };
                }
            }
        }

        return flyweightCurve;
    }

    private static FixBenchmarkField flyweightFiveYear;
    public static final FixBenchmarkField flyweightFiveYear()
    {
        if (flyweightFiveYear == null)
        {
            synchronized(FixBenchmarkField.class)
            {
                if (flyweightFiveYear == null)
                {
                    flyweightFiveYear  = new FixBenchmarkField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_FiveYear;}
                     public String  getValueDescription()             {return text_FiveYear;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_FiveYear).append("|").append(text_FiveYear).append("]").toString();}
                     public boolean isFiveYear()                      {return true;}
                     public char    charValue()                       {return FiveYear;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_FiveYear);}
                    };
                }
            }
        }

        return flyweightFiveYear;
    }

    private static FixBenchmarkField flyweightOld5;
    public static final FixBenchmarkField flyweightOld5()
    {
        if (flyweightOld5 == null)
        {
            synchronized(FixBenchmarkField.class)
            {
                if (flyweightOld5 == null)
                {
                    flyweightOld5  = new FixBenchmarkField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Old5;}
                     public String  getValueDescription()             {return text_Old5;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Old5).append("|").append(text_Old5).append("]").toString();}
                     public boolean isOld5()                          {return true;}
                     public char    charValue()                       {return Old5;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Old5);}
                    };
                }
            }
        }

        return flyweightOld5;
    }

    private static FixBenchmarkField flyweightTenYear;
    public static final FixBenchmarkField flyweightTenYear()
    {
        if (flyweightTenYear == null)
        {
            synchronized(FixBenchmarkField.class)
            {
                if (flyweightTenYear == null)
                {
                    flyweightTenYear  = new FixBenchmarkField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_TenYear;}
                     public String  getValueDescription()             {return text_TenYear;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_TenYear).append("|").append(text_TenYear).append("]").toString();}
                     public boolean isTenYear()                       {return true;}
                     public char    charValue()                       {return TenYear;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_TenYear);}
                    };
                }
            }
        }

        return flyweightTenYear;
    }

    private static FixBenchmarkField flyweightOld10;
    public static final FixBenchmarkField flyweightOld10()
    {
        if (flyweightOld10 == null)
        {
            synchronized(FixBenchmarkField.class)
            {
                if (flyweightOld10 == null)
                {
                    flyweightOld10  = new FixBenchmarkField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Old10;}
                     public String  getValueDescription()             {return text_Old10;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Old10).append("|").append(text_Old10).append("]").toString();}
                     public boolean isOld10()                         {return true;}
                     public char    charValue()                       {return Old10;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Old10);}
                    };
                }
            }
        }

        return flyweightOld10;
    }

    private static FixBenchmarkField flyweightThirtyYear;
    public static final FixBenchmarkField flyweightThirtyYear()
    {
        if (flyweightThirtyYear == null)
        {
            synchronized(FixBenchmarkField.class)
            {
                if (flyweightThirtyYear == null)
                {
                    flyweightThirtyYear  = new FixBenchmarkField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_ThirtyYear;}
                     public String  getValueDescription()             {return text_ThirtyYear;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_ThirtyYear).append("|").append(text_ThirtyYear).append("]").toString();}
                     public boolean isThirtyYear()                    {return true;}
                     public char    charValue()                       {return ThirtyYear;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_ThirtyYear);}
                    };
                }
            }
        }

        return flyweightThirtyYear;
    }

    private static FixBenchmarkField flyweightOld30;
    public static final FixBenchmarkField flyweightOld30()
    {
        if (flyweightOld30 == null)
        {
            synchronized(FixBenchmarkField.class)
            {
                if (flyweightOld30 == null)
                {
                    flyweightOld30  = new FixBenchmarkField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Old30;}
                     public String  getValueDescription()             {return text_Old30;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Old30).append("|").append(text_Old30).append("]").toString();}
                     public boolean isOld30()                         {return true;}
                     public char    charValue()                       {return Old30;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Old30);}
                    };
                }
            }
        }

        return flyweightOld30;
    }

    private static FixBenchmarkField flyweightThreeMolibor;
    public static final FixBenchmarkField flyweightThreeMolibor()
    {
        if (flyweightThreeMolibor == null)
        {
            synchronized(FixBenchmarkField.class)
            {
                if (flyweightThreeMolibor == null)
                {
                    flyweightThreeMolibor  = new FixBenchmarkField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_ThreeMolibor;}
                     public String  getValueDescription()             {return text_ThreeMolibor;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_ThreeMolibor).append("|").append(text_ThreeMolibor).append("]").toString();}
                     public boolean isThreeMolibor()                  {return true;}
                     public char    charValue()                       {return ThreeMolibor;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_ThreeMolibor);}
                    };
                }
            }
        }

        return flyweightThreeMolibor;
    }

    private static FixBenchmarkField flyweightSixMolibor;
    public static final FixBenchmarkField flyweightSixMolibor()
    {
        if (flyweightSixMolibor == null)
        {
            synchronized(FixBenchmarkField.class)
            {
                if (flyweightSixMolibor == null)
                {
                    flyweightSixMolibor  = new FixBenchmarkField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_SixMolibor;}
                     public String  getValueDescription()             {return text_SixMolibor;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_SixMolibor).append("|").append(text_SixMolibor).append("]").toString();}
                     public boolean isSixMolibor()                    {return true;}
                     public char    charValue()                       {return SixMolibor;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_SixMolibor);}
                    };
                }
            }
        }

        return flyweightSixMolibor;
    }


    public boolean isCurve()          {return false;}
    public boolean isFiveYear()       {return false;}
    public boolean isOld5()           {return false;}
    public boolean isTenYear()        {return false;}
    public boolean isOld10()          {return false;}
    public boolean isThirtyYear()     {return false;}
    public boolean isOld30()          {return false;}
    public boolean isThreeMolibor()   {return false;}
    public boolean isSixMolibor()     {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixBenchmarkField create(char[] array, int offset, int length)
    {
        if (length == 1)
        {
            return create(array[offset]);
        }

        return null;
    }

    public static FixBenchmarkField create(final char param)
    {
        switch (param)
        {                                                                                           
            case Curve:        return flyweightCurve();
            case FiveYear:     return flyweightFiveYear();
            case Old5:         return flyweightOld5();
            case TenYear:      return flyweightTenYear();
            case Old10:        return flyweightOld10();
            case ThirtyYear:   return flyweightThirtyYear();
            case Old30:        return flyweightOld30();
            case ThreeMolibor: return flyweightThreeMolibor();
            case SixMolibor:   return flyweightSixMolibor();
        }
                                                                                                    
        return null;
    }                                                                                               
}
