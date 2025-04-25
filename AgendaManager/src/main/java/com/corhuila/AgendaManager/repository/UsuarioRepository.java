package com.corhuila.AgendaManager.repository;

import com.corhuila.AgendaManager.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
}
