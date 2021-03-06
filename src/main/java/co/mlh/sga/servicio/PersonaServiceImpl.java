package co.mlh.sga.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import co.mlh.sga.domain.Persona;
import co.mlh.sga.eis.PersonaDao;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService {
	@EJB
	private PersonaDao personaDao;

	public List<Persona> listarPersonas() {
		/*List<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona(1, "Juan", "Ape paterno", "", "email@email.com", "123"));
		personas.add(new Persona(2, "Pepe", "Ape paterno2", "", "email2@email.com", "543"));
		
		return personas;*/
		return personaDao.findAllPersonas();
	}

	public Persona encontrarPersonaPorId(Persona persona) {
		return personaDao.findPersonaById(persona);
	}

	public Persona econtrarPersonaPorEmail(Persona persona) {
		return personaDao.findPersonaByEmail(persona);
	}

	public void registrarPersona(Persona persona) {
		personaDao.insertPersona(persona);
	}

	public void modificarPersona(Persona persona) {
		personaDao.updatePersona(persona);
	}

	public void eliminarPersona(Persona persona) {
		personaDao.deletePersona(persona);
	}

}
