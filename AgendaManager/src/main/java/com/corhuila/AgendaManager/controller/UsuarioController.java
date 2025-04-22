package com.corhuila.AgendaManager.controller;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.corhuila.AgendaManager.Dto.UsuarioDTO;
import com.corhuila.AgendaManager.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> getAllUsuarios() {
        return ResponseEntity.ok(usuarioService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> getUsuarioById(@PathVariable Long id) {
        UsuarioDTO usuario = usuarioService.findById(id);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/perfil")
    public UsuarioDTO getPerfil(@RequestParam String correo) {
        return usuarioService.findByCorreo(correo);
    }

    public UsuarioService getUsuarioService() {
        return usuarioService;
    }
}
