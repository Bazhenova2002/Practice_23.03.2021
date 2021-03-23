package com.company.entity;

public abstract class Engine {
    private String model;
    private double volume;
    private int power;
    private MyEngine enginesType;

    public Engine(String model, double volume, int power) {
    }

    public abstract void start();
    public abstract void stop();

    public Engine(String model, double volume, int power, MyEngine enginesType) {
        this.model = model;
        this.volume = volume;
        this.power = power;
        this.enginesType = enginesType;
    }
}
