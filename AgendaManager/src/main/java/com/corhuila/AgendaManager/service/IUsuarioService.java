package com.corhuila.AgendaManager.service;

import com.corhuila.AgendaManager.Dto.UsuarioDTO;
import java.util.List;

public interface IUsuarioService {
    List<UsuarioDTO> findAll();
    UsuarioDTO findById(Long id);
    UsuarioDTO findByCorreo(String correo);
}