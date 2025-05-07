package com.corhuila.AgendaManager.controller;

import com.corhuila.AgendaManager.Dto.GestionAcademicaDTO;
import com.corhuila.AgendaManager.service.GestionAcademicasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gestion-academica")
@CrossOrigin(origins = "http://localhost:4200")
public class GestionAcademicaController {

    @Autowired
    private GestionAcademicasService gestionAcademicasService;

    @PostMapping
    public ResponseEntity<?> guardarGestionAcademica(@RequestBody GestionAcademicaDTO datos) {
        gestionAcademicasService.guardarGestionAcademica(datos);
        return ResponseEntity.ok("Datos de gestión académica guardados correctamente");
    }
}
