<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fix="http://www.cboe.com/fix/xslt"
                >

<!-- @author Dmitry Volpyansky

     must be built with JDK 1.4.1 and Saxon XSLT version 7.4 from http://saxon.sourceforge.net/

     classpath needs to include /client/cfix/generator/saxon7.jar and /client/cfix/generator/saxon7_jdom.jar

     command line example: java net.sf.saxon.Transform CboeFIX42.xml Fix_Class_MessageFactory_Main.xsl IMPLS_DIRECTORY="/client/cfix/impls"

     the IMPLS_DIRECTORY parameter specifies the output directory
-->

<xsl:param name="IMPLS_DIRECTORY">/tmp</xsl:param>

<xsl:output method="text" encoding="UTF-8" indent="no" name="text"/>

<xsl:strip-space elements="*"/>

<xsl:template match="text()"/>

<xsl:include href="Fix_Helper.xsl"/>

<xsl:template match="fix/messages">
<xsl:result-document href="file://{$IMPLS_DIRECTORY}/com/cboe/cfix/fix/fix{/fix/@versiontag}/generated/messages/FixMessageFactory.java" format="text">
<xsl:variable name="longestName">
   <xsl:call-template name="fix:longestLengthString">
      <xsl:with-param name="nodeset" select="message/@name"/>
   </xsl:call-template>
</xsl:variable>
<xsl:text/>package com.cboe.cfix.fix.fix<xsl:value-of select="/fix/@versiontag"/>.generated.messages;

/**
 * FixMessageFactory.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements a FixMessageFactory.
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX<xsl:value-of select="/fix/@versiontag"/>.xml file.
 *
 */

import java.util.*;

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.fix.fix<xsl:value-of select="/fix/@versiontag"/>.generated.fields.*;

public final class FixMessageFactory implements FixMessageFactoryIF
{   
    public void initialize(String propertyPrefix, Properties properties)
    {

    }

    public String getFixVersionAsString()
    {
        return FixBeginStringField.string_Fix<xsl:value-of select="/fix/@versiontag"/>;
    }

    public char[] getFixVersionAsChars()
    {
        return FixBeginStringField.chars_Fix<xsl:value-of select="/fix/@versiontag"/>;
    }

    public FixMessageIF createFixMessageFromMsgType(char[] msgType)
    {
        if (msgType.length != 1)
        {
            return null;
        }
        
        return createFixMessageFromMsgType(msgType[0]);
    }

    public FixMessageIF createFixMessageFromMsgType(String msgType)
    {
        if (msgType.length() != 1)
        {
            return null;
        }
        
        return createFixMessageFromMsgType(msgType.charAt(0));
    }

    public FixMessageIF createFixMessageFromMsgType(char msgType)
    {
        switch (msgType)
        {       <xsl:text/>
            <xsl:for-each select="message[@cboe_uses='Y']">
                <xsl:call-template name="fix:FixMessageClass_Function_BuildCreateFixMessageFromMsgType">
                   <xsl:with-param name="longestName" select="$longestName + string-length('FixMessage')"/>
                </xsl:call-template><xsl:text/>
            </xsl:for-each>
        }

        return null;
    }<xsl:text/>

    public String getMsgType(char[] msgType)
    {
        switch (msgType[0])
        {<xsl:text/>
            <xsl:for-each select="message[@cboe_uses='Y']">
                <xsl:call-template name="fix:FixMessageClass_Function_GetMsgType">
                   <xsl:with-param name="longestName" select="$longestName + string-length('FixMessage')"/>
                </xsl:call-template><xsl:text/>
            </xsl:for-each>
        }

        return null;
    }<xsl:text/>

    <xsl:for-each select="message[@cboe_uses='Y']">
        <xsl:call-template name="fix:FixMessageClass_Function_BuildCreateFixXXXMessage">
           <xsl:with-param name="longestName" select="$longestName + string-length('FixMessage')"/>
        </xsl:call-template><xsl:text/>
    </xsl:for-each>
    <xsl:text/><xsl:apply-templates/><xsl:text/>
}
</xsl:result-document>
</xsl:template>

<xsl:template name="fix:FixMessageClass_Function_BuildCreateFixMessageFromMsgType">
<xsl:param name="longestName"/>
<xsl:variable name="casedName" select="concat('Fix', @name, 'Message.MsgTypeAsChar')"/>
            case <xsl:value-of select="fix:rightPad($casedName, $longestName+string-length('.MsgTypeAsChar'))"/>: return createFix<xsl:value-of select="@name"/>Message();<xsl:text/>
</xsl:template>

<xsl:template name="fix:FixMessageClass_Function_GetMsgType">
<xsl:param name="longestName"/>
<xsl:variable name="casedName" select="concat('Fix', @name, 'Message.MsgTypeAsChar')"/>
            case <xsl:value-of select="fix:rightPad($casedName, $longestName+string-length('.MsgTypeAsChar'))"/>: return <xsl:value-of select="concat('Fix', @name, 'Message.MsgType')"/>;<xsl:text/>
</xsl:template>

<xsl:template name="fix:FixMessageClass_Function_BuildCreateFixXXXMessage">
<xsl:param name="longestName"/>
    public FixMessageIF <xsl:value-of select="fix:rightPad(concat('create', fix:buildFixMessageNameWithParen(@name)), string-length('create()') + $longestName)"/> { return new <xsl:value-of select="fix:buildFixMessageNameWithParen(@name)"/>; }<xsl:text/>
</xsl:template>
<!--    public <xsl:value-of select="$paddedName"/><xsl:text> </xsl:text><xsl:value-of select="$paddedFunctionName"/> { return new Fix<xsl:value-of select="@name"/>Message(); }<xsl:text/> -->
</xsl:stylesheet>