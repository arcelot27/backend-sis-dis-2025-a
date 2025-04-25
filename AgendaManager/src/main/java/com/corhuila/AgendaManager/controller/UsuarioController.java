package com.corhuila.AgendaManager.controller;


import com.corhuila.AgendaManager.Dto.UsuarioDTO;
import com.corhuila.AgendaManager.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin (origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Obtener todos los usuarios
    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> getAllUsuarios() {
        return ResponseEntity.ok(usuarioService.findAll());
    }

    // Obtener usuario por ID
    @GetMapping("/{ID_Usuario}")
    public ResponseEntity<UsuarioDTO> getUsuarioById(@PathVariable Long ID_Usuario) {
        return ResponseEntity.ok(usuarioService.findById(ID_Usuario));
    }

    // Obtener perfil por correo
    @GetMapping("/perfil")
    public UsuarioDTO getPerfil(@RequestParam String correo) {
        return usuarioService.findByCorreo(correo);
    }

    // Guardar un nuevo usuario (desde formulario del frontend)
    @PostMapping("/guardar")
    public ResponseEntity<UsuarioDTO> saveUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        UsuarioDTO nuevoUsuario = usuarioService.save(usuarioDTO);
        return ResponseEntity.ok(nuevoUsuario);
    }
}
