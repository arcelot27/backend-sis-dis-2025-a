package com.corhuila.AgendaManager.controller; 

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://agendamanager.s3-website.us-east-2.amazonaws.com")
public class HomeController {

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of(
            "message", "Bienvenido a AgendaManager API",
            "endpoints", "/api/*"
        );
    }
}