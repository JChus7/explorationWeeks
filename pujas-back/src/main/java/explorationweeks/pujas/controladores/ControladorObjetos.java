package explorationweeks.pujas.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import explorationweeks.pujas.modelos.common.CommonRs;
import explorationweeks.pujas.modelos.data.Objeto;
import explorationweeks.pujas.modelos.rs.ListaObjetosRs;
import explorationweeks.pujas.servicios.ServicioObjetos;

@RestController
@RequestMapping(value = "/objetos-svc")
public class ControladorObjetos {

	@Autowired
	private ServicioObjetos service;

	@RequestMapping(method = RequestMethod.GET, path = "/listaObjetos")
	public ListaObjetosRs listaObjetos() {
		final ListaObjetosRs response = new ListaObjetosRs();
		try {
			response.setObjetos(service.listObjetos());
			response.setEstado(true);
		} catch (final Exception e) {
			response.setEstado(false);
			response.setError(e.getMessage());
		}

		return response;
	}

	@RequestMapping(method = RequestMethod.POST, path = "/insertObjeto")
	public CommonRs insertObjeto(final @RequestBody Objeto rq) {
		final CommonRs response = new CommonRs();
		try {
			service.insertObjeto(rq);
			response.setEstado(true);
		} catch (final Exception e) {
			response.setEstado(false);
			response.setError(e.getMessage());
		}
		return response;
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/updateObjeto")
	public CommonRs updateObjeto(final @RequestBody Objeto rq) {
		final CommonRs response = new CommonRs();
		try {
			service.updateObjeto(rq);
			response.setEstado(true);
		} catch (final Exception e) {
			response.setEstado(false);
			response.setError(e.getMessage());
		}
		return response;
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/deleteObjeto")
	public CommonRs deleteObjeto(@RequestParam final Integer id) {
		final CommonRs response = new CommonRs();
		try {
			service.deleteObjeto(id);
			response.setEstado(true);
		} catch (final Exception e) {
			response.setEstado(false);
			response.setError(e.getMessage());
		}
		return response;
	}

	public void setService(final ServicioObjetos service) {
		this.service = service;
	}
}
