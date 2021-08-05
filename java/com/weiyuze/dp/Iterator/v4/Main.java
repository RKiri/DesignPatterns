package com.weiyuze.dp.Iterator.v4;

public class Main {
    public static void main(String[] args) {
        Collection_ list_ = new LinkedList_();
        for (int i = 0; i < 15; i++) {
            list_.add(new String("s" + i));
        }
        System.out.println(list_.size());

        for (int i = 0; i < ((LinkedList_) list_).size; i++) {

        }
    }
}
