package practica_adicional_semana9_Dao.Impl;

import org.w3c.dom.Entity;

import practica_adicional_semana9_Dao.MateriaDao;
import practica_adicional_semana9_Domain.Materia;

public class MateriaDaoImpl extends JDBC<Materia> implements MateriaDao{

	public MateriaDaoImpl() {
		super("Materia");	
		// TODO Auto-generated constructor stub
	}

	
}
