package explorationweeks.pujas.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import explorationweeks.pujas.modelos.common.CommonRs;
import explorationweeks.pujas.servicios.ServicioPujas;

@RestController
@RequestMapping(value = "/pujas-svc")
public class ControladorPujas {

	@Autowired
	private ServicioPujas service;

	@RequestMapping(method = RequestMethod.GET, path = "/listaPujas")
	public void listaPujas() {

	}

	@RequestMapping(method = RequestMethod.POST, path = "/insertPuja")
	public CommonRs insertPuja() {
		final CommonRs response = new CommonRs();
		return response;
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/updatePuja")
	public CommonRs updatePuja() {
		final CommonRs response = new CommonRs();
		return response;
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/deletePuja")
	public CommonRs deletePuja(@RequestParam final Integer id) {
		final CommonRs response = new CommonRs();
		return response;
	}

}
