package com.corhuila.AgendaManager.repository;

import com.corhuila.AgendaManager.entity.LaboresExtensionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface LaboresExtensionRepository extends JpaRepository<LaboresExtensionEntity, Long> {
    Optional<LaboresExtensionEntity> findByFormularioId(Long idFormulario);
}
