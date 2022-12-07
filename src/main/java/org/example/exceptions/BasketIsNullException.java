package org.example.exceptions;

public class BasketIsNullException extends Exception {
    public BasketIsNullException(String errorMessage){
        super(errorMessage);
    }
}
