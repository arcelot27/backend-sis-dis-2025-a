package com.corhuila.AgendaManager.service;

import com.corhuila.AgendaManager.Dto.UsuarioDTO;
import com.corhuila.AgendaManager.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public List<UsuarioDTO> findAll() {
        return usuarioRepository.findAll().stream()
            .map(usuario -> new UsuarioDTO(usuario.getId(), usuario.getNombre()))
            .toList();
    }
}