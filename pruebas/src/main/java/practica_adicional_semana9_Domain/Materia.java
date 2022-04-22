package practica_adicional_semana9_Domain;

public class Materia {

	private int id;
	private String Curso;
	private int turno;
	
	public Materia(int id, String curso, int turno) {
		super();
		this.id = id;
		this.Curso = curso;
		this.turno = turno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		Curso = curso;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}
	
	public String toString() {
		return "Materia [id_Materia=" + id + ", curso=" + Curso + ", turno=" + turno + "]";
	}
	 
}
