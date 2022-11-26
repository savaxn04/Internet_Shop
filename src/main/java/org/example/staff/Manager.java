package org.example.staff;

import java.util.Objects;

public class Manager {
    private String name;
    private String surname;
    private int age;
    private String department;

    public Manager(String name, String surname, int age, String department) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return age == manager.age && name.equals(manager.name) && surname.equals(manager.surname) && department.equals(manager.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, department);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "Mame='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", Age=" + age +
                ", Department='" + department + '\'' +
                '}';
    }
}
