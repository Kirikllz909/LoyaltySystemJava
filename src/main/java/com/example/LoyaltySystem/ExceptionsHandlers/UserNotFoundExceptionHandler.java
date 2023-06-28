package com.example.LoyaltySystem.ExceptionsHandlers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.LoyaltySystem.Exceptions.UserNotFoundException;

@ControllerAdvice
public class UserNotFoundExceptionHandler {

    @ResponseBody
    @ExceptionHandler(UserNotFoundException.class)
    public String userNotFoundHandle(UserNotFoundException error) {
        return error.getMessage();
    }
}
