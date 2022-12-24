package org.example.exceptions;

public class SellerDontHaveProductInSelletProductsException extends IllegalStateException {
    public SellerDontHaveProductInSelletProductsException(String errorMessage){
        super(errorMessage);
    }
}
