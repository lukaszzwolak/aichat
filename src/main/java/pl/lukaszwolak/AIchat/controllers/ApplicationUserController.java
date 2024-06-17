package pl.lukaszwolak.AIchat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationUserController {

    @GetMapping("")
    public String showHomePage() {
        System.out.println("user controller");
        return "index";
    }
}
