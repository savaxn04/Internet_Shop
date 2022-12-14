package org.example.exceptions;

public class UserStorageIsNullException extends IllegalStateException {
    public UserStorageIsNullException(String errorMessage){
        super(errorMessage);
    }
}
