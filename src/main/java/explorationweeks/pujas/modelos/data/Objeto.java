package explorationweeks.pujas.modelos.data;

public class Objeto {

	private Integer id;

	private String nombre;

	private String descripcion;

	private Double precioInicial;

	private String foto;

	private String fechaLimite;

	public Objeto() {
		super();
	}

	public Objeto(final Integer id, final String nombre, final String descripcion, final Double precioInicial,
			final String foto, final String fechaLimite) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioInicial = precioInicial;
		this.foto = foto;
		this.fechaLimite = fechaLimite;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecioInicial() {
		return precioInicial;
	}

	public void setPrecioInicial(final Double precioInicial) {
		this.precioInicial = precioInicial;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(final String foto) {
		this.foto = foto;
	}

	public String getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(final String fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

}
