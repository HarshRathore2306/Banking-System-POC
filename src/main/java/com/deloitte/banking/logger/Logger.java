package com.deloitte.banking.logger;

import org.slf4j.LoggerFactory;

public class Logger {
	public static org.slf4j.Logger getlogger(Class classname) {
		return LoggerFactory.getLogger(classname);
	}

}
