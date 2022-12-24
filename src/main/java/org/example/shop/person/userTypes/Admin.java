package org.example.shop.person.userTypes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.enums.Role;
import org.example.enums.UserStatus;
import org.example.exceptions.ChangeAdministratorStatusException;
import org.example.exceptions.UserAlreadyHasNotBlockedStatusException;
import org.example.exceptions.UserIsAlreadyBlockedException;
import org.example.main;

public class Admin extends User {
    private static final Logger logger = LogManager.getLogger(Admin.class);

    public void blockUser(User user) throws ChangeAdministratorStatusException, UserIsAlreadyBlockedException {
        if(user.getRole() != Role.ADMIN){
            logger.error("Admin can't change admin's role. Admin name and surname: " + user.getName() + user.getSurname());
            throw new ChangeAdministratorStatusException("It is impossible to change the administrator status ");
        }
        if(user.getStatus() != UserStatus.BLOCK){
            logger.error("Admin can't block user. User already has block status. User name and surname: " + user.getName() + user.getSurname());
            throw new UserIsAlreadyBlockedException("The user is already blocked");
        }
        user.setStatus(UserStatus.BLOCK);
        logger.info("User blocked: " + user.getName() + user.getSurname());
    }

    public void unblockUser(User user) throws ChangeAdministratorStatusException, UserAlreadyHasNotBlockedStatusException {
        if(user.getRole() != Role.ADMIN){
            logger.error("Admin can't unblock admin. Admin name and surname: " + user.getName() + user.getSurname());
            throw new ChangeAdministratorStatusException("It is impossible to change the administrator status ");
        }
        if(user.getStatus() != UserStatus.NORMAL){
            logger.error("Admin can't change user status. User already has normal status. User name and surname: " + user.getName() + user.getSurname());
            throw new UserAlreadyHasNotBlockedStatusException("The user already has the status not blocked");
        }
        user.setStatus(UserStatus.NORMAL);
        logger.info("User unblocked: " + user.getName() + user.getSurname());
    }

    public Admin() {
    }

    public Admin(String name, String surname) {
        super(name, surname, Role.ADMIN, UserStatus.NORMAL);
        logger.info("Admin created");
    }

    @Override
    public String toString() {
        return "Admin{" + super.toString() + "}";
    }
}
