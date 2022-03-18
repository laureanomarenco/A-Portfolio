package com.portapp.Portfolio.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class person{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idperson;
    
    private String name;
    private String lastname;
    private String title1;
    private String title2;
    private String location;
    private String about;
    private String urlimg;
    
    public person() {
        
    }

    public person(Long idperson, String name, String lastname, String title1, String title2, String location, String about, String urlimg) {
        this.idperson = idperson;
        this.name = name;
        this.lastname = lastname;
        this.title1 = title1;
        this.title2 = title2;
        this.location = location;
        this.about = about;
        this.urlimg = urlimg;
    }
    
    
}
