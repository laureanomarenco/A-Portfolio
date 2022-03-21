package com.portapp.Portfolio.service;

import com.portapp.Portfolio.model.hobbies;
import com.portapp.Portfolio.repository.hobbiesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class hobbiesService implements IhobbiesService{

    @Autowired
    public hobbiesRepository hbRepo;
    
    @Override
    public List<hobbies> viewhobbies() {
        return hbRepo.findAll();
    }

    @Override
    public void createhobbies(hobbies hb) {
        hbRepo.save(hb);
    }

    @Override
    public void deletehobbies(Long idhb) {
        hbRepo.deleteById(idhb);
    }

    @Override
    public hobbies searchhobbies(Long idhb) {
        return hbRepo.findById(idhb).orElse(null);
    }
    
}
