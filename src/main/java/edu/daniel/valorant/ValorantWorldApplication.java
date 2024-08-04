package edu.daniel.valorant;

import java.util.List;

import org.aspectj.weaver.loadtime.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.daniel.valorant.entities.Agente;
import edu.daniel.valorant.entities.enumerated.Rol;
//import edu.daniel.valorant.entities.enumerated.Rol;
import edu.daniel.valorant.repositories.AgentesRepository;
import edu.daniel.valorant.repositories.IHabilidadesRepository;
import edu.daniel.valorant.repositories.IJugadoresRepository;
import edu.daniel.valorant.repositories.IPartidasRepository;

@SpringBootApplication
// añadir el implements CommandLineRunner
public class ValorantWorldApplication implements CommandLineRunner {

	@Autowired 
	private AgentesRepository agentesRepo;

	@Autowired
	private IHabilidadesRepository hablidadesRepo;

	@Autowired
	private IJugadoresRepository jugadoresRepo;

	@Autowired
	private IPartidasRepository partidasRepo;

	public static void main(String[] args) {
		SpringApplication.run(ValorantWorldApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
		// sout para contar el numero de agentes
	//	System.out.println("Número de agentes almacenador en la tabla: " + agentesRepo.count());
		//sout para encontrar el id numero 20
	//	System.out.println(agentesRepo.findById((long) 20));
		// borrar el id 20
		// agentesRepo.deleteById((long) 20);
		// sout para encontrar por nombre, pais y rol (nombre del agente, pais, Rol. rol seleccionado )
	//	System.out.println(agentesRepo.findByNombreAndPaisAndRol("reyna", "mexico", Rol.DUELISTA));
		// sout para encontrar los agentes con id > 15
	//	System.out.println(agentesRepo.findByIdAgenteGreaterThan(15));
		// sout para encontrar segun el rol
	//	System.out.println(agentesRepo.findByRol(Rol.CENTINELA));

	//	List<Agente> resultadoConsulta = agentesRepo.findByIdAgenteGreaterThan(15);
	//	System.out.println(resultadoConsulta.size());
		// sout para encontrar segun que letra/as empiece el nombre
	//	System.out.println(agentesRepo.findByNombreStartingWith("Re"));

	//	System.out.println(hablidadesRepo.findAll());

	//	System.out.println(agentesRepo.findByRol(Rol.CENTINELA));

	//g	System.out.println(agentesRepo.findByRol(Rol.CENTINELA));;
		System.out.println(partidasRepo.findAll());
	}

}
