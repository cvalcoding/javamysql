package com.cvalcy.javamysql.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

	private static final Logger LOGGER = LogManager.getLogger(Log.class);

	public static void debug() {
		LOGGER.debug("Debug");
	}

	public static void info() {
		LOGGER.info("Info");
	}

	public static void warn() {
		LOGGER.warn("Warn");
	}

	public static void error() {
		LOGGER.error("Error");
	}

}
