package clase9;

abstract class Persona {

	//Atributos
	
		private  String nombre;
		protected String apellido;
		public String colorPelo;
		public final int cantidadOrejas=2;
		public static final int cantidadNariz=1;
		//Constructor
		public Persona(String nombre, String apellido, String colorPelo) {
			this.nombre = nombre;
			this.apellido = apellido;
	        this.colorPelo = colorPelo;

		}
		//metodos
		
		
		public final int getCantifadOjos() {
return 2;			
		}
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getColorPelo() {
			return colorPelo;
		}
		public void setColorPelo(String colorPelo) {
			this.colorPelo = colorPelo;
		}
		
		public void detalle() {
			System.out.println(this.toString());
			detallar();
			//mandar archivo!
		}
	//metodo es del Object, pero Persona le cambia el comportamiento
		public String toString() {
			return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", colorPelo=" + colorPelo + "]";
		}
		
		
		public abstract void detallar();//no esta implementado>el/los hijos implementa el comportamiento
		

} 	 	 
