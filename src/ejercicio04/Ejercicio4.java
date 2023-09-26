package ejercicio04;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner pregunta = new Scanner(System.in);
		// Enciende el Scanner y registras las variables epicamente
		int nota1, nota2;
		float nota12;
		// Pregunta las notas
		System.out.println("Decime la primera nota che");
		nota1 = pregunta.nextInt();
		System.out.println("Decime la segunda nota che");
		nota2 = pregunta.nextInt();
		// Ahora procedes a sumar las dos notas y a dividirlas entre dos
		nota12 = (float) (nota1+nota2)/2;
		// Y ahora lo gritas a los cuatro vientos
		System.out.println("La media aritmetica es: " + nota12);
		// Cierra el scanner
		pregunta.close();
	}

}
