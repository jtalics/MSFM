package com.cboe.client.util.collections;

/**
 * ObjectObjectKeyValuePolicyIF.java
 *
 * @author Dmitry Volpyansky
 *
 * FILE GENERATED BY VELOCITY TEMPLATE ENGINE FROM /vobs/dte/client/generator/DV_XYKeyValuePolicyIF.java (KEY_TYPE=Object, VALUE_TYPE=Object)
 *
 */

public interface ObjectObjectKeyValuePolicyIF
{
    public boolean canInsert(Object key, Object newValue);
    public boolean canUpdate(Object key, Object newValue, Object oldValue);
    public boolean canRemove(Object key, Object oldValue);
}

