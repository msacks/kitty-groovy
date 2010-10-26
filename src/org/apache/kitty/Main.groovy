package org.apache.kitty

/**
* <pre>
* <b>Description</b>
* <p>
* This is the entry point to the remote management framework.
* </p>
* </pre>
*
* @author James R. Bray, Jr.
*
*/
class Main {
	
	def config
	
	public init()
	{
		config = new ConfigSlurper().parse(new File('kittyConfig.groovy')).toString()
		//TODO
	}

}
