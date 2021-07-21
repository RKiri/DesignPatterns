package com.weiyuze.dp.factorymethod;

/**
 * 简单工厂的可扩展性不好
 */
public class SimpleVehicleFactory {
    public Car createCar(){
        //before processing
        return new Car();
    }

    public Plane createPlane(){
        return new Plane();
    }
}
