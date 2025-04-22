package com.corhuila.AgendaManager.controller;


import com.corhuila.AgendaManager.Dto.UsuarioDTO;
import com.corhuila.AgendaManager.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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

    @GetMapping("/{ID_Usuario}")
    public ResponseEntity<UsuarioDTO> getUsuarioById(@PathVariable Long ID_Usuario) {
        return ResponseEntity.ok(usuarioService.findById(ID_Usuario));
    }

    @GetMapping("/perfil")
    public UsuarioDTO getPerfil(@RequestParam String correo) {
        return usuarioService.findByCorreo(correo);
    }
}