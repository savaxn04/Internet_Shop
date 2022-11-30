package org.example.userTypes;

import org.example.Role;

import java.util.Objects;

public class Admin extends User {
    public void blockUser(User user){
        if(user.getRole() != Role.ADMIN){
            throw new IllegalArgumentException("It is impossible to change the administrator status ");
        }
        user.setStatus("Block");
    }

    public void unblockUser(User user){
        if(user.getRole() != Role.ADMIN){
            throw new IllegalArgumentException("It is impossible to change the administrator status ");
        }
        user.setStatus("Unblock");
    }

    public Admin() {
    }

    public Admin(String name, String surname, String status) {
        super(name, surname, status,Role.ADMIN);
    }
}
