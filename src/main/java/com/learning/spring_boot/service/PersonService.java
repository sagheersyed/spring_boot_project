package com.learning.spring_boot.service;

import com.learning.spring_boot.dao.PersonDao;
import com.learning.spring_boot.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PersonService {

    public final PersonDao personDao;
    @Autowired
    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public Person addPerson(Person person){
        return personDao.addPerson(person);
    }

    public List<Person> getAllPersons(){
        return personDao.getAllPerson();
    }

    public Person getPerson(int id , Person person){
        return personDao.getPerson(id , person);
    }

    public Person deletePerson(int id , Person person){
        return personDao.deletePerson(id , person);
    }

    public Person updatePerson(int id , Person person){
        return personDao.updatePerson(id , person);
    }
}
