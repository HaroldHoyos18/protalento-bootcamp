package ar.com.educacionit.dao.impl;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.dao.GenericDao;
import ar.com.educacionit.dao.Exceptions.DuplicatedException;
import ar.com.educacionit.dao.Exceptions.GenericException;
import ar.com.educacionit.domain.Entity;
import ar.com.educacionit.domain.Socios;

public abstract class JDBCDaoBase<T extends Entity> implements GenericDao<T> {

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
		
		//cuado viene de la base de datos
		//paises_id > setPaisesid(objeto)
		
		//clase utilitaria que va a saber como tomar la instancia y como armar
		//los seteos de los atributos
		} catch (Exception e) {
			entity=null; 
		} 
		return entity;
	}

	public void delete(Long id) throws GenericException{
		String sql = "Delete From "+ this.Tabla +"Where id = "+id;
		System.out.println(sql);
		//execute
		//void ejecuta y no devuelve nada 
	}
/*
	public T save(T entity) throws DuplicatedException {
		
		StringBuffer namesSQL = new StringBuffer("Insert Into" ).append(this.Tabla).append("(");
		StringBuffer ValueSQLString = new StringBuffer(" values (");
		try {
			
			T instance = this.clazz.getConstructor().newInstance();
			//Le pido los fields
			Field[] fields = instance.getClass().getDeclaredFields();
			
			for(Field field : fields) {
				field.setAccessible(true);
				//socio(id,nombre,apellido, pais_id)
				//Socios(id,nombre,apellido, pais_id)
				String campoSql = field.getName();
				Object valueSql = field.get(entity);
				
				if (valueSql != null) {
				namesSQL.append(campoSql).append(",");
				ValueSQLString.append("'").append(valueSql).append("'").append(",");
				}
			}
			namesSQL = new StringBuffer(namesSQL.substring(0,namesSQL.length()-1));
			namesSQL.append(")");
			
			ValueSQLString = new StringBuffer(ValueSQLString.substring(0,ValueSQLString.length()-1));
			ValueSQLString.append(")");
			//insert dentro tabla (campo1,campo2,campoN) values (1,2,n)
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String sqlFinal = namesSQL.toString() + ValueSQLString.toString();
		System.out.println(sqlFinal);
		
		//execute hacia la db
		//un recordset
		return null;
	}
*/
	
	public T save(T entity) throws DuplicatedException {
		String sql ="insert into" + this.Tabla+this.getSaveSQL(entity);
		System.out.println(sql);
		entity.setid(12l);
	return entity;
	}
	
	public abstract String getSaveSQL(T entity);
		
	
	public void update(T entity) {
		String sql = "update"+this.Tabla+" SET"+getUpdateSQL(entity)+"where id ="+entity.getid();
		System.out.println(sql);
		// TODO Auto-generated method stub
		
	}
	
	public  abstract String getUpdateSQL(T socios);
	

	public List<T> FindAll() {
		String sql = "Select * from "+this.Tabla;
		System.out.println(sql);
	
		//La informacion viene de la db
	
		//supingo que hay dos registros
		List<T> instances = new ArrayList<T>();
		T instance;
		try {
			instance = this.clazz.getDeclaredConstructor().newInstance();
			instance.setid(1L);
			instances.add(instance);
			instances.add(instance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return instances;
		
	}

	public String getUpdateSQL(Socios socios) {
		// TODO Auto-generated method stub
		return null;
	}

    
}
