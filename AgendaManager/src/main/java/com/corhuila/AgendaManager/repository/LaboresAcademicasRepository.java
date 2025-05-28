package com.corhuila.AgendaManager.repository;

import com.corhuila.AgendaManager.entity.LaboresAcademicasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface LaboresAcademicasRepository extends JpaRepository<LaboresAcademicasEntity, Long> {
    Optional<LaboresAcademicasEntity> findByFormularioId(Long idFormulario);
}
