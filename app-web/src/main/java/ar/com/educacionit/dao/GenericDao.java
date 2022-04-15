package ar.com.educacionit.dao;

import ar.com.educacionit.dao.Exceptions.DuplicatedException;
import ar.com.educacionit.dao.Exceptions.GenericException;

public interface GenericDao<T> {

	public T getOne(Long id) throws GenericException;
	
	public void delete(Long id);

	public T save(T entity) throws DuplicatedException;
	
	public void update(T entity);
	
	public T[] FindAll();
}
