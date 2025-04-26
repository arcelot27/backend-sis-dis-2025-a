package com.corhuila.AgendaManager.service;

import com.corhuila.AgendaManager.entity.Usuario;
import com.corhuila.AgendaManager.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario obtenerPerfil() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios.isEmpty() ? null : usuarios.get(0); 
    }

    public Usuario actualizarUsuario(Integer id, String nombre, String contrasena) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        usuario.setNombre(nombre);
        usuario.setContrasena(contrasena);
        return usuarioRepository.save(usuario);
    }

}
