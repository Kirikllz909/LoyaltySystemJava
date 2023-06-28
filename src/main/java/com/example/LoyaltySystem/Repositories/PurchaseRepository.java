package com.example.LoyaltySystem.Repositories;

import com.example.LoyaltySystem.Models.Purchase;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<Purchase, Integer> {

}