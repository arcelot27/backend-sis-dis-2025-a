package com.corhuila.AgendaManager.repository;

import com.corhuila.AgendaManager.entity.GestionAcademicasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface GestionAcademicasRepository extends JpaRepository<GestionAcademicasEntity, Long> {
    Optional<GestionAcademicasEntity> findByFormularioId(Long idFormulario);
}
