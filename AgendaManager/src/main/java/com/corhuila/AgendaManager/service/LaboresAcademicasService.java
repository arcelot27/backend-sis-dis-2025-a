package com.corhuila.AgendaManager.service;

import com.corhuila.AgendaManager.Dto.LaboresAcademicasDTO;
import com.corhuila.AgendaManager.entity.LaboresAcademicasEntity;
import com.corhuila.AgendaManager.repository.LaboresAcademicasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaboresAcademicasService {

    @Autowired
    private LaboresAcademicasRepository repository;

    public void guardarLabores(LaboresAcademicasDTO dto) {
        LaboresAcademicasEntity entity = new LaboresAcademicasEntity();

        entity.setNombreAsignatura(dto.getNombreAsignatura());
        entity.setPrograma(dto.getPrograma());
        entity.setGrupo(dto.getGrupo());
        entity.setSede(dto.getSede());
        entity.setHorasSemanales(dto.getHorasSemanales());
        entity.setHorasSemestrales(dto.getHorasSemestrales());

        entity.setPrepHorasSemana(dto.getPrepHorasSemana());
        entity.setPrepHorasSemestre(dto.getPrepHorasSemestre());
        entity.setPrepDescripcion(dto.getPrepDescripcion());
        entity.setPrepProducto(dto.getPrepProducto());

        entity.setEvalHorasSemana(dto.getEvalHorasSemana());
        entity.setEvalHorasSemestre(dto.getEvalHorasSemestre());
        entity.setEvalDescripcion(dto.getEvalDescripcion());
        entity.setEvalProducto(dto.getEvalProducto());

        entity.setEventosHorasSemana(dto.getEventosHorasSemana());
        entity.setEventosHorasSemestre(dto.getEventosHorasSemestre());
        entity.setEventosDescripcion(dto.getEventosDescripcion());
        entity.setEventosProducto(dto.getEventosProducto());

        entity.setAcompHorasSemana(dto.getAcompHorasSemana());
        entity.setAcompHorasSemestre(dto.getAcompHorasSemestre());
        entity.setAcompDescripcion(dto.getAcompDescripcion());
        entity.setAcompProducto(dto.getAcompProducto());

        entity.setCursosHorasSemana(dto.getCursosHorasSemana());
        entity.setCursosHorasSemestre(dto.getCursosHorasSemestre());
        entity.setCursosDescripcion(dto.getCursosDescripcion());
        entity.setCursosProducto(dto.getCursosProducto());

        entity.setEmprendHorasSemana(dto.getEmprendHorasSemana());
        entity.setEmprendHorasSemestre(dto.getEmprendHorasSemestre());
        entity.setEmprendDescripcion(dto.getEmprendDescripcion());
        entity.setEmprendProducto(dto.getEmprendProducto());

        repository.save(entity);
    }
}