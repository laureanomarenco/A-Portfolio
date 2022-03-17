package com.portapp.Portfolio.service;

import com.portapp.Portfolio.model.experience;
import java.util.List;


public interface IexperienceService {
    
    public List<experience> viewexperience();
    public void createexperience(experience exp);
    public void deleteexperience(Long idexp);
    public experience searchexperience(Long idexp);
    
}
