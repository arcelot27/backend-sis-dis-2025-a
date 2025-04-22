package com.corhuila.AgendaManager.service;

import com.corhuila.AgendaManager.Dto.UsuarioDTO;
import com.corhuila.AgendaManager.entity.Usuario;
import com.corhuila.AgendaManager.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Obtener todos los usuarios
    public List<UsuarioDTO> findAll() {
        return usuarioRepository.findAll().stream()
            .map(usuario -> new UsuarioDTO(
                usuario.getId(),
                usuario.getRol(),
                usuario.getNombre(),
                usuario.getCorreo(),
                usuario.getContrasena()
            ))
            .toList();
    }

    // Buscar usuario por ID
    public UsuarioDTO findById(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        return new UsuarioDTO(
            usuario.getId(),
            usuario.getRol(),
            usuario.getNombre(),
            usuario.getCorreo(),
            usuario.getContrasena()
        );
    }

    // Actualizar usuario
    public UsuarioDTO update(Long id, UsuarioDTO dto) {
        Usuario usuario = usuarioRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        usuario.setRol(dto.rol());
        usuario.setNombre(dto.nombre());
        usuario.setCorreo(dto.correo());
        usuario.setContrasena(dto.contrasena());

        usuarioRepository.save(usuario);

        return new UsuarioDTO(
            usuario.getId(),
            usuario.getRol(),
            usuario.getNombre(),
            usuario.getCorreo(),
            usuario.getContrasena()
        );
    }

    public UsuarioRepository getUsuarioRepository() {
        return usuarioRepository;
    }

    public UsuarioDTO findByCorreo(String correo) {
        Usuario usuario = usuarioRepository.findByCorreo(correo)
            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    
        return new UsuarioDTO(
            usuario.getId(),
            usuario.getRol(),
            usuario.getNombre(),
            usuario.getCorreo(),
            usuario.getContrasena()
    );
    }
}
