package org.example.logging.log4j2;

import org.example.logging.LoggingExample;

public class Log4j2LoggingExample {
    public static void main(String[] args) {
        System.setProperty("java.util.logging.manager", "org.apache.logging.log4j.jul.LogManager");
        LoggingExample.log();
    }
}
