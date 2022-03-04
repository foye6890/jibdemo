package com.example.jibdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HogeController {

    @GetMapping("/hello")
    public Object hello() {
        return "ok";
    }
}
