package explorationweeks.pujas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import explorationweeks.pujas.modelos.data.Usuario;

@Repository
public class DaoUsuarios {

	private static ConnectionJDBC connectionJDBC;

	private static final String SQL_LIST = "SELECT * FROM pujasdb.USUARIOS";

	private static final String SQL_INSERT = "INSERT INTO pujasdb.USUARIOS (nombre, email) VALUES(?, ?)";

	private static final String SQL_UPDATE = "UPDATE pujasdb.USUARIOS SET nombre=?, email=? WHERE id=?";

	private static final String SQL_DELETE = "DELETE FROM pujasdb.USUARIOS WHERE id=?";

	public DaoUsuarios() {
		super();
		connectionJDBC = new ConnectionJDBC();
	}

	public List<Usuario> listUsuarios() throws SQLException {
		final List<Usuario> listado = new LinkedList<>();
		try (Connection connection = connectionJDBC.getConnection()) {
			try (final PreparedStatement stmt = connection.prepareStatement(SQL_LIST)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						listado.add(populateUsuario(rs));
					}
				}
			}
		}
		return listado;
	}

	public void insertUsuario(final Usuario usuario) throws SQLException {
		try (Connection connection = connectionJDBC.getConnection()) {
			try (final PreparedStatement stmt = connection.prepareStatement(SQL_INSERT)) {
				int parameterIndex = 1;
				stmt.setString(++parameterIndex, usuario.getNombre());
				stmt.setString(++parameterIndex, usuario.getEmail());

				stmt.executeUpdate();
			}
		}
	}

	public void updateUsuario(final Usuario usuario) throws SQLException {
		try (Connection connection = connectionJDBC.getConnection()) {
			try (final PreparedStatement stmt = connection.prepareStatement(SQL_UPDATE)) {
				int parameterIndex = 1;
				stmt.setString(++parameterIndex, usuario.getNombre());
				stmt.setString(++parameterIndex, usuario.getEmail());
				stmt.setInt(++parameterIndex, usuario.getId());

				stmt.executeUpdate();
			}
		}
	}

	public void deleteUsuario(final Integer id) throws SQLException {
		try (Connection connection = connectionJDBC.getConnection()) {
			try (final PreparedStatement stmt = connection.prepareStatement(SQL_DELETE)) {
				int parameterIndex = 1;
				stmt.setInt(++parameterIndex, id);

				stmt.executeUpdate();
			}
		}
	}

	private Usuario populateUsuario(final ResultSet rs) throws SQLException {
		return new Usuario(rs.getInt("id"), rs.getString("nombre"), rs.getString("email"));
	}
}
