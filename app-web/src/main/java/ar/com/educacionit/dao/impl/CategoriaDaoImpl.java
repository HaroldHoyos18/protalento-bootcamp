package ar.com.educacionit.dao.impl;

import ar.com.educacionit.dao.CategoriaDao;
import ar.com.educacionit.domain.Categorias;
import ar.com.educacionit.domain.Socios;

public class CategoriaDaoImpl extends JDBCDaoBase<Categorias> implements CategoriaDao {

	public CategoriaDaoImpl() {
		
		super("categorias"); 
	}
	public String getSaveSQL(Categorias entity) {
		// TODO Auto-generated method stub
	return ("(descripcion, codigo) values ("+entity.getDescripcion()+","+entity.getCodigo()+")" );
	}
	
	@Override
	public String getUpdateSQL(Categorias entity) {
		String sql = "descripcion= "+entity.getCodigo()+"',";
		sql = sql+ "codigo= "+entity.getDescripcion()+"',";
		
	
		return sql;
	}
	/*	

	public Categorias getOne(Long id) {
		String sql= "SELECT * FROM CATEGORIAS WHERE ID ="+ id;
		return new Categorias(1l,"categoria 1", "abc000");
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	public Categorias save(Categorias entity) {
		String sql = "Insert into Categorias(descripcion,codigo) Values('"+entity.getDescripcion()+"','"+entity.getCodigo()+"')";
		System.out.println("Ejecutando sql: "+ sql);

		entity.setId(1L);
		
		return entity;
	
	}

	public void update(Categorias entity) {
		// TODO Auto-generated method stub

	}

	public Categorias[] FindAll() {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
