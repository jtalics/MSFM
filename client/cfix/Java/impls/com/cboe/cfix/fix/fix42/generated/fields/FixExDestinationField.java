package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixExDestinationField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [100] (known as ExDestination).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;

public abstract class FixExDestinationField implements FixFieldIF
{   
    public static final int    TagID         =  100;
    public static final String TagIDAsString = "100";
    public static final char[] TagIDAsChars  = {'1','0','0'};
    public static final String TagName       = "ExDestination";
    public static final String TagFixType    = "STRING";

    public static final String  ASE              = "ASE";
    public static final String  string_ASE       = ASE;
    public static final char[]  chars_ASE        = {'A','S','E'};
    public static final String  tagged_ASE       = TagIDAsString + EQUALS + string_ASE + SOH;
    public static final char[]  taggedchars_ASE  = {'1','0','0', EQUALSchar, 'A','S','E', SOHchar};
    public static final String  text_ASE         = "ASE";
    public static final String  ISX              = "ISX";
    public static final String  string_ISX       = ISX;
    public static final char[]  chars_ISX        = {'I','S','X'};
    public static final String  tagged_ISX       = TagIDAsString + EQUALS + string_ISX + SOH;
    public static final char[]  taggedchars_ISX  = {'1','0','0', EQUALSchar, 'I','S','X', SOHchar};
    public static final String  text_ISX         = "ISX";
    public static final String  PHO              = "PHO";
    public static final String  string_PHO       = PHO;
    public static final char[]  chars_PHO        = {'P','H','O'};
    public static final String  tagged_PHO       = TagIDAsString + EQUALS + string_PHO + SOH;
    public static final char[]  taggedchars_PHO  = {'1','0','0', EQUALSchar, 'P','H','O', SOHchar};
    public static final String  text_PHO         = "PHO";
    public static final String  PSE              = "PSE";
    public static final String  string_PSE       = PSE;
    public static final char[]  chars_PSE        = {'P','S','E'};
    public static final String  tagged_PSE       = TagIDAsString + EQUALS + string_PSE + SOH;
    public static final char[]  taggedchars_PSE  = {'1','0','0', EQUALSchar, 'P','S','E', SOHchar};
    public static final String  text_PSE         = "PSE";

    private static FixExDestinationField flyweightASE;
    public static final FixExDestinationField flyweightASE()
    {
        if (flyweightASE == null)
        {
            synchronized(FixExDestinationField.class)
            {
                if (flyweightASE == null)
                {
                    flyweightASE  = new FixExDestinationField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_ASE;}
                     public String  getValueDescription()             {return text_ASE;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_ASE).append("|").append(text_ASE).append("]").toString();}
                     public boolean isASE()                           {return true;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_ASE);}
                    };
                }
            }
        }

        return flyweightASE;
    }

    private static FixExDestinationField flyweightISX;
    public static final FixExDestinationField flyweightISX()
    {
        if (flyweightISX == null)
        {
            synchronized(FixExDestinationField.class)
            {
                if (flyweightISX == null)
                {
                    flyweightISX  = new FixExDestinationField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_ISX;}
                     public String  getValueDescription()             {return text_ISX;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_ISX).append("|").append(text_ISX).append("]").toString();}
                     public boolean isISX()                           {return true;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_ISX);}
                    };
                }
            }
        }

        return flyweightISX;
    }

    private static FixExDestinationField flyweightPHO;
    public static final FixExDestinationField flyweightPHO()
    {
        if (flyweightPHO == null)
        {
            synchronized(FixExDestinationField.class)
            {
                if (flyweightPHO == null)
                {
                    flyweightPHO  = new FixExDestinationField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_PHO;}
                     public String  getValueDescription()             {return text_PHO;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_PHO).append("|").append(text_PHO).append("]").toString();}
                     public boolean isPHO()                           {return true;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_PHO);}
                    };
                }
            }
        }

        return flyweightPHO;
    }

    private static FixExDestinationField flyweightPSE;
    public static final FixExDestinationField flyweightPSE()
    {
        if (flyweightPSE == null)
        {
            synchronized(FixExDestinationField.class)
            {
                if (flyweightPSE == null)
                {
                    flyweightPSE  = new FixExDestinationField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_PSE;}
                     public String  getValueDescription()             {return text_PSE;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_PSE).append("|").append(text_PSE).append("]").toString();}
                     public boolean isPSE()                           {return true;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_PSE);}
                    };
                }
            }
        }

        return flyweightPSE;
    }


    public boolean isASE()   {return false;}
    public boolean isISX()   {return false;}
    public boolean isPHO()   {return false;}
    public boolean isPSE()   {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixExDestinationField create(char[] array, int offset, int length)
    {
        return create(new String(array, offset, length));
    }

    public static FixExDestinationField create(final String paramString)
    {                                                                                               
        if (ASE.equals(paramString)) return flyweightASE();
        if (ISX.equals(paramString)) return flyweightISX();
        if (PHO.equals(paramString)) return flyweightPHO();
        if (PSE.equals(paramString)) return flyweightPSE();
        return null;
    }                                                                                               
}