package explorationweeks.pujas.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import explorationweeks.pujas.dao.DaoPujas;
import explorationweeks.pujas.modelos.data.Puja;

@Service
public class ServicioPujas {

	@Autowired
	private DaoPujas dao;

	public List<Puja> listPujas() {
		return null;
	}

	public void insertPuja() {

	}

	public void updatePuja() {

	}

	public void deletePuja() {

	}
}
