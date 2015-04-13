package test;

import static org.junit.Assert.*;

import java.util.List;

import javax.ejb.embeddable.EJBContainer;

import org.junit.Before;
import org.junit.Test;

import co.mlh.sga.domain.Persona;
import co.mlh.sga.servicio.PersonaService;

public class PersonaServiceTest {
	private PersonaService personaService;
	
	@Before
	public void setUp() throws Exception{
		EJBContainer contenedor  = EJBContainer.createEJBContainer();
		personaService = (PersonaService)
				contenedor.getContext().lookup("java:global/classes/PersonaServiceImpl!co.mlh.sga.servicio.PersonaService");
		
	}
	
	@Test
	public void testEJBPersonaServide(){
		System.out.println("Inicio test ejb");
		
		assertTrue(personaService != null);
		
		assertEquals(2, personaService.listarPersonas().size());
		
		System.out.println("Número de personas " + personaService.listarPersonas().size());
		
		this.desplegarPersonas(personaService.listarPersonas());
		
		System.out.println("Fin test ejb");
	}
	
	private void desplegarPersonas(List<Persona> personas){
		for(Persona p : personas){
			System.out.println(p);
		}
	}

}
