package explorationweeks.pujas.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import explorationweeks.pujas.modelos.common.CommonRs;

@RestController
@RequestMapping(value = "/health-svc")
public class ControladorHealth {

	@RequestMapping(method = RequestMethod.GET, path = "/checkHealth")
	public CommonRs checkHealth() {
		final CommonRs response = new CommonRs();

		response.setEstado(true);

		return response;
	}
}
