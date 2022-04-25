package practica_adicional_semana11;


public class Main {


	public static void main(String[] args) {
		
//organice la aplicacion para 3 personas, donde cada persona agrega su
//idioma nativo, luego los idiomas que a aprendido, una verificacion si
//habla ese idioma y por ultimo se muestra una lista con las personas que
//hablan cada idioma.
		
		//creo un objeto persona para guardar en este la lista
		
		//Persona1
		
		//idioma nativo
		String idiomaStr = "ES";
		
		Iidioma iidioma; 
		
		IdiomasEnum idiomaEnum = IdiomasEnum.valueOf(idiomaStr);
		
		iidioma = idiomaEnum.getIdioma();
		Persona persona1 = new Persona(idiomaEnum.getIdioma(), "Juan", "Lopez");
		Persona persona = new Persona(idiomaEnum.getIdioma(), "", "");
		String nombre = persona1.getNombre();
		iidioma=persona1.getIdiomaNativo();
		persona.ListaIdiomas(iidioma, nombre);
		
		//aprende idiomas
		iidioma = IdiomasEnum.ING.getIdioma();
		
		persona1.aprender(iidioma, nombre);
		persona.ListaIdiomas(iidioma, nombre);
		
		iidioma = IdiomasEnum.CHI.getIdioma();
		persona1.aprender(iidioma,nombre);
		persona.ListaIdiomas(iidioma, nombre);
		
		//habla este idioma?
		persona1.decirEn(IdiomasEnum.CHI.getIdioma());
		persona1.decirEn(IdiomasEnum.ING.getIdioma());
		
		
		
		//Persona2
		
				//idioma nativo
				 idiomaStr = "ING";
				
				
				 idiomaEnum = IdiomasEnum.valueOf(idiomaStr);
				
				iidioma = idiomaEnum.getIdioma();
				Persona persona2 = new Persona(idiomaEnum.getIdioma(), "George", "Clooney");
				nombre = persona2.getNombre();
				iidioma=persona2.getIdiomaNativo();
				persona.ListaIdiomas(iidioma, nombre);
				
				//aprende idiomas
				iidioma = IdiomasEnum.ES.getIdioma();
				persona2.aprender(iidioma, nombre);
				persona.ListaIdiomas(iidioma, nombre);
				
				iidioma = IdiomasEnum.JAP.getIdioma();
				persona2.aprender(iidioma,nombre);
				persona.ListaIdiomas(iidioma, nombre);
				
				//habla este idioma?
				persona2.decirEn(IdiomasEnum.ING.getIdioma());
				persona2.decirEn(IdiomasEnum.ES.getIdioma());
		
		


				//Persona3
				
				//idioma nativo
				 idiomaStr = "FRA";
				
				
				 idiomaEnum = IdiomasEnum.valueOf(idiomaStr);
				
				iidioma = idiomaEnum.getIdioma();
	  		    Persona persona3 = new Persona(idiomaEnum.getIdioma(), "Kylian", "Mbapp");
				nombre = persona3.getNombre();
				iidioma=persona3.getIdiomaNativo();
				persona.ListaIdiomas(iidioma, nombre);
				
				//aprende idiomas
				iidioma = IdiomasEnum.ES.getIdioma();
				persona3.aprender(iidioma, nombre);
				persona.ListaIdiomas(iidioma, nombre);
				
				iidioma = IdiomasEnum.CHI.getIdioma();
				persona3.aprender(iidioma,nombre);
				persona.ListaIdiomas(iidioma, nombre);
				
				//habla este idioma?
				persona3.decirEn(IdiomasEnum.CHI.getIdioma());
				persona3.decirEn(IdiomasEnum.FRA.getIdioma());
				
				
				//mostramos la lista 
				persona.mostrasLista();
	}

}
