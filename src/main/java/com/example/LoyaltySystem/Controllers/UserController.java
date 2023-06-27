package com.example.LoyaltySystem.Controllers;

import com.example.LoyaltySystem.Models.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {

    @GetMapping("/user")
    public String getUser(@RequestParam(value = "id", defaultValue = "1") int id) {
        return "It' working";
    }

    @PutMapping("/addUser")
    @PostMapping("/addUser")
    public void addUser(@RequestBody User user) {
    }

    @DeleteMapping("/deleteUser")
    @PostMapping("/deleteUser")
    public void deleteUser(@RequestParam(value = "id") int id) {

    }

    @PatchMapping("/patchUser")
    @PostMapping("/patchUser")
    public void patchUser(@RequestParam(value = "id") int id) {

    }

}
