package com.corhuila.AgendaManager.Dto;
public class UsuarioDTO {

    private Long ID_Usuario;
    private String nombre;
    private String correo;
    private String rol;
    private String contrasena;

   
    private String actividadDocente;
    private String actividadFormativa;
    private String actividadInvestigativa;
    private String actividadExtension;
    private String actividadCultural;
    private String actividadGestion;
    private String otrasActividades;

 

    public Long getId() { return ID_Usuario; }
    public void setId(Long ID_Usuario) { this.ID_Usuario = ID_Usuario; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public String getActividadDocente() { return actividadDocente; }
    public void setActividadDocente(String actividadDocente) { this.actividadDocente = actividadDocente; }

    public String getActividadFormativa() { return actividadFormativa; }
    public void setActividadFormativa(String actividadFormativa) { this.actividadFormativa = actividadFormativa; }

    public String getActividadInvestigativa() { return actividadInvestigativa; }
    public void setActividadInvestigativa(String actividadInvestigativa) { this.actividadInvestigativa = actividadInvestigativa; }

    public String getActividadExtension() { return actividadExtension; }
    public void setActividadExtension(String actividadExtension) { this.actividadExtension = actividadExtension; }

    public String getActividadCultural() { return actividadCultural; }
    public void setActividadCultural(String actividadCultural) { this.actividadCultural = actividadCultural; }

    public String getActividadGestion() { return actividadGestion; }
    public void setActividadGestion(String actividadGestion) { this.actividadGestion = actividadGestion; }

    public String getOtrasActividades() { return otrasActividades; }
    public void setOtrasActividades(String otrasActividades) { this.otrasActividades = otrasActividades; }
}
