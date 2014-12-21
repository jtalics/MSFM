package com.cboe.client.util.collections;

/**
 * LongArrayHolderIF.java
 *
 * @author Dmitry Volpyansky
 *
 * FILE GENERATED BY VELOCITY TEMPLATE ENGINE FROM /vobs/dte/client/generator/DV_XArrayHolderIF.java (KEY_TYPE=long)
 *
 */

import com.cboe.client.util.*;

public interface LongArrayHolderIF extends HasSizeIF
{
    public int size();
    public boolean isEmpty();
    public int capacity();
    public int ensureCapacity(int capacity);
    public long[] keys();
    public long[] getKeys();
    public void add(long key);
    public void add(long[] keys);
    public void add(long[] keys, int offset, int length);
    public long getKey(int index);
    public boolean containsKey(long key);
    public LongArrayHolderIF clear();
    public LongVisitorIF acceptVisitor(LongVisitorIF visitor);
}

