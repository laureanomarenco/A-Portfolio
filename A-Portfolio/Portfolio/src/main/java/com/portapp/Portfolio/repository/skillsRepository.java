package com.portapp.Portfolio.repository;

import com.portapp.Portfolio.model.skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface skillsRepository extends JpaRepository <skills, Long> {
    
}
