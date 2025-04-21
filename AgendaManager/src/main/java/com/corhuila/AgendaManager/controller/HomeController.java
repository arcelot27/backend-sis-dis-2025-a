package com.corhuila.AgendaManager.controller;  // Ajusta el paquete según tu estructura

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of(
            "message", "Bienvenido a AgendaManager API",
            "endpoints", "/api/*"
        );
    }
}