package Practica_Adicional_4;

public class Ejercicio_Collections<T> {

	T[] Cliente;
	int i = 0;
	

	public Ejercicio_Collections(int size) {
		Cliente = (T[]) new Object[size];
	}
	
	public void Mostrar() {
		for(T m : Cliente) {
			System.out.println(m);
		}
	}
	
	//agrega en la ultima posicion
	public void add(T a) {
		Cliente[i] = a;
		i++;
	}
	
	//agregar en posicion especifica
	public void addS(int i, T c) {
		for(int as = 0; as < Cliente.length ; i++) {
			if(Cliente[as] == Cliente[i]) {
				Cliente[i] = c;
			}
		}
	}
	
	
	//obtiene el valor del indice indicado
	public T get(int i) {
		return Cliente[i];
	}
	
	
	//reemplaza el valor en el indice indicado
	public T set(int i, T s) {
		Cliente[i] = s;
		return Cliente[i];
	}
	
	public T remove(int i) {
		Cliente[i] = null;
		return Cliente[i];
	}
	

}
