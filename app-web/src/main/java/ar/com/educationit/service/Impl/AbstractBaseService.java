package ar.com.educationit.service.Impl;

import ar.com.educacionit.dao.GenericDao;
import ar.com.educacionit.dao.Exceptions.DuplicatedException;
import ar.com.educacionit.dao.Exceptions.GenericException;
import ar.com.educationit.service.GenericService;
import ar.com.educationit.service.exception.ServiceException;

public class AbstractBaseService<T> implements GenericService<T> {

	protected GenericDao<T> genericDao;
	
	public AbstractBaseService(GenericDao<T> daoDelHijo) {
	this.genericDao = daoDelHijo;
		
		
	}

	public T getOne(Long id) throws ServiceException {
		T entity =null;
		try {
			entity = genericDao.getOne(id);
		} catch (GenericException e) {
			e.printStackTrace();
			if(id != null) {
				
				throw new ServiceException("error de db al intentar obtener entity id= "+id, e);
			} 
			
			
			}
		finally {
			
			
			//siempre se ejecuta
			
			entity = null;
		}

		return entity;
	}

	public void delete(Long id) {
		try {
			genericDao.getOne(id);
		} catch (GenericException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public T save(T entity) throws ServiceException {
		try {
			return genericDao.save(entity);
		} catch (DuplicatedException de) {
			// relazo la exception como una service que contiene
			//laexception original
			throw new ServiceException("Codigo error", de);
		}
	}

	public void update(T entity) {
		genericDao.update(entity);
		
	}

	public T[] FindAll() {
		return genericDao.FindAll();
	}
}
