package edu.daniel.valorant.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.repository.query.parser.Part;

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
    private Long id;
    @Column(length = 55, nullable = false, unique = true)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(name="rol", columnDefinition = "ENUM('CENTINELA','INICIADOR','DUELISTA','CONTROLADOR')")
    private Rol rol;
    @Column(length = 55, nullable = false, unique = true)
    private String ultimate;
    @Column(length = 55, nullable = false)
    private String pais;
    // OneToMany es para mapear varios objetos de una lista 1 a varios
    // cascade hace que si se borra un agente, borre todas sus habilidades
    // el fetch es la manera de conseguir las habilidades.
    @OnDelete(action = OnDeleteAction.CASCADE)
    @OneToMany(mappedBy = "poseedor", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List <Habilidad> habilidades;
    @OnDelete(action = OnDeleteAction.CASCADE)
    @OneToMany(mappedBy = "agente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List <Partida> partidas;

    public Agente() {
    }


    public Agente(String nombre, Rol rol, String ultimate, String pais) {
        this.nombre = nombre;
        this.rol = rol;
        this.ultimate = ultimate;
        this.pais = pais;
    }

    public Agente(long id, String nombre, Rol rol, String ultimate, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
        this.ultimate = ultimate;
        this.pais = pais;
    }

    public long getid() {
        return id;
    }

    public void setid(long id) {
        this.id = id;
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
        return "Agente [id=" + id + ", nombre=" + nombre + ", rol=" + rol + ", ultimate=" + ultimate
                + ", pais=" + pais + ", habilidades=" + habilidades + "]";
    }

    


}
