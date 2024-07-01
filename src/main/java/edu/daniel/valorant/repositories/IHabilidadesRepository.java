package edu.daniel.valorant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.daniel.valorant.entities.enumerated.Habilidad;

public interface IHabilidadesRepository extends JpaRepository <Habilidad, Long>{

}
