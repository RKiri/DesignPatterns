package com.weiyuze.dp.Iterator.v2;

class Main {
    public static void main(String[] args) {
        LinkedList_ list_ = new LinkedList_();
        for (int i = 0; i < 15; i++) {
            list_.add(new String("s" + i));
        }
        System.out.println(list_.size);
    }

}

class LinkedList_ {
    Node head = null;
    Node tail = null;
    int size = 0;

    void add(Object o) {
        Node n = new Node(o);
        n.next = null;
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    int size() {
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
