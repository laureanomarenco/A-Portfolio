package com.portapp.Portfolio.service;

import com.portapp.Portfolio.model.experience;
import com.portapp.Portfolio.repository.experienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class experienceService implements IexperienceService {

    @Autowired
    public experienceRepository expRepo;

    @Override
    public List<experience> viewexperience() {
        return expRepo.findAll();
    }

    @Override
    public void createexperience(experience exp) {
        expRepo.save(exp);
    }

    @Override
    public void deleteexperience(Long idexp) {
        expRepo.deleteById(idexp);
    }

    @Override
    public experience searchexperience(Long idexp) {
        return expRepo.findById(idexp).orElse(null);
    }
    
    
    
}
