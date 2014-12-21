package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixSessionRejectReasonField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [373] (known as SessionRejectReason).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixSessionRejectReasonField implements FixFieldIF, HasIntValueIF
{   
    public static final int    TagID         =  373;
    public static final String TagIDAsString = "373";
    public static final char[] TagIDAsChars  = {'3','7','3'};
    public static final String TagName       = "SessionRejectReason";
    public static final String TagFixType    = "INT";
    public static final char[]  taggedchars_value0 = {'3','7','3', EQUALSchar, ZEROchar, SOHchar};
    public static final char[]  taggedchars_value1 = {'3','7','3', EQUALSchar, ONEchar,  SOHchar};

    public static final int     InvalidTagNumber                             = 0;
    public static final String  string_InvalidTagNumber                      = "0";
    public static final String  tagged_InvalidTagNumber                      = TagIDAsString + EQUALS + string_InvalidTagNumber + SOH;
    public static final char[]  taggedchars_InvalidTagNumber                 = {'3','7','3', EQUALSchar, '0', SOHchar};
    public static final String  text_InvalidTagNumber                        = "InvalidTagNumber";
    public static final int     RequiredTagMissing                           = 1;
    public static final String  string_RequiredTagMissing                    = "1";
    public static final String  tagged_RequiredTagMissing                    = TagIDAsString + EQUALS + string_RequiredTagMissing + SOH;
    public static final char[]  taggedchars_RequiredTagMissing               = {'3','7','3', EQUALSchar, '1', SOHchar};
    public static final String  text_RequiredTagMissing                      = "RequiredTagMissing";
    public static final int     TagNotDefinedForThisMessageType              = 2;
    public static final String  string_TagNotDefinedForThisMessageType       = "2";
    public static final String  tagged_TagNotDefinedForThisMessageType       = TagIDAsString + EQUALS + string_TagNotDefinedForThisMessageType + SOH;
    public static final char[]  taggedchars_TagNotDefinedForThisMessageType  = {'3','7','3', EQUALSchar, '2', SOHchar};
    public static final String  text_TagNotDefinedForThisMessageType         = "TagNotDefinedForThisMessageType";
    public static final int     UndefinedTag                                 = 3;
    public static final String  string_UndefinedTag                          = "3";
    public static final String  tagged_UndefinedTag                          = TagIDAsString + EQUALS + string_UndefinedTag + SOH;
    public static final char[]  taggedchars_UndefinedTag                     = {'3','7','3', EQUALSchar, '3', SOHchar};
    public static final String  text_UndefinedTag                            = "UndefinedTag";
    public static final int     TagSpecifiedWithoutAValue                    = 4;
    public static final String  string_TagSpecifiedWithoutAValue             = "4";
    public static final String  tagged_TagSpecifiedWithoutAValue             = TagIDAsString + EQUALS + string_TagSpecifiedWithoutAValue + SOH;
    public static final char[]  taggedchars_TagSpecifiedWithoutAValue        = {'3','7','3', EQUALSchar, '4', SOHchar};
    public static final String  text_TagSpecifiedWithoutAValue               = "TagSpecifiedWithoutAValue";
    public static final int     ValueIsIncorrect                             = 5;
    public static final String  string_ValueIsIncorrect                      = "5";
    public static final String  tagged_ValueIsIncorrect                      = TagIDAsString + EQUALS + string_ValueIsIncorrect + SOH;
    public static final char[]  taggedchars_ValueIsIncorrect                 = {'3','7','3', EQUALSchar, '5', SOHchar};
    public static final String  text_ValueIsIncorrect                        = "ValueIsIncorrect";
    public static final int     IncorrectDataFormatForValue                  = 6;
    public static final String  string_IncorrectDataFormatForValue           = "6";
    public static final String  tagged_IncorrectDataFormatForValue           = TagIDAsString + EQUALS + string_IncorrectDataFormatForValue + SOH;
    public static final char[]  taggedchars_IncorrectDataFormatForValue      = {'3','7','3', EQUALSchar, '6', SOHchar};
    public static final String  text_IncorrectDataFormatForValue             = "IncorrectDataFormatForValue";
    public static final int     DecryptionProblem                            = 7;
    public static final String  string_DecryptionProblem                     = "7";
    public static final String  tagged_DecryptionProblem                     = TagIDAsString + EQUALS + string_DecryptionProblem + SOH;
    public static final char[]  taggedchars_DecryptionProblem                = {'3','7','3', EQUALSchar, '7', SOHchar};
    public static final String  text_DecryptionProblem                       = "DecryptionProblem";
    public static final int     SignatureProblem                             = 8;
    public static final String  string_SignatureProblem                      = "8";
    public static final String  tagged_SignatureProblem                      = TagIDAsString + EQUALS + string_SignatureProblem + SOH;
    public static final char[]  taggedchars_SignatureProblem                 = {'3','7','3', EQUALSchar, '8', SOHchar};
    public static final String  text_SignatureProblem                        = "SignatureProblem";
    public static final int     CompIdProblem                                = 9;
    public static final String  string_CompIdProblem                         = "9";
    public static final String  tagged_CompIdProblem                         = TagIDAsString + EQUALS + string_CompIdProblem + SOH;
    public static final char[]  taggedchars_CompIdProblem                    = {'3','7','3', EQUALSchar, '9', SOHchar};
    public static final String  text_CompIdProblem                           = "CompIdProblem";
    public static final int     SendingTimeAccuracyProblem                   = 10;
    public static final String  string_SendingTimeAccuracyProblem            = "10";
    public static final String  tagged_SendingTimeAccuracyProblem            = TagIDAsString + EQUALS + string_SendingTimeAccuracyProblem + SOH;
    public static final char[]  taggedchars_SendingTimeAccuracyProblem       = {'3','7','3', EQUALSchar, '1','0', SOHchar};
    public static final String  text_SendingTimeAccuracyProblem              = "SendingTimeAccuracyProblem";
    public static final int     InvalidMsgType                               = 11;
    public static final String  string_InvalidMsgType                        = "11";
    public static final String  tagged_InvalidMsgType                        = TagIDAsString + EQUALS + string_InvalidMsgType + SOH;
    public static final char[]  taggedchars_InvalidMsgType                   = {'3','7','3', EQUALSchar, '1','1', SOHchar};
    public static final String  text_InvalidMsgType                          = "InvalidMsgType";

    private static FixSessionRejectReasonField flyweightInvalidTagNumber;
    public static final FixSessionRejectReasonField flyweightInvalidTagNumber()
    {
        if (flyweightInvalidTagNumber == null)
        {
            synchronized(FixSessionRejectReasonField.class)
            {
                if (flyweightInvalidTagNumber == null)
                {
                    flyweightInvalidTagNumber  = new FixSessionRejectReasonField()
                    {public boolean hasValue()                            {return true;}
                     public String  getValue()                            {return string_InvalidTagNumber;}
                     public String  getValueDescription()                 {return text_InvalidTagNumber;}
                     public String  toString()                            {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_InvalidTagNumber).append("|").append(text_InvalidTagNumber).append("]").toString();}
                     public boolean isInvalidTagNumber()                  {return true;}
                     public int     intValue()                            {return InvalidTagNumber;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_InvalidTagNumber);}
                    };
                }
            }
        }

        return flyweightInvalidTagNumber;
    }

    private static FixSessionRejectReasonField flyweightRequiredTagMissing;
    public static final FixSessionRejectReasonField flyweightRequiredTagMissing()
    {
        if (flyweightRequiredTagMissing == null)
        {
            synchronized(FixSessionRejectReasonField.class)
            {
                if (flyweightRequiredTagMissing == null)
                {
                    flyweightRequiredTagMissing  = new FixSessionRejectReasonField()
                    {public boolean hasValue()                            {return true;}
                     public String  getValue()                            {return string_RequiredTagMissing;}
                     public String  getValueDescription()                 {return text_RequiredTagMissing;}
                     public String  toString()                            {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_RequiredTagMissing).append("|").append(text_RequiredTagMissing).append("]").toString();}
                     public boolean isRequiredTagMissing()                {return true;}
                     public int     intValue()                            {return RequiredTagMissing;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_RequiredTagMissing);}
                    };
                }
            }
        }

        return flyweightRequiredTagMissing;
    }

    private static FixSessionRejectReasonField flyweightTagNotDefinedForThisMessageType;
    public static final FixSessionRejectReasonField flyweightTagNotDefinedForThisMessageType()
    {
        if (flyweightTagNotDefinedForThisMessageType == null)
        {
            synchronized(FixSessionRejectReasonField.class)
            {
                if (flyweightTagNotDefinedForThisMessageType == null)
                {
                    flyweightTagNotDefinedForThisMessageType  = new FixSessionRejectReasonField()
                    {public boolean hasValue()                            {return true;}
                     public String  getValue()                            {return string_TagNotDefinedForThisMessageType;}
                     public String  getValueDescription()                 {return text_TagNotDefinedForThisMessageType;}
                     public String  toString()                            {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_TagNotDefinedForThisMessageType).append("|").append(text_TagNotDefinedForThisMessageType).append("]").toString();}
                     public boolean isTagNotDefinedForThisMessageType()   {return true;}
                     public int     intValue()                            {return TagNotDefinedForThisMessageType;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_TagNotDefinedForThisMessageType);}
                    };
                }
            }
        }

        return flyweightTagNotDefinedForThisMessageType;
    }

    private static FixSessionRejectReasonField flyweightUndefinedTag;
    public static final FixSessionRejectReasonField flyweightUndefinedTag()
    {
        if (flyweightUndefinedTag == null)
        {
            synchronized(FixSessionRejectReasonField.class)
            {
                if (flyweightUndefinedTag == null)
                {
                    flyweightUndefinedTag  = new FixSessionRejectReasonField()
                    {public boolean hasValue()                            {return true;}
                     public String  getValue()                            {return string_UndefinedTag;}
                     public String  getValueDescription()                 {return text_UndefinedTag;}
                     public String  toString()                            {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_UndefinedTag).append("|").append(text_UndefinedTag).append("]").toString();}
                     public boolean isUndefinedTag()                      {return true;}
                     public int     intValue()                            {return UndefinedTag;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_UndefinedTag);}
                    };
                }
            }
        }

        return flyweightUndefinedTag;
    }

    private static FixSessionRejectReasonField flyweightTagSpecifiedWithoutAValue;
    public static final FixSessionRejectReasonField flyweightTagSpecifiedWithoutAValue()
    {
        if (flyweightTagSpecifiedWithoutAValue == null)
        {
            synchronized(FixSessionRejectReasonField.class)
            {
                if (flyweightTagSpecifiedWithoutAValue == null)
                {
                    flyweightTagSpecifiedWithoutAValue  = new FixSessionRejectReasonField()
                    {public boolean hasValue()                            {return true;}
                     public String  getValue()                            {return string_TagSpecifiedWithoutAValue;}
                     public String  getValueDescription()                 {return text_TagSpecifiedWithoutAValue;}
                     public String  toString()                            {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_TagSpecifiedWithoutAValue).append("|").append(text_TagSpecifiedWithoutAValue).append("]").toString();}
                     public boolean isTagSpecifiedWithoutAValue()         {return true;}
                     public int     intValue()                            {return TagSpecifiedWithoutAValue;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_TagSpecifiedWithoutAValue);}
                    };
                }
            }
        }

        return flyweightTagSpecifiedWithoutAValue;
    }

    private static FixSessionRejectReasonField flyweightValueIsIncorrect;
    public static final FixSessionRejectReasonField flyweightValueIsIncorrect()
    {
        if (flyweightValueIsIncorrect == null)
        {
            synchronized(FixSessionRejectReasonField.class)
            {
                if (flyweightValueIsIncorrect == null)
                {
                    flyweightValueIsIncorrect  = new FixSessionRejectReasonField()
                    {public boolean hasValue()                            {return true;}
                     public String  getValue()                            {return string_ValueIsIncorrect;}
                     public String  getValueDescription()                 {return text_ValueIsIncorrect;}
                     public String  toString()                            {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_ValueIsIncorrect).append("|").append(text_ValueIsIncorrect).append("]").toString();}
                     public boolean isValueIsIncorrect()                  {return true;}
                     public int     intValue()                            {return ValueIsIncorrect;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_ValueIsIncorrect);}
                    };
                }
            }
        }

        return flyweightValueIsIncorrect;
    }

    private static FixSessionRejectReasonField flyweightIncorrectDataFormatForValue;
    public static final FixSessionRejectReasonField flyweightIncorrectDataFormatForValue()
    {
        if (flyweightIncorrectDataFormatForValue == null)
        {
            synchronized(FixSessionRejectReasonField.class)
            {
                if (flyweightIncorrectDataFormatForValue == null)
                {
                    flyweightIncorrectDataFormatForValue  = new FixSessionRejectReasonField()
                    {public boolean hasValue()                            {return true;}
                     public String  getValue()                            {return string_IncorrectDataFormatForValue;}
                     public String  getValueDescription()                 {return text_IncorrectDataFormatForValue;}
                     public String  toString()                            {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_IncorrectDataFormatForValue).append("|").append(text_IncorrectDataFormatForValue).append("]").toString();}
                     public boolean isIncorrectDataFormatForValue()       {return true;}
                     public int     intValue()                            {return IncorrectDataFormatForValue;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_IncorrectDataFormatForValue);}
                    };
                }
            }
        }

        return flyweightIncorrectDataFormatForValue;
    }

    private static FixSessionRejectReasonField flyweightDecryptionProblem;
    public static final FixSessionRejectReasonField flyweightDecryptionProblem()
    {
        if (flyweightDecryptionProblem == null)
        {
            synchronized(FixSessionRejectReasonField.class)
            {
                if (flyweightDecryptionProblem == null)
                {
                    flyweightDecryptionProblem  = new FixSessionRejectReasonField()
                    {public boolean hasValue()                            {return true;}
                     public String  getValue()                            {return string_DecryptionProblem;}
                     public String  getValueDescription()                 {return text_DecryptionProblem;}
                     public String  toString()                            {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_DecryptionProblem).append("|").append(text_DecryptionProblem).append("]").toString();}
                     public boolean isDecryptionProblem()                 {return true;}
                     public int     intValue()                            {return DecryptionProblem;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_DecryptionProblem);}
                    };
                }
            }
        }

        return flyweightDecryptionProblem;
    }

    private static FixSessionRejectReasonField flyweightSignatureProblem;
    public static final FixSessionRejectReasonField flyweightSignatureProblem()
    {
        if (flyweightSignatureProblem == null)
        {
            synchronized(FixSessionRejectReasonField.class)
            {
                if (flyweightSignatureProblem == null)
                {
                    flyweightSignatureProblem  = new FixSessionRejectReasonField()
                    {public boolean hasValue()                            {return true;}
                     public String  getValue()                            {return string_SignatureProblem;}
                     public String  getValueDescription()                 {return text_SignatureProblem;}
                     public String  toString()                            {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_SignatureProblem).append("|").append(text_SignatureProblem).append("]").toString();}
                     public boolean isSignatureProblem()                  {return true;}
                     public int     intValue()                            {return SignatureProblem;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_SignatureProblem);}
                    };
                }
            }
        }

        return flyweightSignatureProblem;
    }

    private static FixSessionRejectReasonField flyweightCompIdProblem;
    public static final FixSessionRejectReasonField flyweightCompIdProblem()
    {
        if (flyweightCompIdProblem == null)
        {
            synchronized(FixSessionRejectReasonField.class)
            {
                if (flyweightCompIdProblem == null)
                {
                    flyweightCompIdProblem  = new FixSessionRejectReasonField()
                    {public boolean hasValue()                            {return true;}
                     public String  getValue()                            {return string_CompIdProblem;}
                     public String  getValueDescription()                 {return text_CompIdProblem;}
                     public String  toString()                            {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_CompIdProblem).append("|").append(text_CompIdProblem).append("]").toString();}
                     public boolean isCompIdProblem()                     {return true;}
                     public int     intValue()                            {return CompIdProblem;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_CompIdProblem);}
                    };
                }
            }
        }

        return flyweightCompIdProblem;
    }

    private static FixSessionRejectReasonField flyweightSendingTimeAccuracyProblem;
    public static final FixSessionRejectReasonField flyweightSendingTimeAccuracyProblem()
    {
        if (flyweightSendingTimeAccuracyProblem == null)
        {
            synchronized(FixSessionRejectReasonField.class)
            {
                if (flyweightSendingTimeAccuracyProblem == null)
                {
                    flyweightSendingTimeAccuracyProblem  = new FixSessionRejectReasonField()
                    {public boolean hasValue()                            {return true;}
                     public String  getValue()                            {return string_SendingTimeAccuracyProblem;}
                     public String  getValueDescription()                 {return text_SendingTimeAccuracyProblem;}
                     public String  toString()                            {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_SendingTimeAccuracyProblem).append("|").append(text_SendingTimeAccuracyProblem).append("]").toString();}
                     public boolean isSendingTimeAccuracyProblem()        {return true;}
                     public int     intValue()                            {return SendingTimeAccuracyProblem;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_SendingTimeAccuracyProblem);}
                    };
                }
            }
        }

        return flyweightSendingTimeAccuracyProblem;
    }

    private static FixSessionRejectReasonField flyweightInvalidMsgType;
    public static final FixSessionRejectReasonField flyweightInvalidMsgType()
    {
        if (flyweightInvalidMsgType == null)
        {
            synchronized(FixSessionRejectReasonField.class)
            {
                if (flyweightInvalidMsgType == null)
                {
                    flyweightInvalidMsgType  = new FixSessionRejectReasonField()
                    {public boolean hasValue()                            {return true;}
                     public String  getValue()                            {return string_InvalidMsgType;}
                     public String  getValueDescription()                 {return text_InvalidMsgType;}
                     public String  toString()                            {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_InvalidMsgType).append("|").append(text_InvalidMsgType).append("]").toString();}
                     public boolean isInvalidMsgType()                    {return true;}
                     public int     intValue()                            {return InvalidMsgType;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(taggedchars_InvalidMsgType);}
                    };
                }
            }
        }

        return flyweightInvalidMsgType;
    }


    public boolean isInvalidTagNumber()                  {return false;}
    public boolean isRequiredTagMissing()                {return false;}
    public boolean isTagNotDefinedForThisMessageType()   {return false;}
    public boolean isUndefinedTag()                      {return false;}
    public boolean isTagSpecifiedWithoutAValue()         {return false;}
    public boolean isValueIsIncorrect()                  {return false;}
    public boolean isIncorrectDataFormatForValue()       {return false;}
    public boolean isDecryptionProblem()                 {return false;}
    public boolean isSignatureProblem()                  {return false;}
    public boolean isCompIdProblem()                     {return false;}
    public boolean isSendingTimeAccuracyProblem()        {return false;}
    public boolean isInvalidMsgType()                    {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixSessionRejectReasonField create(char[] array, int offset, int length)
    {
        int param = IntegerHelper.parseInt(array, offset, length);
        if (param == IntegerHelper.INVALID_VALUE)
        {
            return null;
        }
        return create(param);
    }

    public static FixSessionRejectReasonField create(final int param)
    {
        switch (param)
        {                                                                                           
            case InvalidTagNumber:                return flyweightInvalidTagNumber();
            case RequiredTagMissing:              return flyweightRequiredTagMissing();
            case TagNotDefinedForThisMessageType: return flyweightTagNotDefinedForThisMessageType();
            case UndefinedTag:                    return flyweightUndefinedTag();
            case TagSpecifiedWithoutAValue:       return flyweightTagSpecifiedWithoutAValue();
            case ValueIsIncorrect:                return flyweightValueIsIncorrect();
            case IncorrectDataFormatForValue:     return flyweightIncorrectDataFormatForValue();
            case DecryptionProblem:               return flyweightDecryptionProblem();
            case SignatureProblem:                return flyweightSignatureProblem();
            case CompIdProblem:                   return flyweightCompIdProblem();
            case SendingTimeAccuracyProblem:      return flyweightSendingTimeAccuracyProblem();
            case InvalidMsgType:                  return flyweightInvalidMsgType();
        }
                                                                                                    
        return null;
    }                                                                                               
}
