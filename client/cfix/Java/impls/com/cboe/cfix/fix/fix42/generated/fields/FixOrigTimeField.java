package com.cboe.cfix.fix.fix42.generated.fields;

/**
 * FixOrigTimeField.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's Field Tag [42] (known as OrigTime).
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import java.util.*;

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.client.util.*;

public abstract class FixOrigTimeField implements FixFieldIF, HasDateValueIF
{   
    public static final int    TagID         =  42;
    public static final String TagIDAsString = "42";
    public static final char[] TagIDAsChars  = {'4','2'};
    public static final String TagName       = "OrigTime";
    public static final String TagFixType    = "UTCTIMESTAMP";

    public static FixOrigTimeField create(final char[] array, final int offset, final int length)
    {
        return create(DateHelper.extractDateInFixUTCTimeStampFormat(array, offset, length));
    }

    public static FixOrigTimeField create(final Date param)
    {
        return new FixOrigTimeField()
        {   public final Date value = param;
            public boolean hasValue()                        {return value != null;}
            public String  getValue()                        {return DateHelper.stringizeDateInFixUTCTimeStampFormat(value);}
            public Date    dateValue()                       {return value;}
        };
    }
    public static FixOrigTimeField create(final String param)
    {
        return new FixOrigTimeField()
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