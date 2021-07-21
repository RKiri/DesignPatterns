package com.weiyuze.dp.factorymethod;

public class CarFactory {
    public Moveable create(){
        System.out.println("a Car created....");
        return new Car();
    }
}
