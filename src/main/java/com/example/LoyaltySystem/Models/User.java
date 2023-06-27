package com.example.LoyaltySystem.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @OneToOne(orphanRemoval = true)
    private UserLoginInformation userLoginInformation;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String firstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String lastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String email() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String phone() {
        return phone;
    }
}
