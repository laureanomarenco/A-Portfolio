package com.portapp.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class education {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ided;
    
    private String nameofed;
    private String description;
    private String others;
    private String others2;
    private String startandend;
    private String imgurl;
    
    public education(){
        
    }
    
    public education(Long ided, String nameofed, String description, String others, String others2, String startandend, String imgurl) {
        this.ided = ided;
        this.nameofed = nameofed;
        this.description = description;
        this.others = others;
        this.others2 = others2;
        this.startandend = startandend;
        this.imgurl = imgurl;
    }
    
    
}
