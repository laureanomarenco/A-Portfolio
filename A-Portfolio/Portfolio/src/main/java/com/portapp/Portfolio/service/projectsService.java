package com.portapp.Portfolio.service;

import com.portapp.Portfolio.model.projects;
import com.portapp.Portfolio.repository.projectsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class projectsService implements IprojectsService {

    @Autowired
    public projectsRepository prRepo;
    
    @Override
    public List<projects> viewprojects() {
        return prRepo.findAll();
    }

    @Override
    public void createprojects(projects pr) {
        prRepo.save(pr);
    }

    @Override
    public void deleteprojects(Long idpr) {
        prRepo.deleteById(idpr);
    }

    @Override
    public projects searchprojects(Long idpr) {
        return prRepo.findById(idpr).orElse(null);
    }
}
