package com.weiyuze.dp.spring.v1;

import java.util.Random;

public class Tank {
    public void move(){
        System.out.println("Tank Moving Galagalagala...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
