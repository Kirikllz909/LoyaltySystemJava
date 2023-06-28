package com.example.LoyaltySystem.Exceptions;

public class PurchaseNotFoundException extends RuntimeException {
    public PurchaseNotFoundException() {
        super("Purchase not found");
    }
}
