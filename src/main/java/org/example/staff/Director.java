package org.example.staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Director extends Employee {

    public Department createDepartment(String name){
        return new Department(name);
    }

    public Director() {
    }

    public Director(String name, String surname) {
        super(name, surname);
    }
}
