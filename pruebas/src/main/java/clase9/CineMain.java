package clase9;

public class CineMain {
	public static void main(String[] args) {
		//Cuando la clase es abstract y no public no se puede instanciar en otra parte.
//Persona persona = new Persona ("persona1","apellido1","negro");
Empleado empleado = new Empleado ("empleado1","apellidoemp1","rojo",1);
Efectivo efectivo = new Efectivo ("Nombre efectivo1","apellido efectivo1", "negro", 1);
Contratados contratado = new Contratados ("Nombre contratado1","apellido contratado1", "Azul",1,6);
Director director = new Director ("nombre director", "apellido director", "negro",10);


//todas las personas pueden ir al cine

Persona[] personas=new Persona[4];
//personas[0]=persona;
personas[0]=empleado;
personas[1]=efectivo;
personas[2]=contratado;
personas[3]=director;


//recorrer las personas que entran al cine y quiero saber si son un director

for(Persona aux:personas) {
	
	//con aux tengo acceso a todos los meotodos publicos de persona
aux.detalle();
	if(aux instanceof Director) {
		
		Director d=(Director)aux;
		
		System.out.println("Director: "+d.getEmpACargo()+" va a una silla especial!!");
		
	}
	
}
	}

}