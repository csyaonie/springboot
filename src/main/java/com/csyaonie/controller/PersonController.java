package com.csyaonie.controller;

import com.csyaonie.bean.Person;
import com.csyaonie.service.PersonService;
import com.csyaonie.service.PersonServiceIbatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {


    @Autowired
    private PersonService personService;

    @Autowired
    private PersonServiceIbatis personServiceIbatis;


    @RequestMapping("addperson/{name}")
    public Person addPerson(@PathVariable("name") String name){

        Person person=personService.addPerson(name);

        return person;
    }

    @RequestMapping("addperson2/{name}")
    public String addPerson2(@PathVariable("name") String name){

        String code=personServiceIbatis.addPerson(name);

        return code;
    }

    @RequestMapping("findperson/{name}")
    public Person findPerson(@PathVariable("name") String name){
        Person person=personServiceIbatis.getPerson(name);
        return person;
    }
}
