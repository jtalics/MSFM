package com.cboe.client.util.collections;

/**
 * IntObjectArrayHolder.java
 *
 * @author Dmitry Volpyansky
 *
 * FILE GENERATED BY VELOCITY TEMPLATE ENGINE FROM /vobs/dte/client/generator/DV_XYArrayHolder.java (KEY_TYPE=int, VALUE_TYPE=Object)
 *
 */

import com.cboe.client.util.*;

public class IntObjectArrayHolder implements IntObjectArrayHolderIF
{
    public int[]   keys;
    public Object[] values;
    public int      size;

    public static final IntObjectArrayHolderIF EmptyArrayHolder = new IntObjectArrayHolder()
    {
        public void add(int key, Object value) {}
    };

    public IntObjectArrayHolder()
    {
        this(0);
    }

    public IntObjectArrayHolder(int capacity)
    {
        keys   = new int[capacity];
        values = new Object[capacity];
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

    public int[] keys()
    {
        return keys;
    }

    public int[] getKeys()
    {
        return CollectionHelper.arrayclone(keys, size);
    }

    public Object[] values()
    {
        return values;
    }

    public Object[] getValues()
    {
        return CollectionHelper.arrayclone(values, size);
    }

    public void add(int key, Object value)
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

    public int getKey(int index)
    {
        if (index < size)
        {
            return keys[index];
        }

        return IntegerHelper.INVALID_VALUE;
    }

    public Object getValue(int index)
    {
        if (index < size)
        {
            return values[index];
        }

        return null;
    }

    public boolean containsKey(int key)
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

    public boolean containsValue(Object value)
    {
        for (int i = 0; i < size; i++)
        {
            if (values[i] == value || value.equals(values[i]))
            {
                return true;
            }
        }

        return false;
    }

    public IntObjectVisitorIF acceptVisitor(IntObjectVisitorIF visitor)
    {
        for (int i = 0; i < size; i++)
        {
            visitor.visit(keys[i], values[i]);
        }

        return visitor;
    }

    public IntObjectArrayHolderIF clear()
    {
        for (int i = 0; i < size; i++)
        {
            keys[i]   = 0;
            values[i] = null;
        }

        size = 0;

        return this;
    }
}
