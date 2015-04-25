package co.mlh.sga.eis;

import java.util.List;

import co.mlh.sga.domain.Persona;
import co.mlh.sga.domain.Usuario;

public interface UsuarioDAO {
	
	public List<Usuario> findAllUsuarios();
	
	public Usuario findUsuarioById(Usuario usuario);
	
	public Usuario findUsuarioByPersona(Persona persona);
	
	public void insertUsuario(Usuario usuario);
	
	public void updateUsuario(Usuario usuario);
	
	public void deleteUsuario(Usuario usuario);

}
