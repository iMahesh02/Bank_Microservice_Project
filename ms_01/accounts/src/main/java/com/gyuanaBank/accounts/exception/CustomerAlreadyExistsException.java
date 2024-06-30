package com.gyuanaBank.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CustomerAlreadyExistsException extends RuntimeException {


    public CustomerAlreadyExistsException(String message) {
        /* invoking the constructor of parent class */
        super(message);
    }
}
