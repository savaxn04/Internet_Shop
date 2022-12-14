package org.example.exceptions;

public class ChangeAdministratorStatusException extends IllegalAccessException {
    public ChangeAdministratorStatusException(String errorMessage){
        super(errorMessage);
    }
}
