package ar.com.educacionit.collections.list;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapStringMain2 {
	
	public static void main (String[] args) {
	 Map<String,Integer> mapa = new HashMap<>();
	 
	 Scanner teclado = new Scanner(System.in);
	 
	 System.out.println(mapa);
	 
	 String nombre = "FIN";
	 
	 do {
		 System.out.println("Ingrese nombre");
		 nombre = teclado.next();
		 
		 if(mapa.containsKey(nombre)) {
			 
			 Integer value = mapa.get(nombre);
			 value++;
			 mapa.put(nombre, value);
			 
		 }else {
			 mapa.put(nombre, 1);
		 }
		 
	 } while(nombre.equalsIgnoreCase("FIN")) ;
	
	System.out.println(mapa);
	
	
	System.out.println("nombre a eliminar");
	nombre = teclado.next();
	
	
	if(mapa.containsKey(nombre)) {
		mapa.remove(nombre);
		}
	else {
		System.out.println("no existe "+ nombre);
	}
	System.out.println(mapa);	
	
	}
	

}
