 package ar.com.educacionit.domain;

import ar.com.educacionit.dao.ICrud;
import ar.com.educacionit.dao.impl.SocioDaoImpl;
import ar.com.educacionit.dao.impl.SocioSQLCustom;

public class FindAllSociostest2 {


	public static void main(String[] args) {
		
		
          //creo la implementacion que me permite acceder a la db (CRUDL)
		
	SocioDaoImpl socioImpl = new SocioDaoImpl();
	//ArcticuloDaoImpl articuloImpl = new ArticuloDaoImpl();
	//CuponDaoImpl c = new CuponDaoImpl();
	
	ICrud[] cruds = new ICrud[] {socioImpl,/* articuloDaoImpl, CuponDaoImpl*/};
	
	
	for (ICrud uncrud: cruds) {
		
		if(uncrud instanceof SocioSQLCustom) {
			SocioSQLCustom sc = (SocioSQLCustom)uncrud;
			sc.selectCustom();
		}
	}
		}
	}
