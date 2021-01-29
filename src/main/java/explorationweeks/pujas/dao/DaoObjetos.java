package explorationweeks.pujas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import explorationweeks.pujas.modelos.data.Objeto;

@Repository
public class DaoObjetos {

	private static ConnectionJDBC connectionJDBC;

	private static final String SQL_LIST = "SELECT id, nombre, descripcion, precio_inicial, foto, TO_CHAR(fecha_limite_puja, 'DD/MM/YYYY') fecha_limite_puja "
			+ "FROM pujasdb.OBJETOS";

	private static final String SQL_INSERT = "INSERT INTO pujasdb.OBJETOS (nombre, descripcion, precio_inicial, foto, fecha_limite_puja) "
			+ "VALUES(?, ?, ?, ?, TO_DATE(?, 'DD/MM/YYYY'))";

	private static final String SQL_UPDATE = "UPDATE pujasdb.OBJETOS SET nombre=?, descripcion=?, precio_inicial=?, "
			+ "foto=?, fecha_limite_puja=TO_DATE(?, 'DD/MM/YYYY') WHERE id=?";

	private static final String SQL_DELETE = "DELETE FROM pujasdb.OBJETOS WHERE id=?";

	public DaoObjetos() {
		super();
		connectionJDBC = new ConnectionJDBC();
	}

	public List<Objeto> listObjetos() throws SQLException {
		final List<Objeto> listado = new LinkedList<>();
		try (Connection connection = connectionJDBC.getConnection()) {
			try (final PreparedStatement stmt = connection.prepareStatement(SQL_LIST)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						listado.add(populateObjeto(rs));
					}
				}
			}
		}
		return listado;
	}

	public void insertObjeto(final Objeto objeto) throws SQLException {
		try (Connection connection = connectionJDBC.getConnection()) {
			try (final PreparedStatement stmt = connection.prepareStatement(SQL_INSERT)) {
				int parameterIndex = 1;
				stmt.setString(++parameterIndex, objeto.getNombre());
				stmt.setString(++parameterIndex, objeto.getDescripcion());
				stmt.setDouble(++parameterIndex, objeto.getPrecioInicial());
				stmt.setString(++parameterIndex, objeto.getFoto());
				stmt.setString(++parameterIndex, objeto.getFechaLimite());

				stmt.executeUpdate();
			}
		}
	}

	public void updateObjeto(final Objeto objeto) throws SQLException {
		try (Connection connection = connectionJDBC.getConnection()) {
			try (final PreparedStatement stmt = connection.prepareStatement(SQL_UPDATE)) {
				int parameterIndex = 1;
				stmt.setString(++parameterIndex, objeto.getNombre());
				stmt.setString(++parameterIndex, objeto.getDescripcion());
				stmt.setDouble(++parameterIndex, objeto.getPrecioInicial());
				stmt.setString(++parameterIndex, objeto.getFoto());
				stmt.setString(++parameterIndex, objeto.getFechaLimite());
				stmt.setInt(++parameterIndex, objeto.getId());

				stmt.executeUpdate();
			}
		}
	}

	public void deleteObjeto(final Integer id) throws SQLException {
		try (Connection connection = connectionJDBC.getConnection()) {
			try (final PreparedStatement stmt = connection.prepareStatement(SQL_DELETE)) {
				int parameterIndex = 1;
				stmt.setInt(++parameterIndex, id);

				stmt.executeUpdate();
			}
		}
	}

	private Objeto populateObjeto(final ResultSet rs) throws SQLException {
		return new Objeto(rs.getInt("id"), rs.getString("nombre"), rs.getString("descripcion"),
				rs.getDouble("precio_inicial"), rs.getString("foto"), rs.getString("fecha_limite_puja"));
	}
}
