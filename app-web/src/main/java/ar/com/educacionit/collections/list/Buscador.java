package ar.com.educacionit.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Buscador {
	
	private String clave;
	private List<String> resultados;

	
	public Buscador(String clave) {
		this.clave = clave;
		this.resultados = new ArrayList<>();
	}


	public void buscar() {
		
		List<String> resul = new ArrayList<>();
		resul.add("Resultado 1" + this.clave);
		resul.add("Resultado 2" + this.clave);
		resul.add("Resultado 3" + this.clave);
		
		this.resultados = resul;
	}


	public List<String> getResultados() {
		return this.resultados;
		
	}



	
	
	

}
