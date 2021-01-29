package explorationweeks.pujas.modelos.rs;

import java.util.List;

import explorationweeks.pujas.modelos.common.CommonRs;
import explorationweeks.pujas.modelos.data.Objeto;

public class ListaObjetosRs extends CommonRs {

	private List<Objeto> objetos;

	public ListaObjetosRs() {
		super();
	}

	public ListaObjetosRs(final List<Objeto> objetos) {
		super();
		this.objetos = objetos;
	}

	public List<Objeto> getObjetos() {
		return objetos;
	}

	public void setObjetos(final List<Objeto> objetos) {
		this.objetos = objetos;
	}

}
