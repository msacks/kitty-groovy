package org.apache.kitty.client

import javax.management.remote.JMXServiceURL;
import javax.management.remote.JMXConnectorFactory;


/**
 * <pre>
 * <b>Description</p>
 * <p>
 * This is a Groovy implementation of the JSR 160 for a remote client.
 * It is generic and will be the basis for the rmi and jmxmp implemenentations of the client.
 * This class is for development purposes only and will not be used in production.
 * </p>
 * </pre>
 * 
 * @author James R. Bray, Jr.
 * @version 1.0
 *
 */
class Client {
	
	def host
	def port
	def domain
	def mBeansPath
	def remote
	def connector
	
	public connect()
	{
		//TODO
	}
	
	public disconnect()
	{
		//TODO
	}

}
