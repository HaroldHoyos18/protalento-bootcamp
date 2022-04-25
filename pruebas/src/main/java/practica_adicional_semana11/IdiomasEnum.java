package practica_adicional_semana11;

public enum IdiomasEnum {
	ES(new Espanol()),
	ING(new English()),
	CHI(new Chino()),
	ALE(new Aleman()),
	JAP(new Japones()),
	FRA(new Frances ());
		
		private Iidioma idioma;
		
		private IdiomasEnum(Iidioma idioma) {
			
			this.idioma = idioma;
			
		}
		public Iidioma getIdioma() {
			
			return this.idioma;
		}

}
