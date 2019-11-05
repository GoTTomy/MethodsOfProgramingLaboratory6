package com.example.demo.cars;

import org.springframework.stereotype.Component;

@Component("Engine")
public class Engine implements Car.EngineInterface {
    public int work() {
        System.out.println("Engine is now working.");
        return 1;
    }
}
