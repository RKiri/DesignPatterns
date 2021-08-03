package com.weiyuze.dp.spring_teach.v1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring_teach aop test
 */

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app_teach.xml");
        Tank t = (Tank)context.getBean("tank");
        t.move();
    }
}
