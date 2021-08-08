package com.weiyuze.dp.builder;

public class ComplexTerrainBuilder implements TerrainBuilder {
    Terrain terrain = new Terrain();

    @Override
    public TerrainBuilder buildFort() {
        terrain.f = new Fort(10, 10, 10, 10);
        return this;
    }

    @Override
    public TerrainBuilder buildMine() {
        terrain.m = new Mine(20, 20, 20, 20);
        return this;
    }

    @Override
    public TerrainBuilder buildWall() {
        terrain.w = new Wall(30, 30, 30, 30);
        return this;
    }

    @Override
    public Terrain build() {
        return terrain;
    }
}
