package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixTradSesModeField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [339] (known as TradSesMode).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixTradSesModeField implements FixFieldIF, HasIntValueIF
{   
    public static final int    TagID         =  339;
    public static final String TagIDAsString = "339";
    public static final char[] TagIDAsChars  = {'3','3','9'};
    public static final String TagName       = "TradSesMode";
    public static final String TagFixType    = "INT";
    public static final char[]  taggedchars_value0 = {'3','3','9', EQUALSchar, ZEROchar, SOHchar};
    public static final char[]  taggedchars_value1 = {'3','3','9', EQUALSchar, ONEchar,  SOHchar};

    public static final int     Testing                 = 1;
    public static final String  string_Testing          = "1";
    public static final String  tagged_Testing          = TagIDAsString + EQUALS + string_Testing + SOH;
    public static final char[]  taggedchars_Testing     = {'3','3','9', EQUALSchar, '1', SOHchar};
    public static final String  text_Testing            = "Testing";
    public static final int     Simulated               = 2;
    public static final String  string_Simulated        = "2";
    public static final String  tagged_Simulated        = TagIDAsString + EQUALS + string_Simulated + SOH;
    public static final char[]  taggedchars_Simulated   = {'3','3','9', EQUALSchar, '2', SOHchar};
    public static final String  text_Simulated          = "Simulated";
    public static final int     Production              = 3;
    public static final String  string_Production       = "3";
    public static final String  tagged_Production       = TagIDAsString + EQUALS + string_Production + SOH;
    public static final char[]  taggedchars_Production  = {'3','3','9', EQUALSchar, '3', SOHchar};
    public static final String  text_Production         = "Production";

    private static FixTradSesModeField flyweightTesting;
    public static final FixTradSesModeField flyweightTesting()
    {
        if (flyweightTesting == null)
        {
            synchronized(FixTradSesModeField.class)
            {
                if (flyweightTesting == null)
                {
                    flyweightTesting  = new FixTradSesModeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Testing;}
                     public String  getValueDescription()             {return text_Testing;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Testing).append("|").append(text_Testing).append("]").toString();}
                     public boolean isTesting()                       {return true;}
                     public int     intValue()                        {return Testing;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Testing);}
                    };
                }
            }
        }

        return flyweightTesting;
    }

    private static FixTradSesModeField flyweightSimulated;
    public static final FixTradSesModeField flyweightSimulated()
    {
        if (flyweightSimulated == null)
        {
            synchronized(FixTradSesModeField.class)
            {
                if (flyweightSimulated == null)
                {
                    flyweightSimulated  = new FixTradSesModeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Simulated;}
                     public String  getValueDescription()             {return text_Simulated;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Simulated).append("|").append(text_Simulated).append("]").toString();}
                     public boolean isSimulated()                     {return true;}
                     public int     intValue()                        {return Simulated;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Simulated);}
                    };
                }
            }
        }

        return flyweightSimulated;
    }

    private static FixTradSesModeField flyweightProduction;
    public static final FixTradSesModeField flyweightProduction()
    {
        if (flyweightProduction == null)
        {
            synchronized(FixTradSesModeField.class)
            {
                if (flyweightProduction == null)
                {
                    flyweightProduction  = new FixTradSesModeField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Production;}
                     public String  getValueDescription()             {return text_Production;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Production).append("|").append(text_Production).append("]").toString();}
                     public boolean isProduction()                    {return true;}
                     public int     intValue()                        {return Production;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Production);}
                    };
                }
            }
        }

        return flyweightProduction;
    }


    public boolean isTesting()      {return false;}
    public boolean isSimulated()    {return false;}
    public boolean isProduction()   {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixTradSesModeField create(char[] array, int offset, int length)
    {
        int param = IntegerHelper.parseInt(array, offset, length);
        if (param == IntegerHelper.INVALID_VALUE)
        {
            return null;
        }
        return create(param);
    }

    public static FixTradSesModeField create(final int param)
    {
        switch (param)
        {                                                                                           
            case Testing:    return flyweightTesting();
            case Simulated:  return flyweightSimulated();
            case Production: return flyweightProduction();
        }
                                                                                                    
        return null;
    }                                                                                               
}