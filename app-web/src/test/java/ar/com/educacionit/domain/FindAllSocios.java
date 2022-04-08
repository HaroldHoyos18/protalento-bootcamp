 package ar.com.educacionit.domain;

import ar.com.educacionit.dao.impl.SocioDaoImpl;

public class FindAllSocios {


	public static void main(String[] args) {
		
		
		//Creo la implementacion que me permite acceder a la db (CRUD1)
		
	SocioDaoImpl socioImpl = new SocioDaoImpl();
	
	Socios[] vectorDeSociso = socioImpl.FindAll();
	
	for(Socios socios : vectorDeSociso) {
		
		System.out.println(socio);
		
	}
		}
	}
