package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("list-rest")
public class TestRestController {

    public List<String> list = new ArrayList<String>();

    @GetMapping("GET")
    public List<String> onGet(){
        System.out.println("List object has been returned");
        return list;
    }

    @GetMapping("/GET/SPECIFIC/{s}")
    public String onGetSpecific(@PathVariable String s){
        if(list.contains(s)){
            return list.get(list.indexOf(s));
        }
        return "false";
    }

    @PostMapping("{s}")
    public void onPost(@PathVariable String s){
        list.add(s);
        System.out.println("Something was added to the list");
    }

    @DeleteMapping("{s}")
    public void onDelete(@PathVariable  String s){
        list.remove(s);
        System.out.println("Sth was removed from the list");
    }

    @PutMapping("{s}/{x}")
    public void onPut(@PathVariable String s,@PathVariable String x){
        if(list.contains(s)) {
            int index = list.indexOf(s);
            list.remove(index);
            list.add(index, x);
        }
    }
}
