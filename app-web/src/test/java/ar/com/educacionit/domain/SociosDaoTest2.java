 package ar.com.educacionit.domain;

import ar.com.educationit.service.CategoriaService;
import ar.com.educationit.service.SociosService;
import ar.com.educationit.service.Impl.CategoriaServiceImpl;
import ar.com.educationit.service.Impl.SociosServiceImpl;
import ar.com.educationit.service.exception.ServiceException;

public class SociosDaoTest2 {


	public static void main(String[] args) {

		SociosService service = new SociosServiceImpl();
		Socios socios=null;
		try {
			socios = service.getOne(1L);
		} catch (ServiceException se) {
			String msjDeService = se.getMessage();
//quiero la causa que origino
			Throwable cause = se.getCause();
			String msjCause = cause.getMessage();
		}
		System.out.println(socios);
		//2:05:40
		CategoriaService cservice = new CategoriaServiceImpl();
		Categorias categoria=null;
		try {
			categoria = cservice.getOne(1l);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(categoria);
	}
	}
