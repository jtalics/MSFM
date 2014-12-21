package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixHaltReasonField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [327] (known as HaltReason).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixHaltReasonField implements FixFieldIF, HasCharValueIF
{   
    public static final int    TagID         =  327;
    public static final String TagIDAsString = "327";
    public static final char[] TagIDAsChars  = {'3','2','7'};
    public static final String TagName       = "HaltReason";
    public static final String TagFixType    = "CHAR";

    public static final char    OrderImbalance                     = 'I';
    public static final String  string_OrderImbalance              = "I";
    public static final String  tagged_OrderImbalance              = TagIDAsString + EQUALS + string_OrderImbalance + SOH;
    public static final char[]  taggedchars_OrderImbalance         = {'3','2','7', EQUALSchar, 'I', SOHchar};
    public static final String  text_OrderImbalance                = "OrderImbalance";
    public static final char    EquipmentChangeover                = 'X';
    public static final String  string_EquipmentChangeover         = "X";
    public static final String  tagged_EquipmentChangeover         = TagIDAsString + EQUALS + string_EquipmentChangeover + SOH;
    public static final char[]  taggedchars_EquipmentChangeover    = {'3','2','7', EQUALSchar, 'X', SOHchar};
    public static final String  text_EquipmentChangeover           = "EquipmentChangeover";
    public static final char    NewsPending                        = 'P';
    public static final String  string_NewsPending                 = "P";
    public static final String  tagged_NewsPending                 = TagIDAsString + EQUALS + string_NewsPending + SOH;
    public static final char[]  taggedchars_NewsPending            = {'3','2','7', EQUALSchar, 'P', SOHchar};
    public static final String  text_NewsPending                   = "NewsPending";
    public static final char    NewsDissemination                  = 'D';
    public static final String  string_NewsDissemination           = "D";
    public static final String  tagged_NewsDissemination           = TagIDAsString + EQUALS + string_NewsDissemination + SOH;
    public static final char[]  taggedchars_NewsDissemination      = {'3','2','7', EQUALSchar, 'D', SOHchar};
    public static final String  text_NewsDissemination             = "NewsDissemination";
    public static final char    OrderInflux                        = 'E';
    public static final String  string_OrderInflux                 = "E";
    public static final String  tagged_OrderInflux                 = TagIDAsString + EQUALS + string_OrderInflux + SOH;
    public static final char[]  taggedchars_OrderInflux            = {'3','2','7', EQUALSchar, 'E', SOHchar};
    public static final String  text_OrderInflux                   = "OrderInflux";
    public static final char    AdditionalInformation              = 'M';
    public static final String  string_AdditionalInformation       = "M";
    public static final String  tagged_AdditionalInformation       = TagIDAsString + EQUALS + string_AdditionalInformation + SOH;
    public static final char[]  taggedchars_AdditionalInformation  = {'3','2','7', EQUALSchar, 'M', SOHchar};
    public static final String  text_AdditionalInformation         = "AdditionalInformation";

    private static FixHaltReasonField flyweightOrderImbalance;
    public static final FixHaltReasonField flyweightOrderImbalance()
    {
        if (flyweightOrderImbalance == null)
        {
            synchronized(FixHaltReasonField.class)
            {
                if (flyweightOrderImbalance == null)
                {
                    flyweightOrderImbalance  = new FixHaltReasonField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_OrderImbalance;}
                     public String  getValueDescription()             {return text_OrderImbalance;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_OrderImbalance).append("|").append(text_OrderImbalance).append("]").toString();}
                     public boolean isOrderImbalance()                {return true;}
                     public char    charValue()                       {return OrderImbalance;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_OrderImbalance);}
                    };
                }
            }
        }

        return flyweightOrderImbalance;
    }

    private static FixHaltReasonField flyweightEquipmentChangeover;
    public static final FixHaltReasonField flyweightEquipmentChangeover()
    {
        if (flyweightEquipmentChangeover == null)
        {
            synchronized(FixHaltReasonField.class)
            {
                if (flyweightEquipmentChangeover == null)
                {
                    flyweightEquipmentChangeover  = new FixHaltReasonField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_EquipmentChangeover;}
                     public String  getValueDescription()             {return text_EquipmentChangeover;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_EquipmentChangeover).append("|").append(text_EquipmentChangeover).append("]").toString();}
                     public boolean isEquipmentChangeover()           {return true;}
                     public char    charValue()                       {return EquipmentChangeover;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_EquipmentChangeover);}
                    };
                }
            }
        }

        return flyweightEquipmentChangeover;
    }

    private static FixHaltReasonField flyweightNewsPending;
    public static final FixHaltReasonField flyweightNewsPending()
    {
        if (flyweightNewsPending == null)
        {
            synchronized(FixHaltReasonField.class)
            {
                if (flyweightNewsPending == null)
                {
                    flyweightNewsPending  = new FixHaltReasonField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_NewsPending;}
                     public String  getValueDescription()             {return text_NewsPending;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_NewsPending).append("|").append(text_NewsPending).append("]").toString();}
                     public boolean isNewsPending()                   {return true;}
                     public char    charValue()                       {return NewsPending;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_NewsPending);}
                    };
                }
            }
        }

        return flyweightNewsPending;
    }

    private static FixHaltReasonField flyweightNewsDissemination;
    public static final FixHaltReasonField flyweightNewsDissemination()
    {
        if (flyweightNewsDissemination == null)
        {
            synchronized(FixHaltReasonField.class)
            {
                if (flyweightNewsDissemination == null)
                {
                    flyweightNewsDissemination  = new FixHaltReasonField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_NewsDissemination;}
                     public String  getValueDescription()             {return text_NewsDissemination;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_NewsDissemination).append("|").append(text_NewsDissemination).append("]").toString();}
                     public boolean isNewsDissemination()             {return true;}
                     public char    charValue()                       {return NewsDissemination;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_NewsDissemination);}
                    };
                }
            }
        }

        return flyweightNewsDissemination;
    }

    private static FixHaltReasonField flyweightOrderInflux;
    public static final FixHaltReasonField flyweightOrderInflux()
    {
        if (flyweightOrderInflux == null)
        {
            synchronized(FixHaltReasonField.class)
            {
                if (flyweightOrderInflux == null)
                {
                    flyweightOrderInflux  = new FixHaltReasonField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_OrderInflux;}
                     public String  getValueDescription()             {return text_OrderInflux;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_OrderInflux).append("|").append(text_OrderInflux).append("]").toString();}
                     public boolean isOrderInflux()                   {return true;}
                     public char    charValue()                       {return OrderInflux;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_OrderInflux);}
                    };
                }
            }
        }

        return flyweightOrderInflux;
    }

    private static FixHaltReasonField flyweightAdditionalInformation;
    public static final FixHaltReasonField flyweightAdditionalInformation()
    {
        if (flyweightAdditionalInformation == null)
        {
            synchronized(FixHaltReasonField.class)
            {
                if (flyweightAdditionalInformation == null)
                {
                    flyweightAdditionalInformation  = new FixHaltReasonField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_AdditionalInformation;}
                     public String  getValueDescription()             {return text_AdditionalInformation;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_AdditionalInformation).append("|").append(text_AdditionalInformation).append("]").toString();}
                     public boolean isAdditionalInformation()         {return true;}
                     public char    charValue()                       {return AdditionalInformation;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_AdditionalInformation);}
                    };
                }
            }
        }

        return flyweightAdditionalInformation;
    }


    public boolean isOrderImbalance()          {return false;}
    public boolean isEquipmentChangeover()     {return false;}
    public boolean isNewsPending()             {return false;}
    public boolean isNewsDissemination()       {return false;}
    public boolean isOrderInflux()             {return false;}
    public boolean isAdditionalInformation()   {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixHaltReasonField create(char[] array, int offset, int length)
    {
        if (length == 1)
        {
            return create(array[offset]);
        }

        return null;
    }

    public static FixHaltReasonField create(final char param)
    {
        switch (param)
        {                                                                                           
            case OrderImbalance:        return flyweightOrderImbalance();
            case EquipmentChangeover:   return flyweightEquipmentChangeover();
            case NewsPending:           return flyweightNewsPending();
            case NewsDissemination:     return flyweightNewsDissemination();
            case OrderInflux:           return flyweightOrderInflux();
            case AdditionalInformation: return flyweightAdditionalInformation();
        }
                                                                                                    
        return null;
    }                                                                                               
}
