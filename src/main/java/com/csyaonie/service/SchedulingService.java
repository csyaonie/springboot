package com.csyaonie.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SchedulingService {

    private int count=0;

    private static final SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");

//    @Scheduled(cron="*/3 * * * * ?")
//    private void process(){
//        System.out.println("666"+count++);
//    }

//    @Scheduled(fixedRate = 2000)
//    private void process2(){
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(dateFormat.format(new Date()));
//    }

    @Scheduled(fixedDelay = 2000)
    private void process2(){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(dateFormat.format(new Date()));
    }

}
