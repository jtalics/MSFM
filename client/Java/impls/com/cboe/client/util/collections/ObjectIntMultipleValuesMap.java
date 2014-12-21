package com.cboe.client.util.collections;

/**
 * ObjectIntMultipleValuesMap.java
 *
 * @author Dmitry Volpyansky
 *
 * FILE GENERATED BY VELOCITY TEMPLATE ENGINE FROM /vobs/dte/client/generator/DV_XYMultipleValuesMap.java (KEY_TYPE=Object, VALUE_TYPE=int, THIRD_TYPE=)
 *
 */

import com.cboe.client.util.*;

public class ObjectIntMultipleValuesMap implements HasSizeIF
{
    protected Object[][]   keys;
    protected int[][][] values;
    protected int[]        numberKeys;
    protected int          tableHighestIndex;
    protected volatile int size;

    public int ValueNotFound = IntegerHelper.INVALID_VALUE;

    public static final int VALUE_ADDED     = -12345;
    public static final int VALUE_REPLACED  = -23456;
    public static final int VALUE_UNCHANGED = -34567;
    public static final int VALUE_REMOVED   = -45678;

    public static final int DEFAULT_INITIAL_CAPACITY       = 256;
    public static final int DEFAULT_ENTRY_LIST_CAPACITY    = 16;
    public static final int MAXIMUM_CAPACITY               = 1024 * 16;

    public static final ObjectIntMultipleValuesMap unsynchronizedMap()             {return new ObjectIntMultipleValuesMap();}
    public static final ObjectIntMultipleValuesMap unsynchronizedMap(int capacity) {return new ObjectIntMultipleValuesMap(capacity);}
    public static final ObjectIntMultipleValuesMap synchronizedMap()               {return new ObjectIntMultipleValuesMapMT();}
    public static final ObjectIntMultipleValuesMap synchronizedMap(int capacity)   {return new ObjectIntMultipleValuesMapMT(capacity);}

    public static class ObjectIntMultipleValuesMapMT extends ObjectIntMultipleValuesMap
    {
        public ObjectIntMultipleValuesMapMT()
        {
            super();
        }
        public ObjectIntMultipleValuesMapMT(int capacity)
        {
            super(capacity);
        }
        public synchronized int putKeyValue(Object key, int value)
        {
            return super.putKeyValue(key, value);
        }
        public synchronized int putKeyValue(Object key, int value, ObjectIntKeyValuePolicyIF policy)
        {
            return super.putKeyValue(key, value, policy);
        }
        public synchronized boolean containsKey(Object key)
        {
            return super.containsKey(key);
        }
        public synchronized boolean containsValue(int value)
        {
            return super.containsValue(value);
        }
        public synchronized int countValues(Object key)
        {
            return super.countValues(key);
        }
        public synchronized int getValueForKeyAt(Object key, int multiIndex)
        {
            return super.getValueForKeyAt(key, multiIndex);
        }
        public synchronized void getValuesForKey(Object key, IntArrayHolderIF arrayHolder)
        {
            super.getValuesForKey(key, arrayHolder);
        }
        public synchronized void getKeysForValue(int value, ObjectArrayHolderIF arrayHolder)
        {
            super.getKeysForValue(value, arrayHolder);
        }
        public synchronized void getData(ObjectIntArrayHolderIF arrayHolder)
        {
            super.getData(arrayHolder);
        }
        public synchronized int removeKeyValue(Object key, int value)
        {
            return super.removeKeyValue(key, value);
        }
        public int removeKeyValue(Object key, int value, MutableInteger mutableInteger)
        {
            return super.removeKeyValue(key, value, mutableInteger);
        }
        public synchronized void removeKey(Object key)
        {
            super.removeKey(key);
        }
        public synchronized void removeKey(Object key, IntArrayHolderIF arrayHolder)
        {
            super.removeKey(key, arrayHolder);
        }
        public synchronized void removeValue(int value)
        {
            super.removeValue(value);
        }
        public synchronized void removeValue(int value, ObjectArrayHolderIF arrayHolder)
        {
            super.removeValue(value, arrayHolder);
        }
        public synchronized ObjectIntVisitorIF acceptVisitor(ObjectIntVisitorIF visitor)
        {
            return super.acceptVisitor(visitor);
        }
        public synchronized ObjectIntMultipleValuesMap clear()
        {
            return super.clear();
        }
        public synchronized ObjectIntMultipleValuesMap clear(ObjectIntArrayHolderIF arrayHolder)
        {
            return super.clear(arrayHolder);
        }
    };

    public ObjectIntMultipleValuesMap()
    {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public ObjectIntMultipleValuesMap(int capacity)
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

        keys              = new Object[capacity][];
        values            = new int[capacity][][];
        numberKeys        = new int[capacity];
        tableHighestIndex = capacity - 1;
    }

    public int getValueNotFound()
    {
        return ValueNotFound;
    }

    public ObjectIntMultipleValuesMap setValueNotFound(int ValueNotFound)
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

    public int putKeyValue(Object key, int value)
    {
        int bucketIndex = (int) (key.hashCode() & tableHighestIndex);

        if (keys[bucketIndex] == null)
        {
            keys[bucketIndex]       = new Object[DEFAULT_ENTRY_LIST_CAPACITY];
            values[bucketIndex]     = new int[DEFAULT_ENTRY_LIST_CAPACITY][];
            keys[bucketIndex][0]    = key;
            values[bucketIndex][0]  = new int[] {value};
            numberKeys[bucketIndex] = 1;
            size++;

            return VALUE_ADDED;
        }

        Object[]     local_keys   = keys[bucketIndex];
        int[][] local_values = values[bucketIndex];
        int        local_size   = numberKeys[bucketIndex];
        int        keyIndex     = -1;

        for (keyIndex = 0; keyIndex < local_size; keyIndex++)
        {
            if (key == local_keys[keyIndex] || key.equals(local_keys[keyIndex]))
            {
                int[] local_multivalues = local_values[keyIndex];
                int multiIndex;

                for (multiIndex = 0; multiIndex < local_multivalues.length; multiIndex++)
                {
                    if (value == local_multivalues[multiIndex])
                    {
                        return VALUE_UNCHANGED;
                    }
                }

                local_values[keyIndex] = CollectionHelper.arrayclone(local_multivalues, 0, local_multivalues.length, local_multivalues.length + 1);

                local_values[keyIndex][multiIndex] = value;

                size++;

                return VALUE_ADDED;
            }
        }

        // if we got here, this is a completely new multivalues

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
        values[bucketIndex][keyIndex] = new int[] {value};

        numberKeys[bucketIndex]++;
        size++;

        return VALUE_ADDED;
    }

    public int putKeyValue(Object key, int value, ObjectIntKeyValuePolicyIF policy)
    {
        int bucketIndex = (int) (key.hashCode() & tableHighestIndex);

        if (keys[bucketIndex] == null)
        {
            if (!policy.canInsert(key, value))
            {
                return VALUE_UNCHANGED;
            }

            keys[bucketIndex]       = new Object[DEFAULT_ENTRY_LIST_CAPACITY];
            values[bucketIndex]     = new int[DEFAULT_ENTRY_LIST_CAPACITY][];
            keys[bucketIndex][0]    = key;
            values[bucketIndex][0]  = new int[] {value};
            numberKeys[bucketIndex] = 1;
            size++;

            return VALUE_ADDED;
        }

        Object[]     local_keys   = keys[bucketIndex];
        int[][] local_values = values[bucketIndex];
        int        local_size   = numberKeys[bucketIndex];
        int        keyIndex     = -1;

        for (keyIndex = 0; keyIndex < local_size; keyIndex++)
        {
            if (key == local_keys[keyIndex] || key.equals(local_keys[keyIndex]))
            {
                int[] local_multivalues = local_values[keyIndex];
                int multiIndex;

                for (multiIndex = 0; multiIndex < local_multivalues.length; multiIndex++)
                {
                    if (value == local_multivalues[multiIndex])
                    {
                        return VALUE_UNCHANGED;
                    }
                }

                if (!policy.canInsert(key, value))
                {
                    return VALUE_UNCHANGED;
                }

                local_values[keyIndex] = CollectionHelper.arrayclone(local_multivalues, 0, local_multivalues.length, local_multivalues.length + 1);

                local_values[keyIndex][multiIndex] = value;

                size++;

                return VALUE_ADDED;
            }
        }

        // if we got here, this is a completely new multivalues

        if (!policy.canInsert(key, value))
        {
            return VALUE_UNCHANGED;
        }

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
        values[bucketIndex][keyIndex] = new int[] {value};

        numberKeys[bucketIndex]++;
        size++;

        return VALUE_ADDED;
    }

    public int putKeyValue(Object key, int value, MutableInteger mutableInteger)
    {
        int bucketIndex = (int) (key.hashCode() & tableHighestIndex);

        if (keys[bucketIndex] == null)
        {
            keys[bucketIndex]       = new Object[DEFAULT_ENTRY_LIST_CAPACITY];
            values[bucketIndex]     = new int[DEFAULT_ENTRY_LIST_CAPACITY][];
            keys[bucketIndex][0]    = key;
            values[bucketIndex][0]  = new int[] {value};
            numberKeys[bucketIndex] = 1;
            size++;

            mutableInteger.integer = 1;
            return VALUE_ADDED;
        }

        Object[]     local_keys   = keys[bucketIndex];
        int[][] local_values = values[bucketIndex];
        int        local_size   = numberKeys[bucketIndex];
        int        keyIndex     = -1;

        for (keyIndex = 0; keyIndex < local_size; keyIndex++)
        {
            if (key == local_keys[keyIndex] || key.equals(local_keys[keyIndex]))
            {
                int[] local_multivalues = local_values[keyIndex];
                int multiIndex;

                for (multiIndex = 0; multiIndex < local_multivalues.length; multiIndex++)
                {
                    if (value == local_multivalues[multiIndex])
                    {
                        mutableInteger.integer = local_multivalues.length;
                        return VALUE_UNCHANGED;
                    }
                }

                local_values[keyIndex] = CollectionHelper.arrayclone(local_multivalues, 0, local_multivalues.length, local_multivalues.length + 1);

                local_values[keyIndex][multiIndex] = value;

                size++;

                mutableInteger.integer = local_values[keyIndex].length;
                return VALUE_ADDED;
            }
        }

        // if we got here, this is a completely new multivalues

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
        values[bucketIndex][keyIndex] = new int[] {value};

        numberKeys[bucketIndex]++;
        size++;

        mutableInteger.integer = 1;
        return VALUE_ADDED;
    }

    public int putKeyValue(Object key, int value, ObjectIntKeyValuePolicyIF policy, MutableInteger mutableInteger)
    {
        int bucketIndex = (int) (key.hashCode() & tableHighestIndex);

        if (keys[bucketIndex] == null)
        {
            if (!policy.canInsert(key, value))
            {
                mutableInteger.integer = 0;
                return VALUE_UNCHANGED;
            }

            keys[bucketIndex]       = new Object[DEFAULT_ENTRY_LIST_CAPACITY];
            values[bucketIndex]     = new int[DEFAULT_ENTRY_LIST_CAPACITY][];
            keys[bucketIndex][0]    = key;
            values[bucketIndex][0]  = new int[] {value};
            numberKeys[bucketIndex] = 1;
            size++;

            mutableInteger.integer = 1;
            return VALUE_ADDED;
        }

        Object[]     local_keys   = keys[bucketIndex];
        int[][] local_values = values[bucketIndex];
        int        local_size   = numberKeys[bucketIndex];
        int        keyIndex     = -1;

        for (keyIndex = 0; keyIndex < local_size; keyIndex++)
        {
            if (key == local_keys[keyIndex] || key.equals(local_keys[keyIndex]))
            {
                int[] local_multivalues = local_values[keyIndex];
                int multiIndex;

                for (multiIndex = 0; multiIndex < local_multivalues.length; multiIndex++)
                {
                    if (value == local_multivalues[multiIndex])
                    {
                        mutableInteger.integer = local_multivalues.length;
                        return VALUE_UNCHANGED;
                    }
                }

                if (!policy.canInsert(key, value))
                {
                    mutableInteger.integer = local_values[keyIndex].length;
                    return VALUE_UNCHANGED;
                }

                local_values[keyIndex] = CollectionHelper.arrayclone(local_multivalues, 0, local_multivalues.length, local_multivalues.length + 1);

                local_values[keyIndex][multiIndex] = value;

                size++;

                mutableInteger.integer = local_values[keyIndex].length;
                return VALUE_ADDED;
            }
        }

        // if we got here, this is a completely new multivalues

        if (!policy.canInsert(key, value))
        {
            mutableInteger.integer = 0;
            return VALUE_UNCHANGED;
        }

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
        values[bucketIndex][keyIndex] = new int[] {value};

        numberKeys[bucketIndex]++;
        size++;

        mutableInteger.integer = 1;
        return VALUE_ADDED;
    }

    public boolean containsKey(Object key)
    {
        int bucketIndex = (int) (key.hashCode() & tableHighestIndex);

        if (numberKeys[bucketIndex] > 0)
        {
            Object[] local_keys = keys[bucketIndex];

            for (int keyIndex = numberKeys[bucketIndex]; --keyIndex >= 0; )
            {
                if (key == local_keys[keyIndex] || key.equals(local_keys[keyIndex]))
                {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean containsValue(int value)
    {
        int        bucketSize;
        int        keyIndex;
        int        multiIndex;
        int[][] local_values;
        int[]   local_multivalues;

        for (int bucketIndex = keys.length; --bucketIndex >= 0; )
        {
            bucketSize = numberKeys[bucketIndex];

            if (bucketSize > 0)
            {
                local_values = values[bucketIndex];

                for (keyIndex = 0; keyIndex < bucketSize; keyIndex++)
                {
                    local_multivalues = local_values[keyIndex];

                    for (multiIndex = local_multivalues.length; --multiIndex >= 0; )
                    {
                        if (value == local_multivalues[multiIndex])
                        {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    public int countValues(Object key)
    {
        int bucketIndex = (int) (key.hashCode() & tableHighestIndex);

        if (numberKeys[bucketIndex] > 0)
        {
            Object[] local_keys = keys[bucketIndex];
            for (int keyIndex = numberKeys[bucketIndex]; --keyIndex >= 0; )
            {
                if (key == local_keys[keyIndex] || key.equals(local_keys[keyIndex]))
                {
                    return values[bucketIndex][keyIndex].length;
                }
            }
        }

        return 0;
    }

    public int getValueForKeyAt(Object key, int multiIndex)
    {
        int bucketIndex = (int) (key.hashCode() & tableHighestIndex);

        if (numberKeys[bucketIndex] > 0)
        {
            Object[] local_keys = keys[bucketIndex];
            for (int keyIndex = numberKeys[bucketIndex]; --keyIndex >= 0; )
            {
                if (key == local_keys[keyIndex] || key.equals(local_keys[keyIndex]))
                {
                    if (multiIndex >= values[bucketIndex][keyIndex].length)
                    {
                        return ValueNotFound;
                    }

                    return values[bucketIndex][keyIndex][multiIndex];
                }
            }
        }

        return ValueNotFound;
    }

    public void getValuesForKey(Object key, IntArrayHolderIF arrayHolder)
    {
        int bucketIndex = (int) (key.hashCode() & tableHighestIndex);

        if (numberKeys[bucketIndex] > 0)
        {
            Object[] local_keys = keys[bucketIndex];
            for (int keyIndex = numberKeys[bucketIndex]; --keyIndex >= 0; )
            {
                if (key == local_keys[keyIndex] || key.equals(local_keys[keyIndex]))
                {
                    arrayHolder.add(values[bucketIndex][keyIndex]);
                }
            }
        }
    }

    public void getKeysForValue(int value, ObjectArrayHolderIF arrayHolder)
    {
        int        bucketSize;
        int        keyIndex;
        int        multiIndex;
        int[][] local_values;
        int[]   local_multivalues;

        for (int bucketIndex = keys.length; --bucketIndex >= 0; )
        {
            bucketSize = numberKeys[bucketIndex];

            if (bucketSize > 0)
            {
                local_values = values[bucketIndex];

                for (keyIndex = 0; keyIndex < bucketSize; keyIndex++)
                {
                    local_multivalues = local_values[keyIndex];

                    for (multiIndex = local_multivalues.length; --multiIndex >= 0; )
                    {
                        if (value == local_multivalues[multiIndex])
                        {
                            arrayHolder.add(keys[bucketIndex][keyIndex]);
                            break;
                        }
                    }
                }
            }
        }
    }

    public void getData(ObjectIntArrayHolderIF arrayHolder)
    {
        int               bucketSize;
        int               keyIndex;
        int               multiIndex;
        Object       key;
        Object[]     local_keys;
        int[][] local_values;
        int[]   local_multivalues;

        for (int bucketIndex = 0; bucketIndex < keys.length; bucketIndex++)
        {
            bucketSize = numberKeys[bucketIndex];

            if (bucketSize > 0)
            {
                local_values = values[bucketIndex];
                local_keys   = keys[bucketIndex];

                for (keyIndex = 0; keyIndex < bucketSize; keyIndex++)
                {
                    key               = local_keys[keyIndex];
                    local_multivalues = local_values[keyIndex];

                    for (multiIndex = 0; multiIndex < local_multivalues.length; multiIndex++)
                    {
                        arrayHolder.add(key, local_multivalues[multiIndex]);
                    }
                }
            }
        }
    }

//TODO:  ADD POLICIES TO REMOVE

    public int removeKeyValue(Object key, int value)
    {
        int bucketIndex = (int) (key.hashCode() & tableHighestIndex);

        if (numberKeys[bucketIndex] > 0)
        {
            Object[] local_keys = keys[bucketIndex];
            int keyIndex;
            for (keyIndex = numberKeys[bucketIndex]; --keyIndex >= 0; )
            {
                if (key == local_keys[keyIndex] || key.equals(local_keys[keyIndex]))
                {
                    break;
                }
            }

            if (keyIndex < 0)
            {
                return VALUE_UNCHANGED;
            }

            int[][] local_values   = values[bucketIndex];
            int[]   local_multivalues = local_values[keyIndex];

            for (int multiIndex = 0; multiIndex < local_multivalues.length; multiIndex++)
            {
                if (value == local_multivalues[multiIndex])
                {
                    if (local_multivalues.length == 1)
                    {
                        int highest_index = numberKeys[bucketIndex] - 1;

                        System.arraycopy(local_keys,   keyIndex + 1, local_keys,   keyIndex, highest_index);
                        System.arraycopy(local_values, keyIndex + 1, local_values, keyIndex, highest_index);

                        local_keys[highest_index]   = null;
                        local_values[highest_index] = null;

                        numberKeys[bucketIndex]--;
                    }
                    else
                    {
                        local_values[keyIndex] = CollectionHelper.arraycloneShrinkGap(local_multivalues, multiIndex, 1);
                    }

                    size--;

                    return VALUE_REMOVED;
    	        }
	        }
        }

        return VALUE_UNCHANGED;
    }

    public int removeKeyValue(Object key, int value, MutableInteger mutableInteger)
    {
        int bucketIndex = (int) (key.hashCode() & tableHighestIndex);

        if (numberKeys[bucketIndex] > 0)
        {
            Object[] local_keys = keys[bucketIndex];
            int keyIndex;
            for (keyIndex = numberKeys[bucketIndex]; --keyIndex >= 0; )
            {
                if (key == local_keys[keyIndex] || key.equals(local_keys[keyIndex]))
                {
                    break;
                }
            }

            if (keyIndex < 0)
            {
                mutableInteger.integer = 0;
                return VALUE_UNCHANGED;
            }

            int[][] local_values   = values[bucketIndex];
            int[]   local_multivalues = local_values[keyIndex];

            for (int multiIndex = 0; multiIndex < local_multivalues.length; multiIndex++)
            {
                if (value == local_multivalues[multiIndex])
                {
                    if (local_multivalues.length == 1)
                    {
                        int highest_index = numberKeys[bucketIndex] - 1;

                        System.arraycopy(local_keys,   keyIndex + 1, local_keys,   keyIndex, highest_index);
                        System.arraycopy(local_values, keyIndex + 1, local_values, keyIndex, highest_index);

                        local_keys[highest_index]   = null;
                        local_values[highest_index] = null;

                        numberKeys[bucketIndex]--;
                    }
                    else
                    {
                        local_values[keyIndex] = CollectionHelper.arraycloneShrinkGap(local_multivalues, multiIndex, 1);
                    }

                    size--;

                    mutableInteger.integer = local_multivalues.length - 1;
                    return VALUE_REMOVED;
    	        }
	        }
        }

        mutableInteger.integer = 0;
        return VALUE_UNCHANGED;
    }

    public void removeKey(Object key)
    {
        int bucketIndex = (int) (key.hashCode() & tableHighestIndex);

        if (numberKeys[bucketIndex] > 0)
        {
            Object[] local_keys = keys[bucketIndex];
            for (int keyIndex = numberKeys[bucketIndex]; --keyIndex >= 0; )
            {
                if (key == local_keys[keyIndex] || key.equals(local_keys[keyIndex]))
                {
                    int removed = values[bucketIndex][keyIndex].length;
                    int highest_index = numberKeys[bucketIndex] - 1;

                    System.arraycopy(keys[bucketIndex],   keyIndex + 1, keys[bucketIndex],   keyIndex, numberKeys[bucketIndex] - keyIndex);
                    System.arraycopy(values[bucketIndex], keyIndex + 1, values[bucketIndex], keyIndex, numberKeys[bucketIndex] - keyIndex);

                    numberKeys[bucketIndex]--;
                    size -= removed;

                    values[bucketIndex][highest_index] = null;
                    keys[bucketIndex][highest_index]   = null;
                }
            }
        }
    }

    public void removeKey(Object key, IntArrayHolderIF arrayHolder)
    {
        int bucketIndex = (int) (key.hashCode() & tableHighestIndex);

        if (numberKeys[bucketIndex] > 0)
        {
            Object[] local_keys = keys[bucketIndex];
            for (int keyIndex = numberKeys[bucketIndex]; --keyIndex >= 0; )
            {
                if (key == local_keys[keyIndex] || key.equals(local_keys[keyIndex]))
                {
                    arrayHolder.add(values[bucketIndex][keyIndex]);

                    int removed = values[bucketIndex][keyIndex].length;
                    int highest_index = numberKeys[bucketIndex] - 1;

                    System.arraycopy(keys[bucketIndex],   keyIndex + 1, keys[bucketIndex],   keyIndex, numberKeys[bucketIndex] - keyIndex);
                    System.arraycopy(values[bucketIndex], keyIndex + 1, values[bucketIndex], keyIndex, numberKeys[bucketIndex] - keyIndex);

                    numberKeys[bucketIndex]--;
                    size -= removed;

                    values[bucketIndex][highest_index] = null;
                    keys[bucketIndex][highest_index]   = null;
                }
            }
        }
    }

    public void removeValue(int value)
    {
        int        bucketSize;
        int        keyIndex;
        int        multiIndex;
        Object[]     local_keys;
        int[][] local_values;
        int[]   local_multivalues;

        for (int bucketIndex = keys.length; --bucketIndex >= 0; )
        {
            bucketSize = numberKeys[bucketIndex];

            if (bucketSize > 0)
            {
                local_values = values[bucketIndex];
                local_keys   = keys[bucketIndex];

                for (keyIndex = 0; keyIndex < bucketSize; keyIndex++)
                {
                    local_multivalues = local_values[keyIndex];

                    for (multiIndex = local_multivalues.length; --multiIndex >= 0; )
                    {
                        if (value == local_multivalues[multiIndex])
                        {
                            if (local_multivalues.length == 1)
                            {
                                int highest_index = numberKeys[bucketIndex] - 1;

                                System.arraycopy(local_keys,   keyIndex + 1, local_keys,   keyIndex, highest_index);
                                System.arraycopy(local_values, keyIndex + 1, local_values, keyIndex, highest_index);

                                local_keys[highest_index]   = null;
                                local_values[highest_index] = null;

                                numberKeys[bucketIndex]--;
                            }
                            else
                            {
                                local_values[keyIndex] = CollectionHelper.arraycloneShrinkGap(local_multivalues, multiIndex, 1);
                            }

                            size--;
                        }
                    }
                }
            }
        }
    }

    public void removeValue(int value, ObjectArrayHolderIF arrayHolder)
    {
        int        bucketSize;
        int        keyIndex;
        int        multiIndex;
        Object[]     local_keys;
        int[][] local_values;
        int[]   local_multivalues;

        for (int bucketIndex = keys.length; --bucketIndex >= 0; )
        {
            bucketSize = numberKeys[bucketIndex];

            if (bucketSize > 0)
            {
                local_values = values[bucketIndex];
                local_keys   = keys[bucketIndex];

                for (keyIndex = 0; keyIndex < bucketSize; keyIndex++)
                {
                    local_multivalues = local_values[keyIndex];

                    for (multiIndex = local_multivalues.length; --multiIndex >= 0; )
                    {
                        if (value == local_multivalues[multiIndex])
                        {
                            arrayHolder.add(keys[bucketIndex][keyIndex]);

                            if (local_multivalues.length == 1)
                            {
                                int highest_index = numberKeys[bucketIndex] - 1;

                                System.arraycopy(local_keys,   keyIndex + 1, local_keys,   keyIndex, highest_index);
                                System.arraycopy(local_values, keyIndex + 1, local_values, keyIndex, highest_index);

                                local_keys[highest_index]   = null;
                                local_values[highest_index] = null;

                                numberKeys[bucketIndex]--;
                            }
                            else
                            {
                                local_values[keyIndex] = CollectionHelper.arraycloneShrinkGap(local_multivalues, multiIndex, 1);
                            }

                            size--;
                        }
                    }
                }
            }
        }
    }

    public ObjectIntVisitorIF acceptVisitor(ObjectIntVisitorIF visitor)
    {
        int               bucketSize;
        int               keyIndex;
        int               multiIndex;
        Object       key;
        int               multiLength;
        int               rc;
        Object[]     local_keys;
        int[][] local_values;
        int[]   local_multivalues;

        for (int bucketIndex = 0; bucketIndex < keys.length; bucketIndex++)
        {
            bucketSize = numberKeys[bucketIndex];

            if (bucketSize > 0)
            {
                local_values = values[bucketIndex];
                local_keys   = keys[bucketIndex];

                for (keyIndex = 0; keyIndex < bucketSize; keyIndex++)
                {
                    local_multivalues = local_values[keyIndex];
                    multiLength       = local_multivalues.length;
                    key               = local_keys[keyIndex];

                    for (multiIndex = 0; multiIndex < multiLength; multiIndex++)
                    {
                        rc = visitor.visit(key, local_multivalues[multiIndex]);

                        if (rc == ObjectIntVisitorIF.CONTINUE)
                        {
                             continue;
                        }

                        if (rc == ObjectIntVisitorIF.SKIP)
                        {
                            break;
                        }

                        if (rc == ObjectIntVisitorIF.ABORT)
                        {
                             return visitor;
                        }
                    }
                }
            }
        }

        return visitor;
    }

    public ObjectIntMultipleValuesMap clear()
    {
        for (int bucketIndex = keys.length; --bucketIndex >= 0; )
        {
            keys[bucketIndex]       = null;
            values[bucketIndex]     = null;
            numberKeys[bucketIndex] = 0;
        }

        size = 0;

        return this;
    }

    public ObjectIntMultipleValuesMap clear(ObjectIntArrayHolderIF arrayHolder)
    {
        getData(arrayHolder);

        for (int bucketIndex = keys.length; --bucketIndex >= 0; )
        {
            keys[bucketIndex]       = null;
            values[bucketIndex]     = null;
            numberKeys[bucketIndex] = 0;
        }

        size = 0;

        return this;
    }
}

