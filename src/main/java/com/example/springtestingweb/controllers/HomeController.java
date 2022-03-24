package com.example.springtestingweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    // map to all HTTP operations
    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }
}
