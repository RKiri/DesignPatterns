package com.weiyuze.dp.proxy.v5;

import java.util.Random;

public class Tank implements Movable{
    public static void main(String[] args) {
        Tank t = new Tank();
        new TankTimeProxy(t).move();
    }

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
class TankTimeProxy implements Movable{

    Tank tank;

    public TankTimeProxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
interface Movable{
    void move();
}

