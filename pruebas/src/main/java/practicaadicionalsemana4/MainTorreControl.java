package practicaadicionalsemana4;

public class MainTorreControl {

	public static void main(String[] args) {
		avion a = new avion("Avion: Airbus","Alemania","si",30);
		helicoptero h = new helicoptero("Helicoptero: Bell","Cucuta","si",5);
		superman s = new superman ("Superman: clark","Usa","no","azul");
		ovni o = new ovni("Ovni: marvin","marte","no","si");

voladores[] volador = new voladores [] {a,h,s,o};

for (voladores v:volador) {
	v.detallar();
	
	if (v instanceof aterrizable) {
		
		aterrizable atr=(aterrizable)v;
		atr.permisoVuelo();
	} else {
		
		System.out.println(v.getNombre()+" no aterriza");
		
	}
}
	}

}
