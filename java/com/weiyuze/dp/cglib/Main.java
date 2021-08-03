package com.weiyuze.dp.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new TimeMethodInterceptor());
        Tank t = (Tank) enhancer.create();
        t.move();
    }
}

class TimeMethodInterceptor implements MethodInterceptor {

    long time() {
        long time = System.currentTimeMillis();
        return time;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println(obj.getClass().getSuperclass().getName());
        long start = time();
        Object o = proxy.invokeSuper(obj,args);
        long end = time();
        System.out.println(end - start);
        return o;
    }
}

class Tank {
    void move() {
        System.out.println("Tank Moving Galagalagala...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
