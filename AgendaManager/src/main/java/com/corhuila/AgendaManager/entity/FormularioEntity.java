package com.corhuila.AgendaManager.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "formulario")
public class FormularioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_formulario")
    private Long id_formulario;

    private String nombres;
    private String apellidos;
    private String facultad;
    private String programa;
    private LocalDate fecha;
    private String periodo;

    @Column(name = "id_usuario")
    private Long idUsuario;

    // ✅ Getter necesario para el controlador
    public Long getIdFormulario() {
        return id_formulario;
    }

    public void setId(Long id_formulario) {
        this.id_formulario = id_formulario;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
