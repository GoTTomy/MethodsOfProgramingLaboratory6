package com.example.demo.controllers;

import com.example.demo.cars.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    Car car;

    @GetMapping("/test")
    public void test() {
        car.drive();
    }
}
