package org.example.userTypes;

import org.example.Role;

import java.util.Objects;

abstract class User {
    private String name;
    private String surname;
    private Role role;
    private String status;

    public User() {
    }

    public User(String name, String surname, Role role) {
        this.name = name;
        this.surname = surname;
        this.status = "User";
        this.role = role;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", role=" + role +
                ", status='" + status + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return name.equals(user.name) && surname.equals(user.surname) && role == user.role && status.equals(user.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, role, status);
    }
}
