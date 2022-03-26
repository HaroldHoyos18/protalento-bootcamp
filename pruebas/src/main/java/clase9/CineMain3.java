package clase9;

public class CineMain3 {

	public static void main(String[] args) {

		Empleado empleado = new Empleado ("empleado1","apellidoemp1","rojo",1);
		/*no hace falta crear un director por que el metodo delegar no le pertenece a una
		isntancia en partircular si no a la clase director*/
Director.delegar(empleado, "archivar");{
	
}
	}

}
