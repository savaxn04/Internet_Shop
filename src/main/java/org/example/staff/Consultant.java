package org.example.staff;

public class Consultant extends Employee {
    private String department;
    public Consultant() {
    }

    public Consultant(String name, String surname, String department) {
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
