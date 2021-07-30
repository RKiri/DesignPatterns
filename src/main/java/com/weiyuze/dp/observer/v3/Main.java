package com.weiyuze.dp.observer.v3;

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.wakeUp();
    }
}
class Child{
    private boolean isCry() {
        return cry;
    }

    private boolean cry = false;
    private Dad d = new Dad();
    public void wakeUp(){
        cry = true;
        d.feed();
    }

}
class Dad{
    public void feed(){
        System.out.println("feeding...");
    }
}
