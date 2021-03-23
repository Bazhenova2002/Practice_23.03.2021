package com.company.entity;

import com.company.EngineType;

public class Auto extends Machine{

    public Auto(String name, String model, Engine engine, int speed) {
        super(name, model, engine, speed);
    }

    @Override
    public void move() {
        MyEngine myEngine = new MyEngine("Model1", 10, 6, EngineType.DIESEL);
        myEngine.start();
        System.out.println("120 km/h");
        myEngine.stop();
    }
}
