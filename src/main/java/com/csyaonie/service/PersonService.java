package com.csyaonie.service;

import com.csyaonie.bean.Person;
import com.csyaonie.respository.PersonRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PersonService {

    @Autowired
    private PersonRespository personRespository;

    public Person getPerson(Long id){
        Optional<Person> person=personRespository.findById(id);
        return person.get();
    }

    public Person addPerson(String name){
        Person person=new Person();
        person.setAge(26);
        person.setName(name);
        personRespository.save(person);
        return person;
    }

    public List<Person> findAll(){
        List<Person> personList=personRespository.findAll();
        return personList;
    }
}
