package com.example.Recommendation.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String MainPage(){
        return "Main";
    }

    @GetMapping("/Home")
    public String HomePage(){
        return "Home";
    }
}
