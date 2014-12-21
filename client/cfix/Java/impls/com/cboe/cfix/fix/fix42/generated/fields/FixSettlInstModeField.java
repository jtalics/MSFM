package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixSettlInstModeField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [160] (known as SettlInstMode).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixSettlInstModeField implements FixFieldIF, HasCharValueIF
{   
    public static final int    TagID         =  160;
    public static final String TagIDAsString = "160";
    public static final char[] TagIDAsChars  = {'1','6','0'};
    public static final String TagName       = "SettlInstMode";
    public static final String TagFixType    = "CHAR";

    public static final char    Default                                          = '0';
    public static final String  string_Default                                   = "0";
    public static final String  tagged_Default                                   = TagIDAsString + EQUALS + string_Default + SOH;
    public static final char[]  taggedchars_Default                              = {'1','6','0', EQUALSchar, '0', SOHchar};
    public static final String  text_Default                                     = "Default";
    public static final char    StandingInstructionsProvided                     = '1';
    public static final String  string_StandingInstructionsProvided              = "1";
    public static final String  tagged_StandingInstructionsProvided              = TagIDAsString + EQUALS + string_StandingInstructionsProvided + SOH;
    public static final char[]  taggedchars_StandingInstructionsProvided         = {'1','6','0', EQUALSchar, '1', SOHchar};
    public static final String  text_StandingInstructionsProvided                = "StandingInstructionsProvided";
    public static final char    SpecificAllocationAccountOverriding              = '2';
    public static final String  string_SpecificAllocationAccountOverriding       = "2";
    public static final String  tagged_SpecificAllocationAccountOverriding       = TagIDAsString + EQUALS + string_SpecificAllocationAccountOverriding + SOH;
    public static final char[]  taggedchars_SpecificAllocationAccountOverriding  = {'1','6','0', EQUALSchar, '2', SOHchar};
    public static final String  text_SpecificAllocationAccountOverriding         = "SpecificAllocationAccountOverriding";
    public static final char    SpecificAllocationAccountStanding                = '3';
    public static final String  string_SpecificAllocationAccountStanding         = "3";
    public static final String  tagged_SpecificAllocationAccountStanding         = TagIDAsString + EQUALS + string_SpecificAllocationAccountStanding + SOH;
    public static final char[]  taggedchars_SpecificAllocationAccountStanding    = {'1','6','0', EQUALSchar, '3', SOHchar};
    public static final String  text_SpecificAllocationAccountStanding           = "SpecificAllocationAccountStanding";

    private static FixSettlInstModeField flyweightDefault;
    public static final FixSettlInstModeField flyweightDefault()
    {
        if (flyweightDefault == null)
        {
            synchronized(FixSettlInstModeField.class)
            {
                if (flyweightDefault == null)
                {
                    flyweightDefault  = new FixSettlInstModeField()
                    {public boolean hasValue()                                {return true;}
                     public String  getValue()                                {return string_Default;}
                     public String  getValueDescription()                     {return text_Default;}
                     public String  toString()                                {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Default).append("|").append(text_Default).append("]").toString();}
                     public boolean isDefault()                               {return true;}
                     public char    charValue()                               {return Default;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Default);}
                    };
                }
            }
        }

        return flyweightDefault;
    }

    private static FixSettlInstModeField flyweightStandingInstructionsProvided;
    public static final FixSettlInstModeField flyweightStandingInstructionsProvided()
    {
        if (flyweightStandingInstructionsProvided == null)
        {
            synchronized(FixSettlInstModeField.class)
            {
                if (flyweightStandingInstructionsProvided == null)
                {
                    flyweightStandingInstructionsProvided  = new FixSettlInstModeField()
                    {public boolean hasValue()                                {return true;}
                     public String  getValue()                                {return string_StandingInstructionsProvided;}
                     public String  getValueDescription()                     {return text_StandingInstructionsProvided;}
                     public String  toString()                                {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_StandingInstructionsProvided).append("|").append(text_StandingInstructionsProvided).append("]").toString();}
                     public boolean isStandingInstructionsProvided()          {return true;}
                     public char    charValue()                               {return StandingInstructionsProvided;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_StandingInstructionsProvided);}
                    };
                }
            }
        }

        return flyweightStandingInstructionsProvided;
    }

    private static FixSettlInstModeField flyweightSpecificAllocationAccountOverriding;
    public static final FixSettlInstModeField flyweightSpecificAllocationAccountOverriding()
    {
        if (flyweightSpecificAllocationAccountOverriding == null)
        {
            synchronized(FixSettlInstModeField.class)
            {
                if (flyweightSpecificAllocationAccountOverriding == null)
                {
                    flyweightSpecificAllocationAccountOverriding  = new FixSettlInstModeField()
                    {public boolean hasValue()                                {return true;}
                     public String  getValue()                                {return string_SpecificAllocationAccountOverriding;}
                     public String  getValueDescription()                     {return text_SpecificAllocationAccountOverriding;}
                     public String  toString()                                {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_SpecificAllocationAccountOverriding).append("|").append(text_SpecificAllocationAccountOverriding).append("]").toString();}
                     public boolean isSpecificAllocationAccountOverriding()   {return true;}
                     public char    charValue()                               {return SpecificAllocationAccountOverriding;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_SpecificAllocationAccountOverriding);}
                    };
                }
            }
        }

        return flyweightSpecificAllocationAccountOverriding;
    }

    private static FixSettlInstModeField flyweightSpecificAllocationAccountStanding;
    public static final FixSettlInstModeField flyweightSpecificAllocationAccountStanding()
    {
        if (flyweightSpecificAllocationAccountStanding == null)
        {
            synchronized(FixSettlInstModeField.class)
            {
                if (flyweightSpecificAllocationAccountStanding == null)
                {
                    flyweightSpecificAllocationAccountStanding  = new FixSettlInstModeField()
                    {public boolean hasValue()                                {return true;}
                     public String  getValue()                                {return string_SpecificAllocationAccountStanding;}
                     public String  getValueDescription()                     {return text_SpecificAllocationAccountStanding;}
                     public String  toString()                                {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_SpecificAllocationAccountStanding).append("|").append(text_SpecificAllocationAccountStanding).append("]").toString();}
                     public boolean isSpecificAllocationAccountStanding()     {return true;}
                     public char    charValue()                               {return SpecificAllocationAccountStanding;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_SpecificAllocationAccountStanding);}
                    };
                }
            }
        }

        return flyweightSpecificAllocationAccountStanding;
    }


    public boolean isDefault()                               {return false;}
    public boolean isStandingInstructionsProvided()          {return false;}
    public boolean isSpecificAllocationAccountOverriding()   {return false;}
    public boolean isSpecificAllocationAccountStanding()     {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixSettlInstModeField create(char[] array, int offset, int length)
    {
        if (length == 1)
        {
            return create(array[offset]);
        }

        return null;
    }

    public static FixSettlInstModeField create(final char param)
    {
        switch (param)
        {                                                                                           
            case Default:                             return flyweightDefault();
            case StandingInstructionsProvided:        return flyweightStandingInstructionsProvided();
            case SpecificAllocationAccountOverriding: return flyweightSpecificAllocationAccountOverriding();
            case SpecificAllocationAccountStanding:   return flyweightSpecificAllocationAccountStanding();
        }
                                                                                                    
        return null;
    }                                                                                               
}
