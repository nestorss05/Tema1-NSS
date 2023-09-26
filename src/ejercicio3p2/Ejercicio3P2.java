package ejercicio3p2;

import java.util.Scanner;

public class Ejercicio3P2 {

	public static void main(String[] args) {
		//Registra el las variables num (entera) y booleano (boolean)
		int num;
		boolean booleano;
		//Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		//Pregunta al usuario por un numero
		System.out.println("Escribe un numero");
		num=sc.nextInt();
		//Dale valor a la variable booleano comprobando si el resto del numero entre 2 es 0
		booleano = num%2==0;
		//El programa te dira si tu numero es par o no, dependiendo si el resto da 0 (true) o da 1 (false)
		System.out.println(booleano ? "Su numero es par" : "Su numero es impar");
		//Cierra el Scanner
		sc.close();
	}

}
