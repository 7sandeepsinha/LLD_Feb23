package com.scaler.BMSApr23.controller;

import com.scaler.BMSApr23.model.City;
import com.scaler.BMSApr23.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CityController {
    private CityService cityService;

    @Autowired // dependency injection
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    public City addCity(String name){
        return cityService.addCity(name);
    }
}
