package com.corhuila.AgendaManager.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "labores_extension_culturales")
public class LaboresExtensionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_extension;

    @ManyToOne
    @JoinColumn(name = "id_formulario")
    private FormularioEntity formulario;

    public FormularioEntity getFormulario() {
        return formulario;
    }

    public void setFormulario(FormularioEntity formulario) {
        this.formulario = formulario;
    }


    private int consultoria_horas_semana;
    private int consultoria_horas_semestre;
    private String consultoria_descripcion;
    private String consultoria_producto;

    private int acompanamiento_horas_semana;
    private int acompanamiento_horas_semestre;
    private String acompanamiento_descripcion;
    private String acompanamiento_producto;

    private int intervencion_horas_semana;
    private int intervencion_horas_semestre;
    private String intervencion_descripcion;
    private String intervencion_producto;

    private int proyectos_culturales_horas_semana;
    private int proyectos_culturales_horas_semestre;
    private String proyectos_culturales_descripcion;
    private String proyectos_culturales_producto;

    private int educacion_artistica_horas_semana;
    private int educacion_artistica_horas_semestre;
    private String educacion_artistica_descripcion;
    private String educacion_artistica_producto;

    private int divulgacion_valores_horas_semana;
    private int divulgacion_valores_horas_semestre;
    private String divulgacion_valores_descripcion;
    private String divulgacion_valores_producto;

 


public Long getId_extension() {
    return id_extension;
}

public void setId_extension(Long id_extension) {
    this.id_extension = id_extension;
}



public int getConsultoria_horas_semana() {
    return consultoria_horas_semana;
}

public void setConsultoria_horas_semana(int consultoria_horas_semana) {
    this.consultoria_horas_semana = consultoria_horas_semana;
}

public int getConsultoria_horas_semestre() {
    return consultoria_horas_semestre;
}

public void setConsultoria_horas_semestre(int consultoria_horas_semestre) {
    this.consultoria_horas_semestre = consultoria_horas_semestre;
}

public String getConsultoria_descripcion() {
    return consultoria_descripcion;
}

public void setConsultoria_descripcion(String consultoria_descripcion) {
    this.consultoria_descripcion = consultoria_descripcion;
}

public String getConsultoria_producto() {
    return consultoria_producto;
}

public void setConsultoria_producto(String consultoria_producto) {
    this.consultoria_producto = consultoria_producto;
}

public int getAcompanamiento_horas_semana() {
    return acompanamiento_horas_semana;
}

public void setAcompanamiento_horas_semana(int acompanamiento_horas_semana) {
    this.acompanamiento_horas_semana = acompanamiento_horas_semana;
}

public int getAcompanamiento_horas_semestre() {
    return acompanamiento_horas_semestre;
}

public void setAcompanamiento_horas_semestre(int acompanamiento_horas_semestre) {
    this.acompanamiento_horas_semestre = acompanamiento_horas_semestre;
}

public String getAcompanamiento_descripcion() {
    return acompanamiento_descripcion;
}

public void setAcompanamiento_descripcion(String acompanamiento_descripcion) {
    this.acompanamiento_descripcion = acompanamiento_descripcion;
}

public String getAcompanamiento_producto() {
    return acompanamiento_producto;
}

public void setAcompanamiento_producto(String acompanamiento_producto) {
    this.acompanamiento_producto = acompanamiento_producto;
}

public int getIntervencion_horas_semana() {
    return intervencion_horas_semana;
}

public void setIntervencion_horas_semana(int intervencion_horas_semana) {
    this.intervencion_horas_semana = intervencion_horas_semana;
}

public int getIntervencion_horas_semestre() {
    return intervencion_horas_semestre;
}

public void setIntervencion_horas_semestre(int intervencion_horas_semestre) {
    this.intervencion_horas_semestre = intervencion_horas_semestre;
}

public String getIntervencion_descripcion() {
    return intervencion_descripcion;
}

public void setIntervencion_descripcion(String intervencion_descripcion) {
    this.intervencion_descripcion = intervencion_descripcion;
}

public String getIntervencion_producto() {
    return intervencion_producto;
}

public void setIntervencion_producto(String intervencion_producto) {
    this.intervencion_producto = intervencion_producto;
}

public int getProyectos_culturales_horas_semana() {
    return proyectos_culturales_horas_semana;
}

public void setProyectos_culturales_horas_semana(int proyectos_culturales_horas_semana) {
    this.proyectos_culturales_horas_semana = proyectos_culturales_horas_semana;
}

public int getProyectos_culturales_horas_semestre() {
    return proyectos_culturales_horas_semestre;
}

public void setProyectos_culturales_horas_semestre(int proyectos_culturales_horas_semestre) {
    this.proyectos_culturales_horas_semestre = proyectos_culturales_horas_semestre;
}

public String getProyectos_culturales_descripcion() {
    return proyectos_culturales_descripcion;
}

public void setProyectos_culturales_descripcion(String proyectos_culturales_descripcion) {
    this.proyectos_culturales_descripcion = proyectos_culturales_descripcion;
}

public String getProyectos_culturales_producto() {
    return proyectos_culturales_producto;
}

public void setProyectos_culturales_producto(String proyectos_culturales_producto) {
    this.proyectos_culturales_producto = proyectos_culturales_producto;
}

public int getEducacion_artistica_horas_semana() {
    return educacion_artistica_horas_semana;
}

public void setEducacion_artistica_horas_semana(int educacion_artistica_horas_semana) {
    this.educacion_artistica_horas_semana = educacion_artistica_horas_semana;
}

public int getEducacion_artistica_horas_semestre() {
    return educacion_artistica_horas_semestre;
}

public void setEducacion_artistica_horas_semestre(int educacion_artistica_horas_semestre) {
    this.educacion_artistica_horas_semestre = educacion_artistica_horas_semestre;
}

public String getEducacion_artistica_descripcion() {
    return educacion_artistica_descripcion;
}

public void setEducacion_artistica_descripcion(String educacion_artistica_descripcion) {
    this.educacion_artistica_descripcion = educacion_artistica_descripcion;
}

public String getEducacion_artistica_producto() {
    return educacion_artistica_producto;
}

public void setEducacion_artistica_producto(String educacion_artistica_producto) {
    this.educacion_artistica_producto = educacion_artistica_producto;
}

public int getDivulgacion_valores_horas_semana() {
    return divulgacion_valores_horas_semana;
}

public void setDivulgacion_valores_horas_semana(int divulgacion_valores_horas_semana) {
    this.divulgacion_valores_horas_semana = divulgacion_valores_horas_semana;
}

public int getDivulgacion_valores_horas_semestre() {
    return divulgacion_valores_horas_semestre;
}

public void setDivulgacion_valores_horas_semestre(int divulgacion_valores_horas_semestre) {
    this.divulgacion_valores_horas_semestre = divulgacion_valores_horas_semestre;
}

public String getDivulgacion_valores_descripcion() {
    return divulgacion_valores_descripcion;
}

public void setDivulgacion_valores_descripcion(String divulgacion_valores_descripcion) {
    this.divulgacion_valores_descripcion = divulgacion_valores_descripcion;
}

public String getDivulgacion_valores_producto() {
    return divulgacion_valores_producto;
}

public void setDivulgacion_valores_producto(String divulgacion_valores_producto) {
    this.divulgacion_valores_producto = divulgacion_valores_producto;
}

}
