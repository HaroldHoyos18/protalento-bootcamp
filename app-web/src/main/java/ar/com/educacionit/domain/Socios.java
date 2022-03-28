package ar.com.educacionit.domain;

public class Socios {

	
	private Long id;
	private String nombre;
	private String apellido;
	private String email;
	private String direccion;
	private Long paisesid;
	
	
	public Socios(Long id, String nombre, String apellido, String email, String direccion, Long paisesid) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.direccion = direccion;
		this.paisesid = paisesid;
	}


	public Socios(String nombre, String apellido, String email, String direccion, Long paisesid) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.direccion = direccion;
		this.paisesid = paisesid;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Long getPaisesid() {
		return paisesid;
	}


	public void setPaisesid(Long paisesid) {
		this.paisesid = paisesid;
	}


	@Override
	public String toString() {
		return "Socios [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", direccion=" + direccion + ", paisesid=" + paisesid + "]";
	}

	
	



}
