package com.weiyuze.dp.ASM;

class MyClassLoader extends ClassLoader {
    Class defineClass(String name, byte[] b) {
        return defineClass(name, b, 0, b.length);
    }
}
