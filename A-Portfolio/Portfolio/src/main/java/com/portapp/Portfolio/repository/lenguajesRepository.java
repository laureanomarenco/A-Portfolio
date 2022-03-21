package com.portapp.Portfolio.repository;

import com.portapp.Portfolio.model.lenguajes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface lenguajesRepository extends JpaRepository <lenguajes, Long> {
    
}
