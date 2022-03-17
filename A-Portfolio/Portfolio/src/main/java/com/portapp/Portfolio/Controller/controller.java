package com.portapp.Portfolio.Controller;

import com.portapp.Portfolio.model.person;
import com.portapp.Portfolio.model.education;
import com.portapp.Portfolio.model.experience;
import com.portapp.Portfolio.model.hobbies;
import com.portapp.Portfolio.model.lenguajes;
import com.portapp.Portfolio.model.projects;
import com.portapp.Portfolio.model.skills;
import com.portapp.Portfolio.service.IpersonService;
import com.portapp.Portfolio.service.IeducationService;
import com.portapp.Portfolio.service.IexperienceService;
import com.portapp.Portfolio.service.IhobbiesService;
import com.portapp.Portfolio.service.IlenguajesService;
import com.portapp.Portfolio.service.IprojectsService;
import com.portapp.Portfolio.service.IskillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    
    @Autowired
    private IpersonService personServ;
    

    @PostMapping ("/newperson")
    public void addperson(@RequestBody person pers) {
        personServ.createperson(pers);
    }
    
    @GetMapping ("/viewperson")
    @ResponseBody
    public List<person> viewperson(){
       return personServ.viewperson();
    }
    
    @DeleteMapping ("/delete/{idperson}")
    public void deleteperson(@PathVariable Long idperson) {
        personServ.deleteperson(idperson);
    }
    
    @Autowired
    private IeducationService educationServ;
    

    @PostMapping ("/neweducation")
    public void addeducation(@RequestBody education ed) {
        educationServ.createeducation(ed);
    }
    
    @GetMapping ("/vieweducation")
    @ResponseBody
    public List<education> vieweducation(){
       return educationServ.vieweducation();
    }
    
    @DeleteMapping ("/deleteed/{ided}")
    public void deleteeducation(@PathVariable Long ided) {
        educationServ.deleteeducation(ided);
    }
    
    @Autowired
    private IexperienceService expServ;
    
    @PostMapping ("/newexperience")
    public void addexperience(@RequestBody experience exp) {
        expServ.createexperience(exp);
    }
    
    @GetMapping ("/viewexperience")
    @ResponseBody
    public List<experience> viewexperience(){
       return expServ.viewexperience();
    }
    
    @DeleteMapping ("/deleteexp/{idexp}")
    public void deleteexperience(@PathVariable Long idexp) {
        expServ.deleteexperience(idexp);
    }
    
    @Autowired
    private IskillsService skServ;
    
    @PostMapping ("/newskills")
    public void addskills(@RequestBody skills sk) {
        skServ.createskills(sk);
    }
    
    @GetMapping ("/viewskills")
    @ResponseBody
    public List<skills> viewskills(){
       return skServ.viewskills();
    }
    
    @DeleteMapping ("/deleteskills/{idsk}")
    public void deleteskills(@PathVariable Long idsk) {
        skServ.deleteskills(idsk);
    }    
    
    @Autowired
    private IlenguajesService lgServ;
    
    @PostMapping ("/newlenguajes")
    public void addlenguajes(@RequestBody lenguajes lg) {
        lgServ.createlenguajes(lg);
    }
    
    @GetMapping ("/viewlenguajes")
    @ResponseBody
    public List<lenguajes> viewlenguajes(){
       return lgServ.viewlenguajes();
    }
    
    @DeleteMapping ("/deletelenguajes/{idlg}")
    public void deletelenguajes(@PathVariable Long idlg) {
        lgServ.deletelenguajes(idlg);
    }  
    
    @Autowired
    private IprojectsService prServ;
    
    @PostMapping ("/newprojects")
    public void addlenguajes(@RequestBody projects pr) {
        prServ.createprojects(pr);
    }
    
    @GetMapping ("/viewprojects")
    @ResponseBody
    public List<projects> viewprojects(){
       return prServ.viewprojects();
    }
    
    @DeleteMapping ("/deleteprojects/{idpr}")
    public void deleteprojects(@PathVariable Long idpr) {
        lgServ.deletelenguajes(idpr);
    }  
    
    @Autowired
    private IhobbiesService hbServ;
    
    @PostMapping ("/newhobbies")
    public void addhobbies(@RequestBody hobbies hb) {
        hbServ.createhobbies(hb);
    }
    
    @GetMapping ("/viewhobbies")
    @ResponseBody
    public List<hobbies> viewhobbies(){
       return hbServ.viewhobbies();
    }
    
    @DeleteMapping ("/deletehobbies/{idhb}")
    public void deletehobbies(@PathVariable Long idhb) {
        hbServ.deletehobbies(idhb);
    }  
}
