package com.example.LoyaltySystem.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "Purchases")
public class Purchase {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "purchaseSum")
    private double purchaseSum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public void setPurchaseSum(double purchaseSum) throws Exception {
        if (purchaseSum < 0)
            throw new Exception("Sum of purchase should be positive");
        this.purchaseSum = purchaseSum;
    }

    public double purchaseSum() {
        return this.purchaseSum;
    }

}
