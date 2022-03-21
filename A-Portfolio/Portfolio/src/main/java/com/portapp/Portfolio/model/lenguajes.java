package com.portapp.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class lenguajes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idlg;
    
    private String nameoflenguajes;
    private String progress;
    
    public lenguajes() {
        
    }

    public lenguajes(Long idlg, String nameoflenguajes, String progress) {
        this.idlg = idlg;
        this.nameoflenguajes = nameoflenguajes;
        this.progress = progress;
    }   
}
