package edu.daniel.valorant.entities.enumerated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    private String nombre;
    private String descripcion;
    private Long poseedor;
}
