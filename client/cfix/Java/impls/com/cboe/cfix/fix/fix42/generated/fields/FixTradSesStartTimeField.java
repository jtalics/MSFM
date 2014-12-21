package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixTradSesStartTimeField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [341] (known as TradSesStartTime).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import java.util.*;

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixTradSesStartTimeField implements FixFieldIF, HasDateValueIF
{   
    public static final int    TagID         =  341;
    public static final String TagIDAsString = "341";
    public static final char[] TagIDAsChars  = {'3','4','1'};
    public static final String TagName       = "TradSesStartTime";
    public static final String TagFixType    = "UTCTIMESTAMP";

    public static FixTradSesStartTimeField create(final char[] array, final int offset, final int length)
    {
        return create(DateHelper.extractDateInFixUTCTimeStampFormat(array, offset, length));
    }

    public static FixTradSesStartTimeField create(final Date param)
    {
        return new FixTradSesStartTimeField()
        {   public final Date value = param;
            public boolean hasValue()                        {return value != null;}
            public String  getValue()                        {return DateHelper.stringizeDateInFixUTCTimeStampFormat(value);}
            public Date    dateValue()                       {return value;}
        };
    }
    public static FixTradSesStartTimeField create(final String param)
    {
        return new FixTradSesStartTimeField()
        {   public final Date value = DateHelper.extractDateInFixUTCTimeStampFormat(param);
            public boolean hasValue()                        {return value != null;}
            public String  getValue()                        {return DateHelper.stringizeDateInFixUTCTimeStampFormat(value);}
            public Date    dateValue()                       {return value;}
        };
    }
    
    public final int    getTag()                                      {return TagID;}
    public final String getTagAsString()                              {return TagIDAsString;}
    public final char[] getTagAsChars()                               {return TagIDAsChars;}
    public final String getTagName()                                  {return TagName;}
    public       String getValueDescription()                         {return getValue();}
    public       void   accept(FixMessageBuilderIF fixMessageBuilder) {fixMessageBuilder.append(TagIDAsChars, getValue());}
    public       String toString()                                    {return new StringBuilder(64).append(TagName).append("{").append(TagIDAsString).append("} [").append(getValue()).append(']').toString();}
}
