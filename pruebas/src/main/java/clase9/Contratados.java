package clase9;

public class Contratados extends Empleado{
	
	private Integer periodo;

	
	// TODO Auto-generated constructor stub
public Contratados(String nombre, String apellido, String colorPelo, Integer id, Integer periodo) {
	super(nombre, apellido, colorPelo, id);
	this.periodo = periodo;
}



public Integer getPeriodo() {
	return periodo;
}

public void setPeriodo(Integer periodo) {
	this.periodo = periodo;
}

public void detalle() {
	// TODO Auto-generated method stub
	super.detalle();
	
	System.out.println("Periodo: "+this.getPeriodo());
}


}
