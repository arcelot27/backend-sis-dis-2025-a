package com.corhuila.AgendaManager.service;

import com.corhuila.AgendaManager.entity.HistorialFormulario;
import com.corhuila.AgendaManager.entity.Usuario;
import com.corhuila.AgendaManager.repository.HistorialFormularioRepository;
import com.corhuila.AgendaManager.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.corhuila.AgendaManager.Dto.HistorialFormularioDto;

import com.corhuila.AgendaManager.Dto.RevisionDTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class HistorialFormularioService {

    @Autowired
    private HistorialFormularioRepository repository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<HistorialFormulario> findAll() {
        return repository.findAll();
    }

    public HistorialFormulario findById(Long id) {
        Optional<HistorialFormulario> optional = repository.findById(id);
        return optional.orElse(null);
    }

    public HistorialFormulario save(HistorialFormulario historialFormulario) {
        if (historialFormulario.getFecha() == null) {
            historialFormulario.setFecha(LocalDateTime.now());
        }
        return repository.save(historialFormulario);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<HistorialFormulario> findByIdUsuario(Long idUsuario) {
        return repository.findByIdUsuario(idUsuario); // ✅ CORREGIDO
    }

    public void registrarAccion(String accion, String descripcion, String usuario,
            com.corhuila.AgendaManager.entity.FormularioEntity formulario) {
        HistorialFormulario historial = new HistorialFormulario();
        historial.setFecha(LocalDateTime.now());
        historial.setAccion(accion);
        historial.setDescripcion(descripcion);
        historial.setUsuario(usuario);
        historial.setFormulario(formulario);
        historial.setEstado("pendiente"); // ✅ ESTADO por defecto
        repository.save(historial);
    }

    public void aprobarFormulario(Long idFormulario, Long revisorId) {
        Optional<HistorialFormulario> historialOpt = repository.findFirstByFormulario_IdAndEstado(idFormulario,
                "pendiente");

        if (historialOpt.isPresent()) {
            HistorialFormulario historial = historialOpt.get();
            historial.setEstado("aprobado");
            historial.setFechaRevision(LocalDateTime.now());
            historial.setRevisadoPor(revisorId);

            repository.save(historial);
        } else {
            throw new RuntimeException("No se encontró historial pendiente para el formulario con ID: " + idFormulario);
        }
    }

    public void denegarFormulario(Long idFormulario, Long revisorId, String motivo) {
        Optional<HistorialFormulario> historialOpt = repository.findFirstByFormulario_IdAndEstado(idFormulario,
                "pendiente");

        if (historialOpt.isPresent()) {
            HistorialFormulario historial = historialOpt.get();
            historial.setEstado("denegado");
            historial.setMotivoDenegacion(motivo);
            historial.setFechaRevision(LocalDateTime.now());
            historial.setRevisadoPor(revisorId);

            repository.save(historial);
        } else {
            throw new RuntimeException("No se encontró historial pendiente para el formulario con ID: " + idFormulario);
        }
    }

    public List<HistorialFormularioDto> obtenerTodosDTO() {
        List<HistorialFormulario> historialList = repository.findAll();

        return historialList.stream().map(item -> {
            HistorialFormularioDto dto = new HistorialFormularioDto();

            dto.setIdHistorial(item.getIdHistorial());
            dto.setFecha(item.getFecha());
            dto.setAccion(item.getAccion());
            dto.setUsuario(item.getUsuario());
            dto.setDescripcion(item.getDescripcion());
            dto.setRutaArchivo(item.getRutaArchivo());
            dto.setIdUsuario(item.getIdUsuario());

            if (item.getFormulario() != null) {
                dto.setIdFormulario(item.getFormulario().getIdFormulario());
            }

            dto.setEstado(item.getEstado());
            dto.setMotivoDenegacion(item.getMotivoDenegacion());
            dto.setRevisadoPor(item.getRevisadoPor());
            dto.setFechaRevision(item.getFechaRevision());

            // ✅ Obtener el nombre del revisor si existe
            if (item.getRevisadoPor() != null) {
                usuarioRepository.findById(item.getRevisadoPor()).ifPresentOrElse(
                        usuario -> dto.setNombreRevisor(usuario.getNombre()),
                        () -> System.out
                                .println("❌ Usuario no encontrado para ID revisadoPor: " + item.getRevisadoPor()));
            } else {
                dto.setNombreRevisor(null);
            }

            return dto;
        }).toList();
    }

    public List<HistorialFormularioDto> obtenerFormulariosDevueltosPorUsuario(Long idUsuario) {
        List<HistorialFormulario> lista = repository.findByIdUsuarioAndEstado(idUsuario, "denegado");

        return lista.stream().map(item -> {
            HistorialFormularioDto dto = new HistorialFormularioDto();

            dto.setIdHistorial(item.getIdHistorial());
            dto.setFecha(item.getFecha());
            dto.setAccion(item.getAccion());
            dto.setUsuario(item.getUsuario());
            dto.setDescripcion(item.getDescripcion());
            dto.setRutaArchivo(item.getRutaArchivo());
            dto.setIdUsuario(item.getIdUsuario());

            if (item.getFormulario() != null) {
                dto.setIdFormulario(item.getFormulario().getIdFormulario());
            }

            dto.setEstado(item.getEstado());
            dto.setMotivoDenegacion(item.getMotivoDenegacion());
            dto.setRevisadoPor(item.getRevisadoPor());
            dto.setFechaRevision(item.getFechaRevision());

            if (item.getRevisadoPor() != null) {
                usuarioRepository.findById(item.getRevisadoPor()).ifPresent(usuario -> {
                    dto.setNombreRevisor(usuario.getNombre());
                });
            }

            return dto;
        }).toList();
    }

}
