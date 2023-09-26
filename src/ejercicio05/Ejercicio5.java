package ejercicio05;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		//Registra las variables epicamente
		double radio, longitud, area;
		//Abres el scanner y preguntale al pibe el radio de la circunferencia
		Scanner pregunta = new Scanner(System.in);
		System.out.println("Decime el radio che");
		radio = pregunta.nextDouble();
		//Ahora procedes a hacer las operaciones
		//Longitud de la circunferencia: 2*pi*r
		longitud=2*Math.PI*radio;
		//Area del circulo: pi*(r)2
		area=Math.PI*(radio*radio);
		//Y ahora grita los resultados a los cuatro vientos
		System.out.println("La longitud de la circunferencia es de " + longitud);
		System.out.println("El area del circulo es de " + area);
		//Cierra el scanner
		pregunta.close();
	}

}
