package ar.com.educacionit.domain;

public class Categorias extends Entity{



	//Atributos
	private Long id;
	private String descripcion;
	private String codigo;
	
	public Categorias() {}
	
	public Categorias(Long id, String descripcion, String codigo) {
		this.id = id;
		this.descripcion = descripcion;
		this.codigo = codigo;
	}
	public Categorias(String descripcion, String codigo) {
		this.descripcion = descripcion;
		this.codigo = codigo;
	}
	public Long getid() {
		return id;
	}
	public void setid(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", descripcion=" + descripcion + ", codigo=" + codigo + "]";
	}
	
	//Constructor
	
	
	//metodos
	
	
	
	
	//get/set
	

}