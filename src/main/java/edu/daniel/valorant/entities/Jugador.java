package edu.daniel.valorant.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.Collate;
import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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


    @ManyToAny
    @JoinTable(
        name = "jugadores_agentes",
        joinColumns = @JoinColumn(name = "jugador_id"),
        inverseJoinColumns = @JoinColumn (name = "agente_id")
    )

    private Set<Agente> agentes = new HashSet<>();
    



}
