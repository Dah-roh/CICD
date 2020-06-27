package com.spring.cicd.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRest {

    @GetMapping
    public String sample() {
        return "Hi you, I'm just testing this endpoint";  }
}
