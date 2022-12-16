package org.example.exceptions;

public class UserAlreadyHasNotBlockedStatusException extends RuntimeException {
    public UserAlreadyHasNotBlockedStatusException(String errorMessage){
        super(errorMessage);
    }
}
