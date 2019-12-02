package com.csyaonie.service;

import com.csyaonie.bean.Person;
import com.csyaonie.mapping.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceIbatis {

    @Autowired
    private PersonMapper personMapper;


    public Person getPerson(String name){
        Person person=personMapper.select(name);
        return person;
    }

    public String addPerson(String name){
        int code=personMapper.insert(name);
        return code+"";
    }
}
