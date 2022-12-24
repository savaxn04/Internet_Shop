package org.example;

import org.example.shop.order.Order;
import org.example.shop.order.OrderToHome;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.shop.person.userTypes.Customer;
import org.example.shop.person.userTypes.Seller;

public class main {
    private static final Logger LOGGER = LogManager.getLogger(main.class);

    public static void main(String args[]){
        Customer firstUser = new Customer();
        Seller seller = new Seller("Dmytro", "Savchenko");
        LOGGER.info(seller.toString());
        LOGGER.trace("We've just greeted the user!");
        LOGGER.debug("We've just greeted the user!");
        LOGGER.info("We've just greeted the user!");
        LOGGER.warn("We've just greeted the user!");
        LOGGER.error("We've just greeted the user!");
        LOGGER.fatal("We've just greeted the user!");
    }
}
