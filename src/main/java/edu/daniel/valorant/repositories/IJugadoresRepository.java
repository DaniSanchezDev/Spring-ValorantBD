package edu.daniel.valorant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.daniel.valorant.entities.Jugador;

public interface IJugadoresRepository extends JpaRepository<Jugador, String> {

}
