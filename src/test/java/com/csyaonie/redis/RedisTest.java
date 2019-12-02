package com.csyaonie.redis;


import com.csyaonie.SpringBatisApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={SpringBatisApplication.class})
public class RedisTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test1(){

        stringRedisTemplate.opsForValue().set("hello","world");

    }

    @Test
    public void test2(){

        String res=stringRedisTemplate.opsForValue().get("hello");
        System.out.println(res);

    }

}
