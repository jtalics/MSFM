package com.cboe.client.util.collections;

/**
 * IntVisitorIF
 *
 * @author Dmitry Volpyansky
 *
 * FILE GENERATED BY VELOCITY TEMPLATE ENGINE FROM /vobs/dte/client/generator/DV_XYZVisitor.java (KEY_TYPE=int, VALUE_TYPE=)
 *
 */

public interface IntVisitorIF
{
    public static final int ABORT    = 0;
    public static final int CONTINUE = 1;
    public static final int SKIP     = 2;

    public int visit(int value);
}

