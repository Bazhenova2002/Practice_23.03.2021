package com.company.entity;

public abstract class Machine {
    private String name;
    private String model;
    private Engine engine;
    private int speed;


    public Machine(String name, String model, Engine engine, int speed) {
        this.name = name;
        this.model = model;
        this.engine = engine;
        this.speed = speed;
    }

    public abstract void move();

}
