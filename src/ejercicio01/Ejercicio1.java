package ejercicio01;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("Pasame el numero che");
		//Pregunta el numero con Scanner
		Scanner respuesta = new Scanner(System.in);
		int numero = respuesta.nextInt();
		//Ahora le decimos el numero y procedemos a cerrar epicamente
		System.out.println(numero);
		respuesta.close();
	}

}
