package org.example.staff;

import java.util.Objects;

public class Manager extends Employee{
    private String department;

    public Manager() {
    }

    public Manager(String name, String surname, String department) {
        super(name, surname);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
