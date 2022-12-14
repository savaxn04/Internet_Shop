package org.example.shop.person.userTypes;

import org.example.enums.Role;
import org.example.exceptions.ChangeAdministratorStatusException;

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

    public Admin(String name, String surname, Role role, String status) {
        super(name, surname, role, status);
    }

    @Override
    public String toString() {
        return "Admin{" + super.toString() + "}";
    }
}
