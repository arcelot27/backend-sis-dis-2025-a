package com.corhuila.AgendaManager.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rol;

    private String nombre;

    private String correo;

    private String contrasena;
    
    @Column(name = "correo", nullable = false, unique = true)
    private String correo;
   
}