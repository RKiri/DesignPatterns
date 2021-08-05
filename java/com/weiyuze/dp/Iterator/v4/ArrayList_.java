package com.weiyuze.dp.Iterator.v4;

public class ArrayList_ implements Collection_ {
    Object[] objects = new Object[10];
    int size = 0;

    @Override
    public void add(Object o) {
        if (size >= objects.length) {
            Object[] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[size] = o;
        size++;
    }

    @Override
    public int size() {
        return 0;
    }
}
