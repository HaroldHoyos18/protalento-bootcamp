package ar.com.educacionit.domain;

import ar.com.educacionit.dao.impl.SocioDaoImpl;

public class SociosTest {


	public static void main(String[] args) {

		//alguien cargo los datos desde teclado
		String nombre = "JUAN";
		String apellido ="PEREZ";
		String dni = "123456789";
		String email = "unmail@mail.com";
	    String direccion = "Calle 13";
		Long pais = 1l;//1=ARG
		
		//uso ek constructir de ka ckase sicuis
		SocioDaoImpl socioImpl = new SocioDaoImpl();
		
		Socios socio = socioImpl.create(new Socios(nombre,apellido,email,direccion,pais));
		
		System.out.println("se ha creado el socios id: " + socio.getId());
		
		Socios otroSocio = socioImpl.FindById(5l);
		if(otroSocio != null) {
		System.out.println("se ha creado el socios id: "+socio.getId());
		}else {
			System.out.println("Se ha encontrado al socio" + socio);
		}
		}
	}
