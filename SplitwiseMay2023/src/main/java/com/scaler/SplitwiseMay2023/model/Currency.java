package com.scaler.SplitwiseMay2023.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Currency extends BaseModel {
    private String name;
}
