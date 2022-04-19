package ar.com.educationit.service;

import java.util.List;

import ar.com.educationit.service.exception.ServiceException;

public interface GenericService <T>{
	
public T getOne(Long id) throws ServiceException;
	
	public void delete(Long id) throws ServiceException;

	public T save(T entity) throws ServiceException ;
	
	public void update(T entity);
	
	public List<T> FindAll();


}
