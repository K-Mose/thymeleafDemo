package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/")
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name = "name")String name,
            @RequestParam(name = "age")int age,
            Model model) {
        model.addAttribute("name", name)
        .addAttribute("age", age);
        return "greeting";
    }
}
