package org.example.exceptions;

public class UserBlockException extends RuntimeException {
    public UserBlockException(String errorMessage){
        super(errorMessage);
    }
}
