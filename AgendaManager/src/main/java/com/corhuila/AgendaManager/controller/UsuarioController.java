package com.corhuila.AgendaManager.controller;

import com.corhuila.AgendaManager.Dto.UsuarioDTO;
import com.corhuila.AgendaManager.entity.Usuario;
import com.corhuila.AgendaManager.Dto.FormularioDTO;
import com.corhuila.AgendaManager.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @PostMapping("/api/labores-academicas")
    public ResponseEntity<?> guardarLaboresacademicas(@RequestBody FormularioDTO datosLabores) {
        return ResponseEntity.ok("Labores guardadas correctamente");
    }

    @GetMapping("/perfil")
    public Usuario getPerfilUsuario() {
        return usuarioService.obtenerPerfil();
    }


    @PutMapping("/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable Integer id, @RequestBody UsuarioDTO usuarioDTO) {
        Usuario actualizado = usuarioService.actualizarUsuario(id, usuarioDTO.getNombre(), usuarioDTO.getContrasena());
        return ResponseEntity.ok(actualizado);
    
    }

}
