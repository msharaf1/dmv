package com.msschool.dmv.services;

import com.msschool.dmv.models.Person;
import com.msschool.dmv.repositories.PersonRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private PersonRepo pR;

    public PersonService(PersonRepo pR){
        this.pR = pR;
    }

    public Person createPerson(Person person){
        return pR.save(person);
    }

    public List<Person> findAll(){
        return pR.findAll();
//        return person;
    }

    public Person getById(long id){
        return pR.findById(id).get();
    }

    public void updatePerson(Person person){
        pR.save(person);
    }

    public void deltePerson(Long id){
        pR.deleteById(id);
    }




}
