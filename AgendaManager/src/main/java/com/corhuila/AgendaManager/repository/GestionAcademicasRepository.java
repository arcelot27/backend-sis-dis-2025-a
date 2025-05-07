package com.corhuila.AgendaManager.repository;

import com.corhuila.AgendaManager.entity.GestionAcademicasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestionAcademicasRepository extends JpaRepository<GestionAcademicasEntity, Long> {
}
