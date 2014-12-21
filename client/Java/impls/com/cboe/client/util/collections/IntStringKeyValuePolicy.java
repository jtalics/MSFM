package com.cboe.client.util.collections;

/**
 * IntStringKeyValuePolicy.java
 *
 * @author Dmitry Volpyansky
 *
 * FILE GENERATED BY VELOCITY TEMPLATE ENGINE FROM /vobs/dte/client/generator/DV_XYKeyValuePolicy.java (KEY_TYPE=int, VALUE_TYPE=String)
 *
 */

public class IntStringKeyValuePolicy implements IntStringKeyValuePolicyIF
{
    public boolean canInsert(int key, String newValue)
    {
        return true;
    }
    public boolean canUpdate(int key, String newValue, String oldValue)
    {
        return true;
    }
    public boolean canRemove(int key, String oldValue)
    {
        return true;
    }
}

