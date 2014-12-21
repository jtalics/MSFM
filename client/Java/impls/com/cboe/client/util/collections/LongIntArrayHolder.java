package com.cboe.client.util.collections;

/**
 * LongIntArrayHolder.java
 *
 * @author Dmitry Volpyansky
 *
 * FILE GENERATED BY VELOCITY TEMPLATE ENGINE FROM /vobs/dte/client/generator/DV_XYArrayHolder.java (KEY_TYPE=long, VALUE_TYPE=int)
 *
 */

import com.cboe.client.util.*;

public class LongIntArrayHolder implements LongIntArrayHolderIF
{
    public long[]   keys;
    public int[] values;
    public int      size;

    public static final LongIntArrayHolderIF EmptyArrayHolder = new LongIntArrayHolder()
    {
        public void add(long key, int value) {}
    };

    public LongIntArrayHolder()
    {
        this(0);
    }

    public LongIntArrayHolder(int capacity)
    {
        keys   = new long[capacity];
        values = new int[capacity];
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public int capacity()
    {
        return keys.length;
    }

    public int ensureCapacity(int capacity)
    {
        if (keys.length < capacity)
        {
            keys   = CollectionHelper.arrayclone(keys,   0, keys.length,   capacity);
            values = CollectionHelper.arrayclone(values, 0, values.length, capacity);
        }

        return keys.length;
    }

    public long[] keys()
    {
        return keys;
    }

    public long[] getKeys()
    {
        return CollectionHelper.arrayclone(keys, size);
    }

    public int[] values()
    {
        return values;
    }

    public int[] getValues()
    {
        return CollectionHelper.arrayclone(values, size);
    }

    public void add(long key, int value)
    {
        int newSize = size + 1;

        if (newSize >= keys.length)
        {
            keys   = CollectionHelper.arrayclone(keys,   0, keys.length,   newSize);
            values = CollectionHelper.arrayclone(values, 0, values.length, newSize);
        }

        keys[size]   = key;
        values[size] = value;

        size = newSize;
    }

    public long getKey(int index)
    {
        if (index < size)
        {
            return keys[index];
        }

        return IntegerHelper.INVALID_VALUE;
    }

    public int getValue(int index)
    {
        if (index < size)
        {
            return values[index];
        }

        return IntegerHelper.INVALID_VALUE;
    }

    public boolean containsKey(long key)
    {
        for (int i = 0; i < size; i++)
        {
            if (keys[i] == key)
            {
                return true;
            }
        }

        return false;
    }

    public boolean containsValue(int value)
    {
        for (int i = 0; i < size; i++)
        {
            if (values[i] == value)
            {
                return true;
            }
        }

        return false;
    }

    public LongIntVisitorIF acceptVisitor(LongIntVisitorIF visitor)
    {
        for (int i = 0; i < size; i++)
        {
            visitor.visit(keys[i], values[i]);
        }

        return visitor;
    }

    public LongIntArrayHolderIF clear()
    {
        for (int i = 0; i < size; i++)
        {
            keys[i]   = 0;
            values[i] = 0;
        }

        size = 0;

        return this;
    }
}
