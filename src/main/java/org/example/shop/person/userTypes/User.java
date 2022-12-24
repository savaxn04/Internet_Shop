package org.example.shop.person.userTypes;

import org.example.enums.user.Role;
import org.example.enums.user.UserStatus;
import org.example.shop.person.Person;

import java.util.Objects;

public abstract class User extends Person {
    private Role role;
    private UserStatus status;

    public User() {
    }

    public User(String name, String surname, Role role, UserStatus status) {
        super(name, surname);
        this.role = role;
        this.status = UserStatus.NORMAL;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return role == user.role && status.equals(user.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, status);
    }

    @Override
    public String toString() {
        return "User{" + super.toString() +
                "role=" + role +
                ", status='" + status + '\'' +
                '}';
    }
}
