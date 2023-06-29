package com.example.LoyaltySystem.Exceptions;

public class NegativeValueException extends RuntimeException {

    public NegativeValueException(String nameOfNegativeField) {
        super(nameOfNegativeField + " is negative");
    }
}
