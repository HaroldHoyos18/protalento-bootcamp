package practica_adicional_semana9_Dao.Impl;

import java.lang.reflect.ParameterizedType;

import org.w3c.dom.Entity;

import practica_adicional_semana9_Dao.GenericDao;
import practica_adicional_semana9_Domain.Alumno;
import practica_adicional_semana9_Domain.DatosDBMemoria;
import practica_adicional_semana9_Domain.Materia;

public class JDBC <T extends Entity> implements GenericDao<T>{

	protected DatosDBMemoria datosBD = new DatosDBMemoria();
	protected Alumno[] alumnos;
	protected Materia[] materias;
	protected String tabla;
	protected Class<T> clazz;
	protected T entity;
	
	
	public JDBC(String tabla,Alumno[] alumno,Materia[] materia) {
		this.tabla = tabla;
		this.materias = materia;
		this.alumnos = alumno;
		this.clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public JDBC(String tabla) {
		this.tabla = tabla;
		this.clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public T getOne(int id) {		
		System.out.println("SELECT * FROM " + this.tabla + " WHERE ID = " + id);
		return entity;
	}
	
	public void getAll(T entity) {
		
		
	}
	
	public void getArrayMaterias() {
		for(Materia asignature: this.materias) {
			System.out.println(asignature.getId()+ ". "+asignature.getCurso());
		}
	}

	public T save(T entity) {
		System.out.println("INSERT INTO " + this.tabla + " values " + entity.getClass().getSimpleName());
		return null;
	}

	public T getone(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		System.out.println("DELETE * FROM " + this.tabla + " WHERE ID = " + id );
		
	}

	public void update(int id) {
		System.out.println("UPDATE " + this.tabla + " SET " + " columna = value " + "WHERE ID= "+ id);
		
	}

	public T[] FindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
		
}


		
	