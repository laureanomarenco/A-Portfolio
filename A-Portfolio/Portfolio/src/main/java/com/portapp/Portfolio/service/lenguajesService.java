package com.portapp.Portfolio.service;

import com.portapp.Portfolio.model.lenguajes;
import com.portapp.Portfolio.repository.lenguajesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class lenguajesService implements IlenguajesService {

    @Autowired
    public lenguajesRepository lgRepo;
            
    @Override
    public List<lenguajes> viewlenguajes() {
        return lgRepo.findAll();
    }

    @Override
    public void createlenguajes(lenguajes lg) {
        lgRepo.save(lg);
    }

    @Override
    public void deletelenguajes(Long idlg) {
        lgRepo.deleteById(idlg);
    }

    @Override
    public lenguajes searchlenguajes(Long idlg) {
        return lgRepo.findById(idlg).orElse(null);
    }
    
}
