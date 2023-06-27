package com.example.LoyaltySystem.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Set;

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

    @OneToMany(orphanRemoval = true)
    private Set<OptionsCriteria> criterias;

}
