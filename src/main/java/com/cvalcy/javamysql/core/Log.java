package com.cvalcy.javamysql.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

	private static final Logger LOGGER = LogManager.getLogger(Log.class);

	public static void debug(String msg) {
		LOGGER.debug(msg);
	}

	public static void info(String msg) {
		LOGGER.info(msg);
	}

	public static void warn(String msg) {
		LOGGER.warn(msg);
	}

	public static void error(String msg) {
		LOGGER.error(msg);
	}

	public static void error(String msg, int code) {
		String formatMsg = String.format("Msg: %s, Error code: %s", msg, code);
		LOGGER.error(formatMsg);
	}

}
