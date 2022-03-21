package com.portapp.Portfolio.service;

import com.portapp.Portfolio.model.education;
import java.util.List;


public interface IeducationService {
        
    public List<education> vieweducation();
    public void createeducation(education ed);
    public void deleteeducation(Long ided);
    public education searcheducation(Long ided);
}
