package com.csyaonie.controller;

import com.csyaonie.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class TemplateController {

    @Autowired
    private User user;


    @Value("${address}")
    private String address;



    @RequestMapping("freemarker")
    public String freemarker(Map<String,Object> map){

        map.put("user",user);
        map.put("address",address);

        return "template";

    }
}
