package com.portapp.Portfolio.service;

import com.portapp.Portfolio.model.lenguajes;
import java.util.List;

public interface IlenguajesService {
    
    public List<lenguajes> viewlenguajes();
    public void createlenguajes(lenguajes lg);
    public void deletelenguajes(Long idlg);
    public lenguajes searchlenguajes(Long idlg);
}
