package org.example.entity.person.userTypes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.enums.user.Role;
import org.example.enums.user.UserStatus;
import org.example.exceptions.ChangeAdministratorStatusException;
import org.example.exceptions.UserAlreadyHasNotBlockedStatusException;
import org.example.exceptions.UserIsAlreadyBlockedException;

public class Admin extends User {
    private static final Logger LOGGER = LogManager.getLogger(Admin.class);

    public void blockUser(User user) throws ChangeAdministratorStatusException, UserIsAlreadyBlockedException {
        if(user.getRole() != Role.ADMIN){
            LOGGER.error("Admin can't change admin's role. Admin name and surname: " + user.getName() + user.getSurname());
            throw new ChangeAdministratorStatusException("It is impossible to change the administrator status ");
        }
        if(user.getStatus() != UserStatus.BLOCK){
            LOGGER.error("Admin can't block user. User already has block status. User name and surname: " + user.getName() + user.getSurname());
            throw new UserIsAlreadyBlockedException("The user is already blocked");
        }
        user.setStatus(UserStatus.BLOCK);
        LOGGER.info("User blocked: " + user.getName() + user.getSurname());
    }

    public void unblockUser(User user) throws ChangeAdministratorStatusException, UserAlreadyHasNotBlockedStatusException {
        if(user.getRole() != Role.ADMIN){
            LOGGER.error("Admin can't unblock admin. Admin name and surname: " + user.getName() + user.getSurname());
            throw new ChangeAdministratorStatusException("It is impossible to change the administrator status ");
        }
        if(user.getStatus() != UserStatus.NORMAL){
            LOGGER.error("Admin can't change user status. User already has normal status. User name and surname: " + user.getName() + user.getSurname());
            throw new UserAlreadyHasNotBlockedStatusException("The user already has the status not blocked");
        }
        user.setStatus(UserStatus.NORMAL);
        LOGGER.info("User unblocked: " + user.getName() + user.getSurname());
    }

    public Admin() {
    }

    public Admin(String name, String surname) {
        super(name, surname, Role.ADMIN, UserStatus.NORMAL);
        LOGGER.info("Admin created");
    }

    @Override
    public String toString() {
        return "Admin{" + super.toString() + "}";
    }
}
