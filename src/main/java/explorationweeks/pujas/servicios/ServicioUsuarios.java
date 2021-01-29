package explorationweeks.pujas.servicios;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import explorationweeks.pujas.dao.DaoUsuarios;
import explorationweeks.pujas.modelos.data.Usuario;

@Service
public class ServicioUsuarios {

	@Autowired
	private DaoUsuarios dao;

	public List<Usuario> listUsuarios() throws SQLException {
		return dao.listUsuarios();
	}

	public void insertUsuario(final Usuario usuario) throws SQLException {
		dao.insertUsuario(usuario);
	}

	public void updateUsuario(final Usuario usuario) throws SQLException {
		dao.updateUsuario(usuario);
	}

	public void deleteUsuario(final Integer id) throws SQLException {
		dao.deleteUsuario(id);
	}
}
