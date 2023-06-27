package com.example.LoyaltySystem.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "OptionsCriteria")
public class OptionsCriteria {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "discountSumWeight")
    private double discountSumWeight = 0;

    @Column(name = "purchaseSumWeight")
    private double purchaseSumWeight = 0;

    @Column(name = "totalSumWeight")
    private double totalSumWeight = 0;

    @Column(name = "pointsIncreaseWeight")
    private double pointsIncreaseWeight = 0;

    @Column(name = "pointsDecreaseWeight")
    private double pointsDecreaseWeight = 0;

    @ManyToOne
    @JoinColumn(name = "systemLoyalId")
    private LoyaltySystem loyaltySystem;

    public void setDiscountSumWeight(double discountSumWeight) throws Exception {
        if (discountSumWeight < 0)
            throw new Exception("Value must be positive");
        this.discountSumWeight = discountSumWeight;
    }

    public void setPurchaseSumWeight(double purchaseSumWeight) throws Exception {
        if (purchaseSumWeight < 0)
            throw new Exception("Value must be positive");
        this.purchaseSumWeight = purchaseSumWeight;
    }

    public void setTotalSumWeight(double totalSumWeight) throws Exception {
        if (totalSumWeight < 0)
            throw new Exception("Value must be positive");
        this.totalSumWeight = totalSumWeight;
    }

    public void setPointsIncreaseWeight(double pointsIncreaseWeight) throws Exception {
        if (pointsIncreaseWeight < 0)
            throw new Exception("Value must be positive");
        this.pointsIncreaseWeight = pointsIncreaseWeight;
    }

    public void setPointsDecreaseWeight(double pointsDecreaseWeight) throws Exception {
        if (pointsDecreaseWeight < 0)
            throw new Exception("Value must be positive");
        this.pointsDecreaseWeight = pointsDecreaseWeight;
    }

    public double getDiscountSumWeight() {
        return this.discountSumWeight;
    }

    public double getPurchaseSumWeight() {
        return this.purchaseSumWeight;
    }

    public double getTotalSumWeight() {
        return this.totalSumWeight;
    }

    public double getPointsIncreaseWeight() {
        return this.pointsIncreaseWeight;
    }

    public double getPointsDecreaseWeight() {
        return this.pointsDecreaseWeight;
    }
}
