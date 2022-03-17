package com.portapp.Portfolio.service;

import com.portapp.Portfolio.model.person;
import java.util.List;


public interface IpersonService {
    
    public List<person> viewperson();
    public void createperson(person pers);
    public void deleteperson(Long idperson);
    public person searchperson(Long idperson);
}
