package com.cboe.client.util.collections;

/**
 * IntIntKeyValuePolicyIF.java
 *
 * @author Dmitry Volpyansky
 *
 * FILE GENERATED BY VELOCITY TEMPLATE ENGINE FROM /vobs/dte/client/generator/DV_XYKeyValuePolicyIF.java (KEY_TYPE=int, VALUE_TYPE=int)
 *
 */

public interface IntIntKeyValuePolicyIF
{
    public boolean canInsert(int key, int newValue);
    public boolean canUpdate(int key, int newValue, int oldValue);
    public boolean canRemove(int key, int oldValue);
}

