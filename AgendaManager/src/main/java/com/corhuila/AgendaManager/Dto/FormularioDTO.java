package com.corhuila.AgendaManager.Dto;

import java.time.LocalDate;

public class FormularioDTO {
    public String nombres;
    public String apellidos;
    public String facultad;
    public String programa;
    public LocalDate fecha;
    public String periodo;

    public String nombreAsignatura;
    public String grupo;
    public String sede;
    public String horasSemanales;
    public String horasSemestrales;

    public String preparacionClases;
    public String evaluacionAprendizajes;
    public String gestionEventos;

    public String acompanamiento;
    public String cursosFortalecimiento;
    public String asesoriaEmprendimiento;

// Getters y Setters

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

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(String horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public String getHorasSemestrales() {
        return horasSemestrales;
    }

    public void setHorasSemestrales(String horasSemestrales) {
        this.horasSemestrales = horasSemestrales;
    }

    public String getPreparacionClases() {
        return preparacionClases;
    }

    public void setPreparacionClases(String preparacionClases) {
        this.preparacionClases = preparacionClases;
    }

    public String getEvaluacionAprendizajes() {
        return evaluacionAprendizajes;
    }

    public void setEvaluacionAprendizajes(String evaluacionAprendizajes) {
        this.evaluacionAprendizajes = evaluacionAprendizajes;
    }

    public String getGestionEventos() {
        return gestionEventos;
    }

    public void setGestionEventos(String gestionEventos) {
        this.gestionEventos = gestionEventos;
    }

    public String getAcompanamiento() {
        return acompanamiento;
    }

    public void setAcompanamiento(String acompanamiento) {
        this.acompanamiento = acompanamiento;
    }

    public String getCursosFortalecimiento() {
        return cursosFortalecimiento;
    }

    public void setCursosFortalecimiento(String cursosFortalecimiento) {
        this.cursosFortalecimiento = cursosFortalecimiento;
    }

    public String getAsesoriaEmprendimiento() {
        return asesoriaEmprendimiento;
    }

    public void setAsesoriaEmprendimiento(String asesoriaEmprendimiento) {
        this.asesoriaEmprendimiento = asesoriaEmprendimiento;
    }
}