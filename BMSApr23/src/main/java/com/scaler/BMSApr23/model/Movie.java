package com.scaler.BMSApr23.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Movie extends BaseModel {
    private String name;
    private String description;
    private int duration;
    private double rating;
    private Date releaseDate;
    @OneToMany
    private List<Show> shows;
    @ManyToMany
    private List<Actor> actors;
    @ElementCollection // M:M mapping with enums
    @Enumerated(EnumType.STRING) // table for Enum
    private List<Feature> movieFeatures;
    @ElementCollection // M:M mapping with enums
    @Enumerated(EnumType.STRING) // table for Enum
    private List<Language> languages;

}
/*
    Movie : Shows -> 1 : M
    Movie : Actors -> M : M
    Movie : Language -> M : M
    Movie : features -> M : M

 */