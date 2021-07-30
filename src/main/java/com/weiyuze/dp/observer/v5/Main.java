package com.weiyuze.dp.observer.v5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.wakeUp();
    }
}
class Child{
    public Boolean getCry() {
        return cry;
    }

    Boolean cry = false;
    List<Observer> observers = new ArrayList<>();
    {
        observers.add(new Dad());
        observers.add(new Mom());
        observers.add(new Dad());
    }
    public void wakeUp(){
        for(Observer o:observers){
            o.actionOnWakeUp();
        }
    }
}
interface Observer{
    void actionOnWakeUp();
}
class Dad implements Observer{

    public void feed(){
        System.out.println("Dad feeding...");
    }
    @Override
    public void actionOnWakeUp() {
        feed();
    }
}
class Mom implements Observer{

    public void hug(){
        System.out.println("Mom hugging...");
    }
    @Override
    public void actionOnWakeUp() {
        hug();
    }
}
class Dog implements Observer{

    public void wang(){
        System.out.println("Dog wang...");
    }
    @Override
    public void actionOnWakeUp() {
        wang();
    }
}
