//
// -----------------------------------------------------------------------------------
// Source file: GroupElementCacheEventContainerImpl.java
//
// PACKAGE: com.cboe.internalPresentation.userGroup
//
// -----------------------------------------------------------------------------------
// Copyright (c) 2000-2006 The Chicago Board Options Exchange. All Rights Reserved.
// -----------------------------------------------------------------------------------
package com.cboe.presentation.groups;



/**
 * Class to store data needed to be manipulated when IEC event gets
 * fired on cache.
 */
public class GroupElementCacheEventContainerImpl implements GroupElementCacheEventContainer
{
    private GroupElementModel parentGroupElementModel;
    private GroupElementModel childGroupElementModel;

    public GroupElementCacheEventContainerImpl(GroupElementModel parentGroupElementModel,
                                           GroupElementModel childGroupElementModel)
    {
        this.parentGroupElementModel = parentGroupElementModel;
        this.childGroupElementModel = childGroupElementModel;
    }

    public GroupElementModel getParentGroupElementModel()
    {
        return parentGroupElementModel;
    }

    public GroupElementModel getChildGroupElementModel()
    {
        return childGroupElementModel;
    }

    public void setParentGroupElementModel(GroupElementModel parentGroupElementModel)
    {
        this.parentGroupElementModel = parentGroupElementModel;
    }

    public void setChildGroupElementModel(GroupElementModel childGroupElementModel)
    {
        this.childGroupElementModel = childGroupElementModel;
    }

}
