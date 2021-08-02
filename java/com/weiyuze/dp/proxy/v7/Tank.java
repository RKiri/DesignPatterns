package com.weiyuze.dp.proxy.v7;

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
        new TankLogProxy(new TankTimeProxy(new Tank())).move();
    }
}
class TankLogProxy implements Movable{

    Movable m ;

    public TankLogProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("Start moving...");
        m.move();
        System.out.println("Stopped!");
    }
}
class TankTimeProxy implements Movable{

    Movable m;

    public TankTimeProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        m.move();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
interface Movable{
    void move();
}
