package com.corhuila.AgendaManager.controller;

import com.corhuila.AgendaManager.entity.Usuario;
import com.corhuila.AgendaManager.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.corhuila.AgendaManager.Dto.LoginRequestDto;
import com.corhuila.AgendaManager.Dto.LoginResponseDto;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

 @PostMapping("/login")
public ResponseEntity<?> login(@RequestBody Usuario datosLogin) {
    Optional<Usuario> usuarioOpt = usuarioService.validarLogin(
        datosLogin.getCorreo(), datosLogin.getContrasena()
    );

    if (usuarioOpt.isPresent()) {
        Usuario usuario = usuarioOpt.get();

        Map<String, Object> response = new HashMap<>();
        response.put("mensaje", "Acceso concedido");
        response.put("rol", usuario.getRol());
        response.put("correo", usuario.getCorreo());
        response.put("nombre", usuario.getNombre());
        response.put("id", usuario.getId());
        response.put("contrasena", usuario.getContrasena()); 

        return ResponseEntity.ok(response);
    } else {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
            .body(Collections.singletonMap("mensaje", "Correo o contraseña incorrectos"));
    }
}

    @GetMapping("/perfil/{correo}")
    public ResponseEntity<?> getPerfil(@PathVariable String correo) {
        Optional<Usuario> usuario = usuarioService.obtenerPerfil(correo);
        return usuario.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
