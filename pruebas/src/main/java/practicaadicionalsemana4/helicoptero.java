package practicaadicionalsemana4;

public class helicoptero extends voladores implements aterrizable{
 public int pasajeros;

public helicoptero(String nombre, String origen, String permisoVigente, int pasajeros) {
	super(nombre, origen, permisoVigente);
	this.pasajeros = pasajeros;
}

public int getPasajeros() {
	return pasajeros;
}

public void setPasajeros(int pasajeros) {
	this.pasajeros = pasajeros;
}

@Override
	public void detalle() {
System.out.println("pasajeros= "+this.getPasajeros());		
	}
public void permisoVuelo() {
System.out.println("el helicoptero aterriza");		
	}
}
