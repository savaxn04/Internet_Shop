package org.example.staff;

import java.util.Objects;

public class Consultant {
    private final String name;
    private final String surname;
    private final String department;

    public Consultant(String name, String surname, String department) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Consultant that)) return false;
        return name.equals(that.name) && surname.equals(that.surname) && department.equals(that.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, department);
    }

    @Override
    public String toString() {
        return "Consultant{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
