package com.example.LoyaltySystem.Models;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
@Table(name = "UserLoginInformation")
public class UserLoginInformation {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private User user;

    public void setLogin(String login) {
        this.login = login;
    }

    public String login() {
        return this.login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String password() {
        return this.password;
    }

}
