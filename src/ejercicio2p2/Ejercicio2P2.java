package ejercicio2p2;

import java.util.Scanner;

public class Ejercicio2P2 {

	public static void main(String[] args) {
		//Registra la variable entera edad y la variable booleana mayoredad
		int edad;
		boolean mayoredad;
		//Inicia el Scanner
		Scanner sc = new Scanner (System.in);
		//Pregunta al usuario su edad
		System.out.println("¿Cuantos años tienes?");
		edad=sc.nextInt();
		//Dale valor a la variable mayoredad. Si la edad es mayor o igual que 18, sera true. De lo contrario, sera false
		mayoredad = edad>=18;
		//A base del valor de la variable mayoredad (true o false), el programa te dira si eres mayor de edad o no
		System.out.println(mayoredad ? "Eres mayor de edad" : "No eres mayor de edad");
		//Cierra el Scanner
		sc.close();
	}

}
