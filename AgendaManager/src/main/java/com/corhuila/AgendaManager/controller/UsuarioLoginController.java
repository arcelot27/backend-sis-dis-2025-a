package com.corhuila.AgendaManager.controller;

import com.corhuila.AgendaManager.Dto.LoginRequestDto;
import com.corhuila.AgendaManager.Dto.LoginResponseDto;
import com.corhuila.AgendaManager.entity.UsuarioLoginEntity;
import com.corhuila.AgendaManager.service.IUsuarioLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioLoginController {

    @Autowired
    private IUsuarioLoginService usuarioLoginService;

    @PostMapping
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestDto requestDto) {
        Optional<UsuarioLoginEntity> usuario = usuarioLoginService.validarCredenciales(
                requestDto.getUsuario(), requestDto.getContrasena());

        if (usuario.isPresent()) {
            return ResponseEntity.ok(new LoginResponseDto("Acceso concedido", usuario.get().getRol()));
        } else {
            return ResponseEntity.status(401).body(new LoginResponseDto("Correo o contraseña incorrectos", null));
        }
    }
}
