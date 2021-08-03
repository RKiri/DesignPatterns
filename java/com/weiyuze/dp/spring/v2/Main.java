package com.weiyuze.dp.spring.v2;

import com.weiyuze.dp.spring_teach.v2.Tank;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app_auto.xml");
        Tank t = (Tank) context.getBean("tank");
        t.move();
    }
}
