package com.corhuila.AgendaManager.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "labores_academicas")
public class LaboresAcademicasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLabores;

    private String nombreAsignatura;
    private String programa;
    private String grupo;
    private String sede;
    private Integer horasSemanales;
    private Integer horasSemestrales;

    private Integer prepHorasSemana;
    private Integer prepHorasSemestre;
    private String prepDescripcion;
    private String prepProducto;

    private Integer evalHorasSemana;
    private Integer evalHorasSemestre;
    private String evalDescripcion;
    private String evalProducto;

    private Integer eventosHorasSemana;
    private Integer eventosHorasSemestre;
    private String eventosDescripcion;
    private String eventosProducto;

    private Integer acompHorasSemana;
    private Integer acompHorasSemestre;
    private String acompDescripcion;
    private String acompProducto;

    private Integer cursosHorasSemana;
    private Integer cursosHorasSemestre;
    private String cursosDescripcion;
    private String cursosProducto;

    private Integer emprendHorasSemana;
    private Integer emprendHorasSemestre;
    private String emprendDescripcion;
    private String emprendProducto;

    // Getters y Setters

    public Long getIdLabores() { return idLabores; }
    public void setIdLabores(Long idLabores) { this.idLabores = idLabores; }

    public String getNombreAsignatura() { return nombreAsignatura; }
    public void setNombreAsignatura(String nombreAsignatura) { this.nombreAsignatura = nombreAsignatura; }

    public String getPrograma() { return programa; }
    public void setPrograma(String programa) { this.programa = programa; }

    public String getGrupo() { return grupo; }
    public void setGrupo(String grupo) { this.grupo = grupo; }

    public String getSede() { return sede; }
    public void setSede(String sede) { this.sede = sede; }

    public Integer getHorasSemanales() { return horasSemanales; }
    public void setHorasSemanales(Integer horasSemanales) { this.horasSemanales = horasSemanales; }

    public Integer getHorasSemestrales() { return horasSemestrales; }
    public void setHorasSemestrales(Integer horasSemestrales) { this.horasSemestrales = horasSemestrales; }

    public Integer getPrepHorasSemana() { return prepHorasSemana; }
    public void setPrepHorasSemana(Integer prepHorasSemana) { this.prepHorasSemana = prepHorasSemana; }

    public Integer getPrepHorasSemestre() { return prepHorasSemestre; }
    public void setPrepHorasSemestre(Integer prepHorasSemestre) { this.prepHorasSemestre = prepHorasSemestre; }

    public String getPrepDescripcion() { return prepDescripcion; }
    public void setPrepDescripcion(String prepDescripcion) { this.prepDescripcion = prepDescripcion; }

    public String getPrepProducto() { return prepProducto; }
    public void setPrepProducto(String prepProducto) { this.prepProducto = prepProducto; }

    public Integer getEvalHorasSemana() { return evalHorasSemana; }
    public void setEvalHorasSemana(Integer evalHorasSemana) { this.evalHorasSemana = evalHorasSemana; }

    public Integer getEvalHorasSemestre() { return evalHorasSemestre; }
    public void setEvalHorasSemestre(Integer evalHorasSemestre) { this.evalHorasSemestre = evalHorasSemestre; }

    public String getEvalDescripcion() { return evalDescripcion; }
    public void setEvalDescripcion(String evalDescripcion) { this.evalDescripcion = evalDescripcion; }

    public String getEvalProducto() { return evalProducto; }
    public void setEvalProducto(String evalProducto) { this.evalProducto = evalProducto; }

    public Integer getEventosHorasSemana() { return eventosHorasSemana; }
    public void setEventosHorasSemana(Integer eventosHorasSemana) { this.eventosHorasSemana = eventosHorasSemana; }

    public Integer getEventosHorasSemestre() { return eventosHorasSemestre; }
    public void setEventosHorasSemestre(Integer eventosHorasSemestre) { this.eventosHorasSemestre = eventosHorasSemestre; }

    public String getEventosDescripcion() { return eventosDescripcion; }
    public void setEventosDescripcion(String eventosDescripcion) { this.eventosDescripcion = eventosDescripcion; }

    public String getEventosProducto() { return eventosProducto; }
    public void setEventosProducto(String eventosProducto) { this.eventosProducto = eventosProducto; }

    public Integer getAcompHorasSemana() { return acompHorasSemana; }
    public void setAcompHorasSemana(Integer acompHorasSemana) { this.acompHorasSemana = acompHorasSemana; }

    public Integer getAcompHorasSemestre() { return acompHorasSemestre; }
    public void setAcompHorasSemestre(Integer acompHorasSemestre) { this.acompHorasSemestre = acompHorasSemestre; }

    public String getAcompDescripcion() { return acompDescripcion; }
    public void setAcompDescripcion(String acompDescripcion) { this.acompDescripcion = acompDescripcion; }

    public String getAcompProducto() { return acompProducto; }
    public void setAcompProducto(String acompProducto) { this.acompProducto = acompProducto; }

    public Integer getCursosHorasSemana() { return cursosHorasSemana; }
    public void setCursosHorasSemana(Integer cursosHorasSemana) { this.cursosHorasSemana = cursosHorasSemana; }

    public Integer getCursosHorasSemestre() { return cursosHorasSemestre; }
    public void setCursosHorasSemestre(Integer cursosHorasSemestre) { this.cursosHorasSemestre = cursosHorasSemestre; }

    public String getCursosDescripcion() { return cursosDescripcion; }
    public void setCursosDescripcion(String cursosDescripcion) { this.cursosDescripcion = cursosDescripcion; }

    public String getCursosProducto() { return cursosProducto; }
    public void setCursosProducto(String cursosProducto) { this.cursosProducto = cursosProducto; }

    public Integer getEmprendHorasSemana() { return emprendHorasSemana; }
    public void setEmprendHorasSemana(Integer emprendHorasSemana) { this.emprendHorasSemana = emprendHorasSemana; }

    public Integer getEmprendHorasSemestre() { return emprendHorasSemestre; }
    public void setEmprendHorasSemestre(Integer emprendHorasSemestre) { this.emprendHorasSemestre = emprendHorasSemestre; }

    public String getEmprendDescripcion() { return emprendDescripcion; }
    public void setEmprendDescripcion(String emprendDescripcion) { this.emprendDescripcion = emprendDescripcion; }

    public String getEmprendProducto() { return emprendProducto; }
    public void setEmprendProducto(String emprendProducto) { this.emprendProducto = emprendProducto;}
}