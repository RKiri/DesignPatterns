package com.weiyuze.dp.spring.v1;

public class TimePorxy {
    void before(){
        System.out.println("Start "+System.currentTimeMillis());
    }
    void end(){
        System.out.println("end "+System.currentTimeMillis());
    }
}
