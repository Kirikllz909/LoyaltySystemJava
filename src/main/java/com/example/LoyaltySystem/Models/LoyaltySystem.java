package com.example.LoyaltySystem.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Table;

import java.util.Set;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "LoyaltySystem")
public class LoyaltySystem {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(orphanRemoval = true, fetch = FetchType.LAZY, mappedBy = "loyaltySystem")
    private Set<OptionsCriteria> criterias;

    @OneToMany(orphanRemoval = false, fetch = FetchType.LAZY, mappedBy = "loyaltySystem")
    private List<User> users;

}
