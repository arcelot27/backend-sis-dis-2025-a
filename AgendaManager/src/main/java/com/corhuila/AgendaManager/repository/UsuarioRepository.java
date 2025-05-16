package com.corhuila.AgendaManager.repository;

import com.corhuila.AgendaManager.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCorreoAndContrasena(String correo, String contrasena);
    Optional<Usuario> findByCorreo(String correo);
}
