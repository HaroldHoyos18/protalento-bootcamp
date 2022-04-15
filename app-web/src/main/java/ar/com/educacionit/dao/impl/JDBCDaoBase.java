package ar.com.educacionit.dao.impl;

import java.lang.reflect.ParameterizedType;

import ar.com.educacionit.dao.GenericDao;
import ar.com.educacionit.dao.Exceptions.DuplicatedException;
import ar.com.educacionit.dao.Exceptions.GenericException;
import ar.com.educacionit.domain.Entity;

public class JDBCDaoBase<T extends Entity> implements GenericDao<T> {

	protected String Tabla;
	protected Class<T> clazz;
	
    public	JDBCDaoBase(String tablaDelHijo) {
    	this.Tabla = tablaDelHijo;
    	//1:51:49
    	this.clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    			
	
}

	public T getOne(Long id) throws GenericException{
		
		if(id==null) {
			
			throw new GenericException ("id no informado");
		}
		
		
		
		String sql= "SELECT * FROM " + this.Tabla + " WHERE ID ="+ id;
		System.out.println("ejecutando sql: "+sql);
		T entity;
		try {
	//	entity = this.clazz.newInstance();
		entity = this.clazz.getDeclaredConstructor().newInstance();
		entity.setid(id);
		
		//tomar los metodos de this.clazz > methodo
		//para cada method > method.invoke(entity)
		
		
		//clase utilitaria que va a saber como tomar la instancia y como armar
		//los seteos de los atributos
		} catch (Exception e) {
			entity=null; 
		} 
		return entity;
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	public T save(T entity) throws DuplicatedException {
		
		return null;
	}

	public void update(T entity) {
		// TODO Auto-generated method stub
		
	}

	public T[] FindAll() {
		// TODO Auto-generated method stub
		return null;
	}

    
}
