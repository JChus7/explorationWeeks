package explorationweeks.pujas.servicios;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import explorationweeks.pujas.dao.DaoObjetos;
import explorationweeks.pujas.modelos.data.Objeto;

@Service
public class ServicioObjetos {

	@Autowired
	private DaoObjetos dao;

	public List<Objeto> listObjetos() throws SQLException {
		return dao.listObjetos();
	}

	public void insertObjeto(final Objeto objeto) throws SQLException {
		dao.insertObjeto(objeto);
	}

	public void updateObjeto(final Objeto objeto) throws SQLException {
		dao.updateObjeto(objeto);
	}

	public void deleteObjeto(final Integer id) throws SQLException {
		dao.deleteObjeto(id);
	}

	public void setDao(final DaoObjetos dao) {
		this.dao = dao;
	}

}
