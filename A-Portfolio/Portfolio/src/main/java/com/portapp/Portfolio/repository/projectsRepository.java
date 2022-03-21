package com.portapp.Portfolio.repository;

import com.portapp.Portfolio.model.projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface projectsRepository extends JpaRepository <projects, Long>{
    
}
