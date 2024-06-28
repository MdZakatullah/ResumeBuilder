package com.zak.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.zak.model.User;
import com.zak.service.EmailService;
import com.zak.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private EmailService emailService;

    @PostMapping("/forgot-password")
    public ResponseEntity<?> forgotPassword(@RequestParam String email) {
        User user = userService.findUserByEmail(email);

        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }

        // Generate a reset token and save it
        String token = UUID.randomUUID().toString();
        user.setResetToken(token);
        userService.save(user);

        // Send the reset token via email
        emailService.sendResetToken(email, token);

        return ResponseEntity.ok("Reset token sent to your email");
    }

    @GetMapping("/reset-password")
    public ModelAndView showResetPasswordForm(@RequestParam String token) {
        User user = userService.findUserByResetToken(token);

        if (user == null) {
            return new ModelAndView("error", HttpStatus.NOT_FOUND);
        }

        ModelAndView modelAndView = new ModelAndView("reset-password");
        modelAndView.addObject("token", token);
        return modelAndView;
    }

    @PostMapping("/reset-password")
    public ResponseEntity<?> resetPassword(@RequestParam String token, @RequestParam String password) {
        User user = userService.findUserByResetToken(token);

        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Invalid token");
        }

        // Reset the password
        user.setPassword(password);
        user.setResetToken(null);
        userService.save(user);

        return ResponseEntity.ok("Password successfully reset");
    }
}

