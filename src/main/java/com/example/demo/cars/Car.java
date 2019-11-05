package com.example.demo.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Car {
    public interface EngineInterface{
        int work();
    }

    @Autowired
    @Qualifier("Engine")
    Engine engine;

    @Autowired
    Suspension suspension;

    public boolean drive(){
        if(engine.work() == 1 && suspension.work() == 1) {
            System.out.println("Car is now driving.");
            return true;
        }
        else return false;
    }
}
