package com.corhuila.AgendaManager.controller;

import com.corhuila.AgendaManager.Dto.LaboresAcademicasDTO;
import com.corhuila.AgendaManager.entity.HistorialFormulario;
import com.corhuila.AgendaManager.service.HistorialFormularioService;
import com.corhuila.AgendaManager.service.LaboresAcademicasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;


@RestController
@RequestMapping("/api/labores-academicas")
@CrossOrigin(origins = "http://agendamanager.s3-website.us-east-2.amazonaws.com")
public class LaboresAcademicasController {

    @Autowired
    private LaboresAcademicasService service;

    @Autowired
    private HistorialFormularioService historialFormularioService;

    @PostMapping
    public ResponseEntity<?> guardarLaboresAcademicas(@RequestBody LaboresAcademicasDTO dto) {
        try {
            service.guardarLaboresAcademicas(dto);

            HistorialFormulario historial = new HistorialFormulario();
            historial.setFecha(LocalDateTime.now());
            historial.setAccion("Formulario enviado");
            historial.setUsuario("Docente");
            historial.setDescripcion("Labores académicas guardadas");
            historial.setIdUsuario(dto.getIdUsuario());
            historial.setIdUsuario(dto.getIdUsuario());

            historialFormularioService.save(historial);

            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body("{\"error\":\"Error al guardar labores académicas\"}");
        }
    }
}
