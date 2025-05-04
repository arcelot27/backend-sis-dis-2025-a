package com.corhuila.AgendaManager.repository;

import com.corhuila.AgendaManager.entity.LaboresCientificasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboresCientificasRepository extends JpaRepository<LaboresCientificasEntity, Long> {
}
