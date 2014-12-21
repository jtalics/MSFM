package com.cboe.client.util.collections;

/**
 * ObjectIntKeyValuePolicy.java
 *
 * @author Dmitry Volpyansky
 *
 * FILE GENERATED BY VELOCITY TEMPLATE ENGINE FROM /vobs/dte/client/generator/DV_XYKeyValuePolicy.java (KEY_TYPE=Object, VALUE_TYPE=int)
 *
 */

public class ObjectIntKeyValuePolicy implements ObjectIntKeyValuePolicyIF
{
    public boolean canInsert(Object key, int newValue)
    {
        return true;
    }
    public boolean canUpdate(Object key, int newValue, int oldValue)
    {
        return true;
    }
    public boolean canRemove(Object key, int oldValue)
    {
        return true;
    }
}

