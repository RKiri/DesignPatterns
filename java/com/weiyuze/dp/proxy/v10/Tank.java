package com.weiyuze.dp.proxy.v10;

import java.lang.reflect.Proxy;
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
        Tank t = new Tank();

        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        //System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");

        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),new Class[]{Movable.class},new TimeProxy(t));
        m.move();
    }
}
interface Movable{
    void move();
}
