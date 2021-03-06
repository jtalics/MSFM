package com.cboe.net.util;

/**
 * This class was generated by a SmartGuide.
 * 
 */
public class Host {
/**
 * This method was created by a SmartGuide.
 * @return java.lang.String
 */
public static String getName() {
	String hostName;
	try
	{
		hostName = java.net.InetAddress.getLocalHost().getHostName();
	}
	catch(Exception e)
	{
		try
		{
			hostName = java.net.InetAddress.getLocalHost().getHostAddress();
		}
		catch(Exception e1)
		{
			hostName = "unknown";
		}
	}
	return hostName;
}
/**
 * This method was created by a SmartGuide.
 * @return java.lang.String
 * @param socket java.net.Socket
 */
public static String getName(java.net.Socket socket) {
	String hostName;
	try
	{
		hostName = socket.getInetAddress().getHostName();
	}
	catch(Exception e)
	{
		try
		{
			hostName = socket.getInetAddress().getHostAddress();
		}
		catch(Exception e1)
		{
			hostName = "unknown";
		}
	}
	return hostName;
}
}
