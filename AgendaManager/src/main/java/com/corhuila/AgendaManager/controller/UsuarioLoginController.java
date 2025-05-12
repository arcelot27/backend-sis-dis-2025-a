package com.corhuila.AgendaManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.AgendaManager.Dto.LoginRequestDto;
import com.corhuila.AgendaManager.Dto.LoginResponseDto;
import com.corhuila.AgendaManager.service.UsuarioLoginService;

    @RestController
@RequestMapping("/api/login")
public class UsuarioLoginController {

    @Autowired
    private UsuarioLoginService loginService;

    @PostMapping
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestDto request) {
        try {
            return ResponseEntity.ok(loginService.login(request));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                                 .body(new LoginResponseDto(e.getMessage(), null));
        }
    }
}



