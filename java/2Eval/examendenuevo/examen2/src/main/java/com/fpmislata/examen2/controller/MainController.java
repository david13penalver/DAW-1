package com.fpmislata.examen2.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    public String index() {
        return "index";
    }

    public String about() {
        return "about";
    }
}
