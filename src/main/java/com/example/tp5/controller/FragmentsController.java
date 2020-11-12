package com.example.tp5.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class FragmentsController {

    @GetMapping("/fragments")
    public String getHome() {
        return "fragments.html";
    }

    @GetMapping("/navbar")
    public String markupPage() {
        return "markup.html";
    }
}
