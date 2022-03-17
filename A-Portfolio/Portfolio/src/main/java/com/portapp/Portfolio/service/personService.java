package com.portapp.Portfolio.service;

import com.portapp.Portfolio.model.person;
import com.portapp.Portfolio.repository.personRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personService implements IpersonService {
    
    @Autowired
    public personRepository personRepo;

    @Override
    public List<person> viewperson() {
        
       return personRepo.findAll();
        
    }

    @Override
    public void createperson(person pers) {
        
        personRepo.save(pers);
        
    }

    @Override
    public void deleteperson(Long idperson) {
        personRepo.deleteById(idperson);
    }

    @Override
    public person searchperson(Long idperson) {
        return personRepo.findById(idperson).orElse(null);
    }
    
}
