package practica_adicional_semana9_Dao;

public interface GenericDao<T> {
	
	public T save (T entity);
	public T getone (T entity);
	public void delete(int id);
	public void update(int id);
	public T[] FindAll();

}
