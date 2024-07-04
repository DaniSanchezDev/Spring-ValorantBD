package edu.daniel.valorant.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.Collate;
import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;

@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private String nacionalidad;

    @Column(unique = true)
    private String apodo;

    private LocalDate fechaNacimiento;


    @ManyToAny (fetch = FetchType.EAGER)
    @JoinTable(
        name = "jugadores_agentes",
        joinColumns = @JoinColumn(name = "jugador_id"),
        inverseJoinColumns = @JoinColumn (name = "agente_id")
    )

    private Set<Agente> agentes = new HashSet<>();

    public Jugador() {

    }

    public Jugador(String nombre, String apellido, int edad, String email, String nacionalidad, String apodo,
            LocalDate fechaNacimiento, Set<Agente> agentes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.nacionalidad = nacionalidad;
        this.apodo = apodo;
        this.fechaNacimiento = fechaNacimiento;
        this.agentes = agentes;
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


    public Set<Agente> getAgentes() {
        return agentes;
    }


    public void setAgentes(Set<Agente> agentes) {
        this.agentes = agentes;
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", email=" + email
                + ", nacionalidad=" + nacionalidad + ", apodo=" + apodo + ", fechaNacimiento=" + fechaNacimiento
                + ", agentes=" + agentes + "]";
    }


    


}
