package com.portapp.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class hobbies {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idhb;
    
    private String nameohobbie;
    private String description;
    private String others;
    private String others2;
    private String startandend;
    private String imgurl;
    
    public hobbies() {
        
    }

    public hobbies(Long idhb, String nameohobbie, String description, String others, String others2, String startandend, String imgurl) {
        this.idhb = idhb;
        this.nameohobbie = nameohobbie;
        this.description = description;
        this.others = others;
        this.others2 = others2;
        this.startandend = startandend;
        this.imgurl = imgurl;
    }
}
