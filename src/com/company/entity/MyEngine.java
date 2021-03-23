package com.company.entity;

import com.company.EngineType;

public class MyEngine extends Engine {

    public MyEngine(String model, double volume, int power, MyEngine enginesType) {
        super(model, volume, power, enginesType);
    }

    public MyEngine(String model, double volume, int power, EngineType diesel) {
        super(model, volume, power);
    }

    @Override
    public void start() {
        System.out.println("Start engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop engine");

    }
}
