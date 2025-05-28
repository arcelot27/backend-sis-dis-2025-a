package com.corhuila.AgendaManager.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import com.corhuila.AgendaManager.entity.FormularioEntity;

@Entity
@Table(name = "historial_formularios")
public class HistorialFormulario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // ✅ Esto es clave para evitar el error SQL
    private Long idHistorial;

    private LocalDateTime fecha;

    private String accion;

    private String usuario;

    private String descripcion;

    @Column(name = "ruta_archivo")
    private String rutaArchivo;

    @Column(name = "id_usuario")
    private Long idUsuario;

    @ManyToOne
    @JoinColumn(name = "id_formulario")
    private FormularioEntity formulario;

    public FormularioEntity getFormulario() {
        return formulario;
    }

    public void setFormulario(FormularioEntity formulario) {
        this.formulario = formulario;
    }

    // Getters y Setters
    public Long getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(Long idHistorial) {
        this.idHistorial = idHistorial;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }



    
    private String estado; // 'pendiente', 'aprobado', 'denegado'
    private String motivoDenegacion;
    private Long revisadoPor;
    private LocalDateTime fechaRevision;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMotivoDenegacion() {
        return motivoDenegacion;
    }

    public void setMotivoDenegacion(String motivoDenegacion) {
        this.motivoDenegacion = motivoDenegacion;
    }

    public Long getRevisadoPor() {
        return revisadoPor;
    }

    public void setRevisadoPor(Long revisadoPor) {
        this.revisadoPor = revisadoPor;
    }

    public LocalDateTime getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(LocalDateTime fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

}
