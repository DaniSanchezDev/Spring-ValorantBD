package edu.daniel.valorant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.daniel.valorant.entities.enumerated.Rol;
import edu.daniel.valorant.repositories.AgentesRepository;

@SpringBootApplication
// añadir el implements CommandLineRunner
public class ValorantWorldApplication implements CommandLineRunner {

	@Autowired 
	private AgentesRepository agentesRepo;

	public static void main(String[] args) {
		SpringApplication.run(ValorantWorldApplication.class, args);
		

	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Número de agentes almacenador en la tabla: " + agentesRepo.count());
		System.out.println(agentesRepo.findById((long) 20));
		// agentesRepo.deleteById((long) 20);

		// System.out.println(agentesRepo.findByRol(Rol.CENTINELA));
	}

}
