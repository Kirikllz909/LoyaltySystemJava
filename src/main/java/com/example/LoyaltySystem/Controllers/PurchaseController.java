package com.example.LoyaltySystem.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.LoyaltySystem.Repositories.PurchaseRepository;
import com.example.LoyaltySystem.Repositories.UserRepository;
import com.example.LoyaltySystem.Exceptions.PurchaseNotFoundException;
import com.example.LoyaltySystem.Exceptions.UserNotFoundException;

import com.example.LoyaltySystem.Models.Purchase;
import com.example.LoyaltySystem.Models.User;

@RestController
public class PurchaseController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PurchaseRepository purchaseRepository;

    @GetMapping("/purchase/{id}")
    public Purchase getPurchase(@PathVariable Integer id) throws PurchaseNotFoundException {
        return purchaseRepository.findById(id).orElseThrow(() -> new PurchaseNotFoundException());
    }

    @DeleteMapping("/deletePurchase/{id}")
    public String deletePurchase(@PathVariable Integer id) throws PurchaseNotFoundException {
        purchaseRepository.deleteById(id);
        return "Purchase was successfully deleted";
    }

    @GetMapping("/user/{userId}/purchases")
    public Iterable<Purchase> getPurchases(@PathVariable Integer userId) {
        return purchaseRepository.findPurchasesByUserId(userId);
    }

    @PostMapping("/user/{userId}/purchase")
    public Purchase addPurchaseToUser(@PathVariable Integer userId, @RequestBody Purchase newPurchase)
            throws UserNotFoundException {
        Purchase createdPurchase = userRepository.findById(userId).map(user -> {
            int purchaseId = newPurchase.getId();
            if (purchaseId != 0) {
                Purchase purchase = purchaseRepository.findById(purchaseId)
                        .orElseThrow(() -> new PurchaseNotFoundException());
                purchase.setUser(user);
                purchase.setPurchaseSum(newPurchase.getPurchaseSum());
                purchaseRepository.save(purchase);
                return purchase;
            }

            newPurchase.setUser(user);
            return purchaseRepository.save(newPurchase);
        }).orElseThrow(() -> new UserNotFoundException());
        return createdPurchase;
    }

    @DeleteMapping("user/{id}")
    public String removeUserPurchases(@PathVariable Integer id) {
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException());
        for (Purchase p : user.getPurchases()) {
            purchaseRepository.deleteById(p.getId());
        }
        return "Purchases was successfully deleted";
    }
}
