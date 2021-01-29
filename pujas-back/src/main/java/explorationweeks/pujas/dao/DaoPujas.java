package explorationweeks.pujas.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DaoPujas {

	private static ConnectionJDBC connectionJDBC;

	public DaoPujas() {
		super();
		connectionJDBC = new ConnectionJDBC();
	}
}
