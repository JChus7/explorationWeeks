package explorationweeks.pujas.modelos.rs;

import java.util.List;

import explorationweeks.pujas.modelos.common.CommonRs;
import explorationweeks.pujas.modelos.data.Usuario;

public class ListaUsuariosRs extends CommonRs {

	private List<Usuario> usuarios;

	public ListaUsuariosRs() {
		super();
	}

	public ListaUsuariosRs(final List<Usuario> usuarios) {
		super();
		this.usuarios = usuarios;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(final List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
