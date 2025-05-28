package com.corhuila.AgendaManager.repository;

import com.corhuila.AgendaManager.entity.HistorialFormulario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HistorialFormularioRepository extends JpaRepository<HistorialFormulario, Long> {
    List<HistorialFormulario> findByIdUsuario(Long idUsuario);

    List<HistorialFormulario> findByIdUsuarioAndEstado(Long idUsuario, String estado);


    // Buscar por formulario.id
    Optional<HistorialFormulario> findFirstByFormulario_Id(Long idFormulario);

    // ✅ CORRECTO: buscar por ID del formulario y estado
    Optional<HistorialFormulario> findFirstByFormulario_IdAndEstado(Long idFormulario, String estado);



}
