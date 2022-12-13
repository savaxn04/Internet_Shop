package org.example;

import org.apache.log4j.PropertyConfigurator;
import org.example.products.Category;
import org.example.products.Product;
import org.example.staff.Consultant;
import org.example.staff.Department;
import org.example.staff.Manager;
import org.example.userTypes.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.LogManager;
import org.apache.log4j.Logger;

public class main {
    static Logger logger = Logger.getLogger(main.class.getName());
    public static void main(String args[])
    {
        PropertyConfigurator.configure("src/main/resources/log4j.properties");
        logger.error("ERROR");
        logger.warn("WARNING");
        logger.fatal("FATAL");
        logger.debug("DEBUG");
        logger.info("INFO");
        System.out.println("Final Output");
    }
}
