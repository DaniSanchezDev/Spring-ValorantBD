package edu.daniel.valorant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.daniel.valorant.entities.Partida;

public interface IPartidasRepository extends JpaRepository <Partida,Long> {

}
