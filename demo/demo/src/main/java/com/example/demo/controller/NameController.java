package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class NameController {

    @GetMapping("/Name")
    public String getName() {
        return "Me llamo Daniel Perez";
    }
}