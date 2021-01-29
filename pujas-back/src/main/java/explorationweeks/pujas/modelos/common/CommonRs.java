package explorationweeks.pujas.modelos.common;

public class CommonRs {

	private Boolean estado;

	private String error;

	public CommonRs() {
		super();
	}

	public CommonRs(final Boolean estado, final String error) {
		super();
		this.estado = estado;
		this.error = error;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(final Boolean estado) {
		this.estado = estado;
	}

	public String getError() {
		return error;
	}

	public void setError(final String error) {
		this.error = error;
	}

}
