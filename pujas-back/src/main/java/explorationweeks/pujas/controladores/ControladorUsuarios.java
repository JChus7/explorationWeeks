package explorationweeks.pujas.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import explorationweeks.pujas.modelos.common.CommonRs;
import explorationweeks.pujas.modelos.data.Usuario;
import explorationweeks.pujas.modelos.rs.ListaUsuariosRs;
import explorationweeks.pujas.servicios.ServicioUsuarios;

@RestController
@RequestMapping(value = "/usuarios-svc")
public class ControladorUsuarios {

	@Autowired
	private ServicioUsuarios service;

	@RequestMapping(method = RequestMethod.GET, path = "/listaUsuarios")
	public ListaUsuariosRs listaUsuarios() {
		final ListaUsuariosRs response = new ListaUsuariosRs();
		try {
			response.setUsuarios(service.listUsuarios());
			response.setEstado(true);
		} catch (final Exception e) {
			response.setEstado(false);
			response.setError(e.getMessage());
		}

		return response;
	}

	@RequestMapping(method = RequestMethod.POST, path = "/insertUsuario")
	public CommonRs insertUsuario(final @RequestBody Usuario rq) {
		final CommonRs response = new CommonRs();
		try {
			service.insertUsuario(rq);
			response.setEstado(true);
		} catch (final Exception e) {
			response.setEstado(false);
			response.setError(e.getMessage());
		}
		return response;
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/updateUsuario")
	public CommonRs updateUsuario(final @RequestBody Usuario rq) {
		final CommonRs response = new CommonRs();
		try {
			service.updateUsuario(rq);
			response.setEstado(true);
		} catch (final Exception e) {
			response.setEstado(false);
			response.setError(e.getMessage());
		}
		return response;
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/deleteUsuario")
	public CommonRs deleteUsuario(@RequestParam final Integer id) {
		final CommonRs response = new CommonRs();
		try {
			service.deleteUsuario(id);
			response.setEstado(true);
		} catch (final Exception e) {
			response.setEstado(false);
			response.setError(e.getMessage());
		}
		return response;
	}
}
