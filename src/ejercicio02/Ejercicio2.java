package ejercicio02;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println("Oye che, cuantos años tenes?");
		//Pregunta la edad con Scanner
		Scanner respuesta = new Scanner(System.in);
		int edad = respuesta.nextInt();
		//Procedes a sumar uno a la edad...
		edad=edad+1;
		//... y entonces le diras la edad y cerraras el Scanner epicamente
		System.out.println("Vos tendras " + edad + " años.");
		respuesta.close();
	}

}
