package explorationweeks.pujas.modelos.data;

public class Usuario {

	private Integer id;

	private String nombre;

	private String email;

	public Usuario() {
		super();
	}

	public Usuario(final Integer id, final String nombre, final String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

}
