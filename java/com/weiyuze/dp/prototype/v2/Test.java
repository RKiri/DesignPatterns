package com.weiyuze.dp.prototype.v2;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        Person p2 = (Person) p1.clone();
        System.out.println(p2.age + " " + p2.score);
        System.out.println(p2.l);

        System.out.println(p1.l == p2.l);
        p1.l.street = "sh";
        System.out.println(p2.l);

    }
}

class Person implements Cloneable {
    int age = 24;
    int score = 100;
    Location l = new Location("bj", 01);

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person p = (Person) super.clone();
        p.l = (Location) l.clone();
        return p;
    }
}

class Location implements Cloneable {
    String street;
    int roomNo;

    public Location(String street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", roomNo=" + roomNo +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}