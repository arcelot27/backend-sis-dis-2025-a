package com.corhuila.AgendaManager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corhuila.AgendaManager.entity.UsuarioLoginEntity;

@Repository
public interface UsuarioLoginRepository extends JpaRepository<UsuarioLoginEntity, Long> {
    Optional<UsuarioLoginEntity> findByUsuarioAndContrasena(String usuario, String contrasena);
}



