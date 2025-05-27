package com.corhuila.AgendaManager.controller;

import com.corhuila.AgendaManager.Dto.LaboresExtensionDTO;
import com.corhuila.AgendaManager.entity.HistorialFormulario;
import com.corhuila.AgendaManager.service.HistorialFormularioService;
import com.corhuila.AgendaManager.service.LaboresExtensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/labores-extension")
@CrossOrigin(origins = "http://localhost:4200")
public class ExtensionCulturalesController {

    @Autowired
    private LaboresExtensionService service;

    @Autowired
    private HistorialFormularioService historialFormularioService;

    @PostMapping
    public ResponseEntity<?> guardarLaboresExtension(@RequestBody LaboresExtensionDTO dto) {
        try {
            service.guardar(dto);

            HistorialFormulario historial = new HistorialFormulario();
            historial.setFecha(LocalDateTime.now());
            historial.setAccion("Formulario enviado");
            historial.setUsuario("Docente");
            historial.setDescripcion("Labores de extensión y culturales guardadas");
            historialFormularioService.save(historial);

            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("{\"error\":\"Error al guardar labores de extensión\"}");
        }
    }
}
