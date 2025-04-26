package com.corhuila.AgendaManager.repository;

import com.corhuila.AgendaManager.entity.LaboresAcademicasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboresAcademicasRepository extends JpaRepository<LaboresAcademicasEntity, Long> {
   
}