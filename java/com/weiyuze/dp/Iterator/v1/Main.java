package com.weiyuze.dp.Iterator.v1;

public class Main {
    public static void main(String[] args) {
        ArrayList_ list_ = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            list_.add(new String("s" + i));
        }
        System.out.println(list_.size());
    }
}

class ArrayList_ {
    Object[] objects = new Object[10];
    int index;

    void add(Object o) {
        if (index == objects.length) {
            Object[] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[index] = o;
        index++;
    }

    int size() {
        return index;
    }
}
