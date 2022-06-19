package Practica_Adicional_5;


public class GenericException extends Exception{
	
	public GenericException(String msj, Throwable sqe) {
		super(msj,sqe);
	}
}