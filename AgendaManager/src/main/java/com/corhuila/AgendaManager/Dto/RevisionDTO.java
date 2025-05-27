package com.corhuila.AgendaManager.Dto;

public class RevisionDTO {
    private Long idRevisor;
    private String motivo;

    // Getters y setters
    public Long getIdRevisor() {
        return idRevisor;
    }

    public void setIdRevisor(Long idRevisor) {
        this.idRevisor = idRevisor;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
