package com.weiyuze.dp.abstractFactory;

public class Main {
    public static void main(String[] args) {
        //AbstractFactory af = new ModernFactory();
        AbstractFactory af = new MagicFactory();

        Food f = af.createFood();
        f.printName();

        Vehicle v = af.createVehicle();
        v.go();

        Weapon w = af.createWeapon();
        w.shoot();

    }
}
