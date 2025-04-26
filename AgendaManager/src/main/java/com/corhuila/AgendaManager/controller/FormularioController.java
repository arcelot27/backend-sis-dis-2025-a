package com.corhuila.AgendaManager.controller;

import com.corhuila.AgendaManager.Dto.FormularioDTO;
import com.corhuila.AgendaManager.entity.FormularioEntity;
import com.corhuila.AgendaManager.service.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/formulario")
@CrossOrigin(origins = "http://localhost:4200")
public class FormularioController {

    @Autowired
    private FormularioService service;

    @PostMapping
    public ResponseEntity<FormularioEntity> crearFormulario(@RequestBody FormularioDTO dto) {
        if (dto.nombres == null || dto.apellidos == null || dto.facultad == null) {
            return ResponseEntity.badRequest().build();
        }
        FormularioEntity formulario = service.guardarFormulario(dto);
        return ResponseEntity.ok(formulario);
    }
}