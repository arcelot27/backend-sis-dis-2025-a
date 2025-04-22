package com.corhuila.AgendaManager.service;

import com.corhuila.AgendaManager.Dto.UsuarioDTO;
import com.corhuila.AgendaManager.entity.Usuario;
import com.corhuila.AgendaManager.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsuarioService implements IUsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<UsuarioDTO> findAll() {
        return repository.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    @Override
    public UsuarioDTO findById(Long ID_Usuario) {
        return repository.findById(ID_Usuario).map(this::mapToDTO).orElse(null);
    }

    @Override
    public UsuarioDTO findByCorreo(String correo) {
        Optional<Usuario> entity = repository.findByCorreo(correo);
        return entity.map(this::mapToDTO).orElse(null);
    }

    private UsuarioDTO mapToDTO(Usuario entity) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        dto.setCorreo(entity.getCorreo());
        dto.setRol(entity.getRol());
        return dto;
    }
}