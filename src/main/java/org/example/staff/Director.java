package org.example.staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Director {
    private final String name;
    private final String surname;

    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Director director)) return false;
        return name.equals(director.name) && surname.equals(director.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
