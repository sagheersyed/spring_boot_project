package com.learning.spring_boot.dao;

import com.learning.spring_boot.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PersonDaoImp implements PersonDao{

    List<Person> personList = new ArrayList<>();

    int i=0;
    @Override
    public Person addPerson(Person person) {
        personList.add(person);
        return person;
    }

    @Override
    public List<Person> getAllPerson() {
        return personList;
    }

    @Override
    public Person getPerson(int id, Person person) {
        for (Person per:personList) {
            if(per.getId() == id){
                person = per;
            }
        }
        return person;
    }

    @Override
    public Person deletePerson(int id, Person person) {
        for (Person per:personList) {
            if (per.getId() == id){
                personList.remove(per);
            }
        }
        return person;
    }

    @Override
    public Person updatePerson(int id, Person person) {
        for (Person per:personList) {
            if(per.getId() == id ){
                per.setName(person.getName());
            }
        }
        return person;
    }


}
