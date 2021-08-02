package com.weiyuze.dp.proxy_teach.v10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class TimeProxy implements InvocationHandler {
    Movable m;

    public TimeProxy(Movable m) {
        this.m = m;
    }

    public void before() {
        System.out.println("method start..");
    }

    public void after() {
        System.out.println("method stop..");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //Arrays.stream(proxy_teach.getClass().getMethods()).map(Method::getName).forEach(System.out::println);

        before();
        Object o = method.invoke(m, args);
        after();
        return o;
    }

}
