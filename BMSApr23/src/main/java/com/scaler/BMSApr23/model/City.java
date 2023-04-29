package com.scaler.BMSApr23.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class City extends BaseModel{
    private String name;
    @OneToMany
    private List<Theatre> theatres;

}

// City : Theatre -> 1:M