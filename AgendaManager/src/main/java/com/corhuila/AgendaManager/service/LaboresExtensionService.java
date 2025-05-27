// LaboresExtensionService.java
package com.corhuila.AgendaManager.service;

import com.corhuila.AgendaManager.Dto.LaboresExtensionDTO;
import com.corhuila.AgendaManager.entity.FormularioEntity;
import com.corhuila.AgendaManager.entity.LaboresExtensionEntity;
import com.corhuila.AgendaManager.repository.FormularioRepository;
import com.corhuila.AgendaManager.repository.LaboresExtensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaboresExtensionService {

    @Autowired
    private LaboresExtensionRepository repository;

    @Autowired
    private FormularioRepository formularioRepository;

    public void guardar(LaboresExtensionDTO dto) {
        LaboresExtensionEntity entity = new LaboresExtensionEntity();

        FormularioEntity formulario = formularioRepository.findById(dto.getId_formulario())
                .orElseThrow(() -> new RuntimeException("Formulario no encontrado"));
        entity.setFormulario(formulario);

        entity.setConsultoria_horas_semana(dto.getConsultoria_horas_semana());
        entity.setConsultoria_horas_semestre(dto.getConsultoria_horas_semestre());
        entity.setConsultoria_descripcion(dto.getConsultoria_descripcion());
        entity.setConsultoria_producto(dto.getConsultoria_producto());

        entity.setAcompanamiento_horas_semana(dto.getAcompanamiento_horas_semana());
        entity.setAcompanamiento_horas_semestre(dto.getAcompanamiento_horas_semestre());
        entity.setAcompanamiento_descripcion(dto.getAcompanamiento_descripcion());
        entity.setAcompanamiento_producto(dto.getAcompanamiento_producto());

        entity.setIntervencion_horas_semana(dto.getIntervencion_horas_semana());
        entity.setIntervencion_horas_semestre(dto.getIntervencion_horas_semestre());
        entity.setIntervencion_descripcion(dto.getIntervencion_descripcion());
        entity.setIntervencion_producto(dto.getIntervencion_producto());

        entity.setProyectos_culturales_horas_semana(dto.getProyectos_culturales_horas_semana());
        entity.setProyectos_culturales_horas_semestre(dto.getProyectos_culturales_horas_semestre());
        entity.setProyectos_culturales_descripcion(dto.getProyectos_culturales_descripcion());
        entity.setProyectos_culturales_producto(dto.getProyectos_culturales_producto());

        entity.setEducacion_artistica_horas_semana(dto.getEducacion_artistica_horas_semana());
        entity.setEducacion_artistica_horas_semestre(dto.getEducacion_artistica_horas_semestre());
        entity.setEducacion_artistica_descripcion(dto.getEducacion_artistica_descripcion());
        entity.setEducacion_artistica_producto(dto.getEducacion_artistica_producto());

        entity.setDivulgacion_valores_horas_semana(dto.getDivulgacion_valores_horas_semana());
        entity.setDivulgacion_valores_horas_semestre(dto.getDivulgacion_valores_horas_semestre());
        entity.setDivulgacion_valores_descripcion(dto.getDivulgacion_valores_descripcion());
        entity.setDivulgacion_valores_producto(dto.getDivulgacion_valores_producto());

        repository.save(entity);
    }
}