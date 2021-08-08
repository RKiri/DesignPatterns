package com.weiyuze.dp.builder;

public class Main {
    public static void main(String[] args) {
        TerrainBuilder tb = new ComplexTerrainBuilder();
        tb.buildFort().buildMine().buildWall().build();

        Person p = new Person.PersonBulider()
                .basicInfo(01,"weiyuze",24)
                .weight(75)
                .score(100)
                .loc("bj","001")
                .bulid();
    }
}
