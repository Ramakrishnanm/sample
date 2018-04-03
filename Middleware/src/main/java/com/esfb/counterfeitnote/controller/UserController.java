package com.esfb.counterfeitnote.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String userLogin(Model model) {
        return "Welcome";
    }

}
