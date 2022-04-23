package Practicaadicionalsemana3;

import java.util.Arrays;
import java.util.Scanner;

public class Control_de_notas {

	private static final long[] AlumnosPromovidos = null;
	private static final int[] AlumnosNoPromovidos = null;

	public static void main(String[] args) {
	
		
		
        String MejorAlumno = null,PeorAlumno=null;
	
		int i,j,k,h,a,b,c,promedio,Promovido,NoPromovido;
		double Calificacion,Calificacion1,suma,Numero,NotaAlta2,NotaBaja2,CalificacionFinal,d,Aprovo;
		int Dato;
		System.out.println(" Ingrese el numero de alumnos ");
		
Scanner Teclado=new Scanner (System.in);
			
   i=Teclado.nextInt();
   k=i;
   a=0;
   b=0;
   d=7;
   Numero=0;
   Calificacion=0;
   Calificacion1=0;
   suma=0;
   NotaAlta2=0;
   NotaBaja2=10;
   Promovido=0;
   NoPromovido=0;
   
 //Nombre, apellido, numero de examen, nota que obtuvo el alumno
		Object NotasAlumnos [][]= new Object [i][4];
		
		//Llenamos la matriz
		
		for (i=0;i<=k-1;i++) {
			
			for (j=0;j<=3;j++) {
				
				if (j==3) {
					for(h=1;h<=Numero;h++) {
					do {
						
						System.out.println(" Ingrese la calificacion :");
						 Calificacion=Teclado.nextInt();
						if (Calificacion <=10) {
							suma= Calificacion+Calificacion1;
							Calificacion1=suma;
							
						
						
						
					}else {
						System.out.println(" La nota del alumno debe ser 0> Nota <10 ");
					}
					}while(Calificacion >10 );
					}
					
					Calificacion=suma/Numero;
					NotasAlumnos[i][j]=Calificacion;
					Calificacion=0;
					Calificacion1=0;
					suma=0;
					
				}else {
					if(j==0) {
						c=i+1;
					System.out.println(" Ingrese el Nombre del alumno "+c+" : ");
					String Nombre= Teclado.next();
				NotasAlumnos[i][j]=Nombre;}
					
					if(j==1) {
						System.out.println(" Ingrese el Apellido del alumno :");
						String Apellido= Teclado.next();
					NotasAlumnos[i][j]=Apellido;}
					
					if(j==2) {
						System.out.println(" Ingrese el Numero del examen :");
						 Numero=Teclado.nextInt();
					NotasAlumnos[i][j]=Numero;}
				
				}
			}
		}
		
	//Procesamiento de datos
		
for (i=0;i<=k-1;i++) {
	//Alumnos con califiacion mas alta

	double NotaAlta1 = (Double) NotasAlumnos[i][3];
	 
	if(NotaAlta1>NotaAlta2) {
		
		MejorAlumno=(String)NotasAlumnos[i][0];
		NotaAlta2=(Double)NotasAlumnos[i][3];
		
	}
		
	double NotaBaja1 =(Double)NotasAlumnos[i][3];
	 
	if(NotaBaja1<NotaBaja2) {
		
		PeorAlumno=(String)NotasAlumnos[i][0];
		NotaBaja2=(Double)NotasAlumnos[i][3];
		
	}
	

	}

for(j=0;j<k;j++) {
	
	CalificacionFinal=(Double)NotasAlumnos[j][3];
	
	
	if(CalificacionFinal>=d) {
		
		Promovido++;
	}else {
		
		NoPromovido++;
	}
}

String AlumnosPromovidos []= new String [Promovido];
String AlumnosNoPromovidos []= new String [NoPromovido];


for (i=0;i<k;i++) {
	Aprovo =(Double)NotasAlumnos[i][3];
if(Aprovo>=d){
 
AlumnosPromovidos[a]=(String)NotasAlumnos[i][0];
a++;
}else{

AlumnosNoPromovidos[b]=(String)NotasAlumnos[i][0];
b++;
}

}
//Imprimimos la lista de alumons aprovados y no aprovados
System.out.println("Alumnos promovidos: ");
Arrays.stream(AlumnosPromovidos).forEach(System.out::println);

System.out.println(" ---------------------- ");
System.out.println("Alumnos no promovidos: ");

Arrays.stream(AlumnosNoPromovidos).forEach(System.out::println);

System.out.println("-----------------------");
System.out.println("Mejor promedio: "+ MejorAlumno);
System.out.println("Peor promedio: "+ PeorAlumno);
	}
}
