package com.weiyuze.dp.proxy.v6;

import java.util.Random;

public class Tank implements Movable {
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
        new TankTimeProxy().move();
    }
}

class TankTimeProxy implements Movable {

    Tank t;

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        t.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

class TankLogProxy implements Movable {

    Tank t;

    @Override
    public void move() {
        System.out.println("Start moving...");
        t.move();
        System.out.println("Stopped!");
    }
}

interface Movable {
    void move();
}
