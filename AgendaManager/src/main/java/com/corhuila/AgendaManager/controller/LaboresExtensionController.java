package com.corhuila.AgendaManager.controller;

import com.corhuila.AgendaManager.Dto.LaboresExtensionDTO;
import com.corhuila.AgendaManager.service.LaboresExtensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/labores-extension")
@CrossOrigin(origins = "http://localhost:4200")
public class LaboresExtensionController {

    @Autowired
    private LaboresExtensionService service;

    @PostMapping
    public ResponseEntity<String> guardar(@RequestBody LaboresExtensionDTO dto) {
        service.guardar(dto);
        return ResponseEntity.ok("✅ Labores de extensión guardadas correctamente.");
    }
}

