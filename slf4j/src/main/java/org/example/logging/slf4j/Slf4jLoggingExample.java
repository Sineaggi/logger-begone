package org.example.logging.slf4j;

import org.example.logging.LoggingExample;
import org.slf4j.bridge.SLF4JBridgeHandler;

import java.util.logging.LogManager;

public class Slf4jLoggingExample {
    public static void main(String[] args) {
        LogManager.getLogManager().reset();
        SLF4JBridgeHandler.install();
        LoggingExample.log();
    }
}
