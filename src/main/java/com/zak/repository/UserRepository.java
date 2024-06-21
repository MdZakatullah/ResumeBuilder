package com.zak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zak.model.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer>{

}
