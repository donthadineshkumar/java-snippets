package com.logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class SimpleLog4jExWithoutLog4jFile {

	
	//rem: it does not have LoggerFactory - it has only Logger 
	static final Logger  logger = Logger.getLogger("MyLog4jBasicLogger");
	
	public static void main(String[] args) {
		
		//this does not need the log4j.properties
		
		//BasicConfigurator.configure();
		
		// Another way of configuring the log4j without log4j.xml / log4j.properties
		// you can take any layout you need - XML HTML SIMPLE
		//SimpleLayout layout = new SimpleLayout();
		
		//HTMLLayout layout = new HTMLLayout();
		
		XMLLayout layout = new XMLLayout();
		
		
		
		ConsoleAppender appender = new ConsoleAppender(layout);
		
		logger.addAppender(appender);
		
		logger.setLevel(Level.DEBUG);		
		
		logger.debug("This is basic configurator debug message with slf4j & log4j xml file");
		
		
	}
	
}
