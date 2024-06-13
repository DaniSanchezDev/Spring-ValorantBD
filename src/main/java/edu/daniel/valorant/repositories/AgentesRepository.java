package edu.daniel.valorant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.daniel.valorant.entities.Agente;
import java.util.List;
import edu.daniel.valorant.entities.enumerated.Rol;


public interface AgentesRepository extends JpaRepository <Agente, Long> {

    public List<Agente> findByRol(Rol rol);

}
