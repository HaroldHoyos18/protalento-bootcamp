package ar.com.educacionit.collections.list;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapStringMain {
	
	public static void main (String[] args) {
		//collection <Integer> edades = new ArrayList<>();
		
		Map<Integer, String> dias = new HashMap<>();
		
		//agregar elementos put (integer,String)
		
		dias.put(1, "Lunes");
		dias.put(2, "Martes");
		dias.put(3, "Miercoles");
		dias.put(4, "Jueves");
		dias.put(5, "Viernes");
		dias.put(6, "Sabado");
		dias.put(7, "Domingo");
		
		//obtengo mapa
		
		String diaStr = dias.get(1);
		
		//System.out.println(dias);
		
		
		//obtener claves del mapa
		
		//keyset del mapa
		
		Set<Integer> keySet = dias.keySet();
		
		for(Integer key : keySet) {
			//ahora puedo tomar del mapa
			String value = dias.get(key);
		//	System.out.println(key+"-"+value);
			
			
		}
	//recorre solo los valores
		
		Collection<String> values = dias.values();
		
		for(String value : values) {
			
			//System.out.println(value+"-"+dias.containsValue(value));
			
		}
		
		//EntrySet
		
		Set<Map.Entry<Integer, String>> entrySet = dias.entrySet();
		
		for(Map.Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
	//		System.out.println(entry);
			
		} 
		
		
	}

}
