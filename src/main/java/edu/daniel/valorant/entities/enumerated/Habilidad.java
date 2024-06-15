package edu.daniel.valorant.entities.enumerated;

import jakarta.persistence.Entity;

@Entity
public class Habilidad {
    private Long id;
    private String nombre;
    private String descripcion;
    private Long poseedor;
}
