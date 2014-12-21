package com.cboe.infrastructureServices.instrumentationService;


/**
 * A extremely light weight instrumentor. This has no behavior.
 * Used by BOInterceptor to turn of instrumentation.
 * @see com.cboe.infrastructureServices.foundationFramework.BOInterceptor
 * @author Dave Hoag
 */
public class LightWeightInstrumentor implements Instrumentor
{

        public void setMethodSignature(String signature){}
        public String getMethodSignature(){ return null;}

        public void sendMethodEvent(int direction, long entityID){}

        public void sendQueueEvent(int direction, long queueID, int queueSize,long entityID){}

	public String getName()
	{
		return "LightWeight";
	}
	/**
	 */
	public CommPath getCommPath()
	{
		return null;
	}

	/**
	 * @roseuid 365B8F070216
	 */
	public void incBlocksIgnored(int increment)
	{
	}
	/**
	 * @roseuid 365B8F180008
	 */
	public void incBlocksLost(int increment)
	{
	}
	/**
	 * @roseuid 365B8F4C0161
	 */
	public void incBlocksReceived(int increment)
	{
	}
	/**
	 * @roseuid 365B8F6D0245
	 */
	public void incBlocksSent(int increment)
	{
	}
	/**
	 * @roseuid 365B8F7B001E
	 */
	public void incBytesIgnored(int increment)
	{
	}
	/**
	 * @roseuid 365B8F8800A9
	 */
	public void incBytesLost(int increment)
	{
	}
	/**
	 * @roseuid 365B8F95018E
	 */
	public void incBytesReceived(int increment)
	{
	}
	/**
	 * @roseuid 365B8F9F0369
	 */
	public void incBytesSent(int increment)
	{
	}
	/**
	 * @roseuid 365B8FAC0173
	 */
	public void incIgnoredInfo(int msgsInc, int blocksInc, int bytesInc )
	{
	}
	/**
	 * @roseuid 365B8FB503E3
	 */
	public void incLostInfo(int msgsInc, int blocksInc, int bytesInc )
	{
	}
	/**
	 * @roseuid 365B8FC102BE
	 */
	public void incMsgsIgnored(int increment)
	{
	}
	/**
	 * @roseuid 365B8FCB038B
	 */
	public void incMsgsLost(int increment)
	{
	}
	/**
	 * @roseuid 365B8FD4012B
	 */
	public void incMsgsReceived(int increment)
	{
	}
	/**
	 * @roseuid 365B8FDD0228
	 */
	public void incMsgsSent(int increment)
	{
	}
	/**
	 * @roseuid 365B8FFF0335
	 */
	public void incReceivedInfo(int msgsInc, int blocksInc, int bytesInc)
	{
	}
	/**
	 * @roseuid 365B900A0038
	 */
	public void incSentInfo(int msgsInc, int blocksInc, int bytesInc)
	{
	}
	/**
	 * @roseuid 365B901A0027
	 */
	public void incTranTimeMills(int increment)
	{
	}
	/**
	 */
	public void incError(final Exception e)
	{
	}

}
