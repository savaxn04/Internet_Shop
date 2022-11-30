package org.example;

public class UserIsBlockException extends Exception{
    public UserIsBlockException(String errorMessage){
        super(errorMessage);
    }
}
