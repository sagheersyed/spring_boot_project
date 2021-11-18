package com.learning.spring_boot.dao;

import com.learning.spring_boot.model.Person;

import java.util.List;
import java.util.Map;


public interface PersonDao {
    Person addPerson(Person persons);

    public List<Person> getAllPerson();

    Person getPerson(int id , Person person);

    Person deletePerson(int id , Person person);

    Person updatePerson(int id , Person person);

}
