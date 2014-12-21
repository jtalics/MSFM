package com.cboe.client.util.collections;

/**
 * ObjectArrayHolder.java
 *
 * @author Dmitry Volpyansky
 *
 * FILE GENERATED BY VELOCITY TEMPLATE ENGINE FROM /vobs/dte/client/generator/DV_XArrayHolder.java (KEY_TYPE=Object)
 *
 */

import com.cboe.client.util.*;

public class ObjectArrayHolder implements ObjectArrayHolderIF
{
    public Object[] keys;
    public int   size;

    public static final ObjectArrayHolderIF EmptyArrayHolder = new ObjectArrayHolder()
    {
        public void add(Object key) {}
        public void add(Object[] keyArray) {}
        public void add(Object[] keyArray, int offset, int length) {}
    };

    public ObjectArrayHolder()
    {
        this(0);
    }

    public ObjectArrayHolder(int capacity)
    {
        keys = new Object[capacity];
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
            keys = CollectionHelper.arrayclone(keys, 0, keys.length, capacity);
        }

        return keys.length;
    }

    public Object[] keys()
    {
        return keys;
    }

    public Object[] getKeys()
    {
        return CollectionHelper.arrayclone(keys, size);
    }

    public void add(Object key)
    {
        int newSize = size + 1;

        if (newSize >= keys.length)
        {
            keys = CollectionHelper.arrayclone(keys, 0, keys.length, newSize);
        }

        keys[size] = key;

        size = newSize;
    }

    public void add(Object[] keyArray)
    {
        int newSize = size + keyArray.length;

        if (newSize >= keys.length)
        {
            keys = CollectionHelper.arrayclone(keys, 0, keys.length, newSize);
        }

        System.arraycopy(keyArray, 0, keys, size, keyArray.length);

        size = newSize;
    }

    public void add(Object[] keyArray, int offset, int length)
    {
        int newSize = size + length;

        if (newSize >= keys.length)
        {
            keys = CollectionHelper.arrayclone(keys, 0, keys.length, newSize);
        }

        System.arraycopy(keyArray, offset, keys, size, length);

        size = newSize;
    }

    public Object getKey(int index)
    {
        if (index < size)
        {
            return keys[index];
        }

        return null;
    }

    public boolean containsKey(Object object)
    {
        for (int i = 0; i < size; i++)
        {
            if (keys[i] == object)
            {
                return true;
            }
        }

        return false;
    }

    public ObjectVisitorIF acceptVisitor(ObjectVisitorIF visitor)
    {
        for (int i = 0; i < size; i++)
        {
            visitor.visit(keys[i]);
        }

        return visitor;
    }

    public ObjectArrayHolderIF clear()
    {
        for (int i = 0; i < size; i++)
        {
            keys[i] = null;
        }

        size = 0;

        return this;
    }
}

