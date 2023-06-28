package com.example.LoyaltySystem.Controllers;

import com.example.LoyaltySystem.Models.User;
import com.example.LoyaltySystem.Repositories.UserRepository;
import com.example.LoyaltySystem.Exceptions.UserNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id)
            throws UserNotFoundException {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException());

    }

    @GetMapping("/users")
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public String addUser(@RequestBody User user) {
        try {
            user.setEmail(user.getEmail().toLowerCase());
            userRepository.save(user);
            return "User was successfully added";
        } catch (Exception e) {
            return "Unable to add user. " + user.getEmail() + " is already used";
        }
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable Integer id) {
        userRepository.deleteById(id);
        return "User was successfully deleted";
    }

    @PutMapping("/updateUser/{id}")
    public User patchUser(@PathVariable Integer id, @RequestBody User newUser) throws UserNotFoundException {
        return userRepository.findById(id).map(user -> {
            user.setFirstName(newUser.getFirstName());
            user.setLastName(newUser.getLastName());
            user.setEmail(newUser.getEmail());
            user.setPhone(newUser.getPhone());
            return userRepository.save(user);
        }).orElseThrow(() -> new UserNotFoundException());
    }

}
