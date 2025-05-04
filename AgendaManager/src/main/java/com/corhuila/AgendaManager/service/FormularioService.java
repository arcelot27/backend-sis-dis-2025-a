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
        return repository.save(entity);
    }
}