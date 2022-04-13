 package ar.com.educacionit.domain;

import ar.com.educationit.service.CategoriaService;
import ar.com.educationit.service.SociosService;
import ar.com.educationit.service.Impl.CategoriaServiceImpl;
import ar.com.educationit.service.Impl.SociosServiceImpl;

public class SociosDaoTest2 {


	public static void main(String[] args) {

		SociosService service = new SociosServiceImpl();
		Socios socios = service.getOne(1L);
		System.out.println(socios);
		//2:05:40
		CategoriaService cservice = new CategoriaServiceImpl();
		Categorias categoria =cservice.getOne(1l);
		System.out.println(categoria);
	}
	}
