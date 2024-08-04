package edu.daniel.valorant.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.daniel.valorant.entities.enumerated.Rol;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

    @Entity
    @Table(name = "agentes")

public class Agente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idAgente;
    @Column(unique = true)
    private String nombre;
    @Enumerated(EnumType.STRING)
    @Column(name="rol", columnDefinition = "ENUM('CENTINELA','INICIADOR','DUELISTA','CONTROLADOR')")
    private Rol rol;
    private String ultimate;
    private String pais;
    // OneToMany es para mapear varios objetos de una lista 1 a varios
    // cascade hace que si se borra un agente, borre todas sus habilidades
    // el fetch es la manera de conseguir las habilidades.
    @OneToMany(mappedBy = "poseedor", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List <Habilidad> habilidades;

    public Agente() {
    }


    public Agente(String nombre, Rol rol, String ultimate, String pais) {
        this.nombre = nombre;
        this.rol = rol;
        this.ultimate = ultimate;
        this.pais = pais;
    }

    public Agente(long idAgente, String nombre, Rol rol, String ultimate, String pais) {
        this.idAgente = idAgente;
        this.nombre = nombre;
        this.rol = rol;
        this.ultimate = ultimate;
        this.pais = pais;
    }

    public long getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(long idAgente) {
        this.idAgente = idAgente;
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

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Agente [idAgente=" + idAgente + ", nombre=" + nombre + ", rol=" + rol + ", ultimate=" + ultimate
                + ", pais=" + pais + ", habilidades=" + habilidades + "]";
    }

    


}
