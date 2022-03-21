package com.portapp.Portfolio.repository;

import com.portapp.Portfolio.model.person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personRepository extends JpaRepository <person, Long>{
    
}
