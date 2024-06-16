package edu.daniel.valorant.entities.enumerated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "habilidades")
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre;
    private String descripcion;
    private Long poseedor;

    public Habilidad() {

    }

    public Habilidad(Long id, String nombre, String descripcion, Long poseedor) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.poseedor = poseedor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getPoseedor() {
        return poseedor;
    }

    public void setPoseedor(Long poseedor) {
        this.poseedor = poseedor;
    }

    @Override
    public String toString() {
        return "Habilidad [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", poseedor=" + poseedor
                + "]";
    }

    
    

}
