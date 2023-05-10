package com.scaler.SplitwiseMay2023.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptEncoder implements PasswordEncoder{

    private BCryptPasswordEncoder springBCrpytEncoder = new BCryptPasswordEncoder();

    @Override
    public String getEncodedPassword(String realPassword) {
        return springBCrpytEncoder.encode(realPassword);
    }

    @Override
    public boolean matches(String realPassword, String hashedPassword) {
        return springBCrpytEncoder.matches(realPassword, hashedPassword);
    }
}
