package com.portapp.Portfolio.repository;

import com.portapp.Portfolio.model.experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface experienceRepository extends JpaRepository <experience, Long> {
    
}
