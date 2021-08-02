package com.weiyuze.dp.proxy.v2;

import java.util.Random;

public class Tank implements Movable{
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        System.out.println("Tank Moving Galagalagala...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }

    public static void main(String[] args) {
        Tank t = new Tank();
        t.move();
    }
}
interface Movable{
    void move();
}
