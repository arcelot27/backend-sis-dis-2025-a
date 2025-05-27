package com.corhuila.AgendaManager.controller;

import com.corhuila.AgendaManager.Dto.HistorialFormularioDto;
import com.corhuila.AgendaManager.Dto.RevisionDTO;
import com.corhuila.AgendaManager.entity.HistorialFormulario;
import com.corhuila.AgendaManager.exportar.ExportarExcelService;
import com.corhuila.AgendaManager.service.HistorialFormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.io.ByteArrayInputStream;
import java.util.List;

@RestController
@RequestMapping("/api/historial")
@CrossOrigin(origins = "http://localhost:4200")
public class HistorialFormularioController {

    @Autowired
    private HistorialFormularioService historialFormularioService;

    @GetMapping("/usuario/{idUsuario}")
    public ResponseEntity<List<HistorialFormulario>> getByUsuario(@PathVariable Long idUsuario) {
        try {
            List<HistorialFormulario> historial = historialFormularioService.findByIdUsuario(idUsuario);

            // ✅ Forzar la carga del formulario si es lazy
            historial.forEach(h -> {
                if (h.getFormulario() != null) {
                    h.getFormulario().getIdFormulario(); // fuerza la inicialización del formulario
                }
            });

            return new ResponseEntity<>(historial, HttpStatus.OK);
        } catch (Exception e) {
            System.err.println("❌ Error al obtener historial: " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Autowired
    private ExportarExcelService exportarExcelService;

    @GetMapping("/descargar/{idFormulario}")
    public ResponseEntity<Resource> descargarFormulario(@PathVariable Long idFormulario) {
        try {
            byte[] contenido = exportarExcelService.generarPorFormulario(idFormulario);
            ByteArrayInputStream stream = new ByteArrayInputStream(contenido);
            InputStreamResource resource = new InputStreamResource(stream);

            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION,
                            "attachment; filename=formulario_" + idFormulario + ".xlsx")
                    .contentType(MediaType
                            .parseMediaType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
                    .body(resource);
        } catch (Exception e) {
            System.err.println("❌ Error al generar Excel: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping
    public ResponseEntity<List<HistorialFormularioDto>> getAll() {
        return new ResponseEntity<>(historialFormularioService.obtenerTodosDTO(), HttpStatus.OK);
    }

    @PutMapping("/aprobar/{idFormulario}")
    public ResponseEntity<?> aprobarFormulario(@PathVariable Long idFormulario, @RequestBody RevisionDTO revision) {
        try {
            historialFormularioService.aprobarFormulario(idFormulario, revision.getIdRevisor());
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al aprobar formulario: " + e.getMessage());
        }
    }

    @PutMapping("/denegar/{idFormulario}")
    public ResponseEntity<?> denegarFormulario(@PathVariable Long idFormulario, @RequestBody RevisionDTO revision) {
        try {
            historialFormularioService.denegarFormulario(idFormulario, revision.getIdRevisor(), revision.getMotivo());
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al denegar formulario: " + e.getMessage());
        }
    }

    @GetMapping("/devueltos/{idUsuario}")
    public ResponseEntity<List<HistorialFormularioDto>> obtenerFormulariosDevueltos(@PathVariable Long idUsuario) {
        List<HistorialFormularioDto> lista = historialFormularioService
                .obtenerFormulariosDevueltosPorUsuario(idUsuario);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

}
