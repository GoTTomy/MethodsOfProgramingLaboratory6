package com.example.demo.cars;

import org.springframework.stereotype.Component;

@Component("Engine2")
public class Engine2 implements Car.EngineInterface {
    public int work() {
        System.out.println("Engine is now working");
        return 1;
    }
}
