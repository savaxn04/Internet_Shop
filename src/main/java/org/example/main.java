package org.example;

import org.example.shop.order.Order;
import org.example.shop.order.OrderToHome;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.shop.person.userTypes.Customer;
import org.example.shop.person.userTypes.Seller;

public class main {
    private static final Logger logger = LogManager.getLogger(main.class);

    public static void main(String args[]){
        Customer firstUser = new Customer();
        Seller seller = new Seller("Dmytro", "Savchenko");
        logger.info(seller.toString());
        logger.trace("We've just greeted the user!");
        logger.debug("We've just greeted the user!");
        logger.info("We've just greeted the user!");
        logger.warn("We've just greeted the user!");
        logger.error("We've just greeted the user!");
        logger.fatal("We've just greeted the user!");
    }
}
