package ar.com.educacionit.exceptions;

import ar.com.educacionit.domain.Categorias;
import ar.com.educacionit.domain.Entity;
import ar.com.educacionit.domain.Socios;

public class miprimerexceptionmain {

public static void main(String[] args) {

//jvm > errores unchecked: el programador no debe preocuparse
	
int a = 10;
int b = 1;
int c = a/b; //java.lang.ArithmeticException
System.out.println(c);

//ejemplo con objetos
Socios s = new Socios();
Long id = s.getid(); //java.lang.NullPointerException
System.out.println(id);

//herencia / interface 

Object socio = new Socios();
Entity cat = (Entity)socio;// java.lang.ClassCastException

System.out.println(cat.getid());

/**********************************************************/

//jvm > obliga al programador a controlar las "checked exception"
//no deja co
try {
	//ok
metodoConException(10);
} catch (Exception nombre) {
	//error
	nombre.printStackTrace();
}
}

public static void metodoConException(int valor)  throws Exception {
	if(valor %2 ==0) {
		//lanzo una nueva excepcion
		throw new Exception("el valor es erroneo");
	}
	metodoB();
}	

public static void metodoB() throws Exception{
}


}
