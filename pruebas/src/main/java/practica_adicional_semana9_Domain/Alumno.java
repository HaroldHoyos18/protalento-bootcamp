package practica_adicional_semana9_Domain;

public class Alumno {
	
	private int matricula;
	private String Nombre;
	private String Apellido;
	
	
	public Alumno(int matricula, String nombre, String apellido) {
		super();
		this.matricula = matricula;
		Nombre = nombre;
		Apellido = apellido;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getApellido() {
		return Apellido;
	}


	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
	public String toString() {
		return "Alumno [nombre=" + Nombre +"Apellido"+Apellido +", matricula=" + matricula+ "]";
	}
	

}
