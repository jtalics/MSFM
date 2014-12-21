package com.cboe.client.util.collections;

/**
 * IntStringKeyValuePolicyIF.java
 *
 * @author Dmitry Volpyansky
 *
 * FILE GENERATED BY VELOCITY TEMPLATE ENGINE FROM /vobs/dte/client/generator/DV_XYKeyValuePolicyIF.java (KEY_TYPE=int, VALUE_TYPE=String)
 *
 */

public interface IntStringKeyValuePolicyIF
{
    public boolean canInsert(int key, String newValue);
    public boolean canUpdate(int key, String newValue, String oldValue);
    public boolean canRemove(int key, String oldValue);
}

