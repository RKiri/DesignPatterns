package com.weiyuze.dp.factorymethod_teach;

public class CarFactory {
    public Moveable create() {
        System.out.println("a car created!");
        return new Car();
    }
}
