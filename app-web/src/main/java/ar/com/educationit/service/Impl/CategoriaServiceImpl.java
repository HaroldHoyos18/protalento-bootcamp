package ar.com.educationit.service.Impl;

import ar.com.educacionit.dao.impl.CategoriaDaoImpl;
import ar.com.educacionit.domain.Categorias;
import ar.com.educationit.service.CategoriaService;

public class CategoriaServiceImpl extends AbstractBaseService<Categorias> implements CategoriaService {
	


	public CategoriaServiceImpl() {
super ( new CategoriaDaoImpl());
		
	}
}
