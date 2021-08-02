package com.weiyuze.dp.proxy.v4;

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

    public static void main(String[] args) {
        new Tank2().move();
    }
}
class Tank2 extends Tank{

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        super.move();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
interface Movable{
    void move();
}
