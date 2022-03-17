package com.portapp.Portfolio.service;

import com.portapp.Portfolio.model.person;
import com.portapp.Portfolio.model.skills;
import com.portapp.Portfolio.repository.skillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class skillsService implements IskillsService {
    
    @Autowired
    public skillsRepository skRepo;

    @Override
    public List<skills> viewskills() {
        return skRepo.findAll();
    }

    @Override
    public void createskills(skills sk) {
        skRepo.save(sk);
    }

    @Override
    public void deleteskills(Long idsk) {
        skRepo.deleteById(idsk);
    }

    @Override
    public skills searchskills(Long idsk) {
        return skRepo.findById(idsk).orElse(null);
    }
    
    
}
