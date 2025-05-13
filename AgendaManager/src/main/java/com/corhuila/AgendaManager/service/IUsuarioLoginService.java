package com.corhuila.AgendaManager.service;

import com.corhuila.AgendaManager.entity.UsuarioLoginEntity;
import java.util.Optional;

public interface IUsuarioLoginService {
    Optional<UsuarioLoginEntity> validarCredenciales(String usuario, String contrasena);
}
