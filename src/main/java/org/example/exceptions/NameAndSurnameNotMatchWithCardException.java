package org.example.exceptions;

import java.util.InputMismatchException;

public class NameAndSurnameNotMatchWithCardException extends InputMismatchException {
    public NameAndSurnameNotMatchWithCardException(String errorMessage){
        super(errorMessage);
    }
}
