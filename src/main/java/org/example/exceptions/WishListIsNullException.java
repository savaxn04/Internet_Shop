package org.example.exceptions;

public class WishListIsNullException extends Exception{
    public WishListIsNullException(String errorMessage){
        super(errorMessage);
    }
}
