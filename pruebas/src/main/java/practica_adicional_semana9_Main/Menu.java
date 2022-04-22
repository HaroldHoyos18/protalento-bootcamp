package practica_adicional_semana9_Main;

import java.util.Scanner;

import practica_adicional_semana9_Domain.Alumno;
import practica_adicional_semana9_Domain.Inscripciones;
import practica_adicional_semana9_Domain.Materia;

public class Menu {
	

	private Inscripciones inscripcionAlumnoMateria;
	private int Opcion;
	public Menu(Alumno[] alumnos,Materia[] materias) {
		
		//El menu nos muestra por teclado las opcciones y aquí es donde vamos a empezar a ejecuar el CRUD

		
		
		boolean validar = false;
		System.out.println(" ");
		
		while(!validar) {
			System.out.println("Ingrese la opción");
			System.out.println("1. Registrar matería");
			System.out.println("2. Borrar matería");
			System.out.println("3. Buscar inscripción");
			System.out.println("4. Actualizar inscripción");
			System.out.println("5. Salir");
			try {
				Scanner teclado = new Scanner(System.in);
				this.Opcion = teclado.nextInt();
				try {

					switch(Opcion) {
					case 1:
						
					
						System.out.println("Escriba el nobre de la matería que desea inscribir ");
						int materia_id = teclado.nextInt();
						
						System.out.println("ingrese su id de estudiante");
						int alumno_id = teclado.nextInt();
						
						Alumno alumnoInscripcion = this.Inscripcion.obtenerAlumno(alumno_id);
						Materia materiaInscripcion = this.Inscripcion.obtenerMateria(materia_id);
						
						if(alumnoInscripcion != null && materiaInscripcion != null) {
							inscripcionAlumnoMateria = new Inscripciones(alumnoInscripcion,materiaInscripcion);
						
							
							this.Inscripcion.save(inscripcionAlumnoMateria);
							
						}else if(alumnoInscripcion == null) {
							
							System.out.println("El id del alumno es invalido");
							
						}else if(materiaInscripcion == null) {
							System.out.println("El id de la materia es invalido");
						}
						
						
						
						
						
					break;
					case 2:
						
						System.out.println("Ingrese el número de registro que desea eliminar ");
						int id = teclado.nextInt();
						
						this.Inscripcion.delete(id);
						
					break;
					case 3:
						System.out.println("Ingrese el número de registro que desea consultar ");
						int id1 = teclado.nextInt();
						System.out.println(this.Inscripcion.getOne(id1).toString());
						
						System.out.println("Buscando registros");
					break;
					case 4:
						System.out.println("Ingrese el número de registro que desea actualizar");
						int id_inscripcion = teclado.nextInt();
						this.Inscripcion.update(id_inscripcion);
						

					break;
					case 5:
						System.out.println("Salienda");
					
						
						
						validar = true;
					break;
					default:
						System.out.println("Opcion no valida");
					}
					
					
					
					
				}catch(Exception e) {
					e.getMessage();
					Opcion = 5;
					
					System.out.println("Se genero un error al cargar los datos");
				}
				
				
				//Validando que el usuario exista
							
				
				
			}catch(Exception e) {
				System.out.println(" ");
				System.out.println("Error: Ingrese un dato númerico" );
				System.out.println(" ");
			}
		}

	}
	
}
