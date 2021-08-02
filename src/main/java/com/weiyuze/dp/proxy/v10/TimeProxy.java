package com.weiyuze.dp.proxy.v10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeProxy implements InvocationHandler {
    Tank t ;
    public TimeProxy(Tank t) {
        this.t = t;
    }
    long time(){
        long time = System.currentTimeMillis();
        return time;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = time();
        Object o = method.invoke(t,args);
        long end = time();
        System.out.println(end-start);
        return o;
    }
}
