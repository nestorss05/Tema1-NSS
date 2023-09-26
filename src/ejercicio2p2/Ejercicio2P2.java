package ejercicio2p2;

import java.util.Scanner;

public class Ejercicio2P2 {

	public static void main(String[] args) {
		int edad;
		boolean mayoredad;
		Scanner sc = new Scanner (System.in);
		System.out.println("¿Cuantos años tienes?");
		edad=sc.nextInt();
		sc.close();
		mayoredad = edad>=18 ? true : false;
		System.out.println(mayoredad);
	}

}
