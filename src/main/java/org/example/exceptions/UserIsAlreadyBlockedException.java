package org.example.exceptions;

public class UserIsAlreadyBlockedException extends IllegalAccessException {
    public UserIsAlreadyBlockedException(String errorMessage){
        super(errorMessage);
    }
}
