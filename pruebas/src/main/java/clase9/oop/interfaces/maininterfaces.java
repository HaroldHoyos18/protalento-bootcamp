package clase9.oop.interfaces;

public class maininterfaces {

	public static void main(String[] args) {

avion a=new avion();
helicoptero h=new helicoptero ();
Superman s= new Superman();

volador[] voladores=new volador[] {a,h,s};

for(volador v:voladores) {
	
	
	if (v instanceof Aterrizable) {
		
		Aterrizable atr=(Aterrizable)v;
		atr.aterrizar();	} else {
			System.out.println(v +" -No puede aterrizar, no cumple contrato");
}
}

}
}
