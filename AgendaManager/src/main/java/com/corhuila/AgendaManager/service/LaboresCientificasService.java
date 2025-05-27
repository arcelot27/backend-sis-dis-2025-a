package com.corhuila.AgendaManager.service;

import com.corhuila.AgendaManager.Dto.LaboresCientificasDTO;
import com.corhuila.AgendaManager.entity.FormularioEntity;
import com.corhuila.AgendaManager.entity.LaboresCientificasEntity;
import com.corhuila.AgendaManager.repository.FormularioRepository;
import com.corhuila.AgendaManager.repository.LaboresCientificasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaboresCientificasService {

    @Autowired
    private LaboresCientificasRepository repository;

    @Autowired
    private FormularioRepository formularioRepository;

    public void guardarLabores(LaboresCientificasDTO dto) {
        LaboresCientificasEntity entity = new LaboresCientificasEntity();

     
        FormularioEntity formulario = formularioRepository.findById(dto.getId_formulario()).orElse(null);
        if (formulario == null) {
            throw new RuntimeException("Formulario no encontrado con ID: " + dto.getId_formulario());
        }
        entity.setFormulario(formulario);

        entity.setSemilleros_horas_semana(dto.getSemilleros_horas_semana());
        entity.setSemilleros_horas_semestre(dto.getSemilleros_horas_semestre());
        entity.setSemilleros_descripcion(dto.getSemilleros_descripcion());
        entity.setSemilleros_producto(dto.getSemilleros_producto());

        entity.setPropuestas_horas_semana(dto.getPropuestas_horas_semana());
        entity.setPropuestas_horas_semestre(dto.getPropuestas_horas_semestre());
        entity.setPropuestas_descripcion(dto.getPropuestas_descripcion());
        entity.setPropuestas_producto(dto.getPropuestas_producto());

        entity.setProyectos_horas_semana(dto.getProyectos_horas_semana());
        entity.setProyectos_horas_semestre(dto.getProyectos_horas_semestre());
        entity.setProyectos_descripcion(dto.getProyectos_descripcion());
        entity.setProyectos_producto(dto.getProyectos_producto());

        entity.setGrupo_horas_semana(dto.getGrupo_horas_semana());
        entity.setGrupo_horas_semestre(dto.getGrupo_horas_semestre());
        entity.setGrupo_descripcion(dto.getGrupo_descripcion());
        entity.setGrupo_producto(dto.getGrupo_producto());

        entity.setArticulos_horas_semana(dto.getArticulos_horas_semana());
        entity.setArticulos_horas_semestre(dto.getArticulos_horas_semestre());
        entity.setArticulos_descripcion(dto.getArticulos_descripcion());
        entity.setArticulos_producto(dto.getArticulos_producto());

      
        repository.save(entity);
    }

    public void save(LaboresCientificasDTO dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    public void guardarLaboresCientificas(LaboresCientificasDTO dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardarLaboresCientificas'");
    }
}
