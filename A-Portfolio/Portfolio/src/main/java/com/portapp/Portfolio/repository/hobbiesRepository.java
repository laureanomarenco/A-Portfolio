package com.portapp.Portfolio.repository;

import com.portapp.Portfolio.model.hobbies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface hobbiesRepository extends JpaRepository<hobbies, Long> {
    
}
