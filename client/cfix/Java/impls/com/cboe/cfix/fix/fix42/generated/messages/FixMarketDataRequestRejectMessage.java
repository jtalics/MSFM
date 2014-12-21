package com.cboe.cfix.fix.fix42.generated.messages;

/**
 * FixMarketDataRequestRejectMessage.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 * This GENERATED file implements FIX Protocol's MarketDataRequestReject Message.
 *
 * WARNING: This entire file is completely generated by XSLT stylesheets from CboeFIX42.xml file.
 *
 */

import java.util.*;

import com.cboe.cfix.interfaces.*;
import com.cboe.cfix.util.*;
import com.cboe.cfix.fix.fix42.field.*;
import com.cboe.cfix.fix.fix42.generated.fields.*;
import com.cboe.cfix.fix.fix42.generated.helpers.*;
import com.cboe.cfix.fix.util.*;
import com.cboe.client.util.*;
import com.cboe.infrastructureServices.foundationFramework.utilities.*;

public class FixMarketDataRequestRejectMessage extends FixMessage
{   
    public static final String MsgType        = "Y";
    public static final char   MsgTypeAsChar  = 'Y';
    public static final char[] MsgTypeAsChars = {'Y'};
    public static final String MsgTypeName    = "MarketDataRequestReject";

    public FixMDReqIDField           fieldMDReqID;
    public FixMDReqRejReasonField    fieldMDReqRejReason;
    public FixTextField              fieldText;
    //     FixEncodedTextLenField    fieldEncodedTextLen;// NOT GENERATED (marked as unused_by_cboe in the XML file)
    //     FixEncodedTextField       fieldEncodedText;// NOT GENERATED (marked as unused_by_cboe in the XML file)
    public List                      additionalUserFields;

    public FixMarketDataRequestRejectMessage()
    {

    }

    public boolean isFixMarketDataRequestRejectMessage() {return true;}
    public String getMsgType()        {return MsgType;}
    public char   getMsgTypeAsChar()  {return MsgTypeAsChar;}
    public char[] getMsgTypeAsChars() {return MsgTypeAsChars;}
    public String getMsgTypeName()    {return MsgTypeName;}
    
    public String toString()
    {
        PrettyPrintWriter prettyPrintWriter = new PrettyPrintWriter();

        accept(prettyPrintWriter);

        return prettyPrintWriter.toString();
    }

    public void accept(PrettyPrintWriterIF prettyPrintWriter)
    {
        prettyPrintWriter.startPrintingGroup(MsgTypeName);

        super.accept(prettyPrintWriter);
                                                                                                      
        prettyPrintWriter.printGroupItem(fieldMDReqID);
        prettyPrintWriter.printGroupItem(fieldMDReqRejReason);
        prettyPrintWriter.printGroupItem(fieldText);

        prettyPrintWriter.endPrintingGroup();
    }                                                                                                 

    public void accept(FixMessageBuilderIF fixMessageBuilder)
    {
        super.accept(fixMessageBuilder);
                                                                                                      
        fixMessageBuilder.append(fieldMDReqID);
        fixMessageBuilder.append(fieldMDReqRejReason);
        fixMessageBuilder.append(fieldText);

        if (additionalUserFields != null)
        {
            for (Iterator iterator = additionalUserFields.iterator(); iterator.hasNext(); )
            {
                fixMessageBuilder.append((FixFieldIF) iterator.next());
            }
        }
    }                                                                                                 

    public PackedIntArrayIF validate(FixPacketIF fixPacket, PackedIntArrayIF foundErrors, int validationFlags, int debugFlags)
    {
        if (fieldSenderCompID == null)
        {
            foundErrors.add(BitHelper.packInt(FixException.MISSING_REQUIRED_TAG, FixSenderCompIDField.TagID));
            if (BitHelper.isBitMaskSet(validationFlags, FixMessageIF.STOP_ON_FIRST_ERROR))
            {
                return foundErrors;
            }
        }
               
        if (fieldTargetCompID == null)
        {
            foundErrors.add(BitHelper.packInt(FixException.MISSING_REQUIRED_TAG, FixTargetCompIDField.TagID));
            if (BitHelper.isBitMaskSet(validationFlags, FixMessageIF.STOP_ON_FIRST_ERROR))
            {
                return foundErrors;
            }
        }
               
        if (fieldMsgSeqNum == null)
        {
            foundErrors.add(BitHelper.packInt(FixException.MISSING_REQUIRED_TAG, FixMsgSeqNumField.TagID));
            if (BitHelper.isBitMaskSet(validationFlags, FixMessageIF.STOP_ON_FIRST_ERROR))
            {
                return foundErrors;
            }
        }
               
        if (fieldSendingTime == null)
        {
            foundErrors.add(BitHelper.packInt(FixException.MISSING_REQUIRED_TAG, FixSendingTimeField.TagID));
            if (BitHelper.isBitMaskSet(validationFlags, FixMessageIF.STOP_ON_FIRST_ERROR))
            {
                return foundErrors;
            }
        }
               
        if (fieldMDReqID == null)
        {
            foundErrors.add(BitHelper.packInt(FixException.MISSING_REQUIRED_TAG, FixMDReqIDField.TagID));
            if (BitHelper.isBitMaskSet(validationFlags, FixMessageIF.STOP_ON_FIRST_ERROR))
            {
                return foundErrors;
            }
        }
               
        return foundErrors;
    }


    private String toStateString(int state)
    {
        switch (state)
        {
            case STATE_Header: return "State[Header]";
            case STATE_Field:  return "State[Field]";
        }

        return "???";
    }
    
    public PackedIntArrayIF build(FixPacketIF fixPacket, PackedIntArrayIF foundErrors, int validationFlags, int debugFlags)
    {
        char[] array          = fixPacket.getArray();
        int    numTags        = fixPacket.getTagPositionLength();
        int    currentState   = STATE_Header;
        int    tag;
        int    offset;
        int    length;
        int    currentPosition;

        for (currentPosition = 0; currentPosition < numTags; currentPosition++)
        {
            if (!foundErrors.isEmpty() && BitHelper.isBitMaskSet(validationFlags, FixMessageIF.STOP_ON_FIRST_ERROR))
            {
                break;
            }

            tag    = fixPacket.getTag(currentPosition);
            offset = fixPacket.getValueOffset(currentPosition);
            length = fixPacket.getValueLength(currentPosition);

            if ((BitHelper.isBitMaskSet(debugFlags, FixSessionDebugIF.MESSAGE_SHOW_BUILD_TRANSITIONS)))
            {
                String threadName = Thread.currentThread().getName();
                String stateString = toStateString(currentState);
                StringBuilder sb = new StringBuilder(threadName.length()+stateString.length()+50);
                if (currentPosition > 0)
                {
                    sb.append(threadName).append(" --> ").append(stateString);
                    Log.information(sb.toString());
                    sb.setLength(0);
                }

                sb.append(threadName).append("Tag[").append(currentPosition).append("] = ").append(FixFieldHelper.getTagName(tag)).append("(").append(tag).append(") ").append(stateString);
                Log.information(sb.toString());
            }

            switch (tag)
            {
                case FixMDReqIDField.TagID:
                {
                    if (currentState != STATE_Field)
                    {
                        currentState = STATE_Field;
                    }
                  
                    if (fieldMDReqID != null)
                    {
                        foundErrors.add(BitHelper.packInt(FixException.DUPLICATE_TAG, currentPosition));

                        if (BitHelper.isBitMaskSet(validationFlags, FixMessageIF.STOP_ON_FIRST_ERROR))
                        {
                            return foundErrors;
                        }

                        continue;
                    }

                    fieldMDReqID = FixMDReqIDField.create(array, offset, length);
                    if (fieldMDReqID == null || !fieldMDReqID.hasValue())
                    {
                        foundErrors.add(BitHelper.packInt(FixException.INVALID_TAG_VALUE, currentPosition));

                        if (BitHelper.isBitMaskSet(validationFlags, FixMessageIF.STOP_ON_FIRST_ERROR))
                        {
                            return foundErrors;
                        }

                        continue;
                    }

                    continue;
                }

                case FixMDReqRejReasonField.TagID:
                {
                    if (currentState != STATE_Field)
                    {
                        currentState = STATE_Field;
                    }
                  
                    if (fieldMDReqRejReason != null)
                    {
                        foundErrors.add(BitHelper.packInt(FixException.DUPLICATE_TAG, currentPosition));

                        if (BitHelper.isBitMaskSet(validationFlags, FixMessageIF.STOP_ON_FIRST_ERROR))
                        {
                            return foundErrors;
                        }

                        continue;
                    }

                    fieldMDReqRejReason = FixMDReqRejReasonField.create(array, offset, length);
                    if (fieldMDReqRejReason == null || !fieldMDReqRejReason.hasValue())
                    {
                        foundErrors.add(BitHelper.packInt(FixException.INVALID_TAG_VALUE, currentPosition));

                        if (BitHelper.isBitMaskSet(validationFlags, FixMessageIF.STOP_ON_FIRST_ERROR))
                        {
                            return foundErrors;
                        }

                        continue;
                    }

                    continue;
                }

                case FixTextField.TagID:
                {
                    if (currentState != STATE_Field)
                    {
                        currentState = STATE_Field;
                    }
                  
                    if (fieldText != null)
                    {
                        foundErrors.add(BitHelper.packInt(FixException.DUPLICATE_TAG, currentPosition));

                        if (BitHelper.isBitMaskSet(validationFlags, FixMessageIF.STOP_ON_FIRST_ERROR))
                        {
                            return foundErrors;
                        }

                        continue;
                    }

                    fieldText = FixTextField.create(array, offset, length);
                    if (fieldText == null || !fieldText.hasValue())
                    {
                        foundErrors.add(BitHelper.packInt(FixException.INVALID_TAG_VALUE, currentPosition));

                        if (BitHelper.isBitMaskSet(validationFlags, FixMessageIF.STOP_ON_FIRST_ERROR))
                        {
                            return foundErrors;
                        }

                        continue;
                    }

                    continue;
                }

                case FixEncodedTextLenField.TagID:
                {
                    if (currentState != STATE_Field)
                    {
                        currentState = STATE_Field;
                    }
                  
                    if (BitHelper.isBitMaskSet(validationFlags, FixMessageIF.VALIDATE_UNUSED_FIELDS))
                    {
                        FixEncodedTextLenField unusedByCboeField = FixEncodedTextLenField.create(array, offset, length);
                        if (unusedByCboeField == null || !unusedByCboeField.hasValue())
                        {
                            unusedByCboeField = null;

                            foundErrors.add(BitHelper.packInt(FixException.INVALID_TAG_VALUE, currentPosition));

                            if (BitHelper.isBitMaskSet(validationFlags, FixMessageIF.STOP_ON_FIRST_ERROR))
                            {
                                return foundErrors;
                            }

                            continue;
                        }

                        unusedByCboeField = null;
                    }

                    continue;
                }

                case FixEncodedTextField.TagID:
                {
                    if (currentState != STATE_Field)
                    {
                        currentState = STATE_Field;
                    }
                  
                    if (BitHelper.isBitMaskSet(validationFlags, FixMessageIF.VALIDATE_UNUSED_FIELDS))
                    {
                        FixEncodedTextField unusedByCboeField = FixEncodedTextField.create(array, offset, length);
                        if (unusedByCboeField == null || !unusedByCboeField.hasValue())
                        {
                            unusedByCboeField = null;

                            foundErrors.add(BitHelper.packInt(FixException.INVALID_TAG_VALUE, currentPosition));

                            if (BitHelper.isBitMaskSet(validationFlags, FixMessageIF.STOP_ON_FIRST_ERROR))
                            {
                                return foundErrors;
                            }

                            continue;
                        }

                        unusedByCboeField = null;
                    }

                    continue;
                }

            }

            if (tag >= FixMessageIF.USER_DEFINED_TAGS_START)
            {
                if (currentState == STATE_Field || currentState == STATE_Header)
                {
                    if (additionalUserFields == null)
                    {
                        additionalUserFields = new ArrayList();
                    }

                    additionalUserFields.add(new AdditionalUserField(tag, array, offset, length));
                    continue;
                }
            }

            if (!buildHeaderTrailer(array, tag, offset, length, currentState, currentPosition, foundErrors, validationFlags, debugFlags))
            {
                foundErrors.add(BitHelper.packInt(FixException.INVALID_TAG, currentPosition));

                if (BitHelper.isBitMaskSet(validationFlags, FixMessageIF.STOP_ON_FIRST_ERROR))
                {
                    return foundErrors;
                }

                continue;
            }
        }

        if ((BitHelper.isBitMaskSet(debugFlags, FixSessionDebugIF.MESSAGE_SHOW_BUILD_TRANSITIONS)))
        {
            String threadName = Thread.currentThread().getName();
            String stateString = toStateString(currentState);
            StringBuilder sb = new StringBuilder(threadName.length()+stateString.length()+10);
            sb.append(threadName).append(" --> ").append(stateString);
            Log.information(sb.toString());
        }

        return foundErrors;
    }
}
