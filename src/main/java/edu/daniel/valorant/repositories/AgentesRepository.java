package edu.daniel.valorant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.daniel.valorant.entities.Agente;

public interface AgentesRepository extends JpaRepository <Agente, Long> {


}
