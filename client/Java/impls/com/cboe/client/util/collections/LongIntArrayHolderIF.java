package com.cboe.client.util.collections;

/**
 * LongIntArrayHolderIF.java
 *
 * @author Dmitry Volpyansky
 *
 * FILE GENERATED BY VELOCITY TEMPLATE ENGINE FROM /vobs/dte/client/generator/DV_XYArrayHolderIF.java (KEY_TYPE=long, VALUE_TYPE=int)
 *
 */

import com.cboe.client.util.*;

public interface LongIntArrayHolderIF extends HasSizeIF
{
    public int size();
    public boolean isEmpty();
    public int capacity();
    public int ensureCapacity(int capacity);
    public long[] keys();
    public long[] getKeys();
    public int[] values();
    public int[] getValues();
    public void add(long key, int value);
    public long getKey(int index);
    public int getValue(int index);
    public boolean containsKey(long key);
    public boolean containsValue(int value);
    public LongIntArrayHolderIF clear();
    public LongIntVisitorIF acceptVisitor(LongIntVisitorIF visitor);
}
