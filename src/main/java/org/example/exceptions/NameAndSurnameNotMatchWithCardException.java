package org.example.exceptions;

public class NameAndSurnameNotMatchWithCardException extends Exception{
    public NameAndSurnameNotMatchWithCardException(String errorMessage){
        super(errorMessage);
    }
}
