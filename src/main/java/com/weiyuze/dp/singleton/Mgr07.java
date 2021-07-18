package com.weiyuze.dp.singleton;

/**
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Mgr07 {

    private static class Mgr07Holder {
        private static final Mgr07 INSTANCE = new Mgr07();
    }

    public static Mgr07 getINSTANCE() {
        return Mgr07Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr07.getINSTANCE().hashCode());
            }).start();
        }
    }
}
