package com.weiyuze.dp.observer.v4;

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.wakeUp();
    }
}
class Child{
    public boolean isCry() {
        return cry;
    }

    private boolean cry = false;
    Dad dad = new Dad();
    Mom mom = new Mom();
    Dog dog = new Dog();

    public void wakeUp(){
        cry = true;
        dad.feed();
        mom.hug();
        dog.wang();
    }
}
class Dad{
    public void feed(){
        System.out.println("Dad feeding...");
    }
}
class Mom{
    public void hug(){
        System.out.println("Mom hugging...");
    }
}
class Dog{
    public void wang(){
        System.out.println("Dog wang...");
    }
}
