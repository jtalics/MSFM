package com.cboe.client.util.collections;

/**
 * LongKeyPolicyIF.java
 *
 * @author Dmitry Volpyansky
 *
 * FILE GENERATED BY VELOCITY TEMPLATE ENGINE FROM /vobs/dte/client/generator/DV_XYKeyPolicyIF.java (KEY_TYPE=long)
 *
 */

public interface LongKeyPolicyIF
{
    public boolean canInsert(long key);
    public boolean canRemove(long key);
}

