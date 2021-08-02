package com.weiyuze.dp.proxy.v8;

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
        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),new Class[]{Movable.class},new LogHander(t));
        m.move();
    }
}
class LogHander implements InvocationHandler{
    Tank t;

    public LogHander(Tank t) {
        this.t = t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method="+method.getName()+" Start...");
        Object o = method.invoke(t,args);
        System.out.println("method="+method.getName()+" end...");
        return o;
    }
}
interface Movable{
    void move();
}
