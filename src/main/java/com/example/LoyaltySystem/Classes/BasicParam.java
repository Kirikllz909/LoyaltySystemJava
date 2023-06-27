package com.example.LoyaltySystem.Classes;

public class BasicParam {
    private double coefficient = 0;

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public double calculateChange(double purchaseSum) {
        return coefficient * purchaseSum;
    }
}
