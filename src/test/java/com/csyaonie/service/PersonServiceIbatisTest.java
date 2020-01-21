package com.csyaonie.service;

import com.SpringBatisApplication;
import com.csyaonie.mapping.PersonMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={SpringBatisApplication.class})
public class PersonServiceIbatisTest {

    @Autowired
    private PersonMapper personMapper;


    @Test
    public void TestAdd(){
        int code=personMapper.insert("fff");
    }
}