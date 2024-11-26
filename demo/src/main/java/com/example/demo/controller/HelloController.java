package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")  // Ruta principal
    public String sayHello() {
        return "¡Hola, Mundo!";
    }
}

