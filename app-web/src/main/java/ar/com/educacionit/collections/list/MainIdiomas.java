package ar.com.educacionit.collections.list;

import ar.com.educacionit.collections.Enum.IdiomasEnum;

public class MainIdiomas {

	public static void main(String[] args) {
		String idiomaStr = "ES";
		
		IIdioma iidioma; 
		
		IdiomasEnum idiomaEnum = IdiomasEnum.valueOf(idiomaStr);
		
		iidioma = idiomaEnum.getIdioma();
		Persona juan = new Persona(idiomaEnum.getIdioma(), "Juan", "Lopez");
		
		iidioma = IdiomasEnum.ING.getIdioma();
		
		juan.aprender(iidioma);
		
		iidioma = IdiomasEnum.CHI.getIdioma();
		juan.aprender(iidioma);
		
		//juan.decir();
		juan.decirEn(IdiomasEnum.CHI.getIdioma());

	}

	
}
