package com.weiyuze.dp.observer.v8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.wakeUp();
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
        observers.add((a) -> {
            System.out.println("...");
        });
    }

    void wakeUp() {
        cry = true;
        wakeUpEvent event = new wakeUpEvent(System.currentTimeMillis(), "bed", this);
        for (Observer o : observers) {
            o.actionOnWakeUp(event);
        }
    }
}

abstract class Event<T> {
    abstract T getSource();
}

class wakeUpEvent extends Event<Child> {
    long timeStamp;
    String log;
    Child source;

    public wakeUpEvent(long timeStamp, String log, Child source) {
        this.timeStamp = timeStamp;
        this.log = log;
        this.source = source;
    }

    @Override
    Child getSource() {
        return source;
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
        System.out.println("Mom hugging...");
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