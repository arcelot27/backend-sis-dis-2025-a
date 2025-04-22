
// UsuarioDTO.java
package com.corhuila.AgendaManager.Dto;


public record UsuarioDTO(
    Long id,
    String rol,
    String nombre,
    String correo,
    String contrasena
) {}
