package com.scaler.SplitwiseMay2023.service;

public interface PasswordEncoder {
    String getEncodedPassword(String realPassword);
    boolean matches(String realPassword, String hashedPassword);
}
