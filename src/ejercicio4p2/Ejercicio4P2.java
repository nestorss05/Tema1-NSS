package ejercicio4p2;

import java.util.Scanner;

public class Ejercicio4P2 {

	public static void main(String[] args) {
		//Inicia las variables booleanas nolluvia, tarea y biblioteca
		boolean nolluvia, tarea, biblioteca;
		//Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		//Pregunta al usuario si llueve, si termino la tarea y si va a la biblioteca
		System.out.println("NOTA: Solo puedes responder con TRUE (si) o FALSE (no)");
		System.out.println("¿No esta lloviendo?");
		nolluvia=sc.nextBoolean();
		System.out.println("¿Terminaste la tarea?");
		tarea=sc.nextBoolean();
		System.out.println("¿Vas a la biblioteca?");
		biblioteca=sc.nextBoolean();
		//Mediante un ternario metido en un print, te dira el programa si puedes salir o no
		System.out.println(biblioteca || (nolluvia && tarea) ? "Puedes salir" : "Hoy no sales crack");
		//Cierra el Scanner
		sc.close();
	}

}
