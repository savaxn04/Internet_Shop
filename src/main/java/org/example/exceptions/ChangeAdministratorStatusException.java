package org.example.exceptions;

public class ChangeAdministratorStatusException extends Exception{
    public ChangeAdministratorStatusException(String errorMessage){
        super(errorMessage);
    }
}
