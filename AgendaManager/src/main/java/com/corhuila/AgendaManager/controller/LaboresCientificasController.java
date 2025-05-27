package com.corhuila.AgendaManager.controller;

import com.corhuila.AgendaManager.Dto.LaboresCientificasDTO;
import com.corhuila.AgendaManager.entity.HistorialFormulario;
import com.corhuila.AgendaManager.service.HistorialFormularioService;
import com.corhuila.AgendaManager.service.LaboresCientificasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/labores-cientificas")
@CrossOrigin(origins = "http://localhost:4200")
public class LaboresCientificasController {

    @Autowired
    private LaboresCientificasService service;

    @Autowired
    private HistorialFormularioService historialFormularioService;

    @PostMapping
    public ResponseEntity<?> guardarLaboresCientificas(@RequestBody LaboresCientificasDTO dto) {
        try {
            service.guardarLabores(dto);

            HistorialFormulario historial = new HistorialFormulario();
            historial.setFecha(LocalDateTime.now());
            historial.setAccion("Formulario enviado");
            historial.setUsuario("Docente");
            historial.setDescripcion("Labores científicas guardadas");
            historialFormularioService.save(historial);

            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("{\"error\":\"Error al guardar labores científicas\"}");
        }
    }
}
