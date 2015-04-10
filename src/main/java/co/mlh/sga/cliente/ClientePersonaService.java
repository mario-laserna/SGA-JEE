package co.mlh.sga.cliente;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import co.mlh.sga.domain.Persona;
import co.mlh.sga.servicio.PersonaServiceRemote;

public class ClientePersonaService {
	public static void main(String[] args) {
		System.out.println("Iniciando llamada al EJB desde el cliente");
		
		try{
			Context jndi = new InitialContext();
			PersonaServiceRemote personaService = (PersonaServiceRemote)
					jndi.lookup("java:global/sga-jee/PersonaServiceImpl!co.mlh.sga.servicio.PersonaServiceRemote");
			
			List<Persona> personas = personaService.listarPersonas();
			for(Persona p : personas){
				System.out.println(p);
			}
			
			System.out.println("Fin llamada al EJB desde el cliente");
		}catch(NamingException ne){
			ne.printStackTrace();
		}
		
		
	}
}
