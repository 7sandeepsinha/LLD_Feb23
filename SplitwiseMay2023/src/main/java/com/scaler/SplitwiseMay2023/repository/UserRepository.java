package com.scaler.SplitwiseMay2023.repository;

import com.scaler.SplitwiseMay2023.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    User save(User user);
    Optional<User> findByPhoneNumber(String phoneNumber);
}
