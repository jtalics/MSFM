package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixTradSesOpenTimeField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [342] (known as TradSesOpenTime).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import java.util.*;

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixTradSesOpenTimeField implements FixFieldIF, HasDateValueIF
{   
    public static final int    TagID         =  342;
    public static final String TagIDAsString = "342";
    public static final char[] TagIDAsChars  = {'3','4','2'};
    public static final String TagName       = "TradSesOpenTime";
    public static final String TagFixType    = "UTCTIMESTAMP";

    public static FixTradSesOpenTimeField create(final char[] array, final int offset, final int length)
    {
        return create(DateHelper.extractDateInFixUTCTimeStampFormat(array, offset, length));
    }

    public static FixTradSesOpenTimeField create(final Date param)
    {
        return new FixTradSesOpenTimeField()
        {   public final Date value = param;
            public boolean hasValue()                        {return value != null;}
            public String  getValue()                        {return DateHelper.stringizeDateInFixUTCTimeStampFormat(value);}
            public Date    dateValue()                       {return value;}
        };
    }
    public static FixTradSesOpenTimeField create(final String param)
    {
        return new FixTradSesOpenTimeField()
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
