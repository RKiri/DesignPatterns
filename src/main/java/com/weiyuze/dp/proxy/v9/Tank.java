package com.weiyuze.dp.proxy.v9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
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
        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),new Class[]{Movable.class},new TimeProxy(t));
        m.move();
    }
}
class TimeProxy implements InvocationHandler{

    Tank t;

    public TimeProxy(Tank t) {
        this.t = t;
    }

    void before(){
        System.out.println("method start...");
    }
    void after(){
        System.out.println("method end...");
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o = method.invoke(t,args);
        after();
        return null;
    }
}
interface Movable{
    void move();
}
