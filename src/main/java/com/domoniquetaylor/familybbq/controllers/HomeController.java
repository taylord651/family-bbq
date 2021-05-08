package com.domoniquetaylor.familybbq.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("add")
    public String add() {
        return "add";
    }

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @GetMapping ("register")
    public String register() {
        return "register";
    }
}
