package edu.daniel.valorant.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.Collate;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.mapping.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.*;

@Entity
@Table (name="jugadores")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (length = 55, nullable = false)
    private String nombre;
    @Column (length = 55, nullable = false)
    private String apellido;
    private int edad;
    @Column (length = 255, nullable = false)
    private String email;
    @Column (length = 55, nullable = false)
    private String nacionalidad;

    @Column(name = "apodo", length = 55, nullable = false, unique = true)
    private String apodo;
    @Temporal(TemporalType.DATE)
    private LocalDate fechaNacimiento;

    @OnDelete(action = OnDeleteAction.CASCADE)
    @OneToMany(mappedBy = "jugador", cascade = CascadeType.ALL,orphanRemoval = true)
    java.util.List<Partida> partidas;

    public Jugador() {

    }

    public Jugador(String nombre, String apellido, int edad, String email, String nacionalidad, String apodo,
            LocalDate fechaNacimiento, java.util.List<Partida> partidas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.nacionalidad = nacionalidad;
        this.apodo = apodo;
        this.fechaNacimiento = fechaNacimiento;
        this.partidas = partidas;
    }
    

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getNacionalidad() {
        return nacionalidad;
    }


    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


    public String getApodo() {
        return apodo;
    }


    public void setApodo(String apodo) {
        this.apodo = apodo;
    }


    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }


    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", email=" + email
                + ", nacionalidad=" + nacionalidad + ", apodo=" + apodo + ", fechaNacimiento=" + fechaNacimiento
                + /*", agentes=" + agentes + */ "]";
    }

    public java.util.List<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(java.util.List<Partida> partidas) {
        this.partidas = partidas;
    }

    

    


}
