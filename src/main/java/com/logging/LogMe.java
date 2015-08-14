package com.logging;

import org.apache.log4j.Logger;

public class LogMe {

	public static void main(String[]	args) {
		
		Logger logger = Logger.getLogger(LogMe.class);
		
		logger.fatal("fatal message- 6");
		logger.error("error message -5");
		logger.warn("warn message -4");
		logger.info("info message - 3");
		logger.debug("debug message - 2");
		logger.trace("trace message -1");
		
	}

}
