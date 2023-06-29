package com.example.LoyaltySystem.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import com.example.LoyaltySystem.Exceptions.NegativeValueException;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;

@Entity
@Table(name = "Purchases")
public class Purchase {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "purchaseSum")
    private double purchaseSum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    public Integer getId() {
        return this.id;
    }

    public void setPurchaseSum(double purchaseSum) throws NegativeValueException {
        if (purchaseSum < 0)
            throw new NegativeValueException("Purchase sum");
        this.purchaseSum = purchaseSum;
    }

    public double getPurchaseSum() {
        return this.purchaseSum;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }
}
