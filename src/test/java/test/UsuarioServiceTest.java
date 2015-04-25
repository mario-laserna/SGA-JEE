package test;

import static org.junit.Assert.*;

import java.util.List;

import javax.ejb.embeddable.EJBContainer;
import javax.validation.constraints.AssertTrue;

import org.junit.Before;
import org.junit.Test;

import co.mlh.sga.domain.Persona;
import co.mlh.sga.domain.Usuario;
import co.mlh.sga.servicio.PersonaService;
import co.mlh.sga.servicio.UsuarioService;

public class UsuarioServiceTest {
	private UsuarioService usuarioService;
	private PersonaService personaService;
	
	@Before
	public void setUp() throws Exception{
		EJBContainer contenedor = EJBContainer.createEJBContainer();
		personaService = (PersonaService)
				contenedor.getContext().lookup("java:global/classes/PersonaServiceImpl!co.mlh.sga.servicio.PersonaService");
		
		usuarioService = (UsuarioService)
				contenedor.getContext().lookup("java:global/classes/UsuarioServiceImpl!co.mlh.sga.servicio.UsuarioService");
	}
	
	@Test
	public void testEjbUsuarioService(){
		System.out.println("***Inicio test ejb");
		
		assertTrue(personaService != null);
		assertTrue(usuarioService != null);
		
		System.out.println("numero de usuarios " + usuarioService.listarUsuarios().size());
		
		this.listarUsuarios(usuarioService.listarUsuarios());
		
		Usuario nuevo = new Usuario("usuario2", "contraseña");
		usuarioService.registrarUsuario(nuevo);
		
		assertTrue(nuevo.getIdUsuario() != null);
		
		this.listarUsuarios(usuarioService.listarUsuarios());
		
		Usuario aBuscar = new Usuario();
		aBuscar.setIdUsuario(1);
		Usuario buscado = usuarioService.encontrarUsuarioPorId(aBuscar);
		
		assertTrue(buscado != null);
		
		System.out.println("nombre buscado " + buscado.getUsername());
		
		Persona aBuscarPersona = new Persona(1);
		Persona buscadoPersona = personaService.encontrarPersonaPorId(aBuscarPersona);
		
		assertTrue(buscadoPersona != null);
		
		System.out.println("persona " + buscadoPersona.getNombre());
		
		Usuario buscadoPorPersona = usuarioService.encontrarUsuarioPorPersona(buscadoPersona);
		
		assertTrue(buscadoPorPersona != null);
		
		System.out.println("nombre buscado por persona" + buscadoPorPersona.getUsername());
		
		System.out.println("***Fin test ejb");
	}
	
	private void listarUsuarios(List<Usuario> usuarios){
		for(Usuario u : usuarios){
			System.out.println(u);
		}
	}

}
