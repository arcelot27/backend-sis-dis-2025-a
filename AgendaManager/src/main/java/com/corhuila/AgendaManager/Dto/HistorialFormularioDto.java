package com.corhuila.AgendaManager.Dto;

import java.time.LocalDateTime;

public class HistorialFormularioDto {
    private Long id;
    private LocalDateTime fecha;
    private String accion;
    private String usuario;
    private String descripcion;

    public HistorialFormularioDto(Long id, LocalDateTime fecha, String accion, String usuario, String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.accion = accion;
        this.usuario = usuario;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDateTime getFecha() { return fecha; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }

    public String getAccion() { return accion; }
    public void setAccion(String accion) { this.accion = accion; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
