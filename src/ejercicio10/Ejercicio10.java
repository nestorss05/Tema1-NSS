package ejercicio10;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		//Registra las variables epicamente
		final double IVA = 0.21;
		double precio;
		//Enciende el Scanner y procede a preguntar por tu economia venezolana
		Scanner sc=new Scanner(System.in);
		System.out.println("Decime un precio sin IVA che");
		precio=sc.nextDouble();
		//Procede a añadirle el IVA por la cara y despues cierras el Scanner
		precio=precio+(precio*IVA);
		System.out.println("El precio con IVA es de " + precio + "€");
		sc.close();
	}

}
