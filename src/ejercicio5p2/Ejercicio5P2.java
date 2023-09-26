package ejercicio5p2;

import java.util.Scanner;

public class Ejercicio5P2 {

	public static void main(String[] args) {
		//Registra las variables enteras nota1, nota2, nota3 y media1
		int nota1, nota2, nota3, media1;
		//Registra la variable con decimal media2
		double media2;
		//Inicia el scanner
		Scanner sc = new Scanner(System.in);
		//Pregunta al usuario las notas de los tres trimestres
		System.out.println("Inserta la nota del primer trimestre");
		nota1=sc.nextInt();
		System.out.println("Inserta la nota del segundo trimestre");
		nota2=sc.nextInt();
		System.out.println("Inserta la nota del tercer trimestre");
		nota3=sc.nextInt();
		//Pasa a double la media de las tres notas, que se registrara en la variable media2
		media2=(double)(nota1+nota2+nota3)/3;
		//Pasa el resultado de media2 a entero, para que se ajuste a la variable media1
		media1=(int)media2;
		//Muestra las notas medias en sus dos formas
		System.out.println("Notas medias");
		System.out.println("Boletin de calificaciones: " + media1);
		System.out.println("Expediente academico: " + media2);
		//Cierra el Scanner
		sc.close();
	}

}
