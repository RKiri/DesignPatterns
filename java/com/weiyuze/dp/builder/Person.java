package com.weiyuze.dp.builder;

public class Person {
    int id;
    String name;
    int age;
    double weight;
    int score;
    Location loc;

    private Person() {
    }

    static class PersonBulider {
        Person p = new Person();

        PersonBulider basicInfo(int id, String name, int age) {
            p.id = id;
            p.name = name;
            p.age = age;
            return this;
        }

        PersonBulider weight(double weight) {
            p.weight = weight;
            return this;
        }

        PersonBulider score(int score) {
            p.score = score;
            return this;
        }

        PersonBulider loc(String street, String roomNo) {
            p.loc = new Location(street, roomNo);
            return this;
        }

        Person bulid() {
            return p;
        }
    }


}

class Location {
    String street;
    String roomNo;

    public Location(String street, String roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }
}
