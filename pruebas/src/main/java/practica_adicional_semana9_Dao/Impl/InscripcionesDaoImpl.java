package practica_adicional_semana9_Dao.Impl;

import org.w3c.dom.Entity;

import practica_adicional_semana9_Dao.InscripcionesDao;
import practica_adicional_semana9_Domain.Alumno;
import practica_adicional_semana9_Domain.Inscripciones;
import practica_adicional_semana9_Domain.Materia;

public class InscripcionesDaoImpl extends JDBC implements InscripcionesDao{


	public InscripcionesDaoImpl(Alumno[] alumnos, Materia[] materias) {
		super("Inscripcion",alumnos,materias);
	}
	
	public <T> void save(T entity) {	
		
		this.datosBD.recorrerInscripciones();
		
		System.out.println(" -------------------- ");
		
		for(int i = 0; i< this.datosBD.getTamano();i++) {
			if(this.datosBD.getInscripcion(i) == null) {
				this.datosBD.setInscripcion((Inscripciones)entity, i);
				break;
			}
		}
		
		this.datosBD.recorrerInscripciones();
	}
	
	
	
	public void delete(int id) {

		for(int i = 0; i< this.datosBD.getTamano();i++) {
			//System.out.println(this.datosBD.getInscripcion(i));
			try {
				if(this.datosBD.getInscripcion(i).getId() == id) {
					this.datosBD.setInscripcion(null, i);
					break;
				}
			}catch(Exception e) {
				System.out.println("El elemento a eliminar no existe");
			}
			
		}
		
		System.out.println("El dato ha sido eliminado");
		this.datosBD.recorrerInscripciones();
		
	}
	
	public Inscripciones getid(int id) {	
		Inscripciones obtenerUna = null;
		for(int i = 0; i< this.datosBD.getTamano();i++) {
			//System.out.println(this.datosBD.getInscripcion(i));
			if(this.datosBD.getInscripcion(i).getId() == id) {
				 obtenerUna = this.datosBD.getInscripcion(i);
				break;
			}
		}
		return obtenerUna;
	}
	
	public void getInscripciones() {
		this.datosBD.recorrerInscripciones();
	}

	
	public Alumno obtenerAlumno(int id) {
		Alumno alumnoexistente = null;
		for(Alumno user:this.alumnos) {
			if(user.getMatricula() == id) {
				alumnoexistente = user;
			}
		}
		return alumnoexistente;
	}
	
	
	public Materia obtenerMateria(int id) {
		Materia materiaExistente = null;
		for(Materia asig:this.materias) {
			if(asig.getId() == id) {
				materiaExistente = asig;
			}
		}
		return materiaExistente;
	}


	
	
}
