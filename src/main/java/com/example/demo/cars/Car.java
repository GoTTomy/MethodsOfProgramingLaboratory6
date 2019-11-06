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
    public Engine engine;

    @Autowired
    public Suspension suspension;

    public boolean drive(){
        if("1".equals(String.valueOf(engine.work())) && "1".equals(String.valueOf(suspension.work()))) {
            System.out.println("Car is now driving.");
            return true;
        }
        else return false;
    }
}
