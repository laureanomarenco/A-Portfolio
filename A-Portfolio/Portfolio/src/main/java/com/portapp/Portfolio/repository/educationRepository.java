package com.portapp.Portfolio.repository;

import com.portapp.Portfolio.model.education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface educationRepository extends JpaRepository <education, Long> {
    
}
