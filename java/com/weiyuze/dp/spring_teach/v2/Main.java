package com.weiyuze.dp.spring_teach.v2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring_teach aop test
 */

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app_teach_auto.xml");
        Tank t = (Tank)context.getBean("tank");
        t.move();
    }
}
