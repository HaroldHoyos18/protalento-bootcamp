package practicaadicionalsemana4;

public class avion extends voladores implements aterrizable{

	public int fuselaje;

	public avion(String nombre, String origen, String permisoVigente, int fuselaje) {
		super(nombre, origen, permisoVigente);
		this.fuselaje = fuselaje;
	}
	
	public int getFuselaje() {
		return fuselaje;
	}

	public void setFuselaje(int fuselaje) {
		this.fuselaje = fuselaje;
	}

	@Override
	public void detalle() {
		System.out.println("Fuselaje= "+this.getFuselaje());
		
	}
	public void permisoVuelo() {
System.out.println("El avion aterriza");		
	}
	
}
