package com.weiyuze.dp.spring.v2;

import java.util.Random;

public class Tank {
    void move(){
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
