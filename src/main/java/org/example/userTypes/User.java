package org.example.userTypes;

import org.example.Role;

abstract class User {
    private String name;
    private String surname;
    private Role role;
    private String status;

    public User() {
    }

    public User(String name, String surname, String status, Role role) {
        this.name = name;
        this.surname = surname;
        this.status = status;
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
}
