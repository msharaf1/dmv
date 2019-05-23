package com.msschool.dmv.services;

import java.util.List;
import java.util.Optional;

import com.msschool.dmv.models.License;
import com.msschool.dmv.models.Person;
import com.msschool.dmv.repositories.LicenseRepo;

import com.msschool.dmv.repositories.PersonRepo;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;

@Service
public class LicenseService {
    private LicenseRepo lR;
    private PersonRepo pR;
    public LicenseService(LicenseRepo lR, PersonRepo pR){
        this.lR = lR;
        this.pR = pR;
    }

    public License createLicense(License license){
        // License nLicense = new License();
        // nLicense.setLicenseNumber();
        // System.out.println(nLicense.getLicenseNumber());
        return lR.save(license);
    }

    public List<License> findAll(){
        return lR.findAll();
//        return license;
    }


    public License getById(Long id){
        return lR.findById(id).get();
    }

//    public License addLs(License license){
//        License l = lR.save(license);
//        l.setPerson(license);
//
//    }

//    public List<License> findByCreator(Person person) {
//        return lR.findByCreator(person);
//    }

//    public void linkedToPerson(License l, Person person) {
//        List<Person> cl = (List<Person>) l.getPerson();
////        person.set(person);
//        l.setPerson(person);
////        pS.save(l);
//    }
    public Person getByOptional(Long id){
        Optional<License> pId = lR.findById(id);
        return pId.get().getPerson();
    }


//    public Person getId(Long id){
//         id = (long)(1);
//         Optional<Person> l = lR.findById(id);
//        Person pId = ((License) l.get()).getPerson();
//        System.out.println(pId);
//        return pId;
//    }

    public void updateLicense(License license){
        lR.save(license);
    }

    
    public void deleteLicense(Long id){
        lR.deleteById(id);
    }

	public void update(License license) {
	}
}
