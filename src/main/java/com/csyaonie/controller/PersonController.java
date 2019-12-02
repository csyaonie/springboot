package com.csyaonie.controller;

import com.csyaonie.bean.Person;
import com.csyaonie.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {


    @Autowired
    private PersonService personService;


    @RequestMapping("addperson/{name}")
    public Person addPerson(@PathVariable("name") String name){

        Person person=personService.addPerson(name);

        return person;
    }
}
