package org.example.shop.person.userTypes;

import org.example.enums.Role;
import org.example.enums.UserStatus;
import org.example.exceptions.ChangeAdministratorStatusException;
import org.example.exceptions.UserAlreadyHasNotBlockedStatusException;
import org.example.exceptions.UserIsAlreadyBlockedException;

public class Admin extends User {

    public void blockUser(User user) throws ChangeAdministratorStatusException, UserIsAlreadyBlockedException {
        if(user.getRole() != Role.ADMIN){
            throw new ChangeAdministratorStatusException("It is impossible to change the administrator status ");
        }
        if(user.getStatus() != UserStatus.BLOCK){
            throw new UserIsAlreadyBlockedException("The user is already blocked");
        }
        user.setStatus(UserStatus.BLOCK);
    }

    public void unblockUser(User user) throws ChangeAdministratorStatusException, UserAlreadyHasNotBlockedStatusException {
        if(user.getRole() != Role.ADMIN){
            throw new ChangeAdministratorStatusException("It is impossible to change the administrator status ");
        }
        if(user.getStatus() != UserStatus.NORMAL){
            throw new UserAlreadyHasNotBlockedStatusException("The user already has the status not blocked");
        }
        user.setStatus(UserStatus.NORMAL);
    }

    public Admin() {
    }

    public Admin(String name, String surname, Role role, UserStatus status) {
        super(name, surname, role, status);
    }

    @Override
    public String toString() {
        return "Admin{" + super.toString() + "}";
    }
}
