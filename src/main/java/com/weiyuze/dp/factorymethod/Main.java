package com.weiyuze.dp.factorymethod;

public class Main {
    public static void main(String[] args) {
//        Car c = new Car();
//        c.go();

//        Moveable m = new Plane();
//        m.go();

//        Moveable m = new SimpleVehicleFactory().createCar();
//        m.go();

        Moveable m = new CarFactory().create();
        m.go();
    }
}
