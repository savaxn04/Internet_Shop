package org.example.staff;

import java.util.Objects;

public class Consultant {
    private String name;
    private String surname;
    private int age;
    private String department;

    public Consultant(String name, String surname, int age, String department, String name1, String surname1, int age1, String department1) {
        this.name = name1;
        this.surname = surname1;
        this.age = age1;
        this.department = department1;
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
        Consultant that = (Consultant) o;
        return age == that.age && name.equals(that.name) && surname.equals(that.surname) && department.equals(that.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, department);
    }

    @Override
    public String toString() {
        return "Consultant{" +
                "Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", Age=" + age +
                ", Department='" + department + '\'' +
                '}';
    }
}
