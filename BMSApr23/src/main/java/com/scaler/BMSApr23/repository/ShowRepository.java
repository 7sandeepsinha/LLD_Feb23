package com.scaler.BMSApr23.repository;

import com.scaler.BMSApr23.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShowRepository extends JpaRepository<Show,Long> {
    Optional<Show> findById(Long id);
}
