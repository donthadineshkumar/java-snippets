package com.logging;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;

public class Slf4j {

	public static void main(String[] args) {
		//dont need this
	//	org.apache.log4j.Logger.getRootLogger().addAppender(new ConsoleAppender());
		
		//must need log4j.properties or log4j.xml file 
		org.slf4j.Logger logger =  org.slf4j.LoggerFactory.getLogger(Slf4j.class);
		
		logger.info("Hello World");
		
	}
	
}
