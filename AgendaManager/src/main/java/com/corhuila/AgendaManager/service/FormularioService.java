package com.corhuila.AgendaManager.service;

import com.corhuila.AgendaManager.Dto.FormularioDTO;
import com.corhuila.AgendaManager.entity.FormularioEntity;
import com.corhuila.AgendaManager.repository.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormularioService {

    @Autowired
    private FormularioRepository repository;

    public FormularioEntity guardarFormulario(FormularioDTO dto) {
        FormularioEntity entity = new FormularioEntity();
        entity.setNombres(dto.nombres);
        entity.setApellidos(dto.apellidos);
        entity.setFacultad(dto.facultad);
        entity.setPrograma(dto.programa);
        entity.setFecha(dto.fecha);
        entity.setPeriodo(dto.periodo);
        entity.setNombreAsignatura(dto.nombreAsignatura);
        entity.setGrupo(dto.grupo);
        entity.setSede(dto.sede);
        entity.setHorasSemanales(dto.horasSemanales);
        entity.setHorasSemestrales(dto.horasSemestrales);
        entity.setPreparacionClases(dto.preparacionClases);
        entity.setEvaluacionAprendizajes(dto.evaluacionAprendizajes);
        entity.setGestionEventos(dto.gestionEventos);
        entity.setAcompanamiento(dto.acompanamiento);
        entity.setCursosFortalecimiento(dto.cursosFortalecimiento);
        entity.setAsesoriaEmprendimiento(dto.asesoriaEmprendimiento);
        return repository.save(entity);
    }
}