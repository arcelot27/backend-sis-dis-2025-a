package com.corhuila.AgendaManager.controller;

import com.corhuila.AgendaManager.Dto.LaboresCientificasDTO;
import com.corhuila.AgendaManager.service.LaboresCientificasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController 
@RequestMapping("/api/labores-cientificas")
@CrossOrigin(origins = "http://localhost:4200")
public class LaboresCientificasController {

    @Autowired
    private LaboresCientificasService service;

    @PostMapping
    public ResponseEntity<?> guardarLaboresCientificas(@RequestBody LaboresCientificasDTO dto) {
        try {
            service.guardarLabores(dto);
            return ResponseEntity.ok("✅ Labores científicas guardadas correctamente.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("❌ Error al guardar labores científicas: " + e.getMessage());
        }
    }
}
