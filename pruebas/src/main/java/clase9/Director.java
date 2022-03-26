package clase9;
//el elemento "final" es para que haya mas herencia de esta clase
public final class Director extends Persona{
	private Integer empACargo;

	public Director(String nombre, String apellido, String colorPelo, Integer empACargo) {
		super(nombre, apellido, colorPelo);
		this.empACargo = empACargo;
	}

	public Integer getEmpACargo() {
		return empACargo;
	}

	public void setEmpACargo(Integer empACargo) {
		this.empACargo = empACargo;
	}
	
	/*
	public void detalle() {
		// TODO Auto-generated method stub
		super.detalle();
		
		System.out.println("Empleados a cargo: "+this.getEmpACargo());
	}
	*/
	//implementar el metodo abstracto del padre
	
	public void detallar() {
		System.out.println("Empleados a cargo: "+this.getEmpACargo());
		
	}

	
	//metodo static
	
	public static void delegar(Empleado empleado, String tarea){
		empleado.detalle();
		System.out.println("ejecutando tarea delegada"+ tarea);
	}
}
