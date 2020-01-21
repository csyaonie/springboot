package com.csyaonie.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author zyf
 * @date 2019/12/19
 * @description
 */
public class ValueTest {

    @Value("${user.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
