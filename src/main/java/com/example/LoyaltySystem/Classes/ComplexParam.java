package com.example.LoyaltySystem.Classes;

public class ComplexParam<T extends Comparable<T>> {
    private T firstValue;
    private T secondValue;

    public void setParam(T firstValue, T secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public boolean isValueInBetween(T value) {
        if ((value.compareTo(firstValue) > 0) && (value.compareTo(secondValue) < 0))
            return true;
        return false;
    }
}
