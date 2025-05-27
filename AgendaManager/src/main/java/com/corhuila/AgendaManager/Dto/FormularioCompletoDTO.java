package com.corhuila.AgendaManager.Dto;

public class FormularioCompletoDTO {

    // Paso 1: Datos personales
    private String nombres;
    private String apellidos;
    private String facultad;
    private String programa;
    private String fecha;
    private String periodo;

    // Paso 2: Labores académicas
    private String nombreAsignatura;
    private String grupo;
    private String sede;
    private int horasSemana;
    private int horasSemestre;

    private int prepHorasSemana;
    private int prepHorasSemestre;
    private String prepDescripcion;
    private String prepProducto;

    private int evalHorasSemana;
    private int evalHorasSemestre;
    private String evalDescripcion;
    private String evalProducto;

    private int eventosHorasSemana;
    private int eventosHorasSemestre;
    private String eventosDescripcion;
    private String eventosProducto;

    private int acompHorasSemana;
    private int acompHorasSemestre;
    private String acompDescripcion;
    private String acompProducto;

    private int cursoHorasSemana;
    private int cursoHorasSemestre;
    private String cursoDescripcion;
    private String cursoProducto;

    private int asesoriaHorasSemana;
    private int asesoriaHorasSemestre;
    private String asesoriaDescripcion;
    private String asesoriaProducto;

    // Paso 3: Labores científicas
    private int semillerosHorasSemana;
    private int semillerosHorasSemestre;
    private String semillerosDescripcion;
    private String semillerosProducto;

    private int propuestasHorasSemana;
    private int propuestasHorasSemestre;
    private String propuestasDescripcion;
    private String propuestasProducto;

    private int proyectosHorasSemana;
    private int proyectosHorasSemestre;
    private String proyectosDescripcion;
    private String proyectosProducto;

    private int direccionHorasSemana;
    private int direccionHorasSemestre;
    private String direccionDescripcion;
    private String direccionProducto;

    private int articulosHorasSemana;
    private int articulosHorasSemestre;
    private String articulosDescripcion;
    private String articulosProducto;

    // Paso 4: Labores de extensión y culturales
    private int extensionConsultoriaHorasSemana;
    private int extensionConsultoriaHorasSemestre;
    private String extensionConsultoriaDescripcion;
    private String extensionConsultoriaProducto;

    private int extensionEmpresarialHorasSemana;
    private int extensionEmpresarialHorasSemestre;
    private String extensionEmpresarialDescripcion;
    private String extensionEmpresarialProducto;

    private int extensionComunitariaHorasSemana;
    private int extensionComunitariaHorasSemestre;
    private String extensionComunitariaDescripcion;
    private String extensionComunitariaProducto;

    private int culturalProyectosHorasSemana;
    private int culturalProyectosHorasSemestre;
    private String culturalProyectosDescripcion;
    private String culturalProyectosProducto;

    private int culturalEducacionHorasSemana;
    private int culturalEducacionHorasSemestre;
    private String culturalEducacionDescripcion;
    private String culturalEducacionProducto;

    private int culturalValoresHorasSemana;
    private int culturalValoresHorasSemestre;
    private String culturalValoresDescripcion;
    private String culturalValoresProducto;

    // Paso 5: Gestión académica administrativa
    private int gestionJuradoHorasSemana;
    private int gestionJuradoHorasSemestre;
    private String gestionJuradoDescripcion;
    private String gestionJuradoProducto;

    private int gestionRegistrosHorasSemana;
    private int gestionRegistrosHorasSemestre;
    private String gestionRegistrosDescripcion;
    private String gestionRegistrosProducto;

    private int gestionAcreditacionHorasSemana;
    private int gestionAcreditacionHorasSemestre;
    private String gestionAcreditacionDescripcion;
    private String gestionAcreditacionProducto;

    private int gestionComitesHorasSemana;
    private int gestionComitesHorasSemestre;
    private String gestionComitesDescripcion;
    private String gestionComitesProducto;

    private int gestionAutoevaluacionHorasSemana;
    private int gestionAutoevaluacionHorasSemestre;
    private String gestionAutoevaluacionDescripcion;
    private String gestionAutoevaluacionProducto;

    private int gestionInvestigacionHorasSemana;
    private int gestionInvestigacionHorasSemestre;
    private String gestionInvestigacionDescripcion;
    private String gestionInvestigacionProducto;

    private int gestionFormacionHorasSemana;
    private int gestionFormacionHorasSemestre;
    private String gestionFormacionDescripcion;
    private String gestionFormacionProducto;

    private int gestionPracticasHorasSemana;
    private int gestionPracticasHorasSemestre;
    private String gestionPracticasDescripcion;
    private String gestionPracticasProducto;

    private int gestionCHHorasSemana;
    private int gestionCHHorasSemestre;
    private String gestionCHDescripcion;
    private String gestionCHProducto;

    private int gestionLiderHorasSemana;
    private int gestionLiderHorasSemestre;
    private String gestionLiderDescripcion;
    private String gestionLiderProducto;

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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
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

    public int getHorasSemana() {
        return horasSemana;
    }

    public void setHorasSemana(int horasSemana) {
        this.horasSemana = horasSemana;
    }

    public int getHorasSemestre() {
        return horasSemestre;
    }

    public void setHorasSemestre(int horasSemestre) {
        this.horasSemestre = horasSemestre;
    }

    public int getPrepHorasSemana() {
        return prepHorasSemana;
    }

    public void setPrepHorasSemana(int prepHorasSemana) {
        this.prepHorasSemana = prepHorasSemana;
    }

    public int getPrepHorasSemestre() {
        return prepHorasSemestre;
    }

    public void setPrepHorasSemestre(int prepHorasSemestre) {
        this.prepHorasSemestre = prepHorasSemestre;
    }

    public String getPrepDescripcion() {
        return prepDescripcion;
    }

    public void setPrepDescripcion(String prepDescripcion) {
        this.prepDescripcion = prepDescripcion;
    }

    public String getPrepProducto() {
        return prepProducto;
    }

    public void setPrepProducto(String prepProducto) {
        this.prepProducto = prepProducto;
    }

    public int getEvalHorasSemana() {
        return evalHorasSemana;
    }

    public void setEvalHorasSemana(int evalHorasSemana) {
        this.evalHorasSemana = evalHorasSemana;
    }

    public int getEvalHorasSemestre() {
        return evalHorasSemestre;
    }

    public void setEvalHorasSemestre(int evalHorasSemestre) {
        this.evalHorasSemestre = evalHorasSemestre;
    }

    public String getEvalDescripcion() {
        return evalDescripcion;
    }

    public void setEvalDescripcion(String evalDescripcion) {
        this.evalDescripcion = evalDescripcion;
    }

    public String getEvalProducto() {
        return evalProducto;
    }

    public void setEvalProducto(String evalProducto) {
        this.evalProducto = evalProducto;
    }

    public int getEventosHorasSemana() {
        return eventosHorasSemana;
    }

    public void setEventosHorasSemana(int eventosHorasSemana) {
        this.eventosHorasSemana = eventosHorasSemana;
    }

    public int getEventosHorasSemestre() {
        return eventosHorasSemestre;
    }

    public void setEventosHorasSemestre(int eventosHorasSemestre) {
        this.eventosHorasSemestre = eventosHorasSemestre;
    }

    public String getEventosDescripcion() {
        return eventosDescripcion;
    }

    public void setEventosDescripcion(String eventosDescripcion) {
        this.eventosDescripcion = eventosDescripcion;
    }

    public String getEventosProducto() {
        return eventosProducto;
    }

    public void setEventosProducto(String eventosProducto) {
        this.eventosProducto = eventosProducto;
    }

    public int getAcompHorasSemana() {
        return acompHorasSemana;
    }

    public void setAcompHorasSemana(int acompHorasSemana) {
        this.acompHorasSemana = acompHorasSemana;
    }

    public int getAcompHorasSemestre() {
        return acompHorasSemestre;
    }

    public void setAcompHorasSemestre(int acompHorasSemestre) {
        this.acompHorasSemestre = acompHorasSemestre;
    }

    public String getAcompDescripcion() {
        return acompDescripcion;
    }

    public void setAcompDescripcion(String acompDescripcion) {
        this.acompDescripcion = acompDescripcion;
    }

    public String getAcompProducto() {
        return acompProducto;
    }

    public void setAcompProducto(String acompProducto) {
        this.acompProducto = acompProducto;
    }

    public int getCursoHorasSemana() {
        return cursoHorasSemana;
    }

    public void setCursoHorasSemana(int cursoHorasSemana) {
        this.cursoHorasSemana = cursoHorasSemana;
    }

    public int getCursoHorasSemestre() {
        return cursoHorasSemestre;
    }

    public void setCursoHorasSemestre(int cursoHorasSemestre) {
        this.cursoHorasSemestre = cursoHorasSemestre;
    }

    public String getCursoDescripcion() {
        return cursoDescripcion;
    }

    public void setCursoDescripcion(String cursoDescripcion) {
        this.cursoDescripcion = cursoDescripcion;
    }

    public String getCursoProducto() {
        return cursoProducto;
    }

    public void setCursoProducto(String cursoProducto) {
        this.cursoProducto = cursoProducto;
    }

    public int getAsesoriaHorasSemana() {
        return asesoriaHorasSemana;
    }

    public void setAsesoriaHorasSemana(int asesoriaHorasSemana) {
        this.asesoriaHorasSemana = asesoriaHorasSemana;
    }

    public int getAsesoriaHorasSemestre() {
        return asesoriaHorasSemestre;
    }

    public void setAsesoriaHorasSemestre(int asesoriaHorasSemestre) {
        this.asesoriaHorasSemestre = asesoriaHorasSemestre;
    }

    public String getAsesoriaDescripcion() {
        return asesoriaDescripcion;
    }

    public void setAsesoriaDescripcion(String asesoriaDescripcion) {
        this.asesoriaDescripcion = asesoriaDescripcion;
    }

    public String getAsesoriaProducto() {
        return asesoriaProducto;
    }

    public void setAsesoriaProducto(String asesoriaProducto) {
        this.asesoriaProducto = asesoriaProducto;
    }

    public int getSemillerosHorasSemana() {
        return semillerosHorasSemana;
    }

    public void setSemillerosHorasSemana(int semillerosHorasSemana) {
        this.semillerosHorasSemana = semillerosHorasSemana;
    }

    public int getSemillerosHorasSemestre() {
        return semillerosHorasSemestre;
    }

    public void setSemillerosHorasSemestre(int semillerosHorasSemestre) {
        this.semillerosHorasSemestre = semillerosHorasSemestre;
    }

    public String getSemillerosDescripcion() {
        return semillerosDescripcion;
    }

    public void setSemillerosDescripcion(String semillerosDescripcion) {
        this.semillerosDescripcion = semillerosDescripcion;
    }

    public String getSemillerosProducto() {
        return semillerosProducto;
    }

    public void setSemillerosProducto(String semillerosProducto) {
        this.semillerosProducto = semillerosProducto;
    }

    public int getPropuestasHorasSemana() {
        return propuestasHorasSemana;
    }

    public void setPropuestasHorasSemana(int propuestasHorasSemana) {
        this.propuestasHorasSemana = propuestasHorasSemana;
    }

    public int getPropuestasHorasSemestre() {
        return propuestasHorasSemestre;
    }

    public void setPropuestasHorasSemestre(int propuestasHorasSemestre) {
        this.propuestasHorasSemestre = propuestasHorasSemestre;
    }

    public String getPropuestasDescripcion() {
        return propuestasDescripcion;
    }

    public void setPropuestasDescripcion(String propuestasDescripcion) {
        this.propuestasDescripcion = propuestasDescripcion;
    }

    public String getPropuestasProducto() {
        return propuestasProducto;
    }

    public void setPropuestasProducto(String propuestasProducto) {
        this.propuestasProducto = propuestasProducto;
    }

    public int getProyectosHorasSemana() {
        return proyectosHorasSemana;
    }

    public void setProyectosHorasSemana(int proyectosHorasSemana) {
        this.proyectosHorasSemana = proyectosHorasSemana;
    }

    public int getProyectosHorasSemestre() {
        return proyectosHorasSemestre;
    }

    public void setProyectosHorasSemestre(int proyectosHorasSemestre) {
        this.proyectosHorasSemestre = proyectosHorasSemestre;
    }

    public String getProyectosDescripcion() {
        return proyectosDescripcion;
    }

    public void setProyectosDescripcion(String proyectosDescripcion) {
        this.proyectosDescripcion = proyectosDescripcion;
    }

    public String getProyectosProducto() {
        return proyectosProducto;
    }

    public void setProyectosProducto(String proyectosProducto) {
        this.proyectosProducto = proyectosProducto;
    }

    public int getDireccionHorasSemana() {
        return direccionHorasSemana;
    }

    public void setDireccionHorasSemana(int direccionHorasSemana) {
        this.direccionHorasSemana = direccionHorasSemana;
    }

    public int getDireccionHorasSemestre() {
        return direccionHorasSemestre;
    }

    public void setDireccionHorasSemestre(int direccionHorasSemestre) {
        this.direccionHorasSemestre = direccionHorasSemestre;
    }

    public String getDireccionDescripcion() {
        return direccionDescripcion;
    }

    public void setDireccionDescripcion(String direccionDescripcion) {
        this.direccionDescripcion = direccionDescripcion;
    }

    public String getDireccionProducto() {
        return direccionProducto;
    }

    public void setDireccionProducto(String direccionProducto) {
        this.direccionProducto = direccionProducto;
    }

    public int getArticulosHorasSemana() {
        return articulosHorasSemana;
    }

    public void setArticulosHorasSemana(int articulosHorasSemana) {
        this.articulosHorasSemana = articulosHorasSemana;
    }

    public int getArticulosHorasSemestre() {
        return articulosHorasSemestre;
    }

    public void setArticulosHorasSemestre(int articulosHorasSemestre) {
        this.articulosHorasSemestre = articulosHorasSemestre;
    }

    public String getArticulosDescripcion() {
        return articulosDescripcion;
    }

    public void setArticulosDescripcion(String articulosDescripcion) {
        this.articulosDescripcion = articulosDescripcion;
    }

    public String getArticulosProducto() {
        return articulosProducto;
    }

    public void setArticulosProducto(String articulosProducto) {
        this.articulosProducto = articulosProducto;
    }

    public int getExtensionConsultoriaHorasSemana() {
        return extensionConsultoriaHorasSemana;
    }

    public void setExtensionConsultoriaHorasSemana(int extensionConsultoriaHorasSemana) {
        this.extensionConsultoriaHorasSemana = extensionConsultoriaHorasSemana;
    }

    public int getExtensionConsultoriaHorasSemestre() {
        return extensionConsultoriaHorasSemestre;
    }

    public void setExtensionConsultoriaHorasSemestre(int extensionConsultoriaHorasSemestre) {
        this.extensionConsultoriaHorasSemestre = extensionConsultoriaHorasSemestre;
    }

    public String getExtensionConsultoriaDescripcion() {
        return extensionConsultoriaDescripcion;
    }

    public void setExtensionConsultoriaDescripcion(String extensionConsultoriaDescripcion) {
        this.extensionConsultoriaDescripcion = extensionConsultoriaDescripcion;
    }

    public String getExtensionConsultoriaProducto() {
        return extensionConsultoriaProducto;
    }

    public void setExtensionConsultoriaProducto(String extensionConsultoriaProducto) {
        this.extensionConsultoriaProducto = extensionConsultoriaProducto;
    }

    public int getExtensionEmpresarialHorasSemana() {
        return extensionEmpresarialHorasSemana;
    }

    public void setExtensionEmpresarialHorasSemana(int extensionEmpresarialHorasSemana) {
        this.extensionEmpresarialHorasSemana = extensionEmpresarialHorasSemana;
    }

    public int getExtensionEmpresarialHorasSemestre() {
        return extensionEmpresarialHorasSemestre;
    }

    public void setExtensionEmpresarialHorasSemestre(int extensionEmpresarialHorasSemestre) {
        this.extensionEmpresarialHorasSemestre = extensionEmpresarialHorasSemestre;
    }

    public String getExtensionEmpresarialDescripcion() {
        return extensionEmpresarialDescripcion;
    }

    public void setExtensionEmpresarialDescripcion(String extensionEmpresarialDescripcion) {
        this.extensionEmpresarialDescripcion = extensionEmpresarialDescripcion;
    }

    public String getExtensionEmpresarialProducto() {
        return extensionEmpresarialProducto;
    }

    public void setExtensionEmpresarialProducto(String extensionEmpresarialProducto) {
        this.extensionEmpresarialProducto = extensionEmpresarialProducto;
    }

    public int getExtensionComunitariaHorasSemana() {
        return extensionComunitariaHorasSemana;
    }

    public void setExtensionComunitariaHorasSemana(int extensionComunitariaHorasSemana) {
        this.extensionComunitariaHorasSemana = extensionComunitariaHorasSemana;
    }

    public int getExtensionComunitariaHorasSemestre() {
        return extensionComunitariaHorasSemestre;
    }

    public void setExtensionComunitariaHorasSemestre(int extensionComunitariaHorasSemestre) {
        this.extensionComunitariaHorasSemestre = extensionComunitariaHorasSemestre;
    }

    public String getExtensionComunitariaDescripcion() {
        return extensionComunitariaDescripcion;
    }

    public void setExtensionComunitariaDescripcion(String extensionComunitariaDescripcion) {
        this.extensionComunitariaDescripcion = extensionComunitariaDescripcion;
    }

    public String getExtensionComunitariaProducto() {
        return extensionComunitariaProducto;
    }

    public void setExtensionComunitariaProducto(String extensionComunitariaProducto) {
        this.extensionComunitariaProducto = extensionComunitariaProducto;
    }

    public int getCulturalProyectosHorasSemana() {
        return culturalProyectosHorasSemana;
    }

    public void setCulturalProyectosHorasSemana(int culturalProyectosHorasSemana) {
        this.culturalProyectosHorasSemana = culturalProyectosHorasSemana;
    }

    public int getCulturalProyectosHorasSemestre() {
        return culturalProyectosHorasSemestre;
    }

    public void setCulturalProyectosHorasSemestre(int culturalProyectosHorasSemestre) {
        this.culturalProyectosHorasSemestre = culturalProyectosHorasSemestre;
    }

    public String getCulturalProyectosDescripcion() {
        return culturalProyectosDescripcion;
    }

    public void setCulturalProyectosDescripcion(String culturalProyectosDescripcion) {
        this.culturalProyectosDescripcion = culturalProyectosDescripcion;
    }

    public String getCulturalProyectosProducto() {
        return culturalProyectosProducto;
    }

    public void setCulturalProyectosProducto(String culturalProyectosProducto) {
        this.culturalProyectosProducto = culturalProyectosProducto;
    }

    public int getCulturalEducacionHorasSemana() {
        return culturalEducacionHorasSemana;
    }

    public void setCulturalEducacionHorasSemana(int culturalEducacionHorasSemana) {
        this.culturalEducacionHorasSemana = culturalEducacionHorasSemana;
    }

    public int getCulturalEducacionHorasSemestre() {
        return culturalEducacionHorasSemestre;
    }

    public void setCulturalEducacionHorasSemestre(int culturalEducacionHorasSemestre) {
        this.culturalEducacionHorasSemestre = culturalEducacionHorasSemestre;
    }

    public String getCulturalEducacionDescripcion() {
        return culturalEducacionDescripcion;
    }

    public void setCulturalEducacionDescripcion(String culturalEducacionDescripcion) {
        this.culturalEducacionDescripcion = culturalEducacionDescripcion;
    }

    public String getCulturalEducacionProducto() {
        return culturalEducacionProducto;
    }

    public void setCulturalEducacionProducto(String culturalEducacionProducto) {
        this.culturalEducacionProducto = culturalEducacionProducto;
    }

    public int getCulturalValoresHorasSemana() {
        return culturalValoresHorasSemana;
    }

    public void setCulturalValoresHorasSemana(int culturalValoresHorasSemana) {
        this.culturalValoresHorasSemana = culturalValoresHorasSemana;
    }

    public int getCulturalValoresHorasSemestre() {
        return culturalValoresHorasSemestre;
    }

    public void setCulturalValoresHorasSemestre(int culturalValoresHorasSemestre) {
        this.culturalValoresHorasSemestre = culturalValoresHorasSemestre;
    }

    public String getCulturalValoresDescripcion() {
        return culturalValoresDescripcion;
    }

    public void setCulturalValoresDescripcion(String culturalValoresDescripcion) {
        this.culturalValoresDescripcion = culturalValoresDescripcion;
    }

    public String getCulturalValoresProducto() {
        return culturalValoresProducto;
    }

    public void setCulturalValoresProducto(String culturalValoresProducto) {
        this.culturalValoresProducto = culturalValoresProducto;
    }

    public int getGestionJuradoHorasSemana() {
        return gestionJuradoHorasSemana;
    }

    public void setGestionJuradoHorasSemana(int gestionJuradoHorasSemana) {
        this.gestionJuradoHorasSemana = gestionJuradoHorasSemana;
    }

    public int getGestionJuradoHorasSemestre() {
        return gestionJuradoHorasSemestre;
    }

    public void setGestionJuradoHorasSemestre(int gestionJuradoHorasSemestre) {
        this.gestionJuradoHorasSemestre = gestionJuradoHorasSemestre;
    }

    public String getGestionJuradoDescripcion() {
        return gestionJuradoDescripcion;
    }

    public void setGestionJuradoDescripcion(String gestionJuradoDescripcion) {
        this.gestionJuradoDescripcion = gestionJuradoDescripcion;
    }

    public String getGestionJuradoProducto() {
        return gestionJuradoProducto;
    }

    public void setGestionJuradoProducto(String gestionJuradoProducto) {
        this.gestionJuradoProducto = gestionJuradoProducto;
    }

    public int getGestionRegistrosHorasSemana() {
        return gestionRegistrosHorasSemana;
    }

    public void setGestionRegistrosHorasSemana(int gestionRegistrosHorasSemana) {
        this.gestionRegistrosHorasSemana = gestionRegistrosHorasSemana;
    }

    public int getGestionRegistrosHorasSemestre() {
        return gestionRegistrosHorasSemestre;
    }

    public void setGestionRegistrosHorasSemestre(int gestionRegistrosHorasSemestre) {
        this.gestionRegistrosHorasSemestre = gestionRegistrosHorasSemestre;
    }

    public String getGestionRegistrosDescripcion() {
        return gestionRegistrosDescripcion;
    }

    public void setGestionRegistrosDescripcion(String gestionRegistrosDescripcion) {
        this.gestionRegistrosDescripcion = gestionRegistrosDescripcion;
    }

    public String getGestionRegistrosProducto() {
        return gestionRegistrosProducto;
    }

    public void setGestionRegistrosProducto(String gestionRegistrosProducto) {
        this.gestionRegistrosProducto = gestionRegistrosProducto;
    }

    public int getGestionAcreditacionHorasSemana() {
        return gestionAcreditacionHorasSemana;
    }

    public void setGestionAcreditacionHorasSemana(int gestionAcreditacionHorasSemana) {
        this.gestionAcreditacionHorasSemana = gestionAcreditacionHorasSemana;
    }

    public int getGestionAcreditacionHorasSemestre() {
        return gestionAcreditacionHorasSemestre;
    }

    public void setGestionAcreditacionHorasSemestre(int gestionAcreditacionHorasSemestre) {
        this.gestionAcreditacionHorasSemestre = gestionAcreditacionHorasSemestre;
    }

    public String getGestionAcreditacionDescripcion() {
        return gestionAcreditacionDescripcion;
    }

    public void setGestionAcreditacionDescripcion(String gestionAcreditacionDescripcion) {
        this.gestionAcreditacionDescripcion = gestionAcreditacionDescripcion;
    }

    public String getGestionAcreditacionProducto() {
        return gestionAcreditacionProducto;
    }

    public void setGestionAcreditacionProducto(String gestionAcreditacionProducto) {
        this.gestionAcreditacionProducto = gestionAcreditacionProducto;
    }

    public int getGestionComitesHorasSemana() {
        return gestionComitesHorasSemana;
    }

    public void setGestionComitesHorasSemana(int gestionComitesHorasSemana) {
        this.gestionComitesHorasSemana = gestionComitesHorasSemana;
    }

    public int getGestionComitesHorasSemestre() {
        return gestionComitesHorasSemestre;
    }

    public void setGestionComitesHorasSemestre(int gestionComitesHorasSemestre) {
        this.gestionComitesHorasSemestre = gestionComitesHorasSemestre;
    }

    public String getGestionComitesDescripcion() {
        return gestionComitesDescripcion;
    }

    public void setGestionComitesDescripcion(String gestionComitesDescripcion) {
        this.gestionComitesDescripcion = gestionComitesDescripcion;
    }

    public String getGestionComitesProducto() {
        return gestionComitesProducto;
    }

    public void setGestionComitesProducto(String gestionComitesProducto) {
        this.gestionComitesProducto = gestionComitesProducto;
    }

    public int getGestionAutoevaluacionHorasSemana() {
        return gestionAutoevaluacionHorasSemana;
    }

    public void setGestionAutoevaluacionHorasSemana(int gestionAutoevaluacionHorasSemana) {
        this.gestionAutoevaluacionHorasSemana = gestionAutoevaluacionHorasSemana;
    }

    public int getGestionAutoevaluacionHorasSemestre() {
        return gestionAutoevaluacionHorasSemestre;
    }

    public void setGestionAutoevaluacionHorasSemestre(int gestionAutoevaluacionHorasSemestre) {
        this.gestionAutoevaluacionHorasSemestre = gestionAutoevaluacionHorasSemestre;
    }

    public String getGestionAutoevaluacionDescripcion() {
        return gestionAutoevaluacionDescripcion;
    }

    public void setGestionAutoevaluacionDescripcion(String gestionAutoevaluacionDescripcion) {
        this.gestionAutoevaluacionDescripcion = gestionAutoevaluacionDescripcion;
    }

    public String getGestionAutoevaluacionProducto() {
        return gestionAutoevaluacionProducto;
    }

    public void setGestionAutoevaluacionProducto(String gestionAutoevaluacionProducto) {
        this.gestionAutoevaluacionProducto = gestionAutoevaluacionProducto;
    }

    public int getGestionInvestigacionHorasSemana() {
        return gestionInvestigacionHorasSemana;
    }

    public void setGestionInvestigacionHorasSemana(int gestionInvestigacionHorasSemana) {
        this.gestionInvestigacionHorasSemana = gestionInvestigacionHorasSemana;
    }

    public int getGestionInvestigacionHorasSemestre() {
        return gestionInvestigacionHorasSemestre;
    }

    public void setGestionInvestigacionHorasSemestre(int gestionInvestigacionHorasSemestre) {
        this.gestionInvestigacionHorasSemestre = gestionInvestigacionHorasSemestre;
    }

    public String getGestionInvestigacionDescripcion() {
        return gestionInvestigacionDescripcion;
    }

    public void setGestionInvestigacionDescripcion(String gestionInvestigacionDescripcion) {
        this.gestionInvestigacionDescripcion = gestionInvestigacionDescripcion;
    }

    public String getGestionInvestigacionProducto() {
        return gestionInvestigacionProducto;
    }

    public void setGestionInvestigacionProducto(String gestionInvestigacionProducto) {
        this.gestionInvestigacionProducto = gestionInvestigacionProducto;
    }

    public int getGestionFormacionHorasSemana() {
        return gestionFormacionHorasSemana;
    }

    public void setGestionFormacionHorasSemana(int gestionFormacionHorasSemana) {
        this.gestionFormacionHorasSemana = gestionFormacionHorasSemana;
    }

    public int getGestionFormacionHorasSemestre() {
        return gestionFormacionHorasSemestre;
    }

    public void setGestionFormacionHorasSemestre(int gestionFormacionHorasSemestre) {
        this.gestionFormacionHorasSemestre = gestionFormacionHorasSemestre;
    }

    public String getGestionFormacionDescripcion() {
        return gestionFormacionDescripcion;
    }

    public void setGestionFormacionDescripcion(String gestionFormacionDescripcion) {
        this.gestionFormacionDescripcion = gestionFormacionDescripcion;
    }

    public String getGestionFormacionProducto() {
        return gestionFormacionProducto;
    }

    public void setGestionFormacionProducto(String gestionFormacionProducto) {
        this.gestionFormacionProducto = gestionFormacionProducto;
    }

    public int getGestionPracticasHorasSemana() {
        return gestionPracticasHorasSemana;
    }

    public void setGestionPracticasHorasSemana(int gestionPracticasHorasSemana) {
        this.gestionPracticasHorasSemana = gestionPracticasHorasSemana;
    }

    public int getGestionPracticasHorasSemestre() {
        return gestionPracticasHorasSemestre;
    }

    public void setGestionPracticasHorasSemestre(int gestionPracticasHorasSemestre) {
        this.gestionPracticasHorasSemestre = gestionPracticasHorasSemestre;
    }

    public String getGestionPracticasDescripcion() {
        return gestionPracticasDescripcion;
    }

    public void setGestionPracticasDescripcion(String gestionPracticasDescripcion) {
        this.gestionPracticasDescripcion = gestionPracticasDescripcion;
    }

    public String getGestionPracticasProducto() {
        return gestionPracticasProducto;
    }

    public void setGestionPracticasProducto(String gestionPracticasProducto) {
        this.gestionPracticasProducto = gestionPracticasProducto;
    }

    public int getGestionCHHorasSemana() {
        return gestionCHHorasSemana;
    }

    public void setGestionCHHorasSemana(int gestionCHHorasSemana) {
        this.gestionCHHorasSemana = gestionCHHorasSemana;
    }

    public int getGestionCHHorasSemestre() {
        return gestionCHHorasSemestre;
    }

    public void setGestionCHHorasSemestre(int gestionCHHorasSemestre) {
        this.gestionCHHorasSemestre = gestionCHHorasSemestre;
    }

    public String getGestionCHDescripcion() {
        return gestionCHDescripcion;
    }

    public void setGestionCHDescripcion(String gestionCHDescripcion) {
        this.gestionCHDescripcion = gestionCHDescripcion;
    }

    public String getGestionCHProducto() {
        return gestionCHProducto;
    }

    public void setGestionCHProducto(String gestionCHProducto) {
        this.gestionCHProducto = gestionCHProducto;
    }

    public int getGestionLiderHorasSemana() {
        return gestionLiderHorasSemana;
    }

    public void setGestionLiderHorasSemana(int gestionLiderHorasSemana) {
        this.gestionLiderHorasSemana = gestionLiderHorasSemana;
    }

    public int getGestionLiderHorasSemestre() {
        return gestionLiderHorasSemestre;
    }

    public void setGestionLiderHorasSemestre(int gestionLiderHorasSemestre) {
        this.gestionLiderHorasSemestre = gestionLiderHorasSemestre;
    }

    public String getGestionLiderDescripcion() {
        return gestionLiderDescripcion;
    }

    public void setGestionLiderDescripcion(String gestionLiderDescripcion) {
        this.gestionLiderDescripcion = gestionLiderDescripcion;
    }

    public String getGestionLiderProducto() {
        return gestionLiderProducto;
    }

    public void setGestionLiderProducto(String gestionLiderProducto) {
        this.gestionLiderProducto = gestionLiderProducto;
    }
}