package clase9;

public class CineMain2 {

	public static void main(String[] args) {
		//Persona persona = new Persona ("persona1","apellido1","negro");
		Empleado empleado = new Empleado ("empleado1","apellidoemp1","rojo",1);
		Efectivo efectivo = new Efectivo ("Nombre efectivo1","apellido efectivo1", "negro", 1);
		Contratados contratado = new Contratados ("Nombre contratado1","apellido contratado1", "Azul",1,6);
		Director director = new Director ("nombre director", "apellido director", "negro",10);


		//todas las personas pueden ir al cine

		Persona[] personas=new Persona[4];

System.out.println(empleado.cantidadNariz);
System.out.println(efectivo.cantidadNariz);

//logica
//Persona.cantidadNariz=5;

System.out.println(contratado.cantidadNariz);
System.out.println(director.cantidadNariz);
	}

}
