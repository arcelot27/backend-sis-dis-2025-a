package com.corhuila.AgendaManager.controller;

import com.corhuila.AgendaManager.Dto.FormularioDTO;
import com.corhuila.AgendaManager.entity.FormularioEntity;
import com.corhuila.AgendaManager.entity.HistorialFormulario;
import com.corhuila.AgendaManager.service.FormularioService;
import com.corhuila.AgendaManager.service.HistorialFormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/api/formulario")
@CrossOrigin(origins = "http://localhost:4200")
public class FormularioController {

    @Autowired
    private FormularioService formularioService;

    @Autowired
    private HistorialFormularioService historialFormularioService;

    @PostMapping
    public ResponseEntity<?> guardarFormulario(@RequestBody FormularioDTO dto) {
        try {
            Long idUsuario = dto.getIdUsuario();
            FormularioEntity formulario = formularioService.guardarFormulario(dto, idUsuario); // 👈 obtenemos el formulario guardado

            HistorialFormulario historial = new HistorialFormulario();
            historial.setFecha(LocalDateTime.now());
            historial.setAccion("Formulario enviado");
            historial.setUsuario(dto.getNombres() + " " + dto.getApellidos());
            historial.setDescripcion("Formulario de datos personales guardado");
            historial.setIdUsuario(idUsuario);
            historial.setFormulario(formulario); 

            historialFormularioService.save(historial);

            return ResponseEntity.ok(Map.of("id_formulario", formulario.getIdFormulario()));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("{\"error\":\"Error al guardar el formulario\"}");
        }
    }
}
