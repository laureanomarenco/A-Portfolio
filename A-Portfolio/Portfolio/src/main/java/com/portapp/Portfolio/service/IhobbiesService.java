package com.portapp.Portfolio.service;

import com.portapp.Portfolio.model.hobbies;
import java.util.List;

public interface IhobbiesService {
    
    public List<hobbies> viewhobbies();
    public void createhobbies(hobbies hb);
    public void deletehobbies(Long idhb);
    public hobbies searchhobbies(Long idhb);
}
