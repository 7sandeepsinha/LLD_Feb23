package com.scaler.SplitwiseMay2023.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegisterRequestDTO {
    private String name;
    private String phoneNumber;
    private String password;
}
