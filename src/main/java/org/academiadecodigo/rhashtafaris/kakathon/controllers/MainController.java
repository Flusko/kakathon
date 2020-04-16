package org.academiadecodigo.rhashtafaris.kakathon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/signup")
    public String signUp() {
        return "signup";
    }
}
