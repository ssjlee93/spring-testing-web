package com.example.springtestingweb.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greet() {
        return "Hello, World";
    }
}
