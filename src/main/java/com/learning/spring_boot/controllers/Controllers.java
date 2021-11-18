package com.learning.spring_boot.controllers;

import com.learning.spring_boot.model.Person;
import com.learning.spring_boot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class Controllers {

    public final PersonService personService;

    @Autowired
    public Controllers(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/post")
    public Person addPerson(@RequestBody Person person){
        return personService.addPerson(person);
    }

    @GetMapping("/")
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }

    @GetMapping("/user/{id}")
    public Person getPerson(@PathVariable("id") int id , Person person){
        return personService.getPerson(id , person);
    }

    @DeleteMapping("user/{id}")
    public Person deletePerson(@PathVariable("id") int id , Person person){
//        return "the person is deleted";
        return personService.deletePerson(id , person);
    }

    @PutMapping("user/{id}")
    public Person updatePerson(@PathVariable("id") int id ,@RequestBody Person person){
        return personService.updatePerson(id , person);
    }

}
