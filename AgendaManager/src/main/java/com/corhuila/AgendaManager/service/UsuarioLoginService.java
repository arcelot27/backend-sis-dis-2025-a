package com.corhuila.AgendaManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.AgendaManager.Dto.LoginRequestDto;
import com.corhuila.AgendaManager.Dto.LoginResponseDto;
import com.corhuila.AgendaManager.entity.UsuarioLoginEntity;
import com.corhuila.AgendaManager.repository.UsuarioLoginRepository;

@Service
public class UsuarioLoginService {

    @Autowired
    private UsuarioLoginRepository repository;

    public LoginResponseDto login(LoginRequestDto request) {
        UsuarioLoginEntity user = repository.findByUsuario(request.getUsuario())
            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        if (!user.getContrasena().equals(request.getContrasena())) {
            throw new RuntimeException("Contraseña incorrecta");
        }

        return new LoginResponseDto("Login exitoso", user.getRol());
    }
}

