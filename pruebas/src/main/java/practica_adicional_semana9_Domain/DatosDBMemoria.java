package practica_adicional_semana9_Domain;

import java.util.Arrays;

public class DatosDBMemoria {
	

	private int tamano = 4;
	private Inscripciones[] inscripcion = new Inscripciones[tamano];

	public DatosDBMemoria() {
		
	}

	public Inscripciones getInscripcion(int posicion) {
		
		return inscripcion[posicion];
	}

	public void setInscripcion(Inscripciones insc,int posicion) {
		this.inscripcion[posicion] = insc;
	}

	public String toString() {
		return "DatosDBMemoria [inscripcion= " + Arrays.toString(inscripcion) + "]";
	}	
	
	
	public void recorrerInscripciones() {
		for(Inscripciones ins : this.inscripcion) {
			if(ins != null) {
				System.out.println(ins.toString());
			}else {
				System.out.println("Registro vacio");
			}
		}
	}
	
	public int getTamano() {
		return this.tamano;
	}
	
	
	
	

}
