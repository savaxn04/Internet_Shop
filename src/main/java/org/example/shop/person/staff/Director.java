package org.example.shop.person.staff;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.main;
import org.example.shop.person.Person;

public class Director extends Person {
    private static final Logger LOGGER = LogManager.getLogger(Director.class);

    public Department createDepartment(String name){
        LOGGER.info("Department created");
        return new Department(name);
    }

    public Director() {
    }

    public Director(String name, String surname) {
        super(name, surname);
    }
}
