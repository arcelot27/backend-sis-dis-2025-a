package com.corhuila.AgendaManager.controller;

import com.corhuila.AgendaManager.entity.Usuario;
import com.corhuila.AgendaManager.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private com.corhuila.AgendaManager.repository.UsuarioRepository usuarioRepository;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Usuario datosLogin) {

        // Validación de campos vacíos
        if (datosLogin.getCorreo() == null || datosLogin.getContrasena() == null
                || datosLogin.getCorreo().isBlank() || datosLogin.getContrasena().isBlank()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(Collections.singletonMap("mensaje", "Correo y contraseña son obligatorios"));
        }

        // Imprimir datos recibidos (solo para depurar)
        System.out.println("[LOGIN] Correo recibido: " + datosLogin.getCorreo());
        System.out.println("[LOGIN] Contraseña recibida: " + datosLogin.getContrasena());

        Optional<Usuario> usuarioOpt = usuarioService.validarLogin(
                datosLogin.getCorreo(), datosLogin.getContrasena());

        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();

            Map<String, Object> response = new HashMap<>();
            response.put("mensaje", "Acceso concedido");
            response.put("rol", usuario.getRol());
            response.put("correo", usuario.getCorreo());
            response.put("nombre", usuario.getNombre());
            response.put("id", usuario.getIdUsuario());

            return ResponseEntity.ok(response);
        } else {
            System.out.println("[LOGIN] Falló: No se encontró coincidencia en la BD");
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

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuarioActualizado) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);
        if (usuarioOptional.isPresent()) {
            Usuario usuarioExistente = usuarioOptional.get();
            usuarioExistente.setNombre(usuarioActualizado.getNombre());
            usuarioExistente.setContrasena(usuarioActualizado.getContrasena());
            usuarioRepository.save(usuarioExistente);

            return ResponseEntity.ok(Collections.singletonMap("mensaje", "Usuario actualizado correctamente"));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Collections.singletonMap("mensaje", "Usuario no encontrado"));
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUsuarioById(@PathVariable Long id) {
        return usuarioRepository.findById(id)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(Collections.singletonMap("mensaje", "Usuario no encontrado")));
    }
}
