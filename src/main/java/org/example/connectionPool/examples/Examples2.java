package org.example.connectionPool.examples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Examples2 extends Thread {
    private static final Logger LOGGER = LogManager.getLogger(Examples2.class);

    @Override
    public void run() {
        LOGGER.info("Thread");
    }
}
