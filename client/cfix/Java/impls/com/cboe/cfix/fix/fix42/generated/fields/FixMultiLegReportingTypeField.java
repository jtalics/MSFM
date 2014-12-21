package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixMultiLegReportingTypeField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [442] (known as MultiLegReportingType).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixMultiLegReportingTypeField implements FixFieldIF, HasCharValueIF
{   
    public static final int    TagID         =  442;
    public static final String TagIDAsString = "442";
    public static final char[] TagIDAsChars  = {'4','4','2'};
    public static final String TagName       = "MultiLegReportingType";
    public static final String TagFixType    = "CHAR";

    public static final char    SingleSecurity                       = '1';
    public static final String  string_SingleSecurity                = "1";
    public static final String  tagged_SingleSecurity                = TagIDAsString + EQUALS + string_SingleSecurity + SOH;
    public static final char[]  taggedchars_SingleSecurity           = {'4','4','2', EQUALSchar, '1', SOHchar};
    public static final String  text_SingleSecurity                  = "SingleSecurity";
    public static final char    IndividualLegOfMultileg              = '2';
    public static final String  string_IndividualLegOfMultileg       = "2";
    public static final String  tagged_IndividualLegOfMultileg       = TagIDAsString + EQUALS + string_IndividualLegOfMultileg + SOH;
    public static final char[]  taggedchars_IndividualLegOfMultileg  = {'4','4','2', EQUALSchar, '2', SOHchar};
    public static final String  text_IndividualLegOfMultileg         = "IndividualLegOfMultileg";
    public static final char    MultilegSecurity                     = '3';
    public static final String  string_MultilegSecurity              = "3";
    public static final String  tagged_MultilegSecurity              = TagIDAsString + EQUALS + string_MultilegSecurity + SOH;
    public static final char[]  taggedchars_MultilegSecurity         = {'4','4','2', EQUALSchar, '3', SOHchar};
    public static final String  text_MultilegSecurity                = "MultilegSecurity";

    private static FixMultiLegReportingTypeField flyweightSingleSecurity;
    public static final FixMultiLegReportingTypeField flyweightSingleSecurity()
    {
        if (flyweightSingleSecurity == null)
        {
            synchronized(FixMultiLegReportingTypeField.class)
            {
                if (flyweightSingleSecurity == null)
                {
                    flyweightSingleSecurity  = new FixMultiLegReportingTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_SingleSecurity;}
                     public String  getValueDescription()             {return text_SingleSecurity;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_SingleSecurity).append("|").append(text_SingleSecurity).append("]").toString();}
                     public boolean isSingleSecurity()                {return true;}
                     public char    charValue()                       {return SingleSecurity;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_SingleSecurity);}
                    };
                }
            }
        }

        return flyweightSingleSecurity;
    }

    private static FixMultiLegReportingTypeField flyweightIndividualLegOfMultileg;
    public static final FixMultiLegReportingTypeField flyweightIndividualLegOfMultileg()
    {
        if (flyweightIndividualLegOfMultileg == null)
        {
            synchronized(FixMultiLegReportingTypeField.class)
            {
                if (flyweightIndividualLegOfMultileg == null)
                {
                    flyweightIndividualLegOfMultileg  = new FixMultiLegReportingTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_IndividualLegOfMultileg;}
                     public String  getValueDescription()             {return text_IndividualLegOfMultileg;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_IndividualLegOfMultileg).append("|").append(text_IndividualLegOfMultileg).append("]").toString();}
                     public boolean isIndividualLegOfMultileg()       {return true;}
                     public char    charValue()                       {return IndividualLegOfMultileg;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_IndividualLegOfMultileg);}
                    };
                }
            }
        }

        return flyweightIndividualLegOfMultileg;
    }

    private static FixMultiLegReportingTypeField flyweightMultilegSecurity;
    public static final FixMultiLegReportingTypeField flyweightMultilegSecurity()
    {
        if (flyweightMultilegSecurity == null)
        {
            synchronized(FixMultiLegReportingTypeField.class)
            {
                if (flyweightMultilegSecurity == null)
                {
                    flyweightMultilegSecurity  = new FixMultiLegReportingTypeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_MultilegSecurity;}
                     public String  getValueDescription()             {return text_MultilegSecurity;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_MultilegSecurity).append("|").append(text_MultilegSecurity).append("]").toString();}
                     public boolean isMultilegSecurity()              {return true;}
                     public char    charValue()                       {return MultilegSecurity;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_MultilegSecurity);}
                    };
                }
            }
        }

        return flyweightMultilegSecurity;
    }


    public boolean isSingleSecurity()            {return false;}
    public boolean isIndividualLegOfMultileg()   {return false;}
    public boolean isMultilegSecurity()          {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixMultiLegReportingTypeField create(char[] array, int offset, int length)
    {
        if (length == 1)
        {
            return create(array[offset]);
        }

        return null;
    }

    public static FixMultiLegReportingTypeField create(final char param)
    {
        switch (param)
        {                                                                                           
            case SingleSecurity:          return flyweightSingleSecurity();
            case IndividualLegOfMultileg: return flyweightIndividualLegOfMultileg();
            case MultilegSecurity:        return flyweightMultilegSecurity();
        }
                                                                                                    
        return new FixMultiLegReportingTypeField()
        {       public char    value = param;
                public boolean hasValue()                        {return true;}
                public String  getValue()                        {return "" + value;}
                public char    charValue()                       {return MultilegSecurity;}
        };
    }                                                                                               
}
