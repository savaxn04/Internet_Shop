package org.example.exceptions;

import org.apache.logging.log4j.core.tools.picocli.CommandLine;

import java.util.InputMismatchException;

public class NameAndSurnameNotMatchWithCardException extends InputMismatchException {
    public NameAndSurnameNotMatchWithCardException(String errorMessage){
        super(errorMessage);
    }
}
