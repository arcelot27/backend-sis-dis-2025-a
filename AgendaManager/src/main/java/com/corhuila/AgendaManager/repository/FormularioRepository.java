package com.corhuila.AgendaManager.repository;

import com.corhuila.AgendaManager.entity.FormularioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormularioRepository extends JpaRepository<FormularioEntity, Long> {
}