/*
 * Created on Aug 1, 2003
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.cboe.lwt.stateMachine;


/**
 * @author dotyl
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class TestState2a extends TestState
{
    public static final String typeName = "state2a";

    public TestState2a()
    {
        super( typeName );
    }

    /* (non-Javadoc)
     * @see com.cboe.lwt.stateMachine.TestEventSink#a_EVENT()
     */
    public void a_EVENT()
    {
        stateMachine.transition( this, new TestState2b() );
    }

}