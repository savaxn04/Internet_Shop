package org.example.exceptions;

public class NotEnoughMoneyOnCardException extends RuntimeException{
    public NotEnoughMoneyOnCardException(String errorMessage){
        super(errorMessage);
    }
}
