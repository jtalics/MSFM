package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixGTBookingInstField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [427] (known as GTBookingInst).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixGTBookingInstField implements FixFieldIF, HasIntValueIF
{   
    public static final int    TagID         =  427;
    public static final String TagIDAsString = "427";
    public static final char[] TagIDAsChars  = {'4','2','7'};
    public static final String TagName       = "GTBookingInst";
    public static final String TagFixType    = "INT";
    public static final char[]  taggedchars_value0 = {'4','2','7', EQUALSchar, ZEROchar, SOHchar};
    public static final char[]  taggedchars_value1 = {'4','2','7', EQUALSchar, ONEchar,  SOHchar};

    public static final int     BookOutAllTradesOnDayOfExecution                             = 0;
    public static final String  string_BookOutAllTradesOnDayOfExecution                      = "0";
    public static final String  tagged_BookOutAllTradesOnDayOfExecution                      = TagIDAsString + EQUALS + string_BookOutAllTradesOnDayOfExecution + SOH;
    public static final char[]  taggedchars_BookOutAllTradesOnDayOfExecution                 = {'4','2','7', EQUALSchar, '0', SOHchar};
    public static final String  text_BookOutAllTradesOnDayOfExecution                        = "BookOutAllTradesOnDayOfExecution";
    public static final int     AccumulateExecutionsUntilOrderIsFilledOrExpires              = 1;
    public static final String  string_AccumulateExecutionsUntilOrderIsFilledOrExpires       = "1";
    public static final String  tagged_AccumulateExecutionsUntilOrderIsFilledOrExpires       = TagIDAsString + EQUALS + string_AccumulateExecutionsUntilOrderIsFilledOrExpires + SOH;
    public static final char[]  taggedchars_AccumulateExecutionsUntilOrderIsFilledOrExpires  = {'4','2','7', EQUALSchar, '1', SOHchar};
    public static final String  text_AccumulateExecutionsUntilOrderIsFilledOrExpires         = "AccumulateExecutionsUntilOrderIsFilledOrExpires";
    public static final int     AccumulateUntilVerballyNotifiedOtherwise                     = 2;
    public static final String  string_AccumulateUntilVerballyNotifiedOtherwise              = "2";
    public static final String  tagged_AccumulateUntilVerballyNotifiedOtherwise              = TagIDAsString + EQUALS + string_AccumulateUntilVerballyNotifiedOtherwise + SOH;
    public static final char[]  taggedchars_AccumulateUntilVerballyNotifiedOtherwise         = {'4','2','7', EQUALSchar, '2', SOHchar};
    public static final String  text_AccumulateUntilVerballyNotifiedOtherwise                = "AccumulateUntilVerballyNotifiedOtherwise";

    private static FixGTBookingInstField flyweightBookOutAllTradesOnDayOfExecution;
    public static final FixGTBookingInstField flyweightBookOutAllTradesOnDayOfExecution()
    {
        if (flyweightBookOutAllTradesOnDayOfExecution == null)
        {
            synchronized(FixGTBookingInstField.class)
            {
                if (flyweightBookOutAllTradesOnDayOfExecution == null)
                {
                    flyweightBookOutAllTradesOnDayOfExecution  = new FixGTBookingInstField()
                    {public boolean hasValue()                                            {return true;}
                     public String  getValue()                                            {return string_BookOutAllTradesOnDayOfExecution;}
                     public String  getValueDescription()                                 {return text_BookOutAllTradesOnDayOfExecution;}
                     public String  toString()                                            {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_BookOutAllTradesOnDayOfExecution).append("|").append(text_BookOutAllTradesOnDayOfExecution).append("]").toString();}
                     public boolean isBookOutAllTradesOnDayOfExecution()                  {return true;}
                     public int     intValue()                                            {return BookOutAllTradesOnDayOfExecution;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder)         {fixMessageBuilder.append(taggedchars_BookOutAllTradesOnDayOfExecution);}
                    };
                }
            }
        }

        return flyweightBookOutAllTradesOnDayOfExecution;
    }

    private static FixGTBookingInstField flyweightAccumulateExecutionsUntilOrderIsFilledOrExpires;
    public static final FixGTBookingInstField flyweightAccumulateExecutionsUntilOrderIsFilledOrExpires()
    {
        if (flyweightAccumulateExecutionsUntilOrderIsFilledOrExpires == null)
        {
            synchronized(FixGTBookingInstField.class)
            {
                if (flyweightAccumulateExecutionsUntilOrderIsFilledOrExpires == null)
                {
                    flyweightAccumulateExecutionsUntilOrderIsFilledOrExpires  = new FixGTBookingInstField()
                    {public boolean hasValue()                                            {return true;}
                     public String  getValue()                                            {return string_AccumulateExecutionsUntilOrderIsFilledOrExpires;}
                     public String  getValueDescription()                                 {return text_AccumulateExecutionsUntilOrderIsFilledOrExpires;}
                     public String  toString()                                            {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_AccumulateExecutionsUntilOrderIsFilledOrExpires).append("|").append(text_AccumulateExecutionsUntilOrderIsFilledOrExpires).append("]").toString();}
                     public boolean isAccumulateExecutionsUntilOrderIsFilledOrExpires()   {return true;}
                     public int     intValue()                                            {return AccumulateExecutionsUntilOrderIsFilledOrExpires;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder)         {fixMessageBuilder.append(taggedchars_AccumulateExecutionsUntilOrderIsFilledOrExpires);}
                    };
                }
            }
        }

        return flyweightAccumulateExecutionsUntilOrderIsFilledOrExpires;
    }

    private static FixGTBookingInstField flyweightAccumulateUntilVerballyNotifiedOtherwise;
    public static final FixGTBookingInstField flyweightAccumulateUntilVerballyNotifiedOtherwise()
    {
        if (flyweightAccumulateUntilVerballyNotifiedOtherwise == null)
        {
            synchronized(FixGTBookingInstField.class)
            {
                if (flyweightAccumulateUntilVerballyNotifiedOtherwise == null)
                {
                    flyweightAccumulateUntilVerballyNotifiedOtherwise  = new FixGTBookingInstField()
                    {public boolean hasValue()                                            {return true;}
                     public String  getValue()                                            {return string_AccumulateUntilVerballyNotifiedOtherwise;}
                     public String  getValueDescription()                                 {return text_AccumulateUntilVerballyNotifiedOtherwise;}
                     public String  toString()                                            {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(string_AccumulateUntilVerballyNotifiedOtherwise).append("|").append(text_AccumulateUntilVerballyNotifiedOtherwise).append("]").toString();}
                     public boolean isAccumulateUntilVerballyNotifiedOtherwise()          {return true;}
                     public int     intValue()                                            {return AccumulateUntilVerballyNotifiedOtherwise;}
                     public void    accept(FixMessageBuilderIF fixMessageBuilder)         {fixMessageBuilder.append(taggedchars_AccumulateUntilVerballyNotifiedOtherwise);}
                    };
                }
            }
        }

        return flyweightAccumulateUntilVerballyNotifiedOtherwise;
    }


    public boolean isBookOutAllTradesOnDayOfExecution()                  {return false;}
    public boolean isAccumulateExecutionsUntilOrderIsFilledOrExpires()   {return false;}
    public boolean isAccumulateUntilVerballyNotifiedOtherwise()          {return false;}

    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}

    public static FixGTBookingInstField create(char[] array, int offset, int length)
    {
        int param = IntegerHelper.parseInt(array, offset, length);
        if (param == IntegerHelper.INVALID_VALUE)
        {
            return null;
        }
        return create(param);
    }

    public static FixGTBookingInstField create(final int param)
    {
        switch (param)
        {                                                                                           
            case BookOutAllTradesOnDayOfExecution:                return flyweightBookOutAllTradesOnDayOfExecution();
            case AccumulateExecutionsUntilOrderIsFilledOrExpires: return flyweightAccumulateExecutionsUntilOrderIsFilledOrExpires();
            case AccumulateUntilVerballyNotifiedOtherwise:        return flyweightAccumulateUntilVerballyNotifiedOtherwise();
        }
                                                                                                    
        return null;
    }                                                                                               
}
