//
// -----------------------------------------------------------------------------------
// Source file: InternalizationPercentageTradingPropertyGroup.java
//
// PACKAGE: com.cboe.internalPresentation.tradingProperty
//
// -----------------------------------------------------------------------------------
// Copyright (c) 2000-2005 The Chicago Board Options Exchange. All Rights Reserved.
// -----------------------------------------------------------------------------------
package com.cboe.internalPresentation.tradingProperty;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

import com.cboe.idl.tradingProperty.InternalizationPercentageClassStruct;
import com.cboe.idl.tradingProperty.InternalizationPercentageStruct;

import com.cboe.exceptions.AuthorizationException;
import com.cboe.exceptions.CommunicationException;
import com.cboe.exceptions.DataValidationException;
import com.cboe.exceptions.NotFoundException;
import com.cboe.exceptions.SystemException;
import com.cboe.exceptions.TransactionFailedException;

import com.cboe.interfaces.domain.tradingProperty.TradingProperty;
import com.cboe.interfaces.domain.tradingProperty.TradingPropertyGroup;
import com.cboe.interfaces.domain.tradingProperty.TradingPropertyType;
import com.cboe.interfaces.domain.tradingProperty.TradingPropertyFactory;
import com.cboe.interfaces.internalPresentation.tradingProperty.OldTradingPropertyGroup;

import com.cboe.domain.tradingProperty.TradingPropertyTypeImpl;
import com.cboe.domain.tradingProperty.TradingPropertyFactoryHome;

/**
 * Provides a default OldTradingPropertyGroup implementation for InternalizationPercentageStruct's.
 */
public class InternalizationPercentageTradingPropertyGroup extends AbstractOldTradingPropertyGroup
{
    public static final TradingPropertyType TRADING_PROPERTY_TYPE =
            TradingPropertyTypeImpl.INTERNALIZATION_GUARANTEED_PERCENTAGE;

    /**
     * Constructor that initializes with the immutable trading session name and class key. WARNING!! THIS CONSTRUCTOR
     * MUST ALWAYS BE EXPOSED. THE FACTORY WILL USE THIS CONSTRUCTOR TO INSTANTIATE THE OBJECT WITH THE IMMUTABLE
     * SESSION NAME AND CLASS KEY.
     * @param sessionName that this TradingProperty is for
     * @param classKey that this TradingProperty is for
     */
    public InternalizationPercentageTradingPropertyGroup(String sessionName, int classKey)
    {
        super(sessionName, classKey);
    }


    /**
     * Provides a getter to get an instance of this TradingPropertyGroup, downcasted for convenience.
     * @param sessionName to get TradingPropertyGroup for
     * @param classKey to get TradingPropertyGroup for
     * @return instance of TradingPropertyGroup downcasted to this class type.
     * @throws com.cboe.exceptions.SystemException forwarded from TradingPropertyFactory
     * @throws com.cboe.exceptions.AuthorizationException forwarded from TradingPropertyFactory
     * @throws com.cboe.exceptions.CommunicationException forwarded from TradingPropertyFactory
     * @throws com.cboe.exceptions.NotFoundException forwarded from TradingPropertyFactory
     * @throws java.lang.reflect.InvocationTargetException forwarded from TradingPropertyFactory
     * @throws com.cboe.exceptions.DataValidationException forwarded from TradingPropertyFactory
     */
    public static InternalizationPercentageTradingPropertyGroup getGroup(String sessionName, int classKey)
            throws SystemException, NotFoundException, DataValidationException, CommunicationException,
                   InvocationTargetException, AuthorizationException, TransactionFailedException
    {
        TradingPropertyGroup myGroup =
                TradingPropertyFactoryHome.find().getTradingPropertyGroup(sessionName, classKey,
                                                                          TRADING_PROPERTY_TYPE.getName());
        InternalizationPercentageTradingPropertyGroup castedGroup = (InternalizationPercentageTradingPropertyGroup) myGroup;
        return castedGroup;
    }

    /**
     * Create a new implementation specific TradingProperty.
     * @param sessionName that this TradingProperty is for
     * @param classKey that this TradingProperty is for
     * @return new TradingProperty
     */
    public TradingProperty createNewTradingProperty(String sessionName, int classKey)
    {
        InternalizationPercentageTradingProperty newTP = new InternalizationPercentageTradingProperty(sessionName, classKey);
        return newTP;
    }

    public TradingPropertyType getTradingPropertyType()
    {
        return TRADING_PROPERTY_TYPE;
    }

    public InternalizationPercentageTradingProperty[] getInternalizationPercentageTradingProperties()
    {
        TradingProperty[] allTPs = getAllTradingProperties();
        InternalizationPercentageTradingProperty[] castedTPs = new InternalizationPercentageTradingProperty[allTPs.length];
        System.arraycopy(allTPs, 0, castedTPs, 0, allTPs.length);
        return castedTPs;
    }

    protected Object getMapKeyForTradingProperty(TradingProperty tradingProperty)
    {
        InternalizationPercentageTradingProperty ipTP = (InternalizationPercentageTradingProperty) tradingProperty;
        String auctionTypeString = Short.toString(ipTP.getAuctionType());
        String lowerRangeString = Integer.toString(ipTP.getLowerRange());
        return auctionTypeString + lowerRangeString;
    }

    protected Object getSaveParmsData(TradingProperty[] allTradingProperties, Class dataType)
    {
        InternalizationPercentageStruct[] structs = new InternalizationPercentageStruct[allTradingProperties.length];
        for(int i = 0; i < allTradingProperties.length; i++)
        {
            InternalizationPercentageTradingProperty auctionEnabledTradingProperty =
                    (InternalizationPercentageTradingProperty) allTradingProperties[i];
            structs[i] = auctionEnabledTradingProperty.getInternalizationPercentageStruct();
        }

        return structs;
    }

    protected void processDataFromLoad(Object returnValue)
            throws DataValidationException
    {
        InternalizationPercentageStruct[] structs = (InternalizationPercentageStruct[]) returnValue;

        for(int i = 0; i < structs.length; i++)
        {
            InternalizationPercentageStruct internalizationPercentageStruct = structs[i];
            InternalizationPercentageTradingProperty newTP =
                    (InternalizationPercentageTradingProperty) createNewTradingProperty(getSessionName(), getClassKey());
            newTP.setInternalizationPercentageStruct(internalizationPercentageStruct);
            addTradingProperty(newTP);
        }
    }

    protected OldTradingPropertyGroup[] processAllClassesDataFromLoad(String sessionName, Object returnValue)
            throws DataValidationException, InvocationTargetException
    {
        List newTPGList = new ArrayList(200);
        InternalizationPercentageClassStruct[] structs = (InternalizationPercentageClassStruct[]) returnValue;

        int classKey;

        for(int i = 0; i < structs.length; i++)
        {
            InternalizationPercentageClassStruct arrayElement = structs[i];
            classKey = getClassKeyFromStructObject(arrayElement);

            TradingPropertyFactory factory = TradingPropertyFactoryHome.find();

            InternalizationPercentageTradingPropertyGroup newTPGroup =
                    (InternalizationPercentageTradingPropertyGroup) factory.createNewTradingPropertyGroup(sessionName,
                                                                                                          classKey,
                                                                                                          getTradingPropertyType().getName());
            newTPGroup.sequenceHolder.value = arrayElement.seqNum;
            newTPGroup.processDataFromLoad(arrayElement.percentages);

            newTPGList.add(newTPGroup);
        }

        return (OldTradingPropertyGroup[]) newTPGList.toArray(new OldTradingPropertyGroup[newTPGList.size()]);
    }

    protected int getClassKeyFromStructObject(Object arrayElement)
    {
        int classKey = ((InternalizationPercentageClassStruct) arrayElement).classKey;
        return classKey;
    }

    protected int getSequenceNumberFromStructObject(Object arrayElement)
    {
        int sequenceNumber = ((InternalizationPercentageClassStruct) arrayElement).seqNum;
        return sequenceNumber;
    }
}