package ejercicio5p2;

import java.util.Scanner;

public class Ejercicio5P2 {

	public static void main(String[] args) {
		int nota1, nota2, nota3, media1;
		double media2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta la nota del primer trimestre");
		nota1=sc.nextInt();
		System.out.println("Inserta la nota del segundo trimestre");
		nota2=sc.nextInt();
		System.out.println("Inserta la nota del tercer trimestre");
		nota3=sc.nextInt();
		sc.close();
		media2=(double)(nota1+nota2+nota3)/3;
		media1=(int)media2;
		System.out.println("Notas medias");
		System.out.println("Boletin de calificaciones: " + media1);
		System.out.println("Expediente academico: " + media2);
	}

}
