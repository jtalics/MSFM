package com.cboe.cfix.util;

/**
 * OverlayPolicyAlwaysOverlayMarketDataNbboStructList.java
 *
 * @author Dmitry Volpyansky
 *
 */

/**
 *
 * List of mdReqIDs/NBBOStructs, overlay by equality of NBBOStructs's productKey
 *
 */

import com.cboe.client.util.*;
import com.cboe.exceptions.*;
import com.cboe.idl.cmiMarketData.*;
import com.cboe.interfaces.cfix.*;

public class OverlayPolicyAlwaysOverlayMarketDataNbboStructList extends OverlayPolicyAlwaysOverlayMarketDataStructList implements OverlayPolicyMarketDataNbboStructListIF
{
    protected NBBOStruct[] structs  = CollectionHelper.EMPTY_NBBOStruct_ARRAY;

    public OverlayPolicyAlwaysOverlayMarketDataNbboStructList(String mdReqID)
    {
        super(mdReqID);
    }

    public OverlayPolicyAlwaysOverlayMarketDataNbboStructList(String mdReqID, int capacity)
    {
        super(mdReqID);

        this.structs = new NBBOStruct[capacity];
    }

    public void add(CfixMarketDataConsumer cfixMarketDataConsumer, NBBOStruct[] structs, int offset, int length) throws SystemException, CommunicationException, AuthorizationException, DataValidationException, NotFoundException
    {
        boolean    shouldAdd;
        NBBOStruct struct;
        NBBOStruct queuedStruct;
        int        queuedIndex;
        int        index;

        synchronized(this)
        {
            if (size == 0)
            {
                if (length > this.structs.length)
                {
                    this.structs = new NBBOStruct[length];
                }

                System.arraycopy(structs, offset, this.structs, 0, length);

                size += length;
            }
            else
            {
                for (index = offset; index < length; index++)
                {
                    struct = structs[index];

                    shouldAdd = true;

                    for (queuedIndex = 0; queuedIndex < size; queuedIndex++)
                    {
                        queuedStruct = this.structs[queuedIndex];

                        if (queuedStruct.productKeys.productKey == struct.productKeys.productKey)
                        {
                            this.structs[queuedIndex] = struct;
                            shouldAdd = false;
                            overlaid.set(queuedIndex);
                            break;
                        }
                    }

                    if (shouldAdd)
                    {
                        if (size == this.structs.length)
                        {
                            this.structs = CollectionHelper.arrayclone(this.structs, 0, size, this.structs.length << 1);
                        }

                        this.structs[size] = struct;

                        size++;
                    }
                }
            }
        }

        cfixMarketDataConsumer.acceptMarketDataNbbo(this);
    }

    public void add(CfixMarketDataConsumer cfixMarketDataConsumer, NBBOStruct struct) throws SystemException, CommunicationException, AuthorizationException, DataValidationException, NotFoundException
    {
        synchronized(this)
        {
            if (size == 0)
            {
                if (this.structs.length < 1)
                {
                    this.structs = new NBBOStruct[1];
                }

                this.structs[size] = struct;

                size++;
            }
            else
            {
                NBBOStruct queuedStruct;

                for (int queuedIndex = 0; queuedIndex < size; queuedIndex++)
                {
                    queuedStruct = this.structs[queuedIndex];

                    if (queuedStruct.productKeys.productKey == struct.productKeys.productKey)
                    {
                        this.structs[queuedIndex] = struct;
                        overlaid.set(queuedIndex);
                        return;
                    }
                }

                if (size == this.structs.length)
                {
                    this.structs = CollectionHelper.arrayclone(this.structs, 0, size, this.structs.length << 1);
                }

                this.structs[size] = struct;

                size++;
            }
        }

        cfixMarketDataConsumer.acceptMarketDataNbbo(this);
    }

    public void remove(OverlayPolicyMarketDataHolderIF cfixOverlayPolicyMarketDataHolder)
    {
        super.remove(cfixOverlayPolicyMarketDataHolder, CfixMarketDataDispatcherIF.MarketDataType_Nbbo);

        synchronized(this)
        {
            cfixOverlayPolicyMarketDataHolder.setSize(size);

            cfixOverlayPolicyMarketDataHolder.setOverlaid(overlaid);

            if (cfixOverlayPolicyMarketDataHolder.getNbboStructs().length < size)
            {
                cfixOverlayPolicyMarketDataHolder.setNbboStructs(new NBBOStruct[size]);
            }

            System.arraycopy(this.structs, 0, cfixOverlayPolicyMarketDataHolder.getNbboStructs(), 0, size);

            while (size-- > 0)
            {
                this.structs[size] = null;
            }

            size = 0;

            overlaid.clear();
        }
    }

    public void clear()
    {
        synchronized(this)
        {
            while (size-- > 0)
            {
                this.structs[size] = null;
            }

            size = 0;

            overlaid.clear();
        }
    }

    public int capacity()
    {
        return this.structs.length;
    }

    public boolean equals(Object other)
    {
        if (this == other)
        {
            return true;
        }

        if (!(other instanceof OverlayPolicyAlwaysOverlayMarketDataNbboStructList))
        {
            return false;
        }

        return mdReqID.compareTo(((OverlayPolicyAlwaysOverlayMarketDataNbboStructList) other).mdReqID) == 0;
    }
}