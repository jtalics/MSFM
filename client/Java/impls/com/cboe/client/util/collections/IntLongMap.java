package com.cboe.client.util.collections;

/**
 * IntLongMap.java
 *
 * @author Dmitry Volpyansky
 *
 * FILE GENERATED BY VELOCITY TEMPLATE ENGINE FROM /vobs/dte/client/generator/DV_XYMap.java (KEY_TYPE=int, VALUE_TYPE=long)
 *
 */

import com.cboe.client.util.*;

public class IntLongMap implements HasSizeIF
{
    protected int[][] keys;
    protected long[][] values;
    protected int[]        numberKeys;
    protected int          tableHighestIndex;
    protected volatile int size;

    public long ValueNotFound = IntegerHelper.INVALID_VALUE;

    public static final int VALUE_ADDED     = -12345;
    public static final int VALUE_REPLACED  = -23456;
    public static final int VALUE_UNCHANGED = -34567;

    public static final int DEFAULT_INITIAL_CAPACITY       = 256;
    public static final int DEFAULT_ENTRY_LIST_CAPACITY    = 16;
    public static final int MAXIMUM_CAPACITY               = 1024 * 16;

    public static final IntLongMap unsynchronizedMap()             {return new IntLongMap();}
    public static final IntLongMap unsynchronizedMap(int capacity) {return new IntLongMap(capacity);}
    public static final IntLongMap synchronizedMap()               {return new IntLongMapMT();}
    public static final IntLongMap synchronizedMap(int capacity)   {return new IntLongMapMT(capacity);}

    public static class IntLongMapMT extends IntLongMap
    {
        public IntLongMapMT()
        {
            super();
        }
        public IntLongMapMT(int capacity)
        {
            super(capacity);
        }
        public synchronized boolean containsKey(int key)
        {
            return super.containsKey(key);
        }
        public synchronized boolean containsValue(long value)
        {
            return super.containsValue(value);
        }
        public synchronized void getKeysForValue(long value, IntArrayHolderIF arrayHolder)
        {
            super.getKeysForValue(value, arrayHolder);
        }
        public synchronized long getValueForKey(int key)
        {
            return super.getValueForKey(key);
        }
        public synchronized int putKeyValue(int key, long value)
        {
            return super.putKeyValue(key, value);
        }
        public synchronized int putKeyValue(int key, long value, IntLongKeyValuePolicyIF policy)
        {
            return super.putKeyValue(key, value, policy);
        }
        public synchronized long removeKey(int key)
        {
            return super.removeKey(key);
        }
        public synchronized long removeKey(int key, IntLongKeyValuePolicyIF policy)
        {
            return super.removeKey(key, policy);
        }
        public synchronized IntLongVisitorIF acceptVisitor(IntLongVisitorIF visitor)
        {
            return super.acceptVisitor(visitor);
        }
        public synchronized IntLongMap clear()
        {
            return super.clear();
        }
        public synchronized IntLongMap clear(IntLongArrayHolderIF arrayHolder)
        {
            return super.clear(arrayHolder);
        }
    };

    public IntLongMap()
    {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public IntLongMap(int capacity)
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

        keys              = new int[capacity][];
        values            = new long[capacity][];
        numberKeys        = new int[capacity];
        tableHighestIndex = capacity - 1;
    }

    public long getValueNotFound()
    {
        return ValueNotFound;
    }

    public IntLongMap setValueNotFound(long ValueNotFound)
    {
        this.ValueNotFound = ValueNotFound;

        return this;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean containsKey(int key)
    {
        int bucketIndex = (int) (key & tableHighestIndex);

        if (numberKeys[bucketIndex] > 0)
        {
            return CollectionHelper.binarySearch(keys[bucketIndex], key, numberKeys[bucketIndex]) >= 0;
        }

        return false;
    }

    public boolean containsValue(long value)
    {
        int      bucketSize;
        int      keyIndex;
        long[] local_values;

        for (int bucketIndex = keys.length; --bucketIndex >= 0; )
        {
            bucketSize = numberKeys[bucketIndex];

            if (bucketSize > 0)
            {
                local_values = values[bucketIndex];

                for (keyIndex = 0; keyIndex < bucketSize; keyIndex++)
                {
                    if (value == local_values[keyIndex])
                    {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public void getKeysForValue(long value, IntArrayHolderIF arrayHolder)
    {
        int      bucketSize;
        int      keyIndex;
        long[] local_values;

        for (int bucketIndex = keys.length; --bucketIndex >= 0; )
        {
            bucketSize = numberKeys[bucketIndex];

            if (bucketSize > 0)
            {
                local_values = values[bucketIndex];

                for (keyIndex = 0; keyIndex < bucketSize; keyIndex++)
                {
                    if (value == local_values[keyIndex])
                    {
                        arrayHolder.add(keys[bucketIndex][keyIndex]);
                    }
                }
            }
        }
    }

    public long getValueForKey(int key)
    {
        int bucketIndex = (int) (key & tableHighestIndex);

        if (numberKeys[bucketIndex] > 0)
        {
            int keyIndex = CollectionHelper.binarySearch(keys[bucketIndex], key, numberKeys[bucketIndex]);
            if (keyIndex >= 0)
            {
                return values[bucketIndex][keyIndex];
            }
        }

        return ValueNotFound;
    }

    public void getData(IntLongArrayHolderIF arrayHolder)
    {
        int             bucketSize;
        int             keyIndex;
        int[]   local_keys;
        long[] local_values;

        for (int bucketIndex = 0; bucketIndex < keys.length; bucketIndex++)
        {
            bucketSize = numberKeys[bucketIndex];

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

    public int putKeyValue(int key, long value)
    {
        int bucketIndex = (int) (key & tableHighestIndex);

        if (keys[bucketIndex] == null)
        {
            keys[bucketIndex]       = new int[DEFAULT_ENTRY_LIST_CAPACITY];
            values[bucketIndex]     = new long[DEFAULT_ENTRY_LIST_CAPACITY];
            keys[bucketIndex][0]    = key;
            values[bucketIndex][0]  = value;
            numberKeys[bucketIndex] = 1;
            size++;

            return VALUE_ADDED;
        }

        int keyIndex;
        int[] local_keys = keys[bucketIndex];
        long[] local_values = values[bucketIndex];
        int local_numberKeys = numberKeys[bucketIndex];

        keyIndex = CollectionHelper.binarySearch(local_keys, key, local_numberKeys);
        if (keyIndex >= 0)
        {
            local_values[keyIndex] = value;
            return VALUE_REPLACED;
	    }

        // if we got here, this is completely new

        keyIndex = CollectionHelper.normalizeBinarySearchPosition(keyIndex);
        if (local_numberKeys >= local_keys.length) // need to expand
        {
            if (keyIndex == local_numberKeys) // if at end, then just arrayclone, and append later
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
            if (keyIndex < local_numberKeys)
            {
                System.arraycopy(local_values, keyIndex, local_values, keyIndex + 1, local_numberKeys - keyIndex);
                System.arraycopy(local_keys,   keyIndex, local_keys,   keyIndex + 1, local_numberKeys - keyIndex);
            }
        }

        keys[bucketIndex][keyIndex]   = key;
        values[bucketIndex][keyIndex] = value;

        numberKeys[bucketIndex]++;
        size++;

        return VALUE_ADDED;
    }

    public int putKeyValue(int key, long value, IntLongKeyValuePolicyIF policy)
    {
        int bucketIndex = (int) (key & tableHighestIndex);

        if (keys[bucketIndex] == null)
        {
            if (!policy.canInsert(key, value))
            {
                return VALUE_UNCHANGED;
            }

            keys[bucketIndex]       = new int[DEFAULT_ENTRY_LIST_CAPACITY];
            values[bucketIndex]     = new long[DEFAULT_ENTRY_LIST_CAPACITY];
            keys[bucketIndex][0]    = key;
            values[bucketIndex][0]  = value;
            numberKeys[bucketIndex] = 1;
            size++;

            return VALUE_ADDED;
        }

        int keyIndex;
        int[] local_keys = keys[bucketIndex];
        long[] local_values = values[bucketIndex];
        int local_numberKeys = numberKeys[bucketIndex];

        keyIndex = CollectionHelper.binarySearch(local_keys, key, local_numberKeys);
        if (keyIndex >= 0)
        {
            if (policy.canUpdate(keys[bucketIndex][keyIndex], values[bucketIndex][keyIndex], value))
            {
                local_values[keyIndex] = value;
                return VALUE_REPLACED;
            }

            return VALUE_UNCHANGED;
	    }

        // if we got here, this is completely new

        if (!policy.canInsert(key, value))
        {
            return VALUE_UNCHANGED;
        }

        keyIndex = CollectionHelper.normalizeBinarySearchPosition(keyIndex);
        if (local_numberKeys >= local_keys.length) // need to expand
        {
            if (keyIndex == local_numberKeys) // if at end, then just arrayclone, and append later
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
            if (keyIndex < local_numberKeys)
            {
                System.arraycopy(local_values, keyIndex, local_values, keyIndex + 1, local_numberKeys - keyIndex);
                System.arraycopy(local_keys,   keyIndex, local_keys,   keyIndex + 1, local_numberKeys - keyIndex);
            }
        }

        keys[bucketIndex][keyIndex]   = key;
        values[bucketIndex][keyIndex] = value;

        numberKeys[bucketIndex]++;
        size++;

        return VALUE_ADDED;
    }

    public long removeKey(int key)
    {
        int bucketIndex = (int) (key & tableHighestIndex);

        if (numberKeys[bucketIndex] > 0)
        {
            int keyIndex;
            int[] local_keys = keys[bucketIndex];
            long[] local_values = values[bucketIndex];
            int local_numberKeys = numberKeys[bucketIndex];

            keyIndex = CollectionHelper.binarySearch(local_keys, key, local_numberKeys);
            if (keyIndex >= 0)
            {
                long oldValue = local_values[keyIndex];

                int highest_index = local_values.length - 1;

                if (keyIndex < highest_index)
                {
                    System.arraycopy(local_values, keyIndex + 1, local_values, keyIndex, highest_index - keyIndex);
                    System.arraycopy(local_keys,   keyIndex + 1, local_keys,   keyIndex, highest_index - keyIndex);
                }

                local_keys[highest_index]   = 0;
                local_values[highest_index] = 0;

                numberKeys[bucketIndex]--;
                size--;

                return oldValue;
	        }
        }

        return ValueNotFound;
    }

    public long removeKey(int key, IntLongKeyValuePolicyIF policy)
    {
        int bucketIndex = (int) (key & tableHighestIndex);

        if (numberKeys[bucketIndex] > 0)
        {
            int keyIndex;
            int[] local_keys = keys[bucketIndex];
            long[] local_values = values[bucketIndex];
            int local_numberKeys = numberKeys[bucketIndex];

            keyIndex = CollectionHelper.binarySearch(local_keys, key, local_numberKeys);
            if (keyIndex >= 0)
            {
                long oldValue = local_values[keyIndex];

                if (!policy.canRemove(key, oldValue))
                {
                    return ValueNotFound;
                }

                int highest_index = local_values.length - 1;

                if (keyIndex < highest_index)
                {
                    System.arraycopy(local_values, keyIndex + 1, local_values, keyIndex, highest_index - keyIndex);
                    System.arraycopy(local_keys,   keyIndex + 1, local_keys,   keyIndex, highest_index - keyIndex);
                }

                local_keys[highest_index]   = 0;
                local_values[highest_index] = 0;

                numberKeys[bucketIndex]--;
                size--;

                return oldValue;
	        }
        }

        return ValueNotFound;
    }

    public IntLongVisitorIF acceptVisitor(IntLongVisitorIF visitor)
    {
        int             bucketSize;
        int             keyIndex;
        int             rc;
        int[]   local_keys;
        long[] local_values;

        for (int bucketIndex = 0; bucketIndex < keys.length; bucketIndex++)
        {
            bucketSize = numberKeys[bucketIndex];

            local_keys = keys[bucketIndex];

            if (bucketSize > 0)
            {
                local_values = values[bucketIndex];

                for (keyIndex = 0; keyIndex < bucketSize; keyIndex++)
                {
                    rc = visitor.visit(local_keys[keyIndex], local_values[keyIndex]);

                    if (rc == IntLongVisitorIF.CONTINUE)
                    {
                        continue;
                    }

                    if (rc == IntLongVisitorIF.ABORT)
                    {
                         return visitor;
                    }
                }
            }
        }

        return visitor;
    }

    public IntLongMap clear()
    {
        for (int bucketIndex = keys.length; --bucketIndex >= 0; )
        {
            keys[bucketIndex]   = null;
            values[bucketIndex] = null;
            numberKeys[bucketIndex]  = 0;
        }

        size = 0;

        return this;
    }

    public IntLongMap clear(IntLongArrayHolderIF arrayHolder)
    {
        getData(arrayHolder);

        for (int bucketIndex = keys.length; --bucketIndex >= 0; )
        {
            keys[bucketIndex]   = null;
            values[bucketIndex] = null;
            numberKeys[bucketIndex]  = 0;
        }

        size = 0;

        return this;
    }
}

