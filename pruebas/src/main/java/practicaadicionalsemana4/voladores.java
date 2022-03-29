package practicaadicionalsemana4;

abstract class voladores {

public	String Nombre ;
public String Origen;
public String PermisoVigente;
public voladores(String nombre, String origen, String permisoVigente) {
	Nombre = nombre;
	Origen = origen;
	PermisoVigente = permisoVigente;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getOrigen() {
	return Origen;
}
public void setOrigen(String origen) {
	Origen = origen;
}
public String getPermisoVigente() {
	return PermisoVigente;
}
public void setPermisoVigente(String permisoVigente) {
	PermisoVigente = permisoVigente;
}

public void detallar() {
	System.out.println(this.toString());
	detalle();
}
 
public String toString() {
	
	return "Volador :[" +Nombre+". Origen= "+Origen+". Permiso vigente= "+PermisoVigente+". ] ";
}
public abstract void detalle();

}
