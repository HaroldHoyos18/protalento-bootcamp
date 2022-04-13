package ar.com.educationit.service.Impl;

import ar.com.educacionit.dao.impl.SocioDaoImpl;
import ar.com.educacionit.domain.Socios;
import ar.com.educationit.service.CategoriaService;
import ar.com.educationit.service.SociosService;

public class SociosServiceImpl extends AbstractBaseService<Socios> implements SociosService {
	
	//constructores
	
	
	
	public SociosServiceImpl() {
		//defino la implementacion usar de la inteface sociosDao
	super(new SocioDaoImpl());
	
	
	}
	//metodos
	

}
