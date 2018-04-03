package com.esfb.counterfeitnote.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.name}")
    private String appName;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("appName", appName);
        return "";
    }

}
