package practicaadicionalsemana4;

public class ovni extends voladores {
	public String virusEspacial;

	public ovni(String nombre, String origen, String permisoVigente, String virusEspacial) {
		super(nombre, origen, permisoVigente);
		this.virusEspacial = virusEspacial;
	}

	public String getVirusEspacial() {
		return virusEspacial;
	}

	public void setVirusEspacial(String virusEspacial) {
		this.virusEspacial = virusEspacial;
	}

	@Override
	public void detalle() {
	System.out.println("Virus Espacial= "+this.getVirusEspacial());
		
	}

}
