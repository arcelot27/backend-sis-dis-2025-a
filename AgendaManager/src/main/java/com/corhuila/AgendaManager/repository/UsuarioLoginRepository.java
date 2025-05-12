package com.corhuila.AgendaManager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corhuila.AgendaManager.entity.UsuarioLoginEntity;


    public interface UsuarioLoginRepository extends JpaRepository<UsuarioLoginEntity, Long> {
    Optional<UsuarioLoginEntity> findByUsuario(String usuario);
}


