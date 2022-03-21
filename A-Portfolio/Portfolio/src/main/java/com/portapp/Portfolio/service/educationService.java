package com.portapp.Portfolio.service;

import com.portapp.Portfolio.model.education;
import com.portapp.Portfolio.repository.educationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class educationService implements IeducationService {
    
    @Autowired
    public educationRepository educationRepo;
    
    @Override
    public List<education> vieweducation() {
        
        return educationRepo.findAll();
        
    }

    @Override
    public void createeducation (education ed) {
        
        educationRepo.save(ed);
        
    }
    
    @Override
        public void deleteeducation (Long ided) {
        educationRepo.deleteById(ided);
    }
    @Override
    public education searcheducation (Long ided) {
        return educationRepo.findById(ided).orElse(null);
    }
}
