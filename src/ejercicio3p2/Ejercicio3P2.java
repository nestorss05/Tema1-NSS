package ejercicio3p2;

import java.util.Scanner;

public class Ejercicio3P2 {

	public static void main(String[] args) {
		int num;
		boolean booleano;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero");
		num=sc.nextInt();
		sc.close();
		num=num%2;
		booleano = num==0 ? true : false;
		System.out.println(booleano);
	}

}
