package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    @GetMapping("")
    public String index() {
        System.out.println("Método index de MainController ejecutándose");
        return "index";
    }
    @GetMapping("/about")
    public String about() {
        System.out.println("Método about de MainController ejecutándose");
        return "about";
    }
}
