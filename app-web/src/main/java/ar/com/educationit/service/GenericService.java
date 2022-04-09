package ar.com.educationit.service;


public interface GenericService <T>{
	
public T getOne(Long id);
	
	public void delete(Long id);

	public T save(T entity);
	
	public void update(T entity);
	
	public T[] FindAll();


}