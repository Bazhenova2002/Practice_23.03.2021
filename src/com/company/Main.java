package com.company;

import com.company.entity.Auto;
import com.company.entity.MyEngine;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Auto");
        MyEngine myEngine = new MyEngine("Model1", 10, 6, EngineType.DIESEL);
        Auto auto = new Auto("BMW", "X5", myEngine, 120);
        auto.move();
    }
}
