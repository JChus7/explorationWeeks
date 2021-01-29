package explorationweeks.pujas.modelos.data;

public class Puja {

	private Integer id;

	private Integer idUsuario;

	private Integer idObjeto;

	private Double precioPuja;

	public Puja() {
		super();
	}

	public Puja(final Integer id, final Integer idUsuario, final Integer idObjeto, final Double precioPuja) {
		super();
		this.id = id;
		this.idUsuario = idUsuario;
		this.idObjeto = idObjeto;
		this.precioPuja = precioPuja;
	}

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(final Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getIdObjeto() {
		return idObjeto;
	}

	public void setIdObjeto(final Integer idObjeto) {
		this.idObjeto = idObjeto;
	}

	public Double getPrecioPuja() {
		return precioPuja;
	}

	public void setPrecioPuja(final Double precioPuja) {
		this.precioPuja = precioPuja;
	}

}
