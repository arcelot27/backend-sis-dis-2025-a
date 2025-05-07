
package com.corhuila.AgendaManager.service;

import com.corhuila.AgendaManager.entity.GestionAcademicasEntity;
import com.corhuila.AgendaManager.repository.GestionAcademicasRepository;
import com.corhuila.AgendaManager.Dto.GestionAcademicaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GestionAcademicasService {

    @Autowired
    private GestionAcademicasRepository repository;

    public void guardarGestionAcademica(GestionAcademicaDTO dto) {
        GestionAcademicasEntity entity = new GestionAcademicasEntity();

        entity.setId_formulario(dto.getIdformulario());
        entity.setJurado_horas_semana(dto.getJurado_horas_semana());
        entity.setJurado_horas_semestre(dto.getJurado_horas_semestre());
        entity.setJurado_descripcion(dto.getJurado_descripcion());
        entity.setJurado_producto(dto.getJurado_producto());

        entity.setRegistros_horas_semana(dto.getRegistros_horas_semana());
        entity.setRegistros_horas_semestre(dto.getRegistros_horas_semestre());
        entity.setRegistros_descripcion(dto.getRegistros_descripcion());
        entity.setRegistros_producto(dto.getRegistros_producto());

        entity.setAcreditacion_horas_semana(dto.getAcreditacion_horas_semana());
        entity.setAcreditacion_horas_semestre(dto.getAcreditacion_horas_semestre());
        entity.setAcreditacion_descripcion(dto.getAcreditacion_descripcion());
        entity.setAcreditacion_producto(dto.getAcreditacion_producto());

        entity.setConsejos_horas_semana(dto.getConsejos_horas_semana());
        entity.setConsejos_horas_semestre(dto.getConsejos_horas_semestre());
        entity.setConsejos_descripcion(dto.getConsejos_descripcion());
        entity.setConsejos_producto(dto.getConsejos_producto());

        entity.setAutoevaluacion_horas_semana(dto.getAutoevaluacion_horas_semana());
        entity.setAutoevaluacion_horas_semestre(dto.getAutoevaluacion_horas_semestre());
        entity.setAutoevaluacion_descripcion(dto.getAutoevaluacion_descripcion());
        entity.setAutoevaluacion_producto(dto.getAutoevaluacion_producto());

        entity.setInvestigaciones_mercado_horas_semana(dto.getInvestigaciones_mercado_horas_semana());
        entity.setInvestigaciones_mercado_horas_semestre(dto.getInvestigaciones_mercado_horas_semestre());
        entity.setInvestigaciones_mercado_descripcion(dto.getInvestigaciones_mercado_descripcion());
        entity.setInvestigaciones_mercado_producto(dto.getInvestigaciones_mercado_producto());

        entity.setFormacion_profesores_horas_semana(dto.getFormacion_profesores_horas_semana());
        entity.setFormacion_profesores_horas_semestre(dto.getFormacion_profesores_horas_semestre());
        entity.setFormacion_profesores_descripcion(dto.getFormacion_profesores_descripcion());
        entity.setFormacion_profesores_producto(dto.getFormacion_profesores_producto());

        entity.setExtramuros_horas_semana(dto.getExtramuros_horas_semana());
        entity.setExtramuros_horas_semestre(dto.getExtramuros_horas_semestre());
        entity.setExtramuros_descripcion(dto.getExtramuros_descripcion());
        entity.setExtramuros_producto(dto.getExtramuros_producto());

        entity.setValidaciones_horas_semana(dto.getValidaciones_horas_semana());
        entity.setValidaciones_horas_semestre(dto.getValidaciones_horas_semestre());
        entity.setValidaciones_descripcion(dto.getValidaciones_descripcion());
        entity.setValidaciones_producto(dto.getValidaciones_producto());

        entity.setCtei_horas_semana(dto.getCtei_horas_semana());
        entity.setCtei_horas_semestre(dto.getCtei_horas_semestre());
        entity.setCtei_descripcion(dto.getCtei_descripcion());
        entity.setCtei_producto(dto.getCtei_producto());

        entity.setResultados_aprendizaje_horas_semana(dto.getResultados_aprendizaje_horas_semana());
        entity.setResultados_aprendizaje_horas_semestre(dto.getResultados_aprendizaje_horas_semestre());
        entity.setResultados_aprendizaje_descripcion(dto.getResultados_aprendizaje_descripcion());
        entity.setResultados_aprendizaje_producto(dto.getResultados_aprendizaje_producto());

        repository.save(entity);
    }
}
