package com.zak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.zak.model.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
