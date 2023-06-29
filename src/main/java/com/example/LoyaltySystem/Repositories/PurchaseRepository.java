package com.example.LoyaltySystem.Repositories;

import com.example.LoyaltySystem.Models.Purchase;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<Purchase, Integer> {
    List<Purchase> findPurchasesByUserId(Integer userId);
}