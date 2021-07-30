package com.weiyuze.dp.observer.v2;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        while (!child.isCry()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("obsetving...");
        }
    }
}
class Child{
    public boolean isCry() {
        return cry;
    }

    boolean cry = false;

    public void wakeUp(){
        System.out.println("Waked Up! Wuwuwu...");
        cry = true;
    }
}