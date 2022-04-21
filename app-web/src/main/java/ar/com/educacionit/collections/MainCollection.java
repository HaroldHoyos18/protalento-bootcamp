package ar.com.educacionit.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class MainCollection {
	
	public static void main(String[] args) {
		//creo
		Collection<String> nombres = new ArrayList<String>();
		
		//Agregar
		
		nombres.add("Juan");
		nombres.add("Camilo");
		nombres.add("Edwin");
		
		//obtener 
		
	Iterator<String> itNombres = nombres.iterator();
	while(itNombres.hasNext()) {
		
	String dato = itNombres.next();
	System.out.println("Dato: "+dato);
	}
	//Eliminar DA ERROR 
	/*
	 * For (String nombre : nombres){
	 * Nombres.remove(nombre);
	 * }
	 * 
	 * 
	 * */
	
	//buscar sin eliminar	
	
for (String nombre : nombres) {
		
		if (nombre.equalsIgnoreCase("juan")) {
			
			nombre = new String ("Jose");
		}
		
	}
	System.out.println(nombres);

	//Eliminar dato
	
	itNombres = nombres.iterator();
	while(itNombres.hasNext()) {
		itNombres.next();
	/*	String nombre = itNombres.next();
		if(nombre.equalsIgnoreCase("juan")) {
		*/
	itNombres.remove();
		}
		
		
	}

}
