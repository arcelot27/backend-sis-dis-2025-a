package com.corhuila.AgendaManager.controller;

import com.corhuila.AgendaManager.Dto.HistorialFormularioDto;
import com.corhuila.AgendaManager.entity.HistorialFormulario;
import com.corhuila.AgendaManager.repository.HistorialFormularioRepository;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.core.io.Resource;
import org.springframework.core.io.FileSystemResource;

import java.util.List;
import java.util.stream.Collectors;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

@RestController
@RequestMapping("/api/historial")
@CrossOrigin(origins = "http://localhost:4200")
public class HistorialFormularioController {

    @Autowired
    private HistorialFormularioRepository historialRepository;

    // Obtener historial por usuario (usando DTO)
    @GetMapping("/{usuario}")
    public List<HistorialFormularioDto> obtenerHistorial(@PathVariable String usuario) {
        return historialRepository.findByUsuario(usuario)
                .stream()
                .map(h -> new HistorialFormularioDto(
                        h.getId(),
                        h.getFecha(),
                        h.getAccion(),
                        h.getUsuario(),
                        h.getDescripcion()))
                .collect(Collectors.toList());
    }

    // Descargar archivo asociado
    @GetMapping("/descargar/{id}")
    public ResponseEntity<Resource> descargarFormulario(@PathVariable Long id) throws IOException {
        HistorialFormulario registro = historialRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Formulario no encontrado"));

        Path ruta = Paths.get(registro.getRutaArchivo());
        Resource archivo = new FileSystemResource(ruta);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + ruta.getFileName() + "\"")
                .body(archivo);
    }
}
