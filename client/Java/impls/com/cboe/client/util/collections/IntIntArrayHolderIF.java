package com.cboe.client.util.collections;

/**
 * IntIntArrayHolderIF.java
 *
 * @author Dmitry Volpyansky
 *
 * FILE GENERATED BY VELOCITY TEMPLATE ENGINE FROM /vobs/dte/client/generator/DV_XYArrayHolderIF.java (KEY_TYPE=int, VALUE_TYPE=int)
 *
 */

import com.cboe.client.util.*;

public interface IntIntArrayHolderIF extends HasSizeIF
{
    public int size();
    public boolean isEmpty();
    public int capacity();
    public int ensureCapacity(int capacity);
    public int[] keys();
    public int[] getKeys();
    public int[] values();
    public int[] getValues();
    public void add(int key, int value);
    public int getKey(int index);
    public int getValue(int index);
    public boolean containsKey(int key);
    public boolean containsValue(int value);
    public IntIntArrayHolderIF clear();
    public IntIntVisitorIF acceptVisitor(IntIntVisitorIF visitor);
}
