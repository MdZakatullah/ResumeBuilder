package com.zak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zak.model.Users;

public interface UserRepo extends JpaRepository<Users, Long> {
    Users findByEmail(String email);
}
