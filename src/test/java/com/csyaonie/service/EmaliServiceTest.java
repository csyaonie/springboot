package com.csyaonie.service;

import com.SpringBatisApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={SpringBatisApplication.class})
public class EmaliServiceTest {

    @Autowired
    private EmaliService emaliService;

    @Test
    public void sendEmail() {

        try {
            emaliService.sendEmail("csyaonie@qq.com","javaMailTest","hello");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}