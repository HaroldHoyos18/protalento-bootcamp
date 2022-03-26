package clase9; 

public class Empleado extends Persona {
	
	//Atributo propio de Empleado
private Integer id;
	
	public Empleado(String nombre, String apellido, String colorPelo, Integer id) {
		//Comando super para llamar atributos de padre
		super (nombre,apellido,colorPelo);
		//Puedo setear atriutos propios
		
		this.id=id;
	}

	//get set Empleadosyso
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
//Cambiar el comportamineto del padre (reutilizar lo del padre+lo propio)
/*public void detalle () {
//llamo el void detalle de la estancia padre
	super.detalle();
	//muestra lo propio
	System.out.println("Id: "+this.getId());	
}


public String toString() {
	return super.toString();
}
*/

@Override
public void detallar() {
	System.out.println("Id: "+this.getId());
	
}	
	
}


	