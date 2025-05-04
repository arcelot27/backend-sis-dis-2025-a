package com.corhuila.AgendaManager.controller;

import com.corhuila.AgendaManager.Dto.LaboresAcademicasDTO;
import com.corhuila.AgendaManager.service.LaboresAcademicasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/labores-academicas")
@CrossOrigin(origins = "http://localhost:4200")
public class LaboresAcademicasController {

    @Autowired
    private LaboresAcademicasService service;   

    @PostMapping
    public ResponseEntity<?> guardarLaboresAcademicas(@RequestBody LaboresAcademicasDTO dto) {
        if (dto.getNombreAsignatura() == null || dto.getPrograma() == null || dto.getHorasSemanales() == null) {
            return ResponseEntity.badRequest().body("Faltan campos obligatorios");
        }
        service.guardarLaboresAcademicas(dto);
        return ResponseEntity.ok().body("{\"mensaje\":\"Labores académicas guardadas correctamente\"}");
    }
    
}