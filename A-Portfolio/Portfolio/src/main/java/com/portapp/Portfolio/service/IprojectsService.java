package com.portapp.Portfolio.service;

import com.portapp.Portfolio.model.projects;
import java.util.List;

public interface IprojectsService {
    
    public List<projects> viewprojects();
    public void createprojects(projects pr);
    public void deleteprojects (Long idpr);
    public projects searchprojects(Long idpr);
}
