package com.corhuila.AgendaManager.service;

import com.corhuila.AgendaManager.entity.UsuarioLoginEntity;
import com.corhuila.AgendaManager.repository.UsuarioLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioLoginService implements IUsuarioLoginService {

    @Autowired
    private UsuarioLoginRepository usuarioLoginRepository;

    @Override
    public Optional<UsuarioLoginEntity> validarCredenciales(String usuario, String contrasena) {
        return usuarioLoginRepository.findByUsuarioAndContrasena(usuario, contrasena);
    }
}

