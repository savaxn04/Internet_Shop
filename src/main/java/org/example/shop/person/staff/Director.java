package org.example.shop.person.staff;

import org.example.shop.person.Person;

public class Director extends Person {

    public Department createDepartment(String name){
        return new Department(name);
    }

    public Director() {
    }

    public Director(String name, String surname) {
        super(name, surname);
    }
}
