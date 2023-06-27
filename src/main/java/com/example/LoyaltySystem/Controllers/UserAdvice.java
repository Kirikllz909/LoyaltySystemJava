package com.example.LoyaltySystem.Controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

class UserNotFoundException extends RuntimeException {
    UserNotFoundException() {
        super("User not found");
    }
}

@ControllerAdvice
public class UserAdvice {

    @ResponseBody
    @ExceptionHandler(UserNotFoundException.class)
    public String userNotFoundHandler(UserNotFoundException error) {
        return error.getMessage();
    }
}
