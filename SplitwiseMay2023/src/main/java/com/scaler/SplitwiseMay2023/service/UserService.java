package com.scaler.SplitwiseMay2023.service;

import com.scaler.SplitwiseMay2023.dtos.UserLoginDTO;
import com.scaler.SplitwiseMay2023.dtos.UserRegisterRequestDTO;
import com.scaler.SplitwiseMay2023.model.User;
import com.scaler.SplitwiseMay2023.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User registerUser(UserRegisterRequestDTO userRegisterRequestDTO){
        User user = new User();
        user.setUsername(userRegisterRequestDTO.getName());
        user.setPhoneNumber(userRegisterRequestDTO.getPhoneNumber());
        user.setHashedPassword(passwordEncoder.getEncodedPassword(userRegisterRequestDTO.getPassword()));
        return userRepository.save(user);
    }

    public boolean loginUser(UserLoginDTO userLoginDTO){
        Optional<User> savedUser = userRepository.findByPhoneNumber(userLoginDTO.getPhoneNumber());
        if(savedUser.isEmpty()){
            return false;
        } else {
            return passwordEncoder.matches(savedUser.get().getHashedPassword(), userLoginDTO.getRealPassword());
        }
    }
}

/*
Hash function
For every different input, it will give different encrypted string
For every same input, it will give same string

For example
ABC -> hash -> 123
BCD -> hash -> 234
ABCD -> hash -> 1234
ABC -> hash -> 123

Encryption -> 2 way street -> real -> encrypted -> real
Hash -> 1 way street -> real -> hashed
 */

//Break -> 8:08 AM

