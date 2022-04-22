package practica_adicional_semana9_Dao.Impl;

import practica_adicional_semana9_Dao.AlumnoDao;
import practica_adicional_semana9_Domain.Alumno;

public class AlumnoDaoImpl extends JDBC<Alumno> implements AlumnoDao { 
	AlumnoDaoImpl(){
		
		super("Alumno");
	}

}
