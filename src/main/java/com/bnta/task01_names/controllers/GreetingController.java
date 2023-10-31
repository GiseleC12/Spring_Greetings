package com.bnta.task01_names.controllers;

import com.bnta.task01_names.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping(value = "/greetings")
public class GreetingController {
    @GetMapping //localhost:8080/greeting
    public Greeting newGreeting(){
        Greeting greeting = new Greeting("Gisele");
        return greeting;
    }
}
