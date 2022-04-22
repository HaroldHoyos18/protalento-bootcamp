package practica_adicional_semana9_Dao;

import practica_adicional_semana9_Domain.Alumno;
import practica_adicional_semana9_Domain.Inscripciones;
import practica_adicional_semana9_Domain.Materia;

public interface InscripcionesDao<Inscripciones>  extends GenericDao<Inscripciones>{
	public Alumno obtenerAlumno(int id);
	public Materia obtenerMateria(int id);

}
