package com.example.LoyaltySystem.Repositories;

import com.example.LoyaltySystem.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
