 package ar.com.educacionit.domain;

import ar.com.educationit.service.CategoriaService;
import ar.com.educationit.service.SociosService;
import ar.com.educationit.service.Impl.CategoriaServiceImpl;
import ar.com.educationit.service.Impl.SociosServiceImpl;
import ar.com.educationit.service.exception.ServiceException;

public class SociosTest {


	public static void main(String[] args) throws ServiceException {

		//alguien cargo los datos desde teclado
		String nombre = "JUAN";
		String apellido ="PEREZ";
		String dni = "123456789";
		String email = "unmail@mail.com";
	    String direccion = "Calle 13";
		Long pais = 1l;//1=ARG
		
		
		SociosService service = new SociosServiceImpl();	
	Socios socio = new Socios (nombre, apellido, email, direccion, pais);
	service.save(socio);
	
	CategoriaService cservice = new CategoriaServiceImpl();
	Categorias categorias = new Categorias("televisores","abc1234");
	cservice.save(categorias);
	//1:16:22
	}
	}
