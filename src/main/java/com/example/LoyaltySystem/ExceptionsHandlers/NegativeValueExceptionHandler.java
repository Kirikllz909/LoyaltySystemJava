package com.example.LoyaltySystem.ExceptionsHandlers;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.LoyaltySystem.Exceptions.NegativeValueException;

@ControllerAdvice
public class NegativeValueExceptionHandler {
    @ExceptionHandler(NegativeValueException.class)
    public @ResponseBody String negativeValueExceptionHandler(NegativeValueException error) {
        return error.getMessage();
    }
}
