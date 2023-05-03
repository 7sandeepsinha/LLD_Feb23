package com.scaler.BMSApr23.repository;

import com.scaler.BMSApr23.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository<City,Long> {
    City save(City city); // save and update
    Optional<City> findById(Long id); // select * from city where id = :id;
    List<City> findAllByName(String name); //select * from city where name = :name
}
