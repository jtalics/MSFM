package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixSettlCurrFxRateCalcField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [156] (known as SettlCurrFxRateCalc).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixSettlCurrFxRateCalcField implements FixFieldIF, HasCharValueIF
{   
    public static final int    TagID         =  156;
    public static final String TagIDAsString = "156";
    public static final char[] TagIDAsChars  = {'1','5','6'};
    public static final String TagName       = "SettlCurrFxRateCalc";
    public static final String TagFixType    = "CHAR";

    public static final char    Multiply              = 'M';
    public static final String  string_Multiply       = "M";
    public static final String  tagged_Multiply       = TagIDAsString + EQUALS + string_Multiply + SOH;
    public static final char[]  taggedchars_Multiply  = {'1','5','6', EQUALSchar, 'M', SOHchar};
    public static final String  text_Multiply         = "Multiply";
    public static final char    Divide                = 'D';
    public static final String  string_Divide         = "D";
    public static final String  tagged_Divide         = TagIDAsString + EQUALS + string_Divide + SOH;
    public static final char[]  taggedchars_Divide    = {'1','5','6', EQUALSchar, 'D', SOHchar};
    public static final String  text_Divide           = "Divide";

    private static FixSettlCurrFxRateCalcField flyweightMultiply;
    public static final FixSettlCurrFxRateCalcField flyweightMultiply()
    {
        if (flyweightMultiply == null)
        {
            synchronized(FixSettlCurrFxRateCalcField.class)
            {
                if (flyweightMultiply == null)
                {
                    flyweightMultiply  = new FixSettlCurrFxRateCalcField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Multiply;}
                     public String  getValueDescription()             {return text_Multiply;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Multiply).append("|").append(text_Multiply).append("]").toString();}
                     public boolean isMultiply()                      {return true;}
                     public char    charValue()                       {return Multiply;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Multiply);}
                    };
                }
            }
        }

        return flyweightMultiply;
    }

    private static FixSettlCurrFxRateCalcField flyweightDivide;
    public static final FixSettlCurrFxRateCalcField flyweightDivide()
    {
        if (flyweightDivide == null)
        {
            synchronized(FixSettlCurrFxRateCalcField.class)
            {
                if (flyweightDivide == null)
                {
                    flyweightDivide  = new FixSettlCurrFxRateCalcField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Divide;}
                     public String  getValueDescription()             {return text_Divide;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Divide).append("|").append(text_Divide).append("]").toString();}
                     public boolean isDivide()                        {return true;}
                     public char    charValue()                       {return Divide;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Divide);}
                    };
                }
            }
        }

        return flyweightDivide;
    }


    public boolean isMultiply()   {return false;}
    public boolean isDivide()     {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixSettlCurrFxRateCalcField create(char[] array, int offset, int length)
    {
        if (length == 1)
        {
            return create(array[offset]);
        }

        return null;
    }

    public static FixSettlCurrFxRateCalcField create(final char param)
    {
        switch (param)
        {                                                                                           
            case Multiply: return flyweightMultiply();
            case Divide:   return flyweightDivide();
        }
                                                                                                    
        return null;
    }                                                                                               
}