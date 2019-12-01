package com.csyaonie.controller;

import com.csyaonie.bean.Admin;
import com.csyaonie.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    @Autowired
    private User user;

    @Autowired
    private Admin admin;


    @Value("${address}")
    private String address;

    @RequestMapping("user")
    public User user(){
        return user;
    }

    @RequestMapping("admin")
    public Admin admin(){
        return admin;
    }

    @RequestMapping("address")
    public String address(){
        return address;
    }


}
