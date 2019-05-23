package com.msschool.dmv.controllers;

import com.msschool.dmv.models.License;
import com.msschool.dmv.models.Person;
import com.msschool.dmv.services.LicenseService;
import com.msschool.dmv.services.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class LicenseController {
    private LicenseService lS;
    private PersonService pS;

    public LicenseController(LicenseService lS, PersonService pS){
        this.lS = lS;
        this.pS = pS;
    }

    @GetMapping("/license/new")
    public String getLicense(@ModelAttribute("licenseObj")License license, Model model){
        List<Person> personList = pS.findAll();
        // License l = new License();
        // System.out.println(l.getNumber() +" "+ l.getCounter());
        
        model.addAttribute("allPs", personList);
        
        

        return "newLicense";
    }

    @PostMapping("/license/new")
    public String createLicense(@Valid @ModelAttribute("licenseObj") License license, BindingResult result){
        if(result.hasErrors()){
            return "redirect:/new";
        }else{
            License newLicense =  lS.createLicense(license);
            return "redirect:/person";
        }
    }

}
