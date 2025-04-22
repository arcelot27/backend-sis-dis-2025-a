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

    // Método para guardar un nuevo usuario
    @Override
    public UsuarioDTO save(UsuarioDTO usuarioDTO) {
        Usuario usuario = mapToEntity(usuarioDTO);  // Convertir DTO a Entity
        Usuario usuarioGuardado = repository.save(usuario); // Guardar en la base de datos
        return mapToDTO(usuarioGuardado);  // Retornar el DTO del usuario guardado
    }

    // Convertir Entity a DTO
    private UsuarioDTO mapToDTO(Usuario entity) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        dto.setCorreo(entity.getCorreo());
        dto.setRol(entity.getRol());
        dto.setContrasena(entity.getContrasena());
        // Asignar cualquier otro campo adicional aquí si es necesario
        return dto;
    }

    // Convertir DTO a Entity
    private Usuario mapToEntity(UsuarioDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setId(dto.getId());  // Mapea el ID
        usuario.setNombre(dto.getNombre());  // Mapea el nombre
        usuario.setCorreo(dto.getCorreo());  // Mapea el correo
        usuario.setRol(dto.getRol());  // Mapea el rol
        usuario.setContrasena(dto.getContrasena());  // Mapea la contraseña
        // Mapear los nuevos campos si es necesario
        return usuario;
    }
}
