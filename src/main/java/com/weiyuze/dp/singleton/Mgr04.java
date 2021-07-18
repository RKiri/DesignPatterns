package com.weiyuze.dp.singleton;

public class Mgr04 {
    private static Mgr04 INSTANCE;

    public static synchronized Mgr04 getINSTANCE() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Mgr04.getINSTANCE().hashCode())).start();
        }
    }
}
