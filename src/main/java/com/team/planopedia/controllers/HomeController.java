package com.team.planopedia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String homeScreen(){
        return "index";
    }
    
    @GetMapping("/form")
    public String fakeForm(){
        return "example-form";
    }
}
