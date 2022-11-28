package org.example.staff;

import java.util.Objects;

public class Manager {
    private final String name;
    private final String surname;
    private String department;

    public Manager(String name, String surname, String department) {
        this.name = name;
        this.surname = surname;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager manager)) return false;
        return name.equals(manager.name) && surname.equals(manager.surname) && department.equals(manager.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, department);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
