package com.portapp.Portfolio.service;

import com.portapp.Portfolio.model.skills;
import java.util.List;

public interface IskillsService {
    
    public List<skills> viewskills();
    public void createskills(skills sk);
    public void deleteskills(Long idsk);
    public skills searchskills(Long idsk);
}
