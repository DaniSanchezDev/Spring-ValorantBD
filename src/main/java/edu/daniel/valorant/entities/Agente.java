package edu.daniel.valorant.entities;

import edu.daniel.valorant.enumerated.Rol;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

    @Entity
    @Table(name = "agentes")

public class Agente {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdAgente;
    private String nombre;
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition ="ENUM('CENTINELA', 'INICIADOR', 'DUELISTA','CONTROLADOR')")
    private Rol rol;
    private String ultimate;
    private String pais;
    public Long getIdAgente() {
        return IdAgente;
    }
    public void setIdAgente(Long idAgente) {
        IdAgente = idAgente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Rol getRol() {
        return rol;
    }
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public String getUltimate() {
        return ultimate;
    }
    public void setUltimate(String ultimate) {
        this.ultimate = ultimate;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public Agente(Long idAgente, String nombre, Rol rol, String ultimate, String pais) {
        IdAgente = idAgente;
        this.nombre = nombre;
        this.rol = rol;
        this.ultimate = ultimate;
        this.pais = pais;
    }
    @Override
    public String toString() {
        return "Agente [IdAgente=" + IdAgente + ", nombre=" + nombre + ", rol=" + rol + ", ultimate=" + ultimate
                + ", pais=" + pais + "]";
    }

    
    


}
