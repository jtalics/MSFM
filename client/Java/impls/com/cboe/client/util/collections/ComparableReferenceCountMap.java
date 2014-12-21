package com.cboe.client.util.collections;

/**
 * ComparableReferenceCountMap.java
 *
 * @author Dmitry Volpyansky
 *
 * FILE GENERATED BY VELOCITY TEMPLATE ENGINE FROM /vobs/dte/client/generator/DV_XReferenceCountMap.java (KEY_TYPE=Comparable)
 *
 */

import com.cboe.client.util.*;

public class ComparableReferenceCountMap implements HasSizeIF
{
    protected Comparable[][] keys;
    protected int[][] values;
    protected int[]        sizes;
    protected int          tableHighestIndex;
    protected volatile int size;

    public static final int DEFAULT_INITIAL_CAPACITY       = 256;
    public static final int DEFAULT_ENTRY_LIST_CAPACITY    = 16;
    public static final int MAXIMUM_CAPACITY               = 1024 * 16;

    public static final ComparableReferenceCountMap unsynchronizedMap()             {return new ComparableReferenceCountMap();}
    public static final ComparableReferenceCountMap unsynchronizedMap(int capacity) {return new ComparableReferenceCountMap(capacity);}
    public static final ComparableReferenceCountMap synchronizedMap()               {return new ComparableReferenceCountMapMT();}
    public static final ComparableReferenceCountMap synchronizedMap(int capacity)   {return new ComparableReferenceCountMapMT(capacity);}

    public static class ComparableReferenceCountMapMT extends ComparableReferenceCountMap
    {
        public ComparableReferenceCountMapMT()
        {
            super();
        }
        public ComparableReferenceCountMapMT(int capacity)
        {
            super(capacity);
        }
        public ComparableReferenceCountMapMT(ComparableReferenceCountMap map)
        {
            super(map);
        }
        public synchronized boolean containsKey(Comparable key)
        {
            return super.containsKey(key);
        }
        public synchronized int getValueForKey(Comparable key)
        {
            return super.getValueForKey(key);
        }
        public synchronized void incKeyValue(Comparable key, int value)
        {
            super.incKeyValue(key, value);
        }
        public synchronized void decKeyValuePositive(Comparable key, int value)
        {
            super.decKeyValuePositive(key, value);
        }
        public synchronized void getData(ObjectIntArrayHolderIF arrayHolder)
        {
            super.getData(arrayHolder);
        }
        public synchronized void putKeyValue(Comparable key, int value)
        {
            super.putKeyValue(key, value);
        }
        public synchronized int removeKey(Comparable key)
        {
            return super.removeKey(key);
        }
        public synchronized ObjectIntVisitorIF acceptVisitor(ObjectIntVisitorIF visitor)
        {
            return super.acceptVisitor(visitor);
        }
        public synchronized ComparableReferenceCountMap clear()
        {
            return super.clear();
        }
        public synchronized ComparableReferenceCountMap clear(ObjectIntArrayHolderIF arrayHolder)
        {
            return super.clear(arrayHolder);
        }
    };

    public ComparableReferenceCountMap()
    {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public ComparableReferenceCountMap(int capacity)
    {
        if (capacity < 2)
        {
            capacity = DEFAULT_INITIAL_CAPACITY;
        }
        else if (capacity > MAXIMUM_CAPACITY)
        {
            capacity = MAXIMUM_CAPACITY;
        }
        else
        {
            capacity = IntegerHelper.higherPowerOf2(capacity);
        }

        keys              = new Comparable[capacity][];
        values            = new int[capacity][];
        sizes             = new int[capacity];
        tableHighestIndex = capacity - 1;
    }

    public ComparableReferenceCountMap(ComparableReferenceCountMap map)
    {
        synchronized(map)
        {
            sizes             = CollectionHelper.arrayclone(map.sizes);
            keys              = CollectionHelper.arraycloneDimensions(map.keys);
            values            = CollectionHelper.arraycloneDimensions(map.values);
            size              = map.size;
            tableHighestIndex = map.tableHighestIndex;
        }
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean containsKey(Comparable key)
    {
        int bucketIndex = (int) (key.hashCode() & tableHighestIndex);

        if (sizes[bucketIndex] > 0)
        {
            Comparable[] local_keys = keys[bucketIndex];

            for (int keyIndex = sizes[bucketIndex]; --keyIndex >= 0; )
            {
                if (key == local_keys[keyIndex] || key.equals(local_keys[keyIndex]))
                {
                    return true;
                }
            }
        }

        return false;
    }

    public int getValueForKey(Comparable key)
    {
        int bucketIndex = (int) (key.hashCode() & tableHighestIndex);

        if (sizes[bucketIndex] > 0)
        {
            Comparable[] local_keys = keys[bucketIndex];

            for (int keyIndex = sizes[bucketIndex]; --keyIndex >= 0; )
            {
                if (key == local_keys[keyIndex] || key.equals(local_keys[keyIndex]))
                {
                    return values[bucketIndex][keyIndex];
                }
            }
        }

        return 0;
    }

    public void incKeyValue(Comparable key)
    {
        incKeyValue(key, 1);
    }

    public void incKeyValue(Comparable key, int value)
    {
        int bucketIndex = (int) (key.hashCode() & tableHighestIndex);

        if (keys[bucketIndex] == null)
        {
            keys[bucketIndex]      = new Comparable[DEFAULT_ENTRY_LIST_CAPACITY];
            values[bucketIndex]    = new int[DEFAULT_ENTRY_LIST_CAPACITY];
            keys[bucketIndex][0]   = key;
            values[bucketIndex][0] = value;
            sizes[bucketIndex]     = 1;
            size++;

            return;
        }

        int keyIndex;
        Comparable[] local_keys = keys[bucketIndex];
        int[] local_values = values[bucketIndex];
        int local_size = sizes[bucketIndex];

        for (keyIndex = 0; keyIndex < local_size; keyIndex++)
        {
            if (key == local_keys[keyIndex] || key.equals(local_keys[keyIndex]))
            {
                values[bucketIndex][keyIndex] += value;
                return;
            }
        }

        // if we got here, this is completely new

        if (local_size >= local_keys.length) // need to expand
        {
            if (keyIndex == local_size) // if at end, then just arrayclone, and append later
            {
                keys[bucketIndex]   = CollectionHelper.arrayclone(local_keys,   0, local_keys.length, local_keys.length << 1);
                values[bucketIndex] = CollectionHelper.arrayclone(local_values, 0, local_keys.length, local_keys.length << 1);
            }
            else
            {
                keys[bucketIndex]   = CollectionHelper.arraycloneExpandGap(local_keys,   0, local_keys.length, local_keys.length << 1, keyIndex, 1);
                values[bucketIndex] = CollectionHelper.arraycloneExpandGap(local_values, 0, local_keys.length, local_keys.length << 1, keyIndex, 1);
            }
        }
        else
        {
            if (keyIndex < local_size)
            {
                System.arraycopy(local_values, keyIndex, local_values, keyIndex + 1, local_size - keyIndex);
                System.arraycopy(local_keys,   keyIndex, local_keys,   keyIndex + 1, local_size - keyIndex);
            }
        }

        keys[bucketIndex][keyIndex]   = key;
        values[bucketIndex][keyIndex] = value;

        sizes[bucketIndex]++;
        size++;
    }

    public void decKeyValue(Comparable key)
    {
        incKeyValue(key, -1);
    }

    public void decKeyValue(Comparable key, int value)
    {
        incKeyValue(key, -value);
    }

    public void decKeyValuePositive(Comparable key)
    {
        decKeyValuePositive(key, 1);
    }

    public void decKeyValuePositive(Comparable key, int value)
    {
        int bucketIndex = (int) (key.hashCode() & tableHighestIndex);

        if (keys[bucketIndex] == null)
        {
            keys[bucketIndex]      = new Comparable[DEFAULT_ENTRY_LIST_CAPACITY];
            values[bucketIndex]    = new int[DEFAULT_ENTRY_LIST_CAPACITY];
            keys[bucketIndex][0]   = key;
            values[bucketIndex][0] = 0;
            sizes[bucketIndex]     = 1;
            size++;

            return;
        }

        int keyIndex;
        Comparable[] local_keys = keys[bucketIndex];
        int[] local_values = values[bucketIndex];
        int local_size = sizes[bucketIndex];

        for (keyIndex = 0; keyIndex < local_size; keyIndex++)
        {
            if (key == local_keys[keyIndex] || key.equals(local_keys[keyIndex]))
            {
                values[bucketIndex][keyIndex] -= value;
                if (values[bucketIndex][keyIndex] < 0)
                {
                    values[bucketIndex][keyIndex] = 0;
                }
                return;
            }
        }

        // if we got here, this is completely new

        if (local_size >= local_keys.length) // need to expand
        {
            if (keyIndex == local_size) // if at end, then just arrayclone, and append later
            {
                keys[bucketIndex]   = CollectionHelper.arrayclone(local_keys,   0, local_keys.length, local_keys.length << 1);
                values[bucketIndex] = CollectionHelper.arrayclone(local_values, 0, local_keys.length, local_keys.length << 1);
            }
            else
            {
                keys[bucketIndex]   = CollectionHelper.arraycloneExpandGap(local_keys,   0, local_keys.length, local_keys.length << 1, keyIndex, 1);
                values[bucketIndex] = CollectionHelper.arraycloneExpandGap(local_values, 0, local_keys.length, local_keys.length << 1, keyIndex, 1);
            }
        }
        else
        {
            if (keyIndex < local_size)
            {
                System.arraycopy(local_values, keyIndex, local_values, keyIndex + 1, local_size - keyIndex);
                System.arraycopy(local_keys,   keyIndex, local_keys,   keyIndex + 1, local_size - keyIndex);
            }
        }

        keys[bucketIndex][keyIndex]   = key;
        values[bucketIndex][keyIndex] = 0;

        sizes[bucketIndex]++;
        size++;
    }

    public void getData(ObjectIntArrayHolderIF arrayHolder)
    {
        int             bucketSize;
        int             keyIndex;
        Comparable[]   local_keys;
        int[] local_values;

        for (int bucketIndex = 0; bucketIndex < keys.length; bucketIndex++)
        {
            bucketSize = sizes[bucketIndex];

            if (bucketSize > 0)
            {
                local_values = values[bucketIndex];
                local_keys   = keys[bucketIndex];

                for (keyIndex = 0; keyIndex < bucketSize; keyIndex++)
                {
                    arrayHolder.add(local_keys[keyIndex], local_values[keyIndex]);
                }
            }
        }
    }

    public void putKeyValue(Comparable key, int value)
    {
        int bucketIndex = (int) (key.hashCode() & tableHighestIndex);

        if (keys[bucketIndex] == null)
        {
            keys[bucketIndex]      = new Comparable[DEFAULT_ENTRY_LIST_CAPACITY];
            values[bucketIndex]    = new int[DEFAULT_ENTRY_LIST_CAPACITY];
            keys[bucketIndex][0]   = key;
            values[bucketIndex][0] = value;
            sizes[bucketIndex]     = 1;
            size++;

            return;
        }

        int keyIndex;
        Comparable[] local_keys = keys[bucketIndex];
        int[] local_values = values[bucketIndex];
        int local_size = sizes[bucketIndex];

        for (keyIndex = 0; keyIndex < local_size; keyIndex++)
        {
            if (key == local_keys[keyIndex] || key.equals(local_keys[keyIndex]))
            {
                values[bucketIndex][keyIndex] = value;
                return;
            }
        }

        // if we got here, this is completely new

        if (local_size >= local_keys.length) // need to expand
        {
            if (keyIndex == local_size) // if at end, then just arrayclone, and append later
            {
                keys[bucketIndex]   = CollectionHelper.arrayclone(local_keys,   0, local_keys.length, local_keys.length << 1);
                values[bucketIndex] = CollectionHelper.arrayclone(local_values, 0, local_keys.length, local_keys.length << 1);
            }
            else
            {
                keys[bucketIndex]   = CollectionHelper.arraycloneExpandGap(local_keys,   0, local_keys.length, local_keys.length << 1, keyIndex, 1);
                values[bucketIndex] = CollectionHelper.arraycloneExpandGap(local_values, 0, local_keys.length, local_keys.length << 1, keyIndex, 1);
            }
        }
        else
        {
            if (keyIndex < local_size)
            {
                System.arraycopy(local_values, keyIndex, local_values, keyIndex + 1, local_size - keyIndex);
                System.arraycopy(local_keys,   keyIndex, local_keys,   keyIndex + 1, local_size - keyIndex);
            }
        }

        keys[bucketIndex][keyIndex]   = key;
        values[bucketIndex][keyIndex] = value;

        sizes[bucketIndex]++;
        size++;
    }

    public int removeKey(Comparable key)
    {
        int bucketIndex = (int) (key.hashCode() & tableHighestIndex);

        if (sizes[bucketIndex] > 0)
        {
            int keyIndex;
            Comparable[] local_keys = keys[bucketIndex];
            int[] local_values = values[bucketIndex];
            int local_size = sizes[bucketIndex];

            for (keyIndex = 0; keyIndex < local_size; keyIndex++)
            {
                if (key == local_keys[keyIndex] || key.equals(local_keys[keyIndex]))
                {
                    int oldValue = local_values[keyIndex];

                    int highest_index = local_values.length - 1;

                    if (keyIndex < highest_index)
                    {
                        System.arraycopy(local_values, keyIndex + 1, local_values, keyIndex, highest_index - keyIndex);
                        System.arraycopy(local_keys,   keyIndex + 1, local_keys,   keyIndex, highest_index - keyIndex);
                    }

                    local_keys[highest_index]   = null;
                    local_values[highest_index] = 0;

                    sizes[bucketIndex]--;
                    size--;

                    return oldValue;
                }
            }
        }

        return 0;
    }

    public ObjectIntVisitorIF acceptVisitor(ObjectIntVisitorIF visitor)
    {
        int             bucketSize;
        int             keyIndex;
        int             rc;
        Comparable[]   local_keys;
        int[] local_values;

        for (int bucketIndex = 0; bucketIndex < keys.length; bucketIndex++)
        {
            bucketSize = sizes[bucketIndex];

            local_keys = keys[bucketIndex];

            if (bucketSize > 0)
            {
                local_values = values[bucketIndex];

                for (keyIndex = 0; keyIndex < bucketSize; keyIndex++)
                {
                    rc = visitor.visit(local_keys[keyIndex], local_values[keyIndex]);

                    if (rc == ObjectIntVisitorIF.CONTINUE)
                    {
                        continue;
                    }

                    if (rc == ObjectIntVisitorIF.ABORT)
                    {
                         return visitor;
                    }
                }
            }
        }

        return visitor;
    }

    public ComparableReferenceCountMap clear()
    {
        for (int bucketIndex = keys.length; --bucketIndex >= 0; )
        {
            keys[bucketIndex]   = null;
            values[bucketIndex] = null;
            sizes[bucketIndex]  = 0;
        }

        size = 0;

        return this;
    }

    public ComparableReferenceCountMap clear(ObjectIntArrayHolderIF arrayHolder)
    {
        getData(arrayHolder);

        for (int bucketIndex = keys.length; --bucketIndex >= 0; )
        {
            keys[bucketIndex]   = null;
            values[bucketIndex] = null;
            sizes[bucketIndex]  = 0;
        }

        size = 0;

        return this;
    }
}

