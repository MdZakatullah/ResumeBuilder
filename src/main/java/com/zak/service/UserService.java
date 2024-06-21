//package com.zak.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.zak.model.User;
//import com.zak.repository.UserRepositories;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepositories userRepository;
//
//    public User findUserByEmail(String email) {
//        return userRepository.findByEmail(email);
//    }
//
//    public User findUserByResetToken(String resetToken) {
//        return userRepository.findByResetToken(resetToken);
//    }
//
//    public void save(User user) {
//        userRepository.save(user);
//    }
//}
//
