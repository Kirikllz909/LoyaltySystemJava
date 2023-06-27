package com.example.LoyaltySystem.Classes;

public class PurchaseProcessResult {

    private double discountSum = 0, purchaseSum = 0, totalSum = 0, pointsIncrease = 0, pointsDecrease = 0;

    public void setDiscountSum(double discountSum) throws Exception {
        if (discountSum < 0)
            throw new Exception("Value must be positive");
        this.discountSum = discountSum;
    }

    public void setPurchaseSum(double purchaseSum) throws Exception {
        if (purchaseSum < 0)
            throw new Exception("Value must be positive");
        this.purchaseSum = purchaseSum;
    }

    public void setTotalSum(double totalSum) throws Exception {
        if (totalSum < 0)
            throw new Exception("Value must be positive");
        this.totalSum = totalSum;
    }

    public void setPointsIncrease(double pointsIncrease) throws Exception {
        if (pointsIncrease < 0)
            throw new Exception("Value must be positive");
        this.pointsIncrease = pointsIncrease;
    }

    public void setPointsDecrease(double pointsDecrease) throws Exception {
        if (pointsDecrease < 0)
            throw new Exception("Value must be positive");
        this.pointsDecrease = pointsDecrease;
    }

    public double getDiscountSum() {
        return this.discountSum;
    }

    public double getPurchaseSum() {
        return this.purchaseSum;
    }

    public double getTotalSum() {
        return this.totalSum;
    }

    public double getPointsIncrease() {
        return this.pointsIncrease;
    }

    public double getPointsDecrease() {
        return this.pointsDecrease;
    }

}
