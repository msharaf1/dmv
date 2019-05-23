package com.msschool.dmv.controllers;

import java.util.List;

import com.msschool.dmv.models.License;
import com.msschool.dmv.models.Person;
import com.msschool.dmv.services.LicenseService;
import com.msschool.dmv.services.PersonService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;


@Controller
public class PersonController {
    private PersonService pS;
    private LicenseService lS;
    public PersonController(PersonService pS, LicenseService lS){
        this.lS = lS;
        this.pS = pS;
    }

    @GetMapping("/home")
    public String showAll(Model model){
        List<Person> allPs = pS.findAll();
        List<License> allLs = lS.findAll();
        model.addAttribute("personList", allPs);
        model.addAttribute("licenseObj", allLs);
        return "personIdInfo";
    }
    
    
    
    @GetMapping("/person")
    public String getPerson(Model model){
        List<Person> allPs = pS.findAll();
        List<License> allLs = lS.findAll();
        model.addAttribute("personList", allPs);
        model.addAttribute("licenseObj", allLs);
        
        return "person";
    }
    
    

    @GetMapping("/person/new")
    public String getNewPerson(@ModelAttribute("personObj") Person person){
        return "newPerson";
    }

    @PostMapping("/person/new")
    public String addNewPerson(@Valid @ModelAttribute("personObj") Person person, BindingResult result){
        if(result.hasErrors()){
            return "redirect:/person/new";
        } else {
//            Person newPerson = pS.createPerson(person);
            pS.createPerson(person);
            return "redirect:/person";

        }

    }
}