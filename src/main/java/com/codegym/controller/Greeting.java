package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Greeting {
    @GetMapping("/hi")
    public String Greeting(){
        return "hoa";
    }
}
