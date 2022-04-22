package practica_adicional_semana9_Main;

import practica_adicional_semana9_Domain.Alumno;
import practica_adicional_semana9_Domain.Materia;

public class Aplicacion {

	public static void main(String[] args) {

		Alumno alumno1 = new Alumno(12345,"jose","ramirez");
		Alumno alumno2 = new Alumno(12354,"Laura","mahecha");
		Alumno alumno3 = new Alumno(12334,"Richard","Bermudez");
		Alumno alumno4 = new Alumno(12532,"Laura","martinez");
		

		Materia materia1 = new Materia(18,"quinto",12);

		Materia materia2 = new Materia(242373,"segundo",13);

		Materia materia3 = new Materia(345373,"tercero",15);
		
		Alumno [] listaAlumnos = new Alumno[]{alumno1,alumno2,alumno3};
		Materia[] listaMaterias = new Materia[] {materia1,materia2,materia3};
		
		
		
		System.out.println("Bienvenido al moodle de registro de asignaturas");
		System.out.println(" ");
		Menu menu = new Menu(listaAlumnos,listaMaterias);

	}

}
