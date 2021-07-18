package com.weiyuze.dp.singleton;
/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 唯一缺点：不管用到与否，类装载时就完成实例化
 */
public class Mgr01 {

    private static final Mgr01 INSTANCE = new Mgr01();

    public static Mgr01 getINSTANCE() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getINSTANCE();
        Mgr01 m2 = Mgr01.getINSTANCE();
        System.out.println(m1==m2);
    }
}
