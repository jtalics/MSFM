package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixMsgDirectionField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [385] (known as MsgDirection).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixMsgDirectionField implements FixFieldIF, HasCharValueIF
{   
    public static final int    TagID         =  385;
    public static final String TagIDAsString = "385";
    public static final char[] TagIDAsChars  = {'3','8','5'};
    public static final String TagName       = "MsgDirection";
    public static final String TagFixType    = "CHAR";

    public static final char    Send                 = 'S';
    public static final String  string_Send          = "S";
    public static final String  tagged_Send          = TagIDAsString + EQUALS + string_Send + SOH;
    public static final char[]  taggedchars_Send     = {'3','8','5', EQUALSchar, 'S', SOHchar};
    public static final String  text_Send            = "Send";
    public static final char    Receive              = 'R';
    public static final String  string_Receive       = "R";
    public static final String  tagged_Receive       = TagIDAsString + EQUALS + string_Receive + SOH;
    public static final char[]  taggedchars_Receive  = {'3','8','5', EQUALSchar, 'R', SOHchar};
    public static final String  text_Receive         = "Receive";

    private static FixMsgDirectionField flyweightSend;
    public static final FixMsgDirectionField flyweightSend()
    {
        if (flyweightSend == null)
        {
            synchronized(FixMsgDirectionField.class)
            {
                if (flyweightSend == null)
                {
                    flyweightSend  = new FixMsgDirectionField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Send;}
                     public String  getValueDescription()             {return text_Send;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Send).append("|").append(text_Send).append("]").toString();}
                     public boolean isSend()                          {return true;}
                     public char    charValue()                       {return Send;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Send);}
                    };
                }
            }
        }

        return flyweightSend;
    }

    private static FixMsgDirectionField flyweightReceive;
    public static final FixMsgDirectionField flyweightReceive()
    {
        if (flyweightReceive == null)
        {
            synchronized(FixMsgDirectionField.class)
            {
                if (flyweightReceive == null)
                {
                    flyweightReceive  = new FixMsgDirectionField()
                    {public boolean hasValue()                        {return true;}
                     public String  getValue()                        {return string_Receive;}
                     public String  getValueDescription()             {return text_Receive;}
                     public String  toString()                        {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_Receive).append("|").append(text_Receive).append("]").toString();}
                     public boolean isReceive()                       {return true;}
                     public char    charValue()                       {return Receive;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_Receive);}
                    };
                }
            }
        }

        return flyweightReceive;
    }


    public boolean isSend()      {return false;}
    public boolean isReceive()   {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixMsgDirectionField create(char[] array, int offset, int length)
    {
        if (length == 1)
        {
            return create(array[offset]);
        }

        return null;
    }

    public static FixMsgDirectionField create(final char param)
    {
        switch (param)
        {                                                                                           
            case Send:    return flyweightSend();
            case Receive: return flyweightReceive();
        }
                                                                                                    
        return null;
    }                                                                                               
}
