package org.example.connectionPool.examples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Examples1  implements Runnable{
    private static final Logger LOGGER = LogManager.getLogger(Examples1.class);
    @Override
    public void run(){
        LOGGER.info("Runnable");
    }
}

