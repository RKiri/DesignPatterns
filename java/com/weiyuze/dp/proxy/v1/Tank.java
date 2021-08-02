package com.weiyuze.dp.proxy.v1;

import java.util.Random;

public class Tank implements Movable{
    @Override
    public void move() {
        System.out.println("Tank Moving Galagalagala...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
interface Movable{
    void move();
}
