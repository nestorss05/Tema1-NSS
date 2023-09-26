package ejercicio09;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		//Registra la variable del DINERO DINERO DINERO APRENDE ALGO DINERO
		int dinero;
		//Abre el Scanner y procede a preguntarle la cantidad de euros a pasar a pesetas
		Scanner sc=new Scanner(System.in);
		System.out.println("Decime los euros que queres pasar a pesetas");
		dinero=sc.nextInt();
		//Haz la operacion y muestra el dinero que vales
		System.out.println("Euros: " + dinero);
		dinero=dinero*166;
		System.out.println("Pesetas: " + dinero);
		//Cierra el scanner epicamente
		sc.close();
	}

}
