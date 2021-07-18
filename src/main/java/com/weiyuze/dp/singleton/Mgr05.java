package com.weiyuze.dp.singleton;

public class Mgr05 {
    private static Mgr05 INSTANCE;

    public static Mgr05 getINSTANCE() {
        if(INSTANCE==null){
            synchronized (Mgr05.class){ //通过减小同步代码块加锁提高效率，但不可行
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }
    public static void main(String[] args) {
         for (int i = 0;i<100;i++){
             new Thread(()->
                     System.out.println(Mgr05.getINSTANCE().hashCode())).start();
         }
    }
}
