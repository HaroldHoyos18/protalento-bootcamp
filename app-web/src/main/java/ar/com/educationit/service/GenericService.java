package ar.com.educationit.service;

import ar.com.educationit.service.exception.ServiceException;

public interface GenericService <T>{
	
public T getOne(Long id) throws ServiceException;
	
	public void delete(Long id);

	public T save(T entity) throws ServiceException ;
	
	public void update(T entity);
	
	public T[] FindAll();


}
