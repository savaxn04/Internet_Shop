package org.example.userTypes;

import org.example.enums.Role;
import org.example.exceptions.*;

public class Admin extends User {
    public void blockUser(User user) throws ChangeAdministratorStatusException {
        if(user.getRole() != Role.ADMIN){
            throw new ChangeAdministratorStatusException("It is impossible to change the administrator status ");
        }
        user.setStatus("Block");
    }

    public void unblockUser(User user) throws ChangeAdministratorStatusException {
        if(user.getRole() != Role.ADMIN){
            throw new ChangeAdministratorStatusException("It is impossible to change the administrator status ");
        }
        user.setStatus("Unblock");
    }

    public Admin() {
    }

    public Admin(String name, String surname) {
        super(name, surname,Role.ADMIN);
    }

    @Override
    public String toString() {
        return "Admin{" + super.toString() + "}";
    }
}
