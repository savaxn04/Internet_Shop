package org.example.exceptions;

public class UserIsBlockException extends Exception{
    public UserIsBlockException(String errorMessage){
        super(errorMessage);
    }
}
