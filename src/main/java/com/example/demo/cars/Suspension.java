package com.example.demo.cars;

import org.springframework.stereotype.Component;

@Component
public class Suspension {
    public int work(){
        System.out.println("Suspension is now working.");
        return 1;
    }
}
