package org.example;

import org.example.shop.order.Order;
import org.example.shop.order.OrderToHome;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class main {
    private static final Logger logger = LogManager.getLogger(main.class);

    public static void main(String args[]){
        logger.trace("We've just greeted the user!");
        logger.debug("We've just greeted the user!");
        logger.info("We've just greeted the user!");
        logger.warn("We've just greeted the user!");
        logger.error("We've just greeted the user!");
        logger.fatal("We've just greeted the user!");
    }
}
