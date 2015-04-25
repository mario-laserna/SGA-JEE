package co.mlh.sga.servicio;

import java.util.List;

import javax.ejb.Local;

import co.mlh.sga.domain.Persona;
import co.mlh.sga.domain.Usuario;

@Local
public interface UsuarioService {
	public List<Usuario> listarUsuarios();
	
	public Usuario encontrarUsuarioPorId(Usuario usuario);
	
	public Usuario encontrarUsuarioPorPersona(Persona persona);
	
	public void registrarUsuario(Usuario usuario);
	
	public void modificarUsuario(Usuario usuario);
	
	public void eliminarUsuario(Usuario usuario);

}
