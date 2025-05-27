
package com.corhuila.AgendaManager.service;

import com.corhuila.AgendaManager.Dto.FormularioDTO;
import com.corhuila.AgendaManager.entity.FormularioEntity;
import com.corhuila.AgendaManager.entity.Usuario;
import com.corhuila.AgendaManager.repository.FormularioRepository;
import com.corhuila.AgendaManager.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import com.corhuila.AgendaManager.Dto.FormularioCompletoDTO;
import com.corhuila.AgendaManager.repository.LaboresAcademicasRepository;
import com.corhuila.AgendaManager.repository.LaboresCientificasRepository;
import com.corhuila.AgendaManager.repository.LaboresExtensionRepository;
import com.corhuila.AgendaManager.repository.GestionAcademicasRepository;

@Service
public class FormularioService {

    @Autowired
    private FormularioRepository repository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public FormularioEntity guardarFormulario(FormularioDTO dto, Long idUsuario) {
        FormularioEntity formulario = new FormularioEntity();
        formulario.setNombres(dto.getNombres());
        formulario.setApellidos(dto.getApellidos());
        formulario.setFacultad(dto.getFacultad());
        formulario.setPrograma(dto.getPrograma());
        formulario.setFecha(dto.getFecha());
        formulario.setPeriodo(dto.getPeriodo());
        formulario.setIdUsuario(idUsuario);

        return repository.save(formulario);
    }

    public Long obtenerIdUsuarioPorCorreo(String correo) {
        Optional<Usuario> usuario = usuarioRepository.findByCorreo(correo);
        return usuario.map(Usuario::getIdUsuario).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    @Autowired
    private LaboresAcademicasRepository laboresAcademicasRepository;

    @Autowired
    private LaboresCientificasRepository laboresCientificasRepository;

    @Autowired
    private LaboresExtensionRepository laboresExtensionRepository;

    @Autowired
    private GestionAcademicasRepository gestionAcademicasRepository;

    public FormularioCompletoDTO obtenerFormularioCompleto(Long idFormulario) {
        FormularioEntity formulario = repository.findById(idFormulario)
                .orElseThrow(() -> new RuntimeException("Formulario no encontrado"));

        FormularioCompletoDTO dto = new FormularioCompletoDTO();
        dto.setNombres(formulario.getNombres());
        dto.setApellidos(formulario.getApellidos());
        dto.setFacultad(formulario.getFacultad());
        dto.setPrograma(formulario.getPrograma());
        dto.setFecha(formulario.getFecha() != null ? formulario.getFecha().toString() : "");
        dto.setPeriodo(formulario.getPeriodo());

        laboresAcademicasRepository.findByFormularioId(idFormulario).ifPresent(la -> {
            dto.setNombreAsignatura(la.getNombreAsignatura());
            dto.setGrupo(la.getGrupo());
            dto.setSede(la.getSede());
            dto.setHorasSemana(la.getHorasSemanales());
            dto.setHorasSemestre(la.getHorasSemestrales());
            dto.setPrepHorasSemana(la.getPrepHorasSemana());
            dto.setPrepHorasSemestre(la.getPrepHorasSemestre());
            dto.setPrepDescripcion(la.getPrepDescripcion());
            dto.setPrepProducto(la.getPrepProducto());
            dto.setEvalHorasSemana(la.getEvalHorasSemana());
            dto.setEvalHorasSemestre(la.getEvalHorasSemestre());
            dto.setEvalDescripcion(la.getEvalDescripcion());
            dto.setEvalProducto(la.getEvalProducto());
            dto.setEventosHorasSemana(la.getEventosHorasSemana());
            dto.setEventosHorasSemestre(la.getEventosHorasSemestre());
            dto.setEventosDescripcion(la.getEventosDescripcion());
            dto.setEventosProducto(la.getEventosProducto());
            dto.setAcompHorasSemana(la.getAcompHorasSemana());
            dto.setAcompHorasSemestre(la.getAcompHorasSemestre());
            dto.setAcompDescripcion(la.getAcompDescripcion());
            dto.setAcompProducto(la.getAcompProducto());
            dto.setCursoHorasSemana(la.getCursosHorasSemana());
            dto.setCursoHorasSemestre(la.getCursosHorasSemestre());
            dto.setCursoDescripcion(la.getCursosDescripcion());
            dto.setCursoProducto(la.getCursosProducto());

            dto.setAsesoriaHorasSemana(la.getEmprendHorasSemana());
            dto.setAsesoriaHorasSemestre(la.getEmprendHorasSemestre());
            dto.setAsesoriaDescripcion(la.getEmprendDescripcion());
            dto.setAsesoriaProducto(la.getEmprendProducto());

        });

        laboresCientificasRepository.findByFormularioId(idFormulario).ifPresent(lc -> {
            dto.setSemillerosHorasSemana(lc.getSemilleros_horas_semana());
            dto.setSemillerosHorasSemestre(lc.getSemilleros_horas_semestre());
            dto.setSemillerosDescripcion(lc.getSemilleros_descripcion());
            dto.setSemillerosProducto(lc.getSemilleros_producto());

            dto.setPropuestasHorasSemana(lc.getPropuestas_horas_semana());
            dto.setPropuestasHorasSemestre(lc.getPropuestas_horas_semestre());
            dto.setPropuestasDescripcion(lc.getPropuestas_descripcion());
            dto.setPropuestasProducto(lc.getPropuestas_producto());

            dto.setProyectosHorasSemana(lc.getProyectos_horas_semana());
            dto.setProyectosHorasSemestre(lc.getProyectos_horas_semestre());
            dto.setProyectosDescripcion(lc.getProyectos_descripcion());
            dto.setProyectosProducto(lc.getProyectos_producto());

            dto.setDireccionHorasSemana(lc.getGrupo_horas_semana());
            dto.setDireccionHorasSemestre(lc.getGrupo_horas_semestre());
            dto.setDireccionDescripcion(lc.getGrupo_descripcion());
            dto.setDireccionProducto(lc.getGrupo_producto());

            dto.setArticulosHorasSemana(lc.getArticulos_horas_semana());
            dto.setArticulosHorasSemestre(lc.getArticulos_horas_semestre());
            dto.setArticulosDescripcion(lc.getArticulos_descripcion());
            dto.setArticulosProducto(lc.getArticulos_producto());
        });

        laboresExtensionRepository.findByFormularioId(idFormulario).ifPresent(le -> {
            dto.setExtensionConsultoriaHorasSemana(le.getConsultoria_horas_semana());
            dto.setExtensionConsultoriaHorasSemestre(le.getConsultoria_horas_semestre());
            dto.setExtensionConsultoriaDescripcion(le.getConsultoria_descripcion());
            dto.setExtensionConsultoriaProducto(le.getConsultoria_producto());

            dto.setExtensionEmpresarialHorasSemana(le.getAcompanamiento_horas_semana());
            dto.setExtensionEmpresarialHorasSemestre(le.getAcompanamiento_horas_semestre());
            dto.setExtensionEmpresarialDescripcion(le.getAcompanamiento_descripcion());
            dto.setExtensionEmpresarialProducto(le.getAcompanamiento_producto());

            dto.setExtensionComunitariaHorasSemana(le.getIntervencion_horas_semana());
            dto.setExtensionComunitariaHorasSemestre(le.getIntervencion_horas_semestre());
            dto.setExtensionComunitariaDescripcion(le.getIntervencion_descripcion());
            dto.setExtensionComunitariaProducto(le.getIntervencion_producto());

            dto.setCulturalProyectosHorasSemana(le.getProyectos_culturales_horas_semana());
            dto.setCulturalProyectosHorasSemestre(le.getProyectos_culturales_horas_semestre());
            dto.setCulturalProyectosDescripcion(le.getProyectos_culturales_descripcion());
            dto.setCulturalProyectosProducto(le.getProyectos_culturales_producto());

            dto.setCulturalEducacionHorasSemana(le.getEducacion_artistica_horas_semana());
            dto.setCulturalEducacionHorasSemestre(le.getEducacion_artistica_horas_semestre());
            dto.setCulturalEducacionDescripcion(le.getEducacion_artistica_descripcion());
            dto.setCulturalEducacionProducto(le.getEducacion_artistica_producto());

            dto.setCulturalValoresHorasSemana(le.getDivulgacion_valores_horas_semana());
            dto.setCulturalValoresHorasSemestre(le.getDivulgacion_valores_horas_semestre());
            dto.setCulturalValoresDescripcion(le.getDivulgacion_valores_descripcion());
            dto.setCulturalValoresProducto(le.getDivulgacion_valores_producto());
        });

        gestionAcademicasRepository.findByFormularioId(idFormulario).ifPresent(ga -> {
            dto.setGestionJuradoHorasSemana(ga.getJurado_horas_semana());
            dto.setGestionJuradoHorasSemestre(ga.getJurado_horas_semestre());
            dto.setGestionJuradoDescripcion(ga.getJurado_descripcion());
            dto.setGestionJuradoProducto(ga.getJurado_producto());

            dto.setGestionRegistrosHorasSemana(ga.getRegistros_horas_semana());
            dto.setGestionRegistrosHorasSemestre(ga.getRegistros_horas_semestre());
            dto.setGestionRegistrosDescripcion(ga.getRegistros_descripcion());
            dto.setGestionRegistrosProducto(ga.getRegistros_producto());

            dto.setGestionAcreditacionHorasSemana(ga.getAcreditacion_horas_semana());
            dto.setGestionAcreditacionHorasSemestre(ga.getAcreditacion_horas_semestre());
            dto.setGestionAcreditacionDescripcion(ga.getAcreditacion_descripcion());
            dto.setGestionAcreditacionProducto(ga.getAcreditacion_producto());

            dto.setGestionComitesHorasSemana(ga.getConsejos_horas_semana());
            dto.setGestionComitesHorasSemestre(ga.getConsejos_horas_semestre());
            dto.setGestionComitesDescripcion(ga.getConsejos_descripcion());
            dto.setGestionComitesProducto(ga.getConsejos_producto());
        });

        return dto;
    }

}
