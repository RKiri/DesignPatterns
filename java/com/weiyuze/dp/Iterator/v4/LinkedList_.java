package com.weiyuze.dp.Iterator.v4;

public class LinkedList_ implements Collection_ {

    Node head = null;
    Node tail = null;
    int size = 0;

    @Override
    public void add(Object o) {
        Node n = new Node(o);
        if (head == null) {
            head = n;
            tail = n;
            tail.next = null;
        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    class Node {
        Object o;
        Node next;

        public Node(Object o) {
            this.o = o;
        }
    }
}
