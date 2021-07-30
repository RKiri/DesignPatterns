package com.weiyuze.dp.observer.v6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.WakeUp();
    }
}

class Child {
    public boolean isCry() {
        return cry;
    }

    boolean cry = false;
    List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Mom());
        observers.add(new Dog());
    }

    public void WakeUp() {
        cry = true;
        wakeUpEvent event = new wakeUpEvent(System.currentTimeMillis(), "bad");
        for (Observer o : observers) {
            o.actionOnWakeUp(event);
        }
    }
}

interface Observer {
    void actionOnWakeUp(wakeUpEvent event);
}

class Dad implements Observer {
    void feed() {
        System.out.println("Dad feeding...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        feed();
    }
}

class Mom implements Observer {
    void hug() {
        System.out.println("Mom huging...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        hug();
    }
}

class Dog implements Observer {
    void wang() {
        System.out.println("Dog wang...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        wang();
    }
}

class wakeUpEvent {
    long timeStamp;
    String log;

    public wakeUpEvent(long timeStamp, String log) {
        this.timeStamp = timeStamp;
        this.log = log;
    }
}