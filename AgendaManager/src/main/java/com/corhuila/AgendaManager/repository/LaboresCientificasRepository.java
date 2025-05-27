package com.corhuila.AgendaManager.repository;

import com.corhuila.AgendaManager.entity.LaboresCientificasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface LaboresCientificasRepository extends JpaRepository<LaboresCientificasEntity, Long> {
    Optional<LaboresCientificasEntity> findByFormularioId(Long idFormulario);
}
