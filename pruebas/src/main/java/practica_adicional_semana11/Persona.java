package practica_adicional_semana11;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Persona {

	
	private Iidioma IdiomaNativo;
	private Set<Iidioma> otros;
	private Map<Class,Iidioma> idiomas;
	private Map<Iidioma,String> lista;
	private String nombre;
	private String apellido;
	
	public Persona(Iidioma idiomaNativo, String nombre, String apellido) {
		this.IdiomaNativo = idiomaNativo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.otros = new HashSet<>();
		this.idiomas = new HashMap<>();
		this.lista = new HashMap<>();
		idiomas.put(IdiomaNativo.getClass(),idiomaNativo);
		lista.put(idiomaNativo, nombre);
	}
public Iidioma getIdiomaNativo() {
		return IdiomaNativo;
	}
	public void setIdiomaNativo(Iidioma idiomaNativo) {
		IdiomaNativo = idiomaNativo;
	}
	//puede aprender un nuevo idioma
	public void aprender (Iidioma nuevoIdioma,String nombre) {
		//nulo
		if (nuevoIdioma == null) {
			throw new RuntimeException("idioma invalido o nulo");	
		}
		if (otros.contains(nuevoIdioma)){
			
			throw new RuntimeException("Idioma ya aprendido");		
		}
		this.aprenderIdioma(nuevoIdioma,nombre);
		
		
		
	}
	
	public void decir() {
		Collection<Iidioma> idiomas = this.obtenerIdiomas();
		for(Iidioma idioma : idiomas) {
			idioma.decir();
	
			
		}	
		
		
	}
	
	public void decirEn(Iidioma idioma) {
		
		//como valido
		//mapa?
		if(this.idiomas.containsKey(idioma.getClass())) {
			Iidioma idiomaAux = this.idiomas.get(idioma.getClass());
			idiomaAux.decir();
			
		}else {
			
			throw new RuntimeException(this.nombre+ " No habla "+ idioma.getClass().getSimpleName());
		}
			
		}

	
	private Collection<Iidioma> obtenerIdiomas() {
		return this.idiomas.values();
		
		
		
	}

	private void aprenderIdioma(Iidioma nuevoIdioma,String nombre) {
		//logica adicional
		this.otros.add(nuevoIdioma);
		this.idiomas.put(nuevoIdioma.getClass(), nuevoIdioma);
		
		
	}
	
	public void ListaIdiomas(Iidioma nuevoIdioma, String nombre){
		String nombreStr = lista.get(nuevoIdioma);
	    nombre= nombre +" , "+nombreStr;
		this.lista.put(nuevoIdioma, nombre);
	}
	
	
	public void mostrasLista() {
		
	Set<Map.Entry<Iidioma, String>> entrySet = lista.entrySet();
		
		for(Entry<Iidioma, String> entry : entrySet) {
			System.out.println(entry);
		
	}
	}		
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}
