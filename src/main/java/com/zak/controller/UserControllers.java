package com.zak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.zak.model.Users;
import com.zak.repository.UserRepo;

@RestController
@RequestMapping("/profile")
public class UserControllers {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/{email}")
    public Users getUserProfile(@PathVariable String email) {
        return userRepo.findByEmail(email);
    }
}
