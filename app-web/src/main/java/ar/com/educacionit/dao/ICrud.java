package ar.com.educacionit.dao;

import ar.com.educacionit.domain.Socios;

public interface ICrud {
	
	public Socios create(Socios socioAcrear);

	public Socios FindById(Long id);
	
	public Socios[] FindAll();
	//despues completo lo demas


}
