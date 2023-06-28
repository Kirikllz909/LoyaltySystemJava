package com.example.LoyaltySystem.ExceptionsHandlers;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.LoyaltySystem.Exceptions.PurchaseNotFoundException;

@ControllerAdvice
public class PurchaseNotFoundExceptionHandler {

    @ResponseBody
    @ExceptionHandler(PurchaseNotFoundException.class)
    public String purchaseNotFoundHandle(PurchaseNotFoundException purchaseNotFound) {
        return purchaseNotFound.getMessage();
    }
}
