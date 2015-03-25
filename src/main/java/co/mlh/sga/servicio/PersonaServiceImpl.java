package co.mlh.sga.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import co.mlh.sga.domain.Persona;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote {

	public List<Persona> listarPersonas() {
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona(1, "Juan", "Ape paterno", "", "email@email.com", "123"));
		personas.add(new Persona(2, "Pepe", "Ape paterno2", "", "email2@email.com", "543"));
		
		return personas;
	}

	public Persona encontrarPersonaPorId(Persona persona) {
		return null;
	}

	public Persona econtrarPersonaPorEmail(Persona persona) {
		return null;
	}

	public void registrarPersona(Persona persona) {
	}

	public void modificarPersona(Persona persona) {
	}

	public void eliminarPersona(Persona persona) {
	}

}
