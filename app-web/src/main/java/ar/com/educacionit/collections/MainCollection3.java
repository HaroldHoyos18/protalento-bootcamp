package ar.com.educacionit.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class MainCollection3 {
	
	public static void main(String[] args) {
		//creo
		LinkedList<String> nombres = new LinkedList<String>();
		
		//Agregar
		
		nombres.add("Juan");
		nombres.add("Camilo");
		nombres.add("Edwin");
		nombres.add("Edwin");

		ListIterator<String> li = nombres.listIterator();
	
		while (li.hasNext()) {
			String current = li.next();
			System.out.println(current);		
			
		}
		
		while (li.hasPrevious()) {
			String current = li.previous();
			System.out.println(current);		
			
		}
		
	}

}
