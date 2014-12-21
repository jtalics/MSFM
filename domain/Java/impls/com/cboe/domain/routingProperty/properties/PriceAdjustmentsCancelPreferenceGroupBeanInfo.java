package com.cboe.domain.routingProperty.properties;
//-----------------------------------------------------------------------------------
//Source file: PriceAdjustmentsCancelPreferenceGroupBeanInfo
//
//PACKAGE: com.cboe.domain.routingProperty.properties
//
//Created: Aug 7, 2006 2:47:40 PM
//-----------------------------------------------------------------------------------
//Copyright (c) 2007 The Chicago Board Options Exchange. All Rights Reserved.
//-----------------------------------------------------------------------------------

import com.cboe.domain.routingProperty.AbstractRoutingPropertyGroupBeanInfo;

/*
    Note that this class is required, even though it is empty. Without it, introspection will return all fields of the
    PriceAdjustmentsCancelPreferenceGroup class to be shown as key columns in the  property table, while with this,
    it will not show any keys, just the value, because the only keys are session and firm which are already
    determined by the parent nodes in the session-firm firm property navigation tree.
 */
@SuppressWarnings({"EmptyClass"})
public class PriceAdjustmentsCancelPreferenceGroupBeanInfo extends AbstractRoutingPropertyGroupBeanInfo
{
}