package org.example.logging;

import java.util.logging.Logger;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.LogManager;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    public static void log() {
        System.out.println("no logging");
        LoggerFactory.getLogger(LoggingExample.class).info("logging from slf4j");
        Logger.getLogger(LoggingExample.class.getName()).info("logging from jul");
        LogFactory.getLog(LoggingExample.class).info("logging from jcl");
        org.apache.log4j.Logger.getLogger(LoggingExample.class).info("logging from log4j");
        LogManager.getLogger(LoggingExample.class).info("logging from log4j2");
        System.getLogger(LoggingExample.class.getName()).log(System.Logger.Level.INFO, "logging from jdk platform");
    }
}
