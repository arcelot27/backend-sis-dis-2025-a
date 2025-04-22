package com.corhuila.AgendaManager.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Usuario;
    private String nombre;
    private String correo;
    private String rol;
    private String contrasena;

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    // Getters y Setters
    public Long getId() { return ID_Usuario; }
    public void setId(Long ID_Usuario) { this.ID_Usuario = ID_Usuario; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}


