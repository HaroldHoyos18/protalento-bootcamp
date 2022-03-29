package practicaadicionalsemana4;

public class superman extends voladores {
public String Color;

public superman(String nombre, String origen, String permisoVigente, String color) {
	super(nombre, origen, permisoVigente);
	Color = color;
}

public String getColor() {
	return Color;
}

public void setColor(String color) {
	Color = color;
}

@Override
	public void detalle() {
	System.out.println("Color= "+this.getColor());
		
	}
}
