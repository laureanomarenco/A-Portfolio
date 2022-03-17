package com.portapp.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class experience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idexp;
    
    private String nameofjob;
    private String description;
    private String others;
    private String others2;
    private String startandend;
    private String urlimg;
    
    public experience(){
        
    }
    
    public experience(Long idexp, String nameofjob, String description, String others, String others2, String startandend, String urlimg) {
        this.idexp = idexp;
        this.nameofjob = nameofjob;
        this.description = description;
        this.others = others;
        this.others2 = others2;
        this.startandend = startandend;
        this.urlimg = urlimg;
    }
    
}
