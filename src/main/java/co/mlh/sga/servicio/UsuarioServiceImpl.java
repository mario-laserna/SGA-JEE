package co.mlh.sga.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import co.mlh.sga.domain.Persona;
import co.mlh.sga.domain.Usuario;
import co.mlh.sga.eis.UsuarioDAO;

@Stateless
public class UsuarioServiceImpl implements UsuarioService {
	@EJB
	private UsuarioDAO usuarioDao;

	@Override
	public List<Usuario> listarUsuarios() {
		return usuarioDao.findAllUsuarios();
	}

	@Override
	public Usuario encontrarUsuarioPorId(Usuario usuario) {
		return usuarioDao.findUsuarioById(usuario);
	}

	@Override
	public Usuario encontrarUsuarioPorPersona(Persona persona) {
		return usuarioDao.findUsuarioByPersona(persona);
	}

	@Override
	public void registrarUsuario(Usuario usuario) {
		usuarioDao.insertUsuario(usuario);
	}

	@Override
	public void modificarUsuario(Usuario usuario) {
		usuarioDao.updateUsuario(usuario);
	}

	@Override
	public void eliminarUsuario(Usuario usuario) {
		usuarioDao.deleteUsuario(usuario);
	}
	

}
