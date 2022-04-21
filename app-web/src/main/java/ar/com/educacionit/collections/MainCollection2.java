package ar.com.educacionit.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class MainCollection2 {
	
	public static void main(String[] args) {
		//creo
		List<String> nombres = new ArrayList<String>();
		
		//Agregar
		
		nombres.add("Juan");
		nombres.add("Camilo");
		nombres.add("Edwin");
		nombres.add("Edwin");
		
		
		List<String> apellidos = new ArrayList<String>();
		
		apellidos.add("perez");
		apellidos.add("lopez");
		apellidos.add("juarez");
		//lista de lista
		
		List<List<String>> nombresList = new ArrayList<List<String>>();
				nombresList.add(nombres);
				nombresList.add(apellidos);
		//recorrer
				
		System.out.println(nombres);
		for(List<String> nl : nombresList) {
			
			for (String aux: nl) {
				
				System.out.println(aux);
			}
		}
		nombres = new LinkedList<String>();
 
	}

}
