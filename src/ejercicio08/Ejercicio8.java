package ejercicio08;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		//Registra las variables epicamente
		String nombre;
		int edad;
		//Procede a preguntar su nombre y su edad
		Scanner pregunta=new Scanner(System.in);
		System.out.println("Cual es seu nombre?");
		nombre=pregunta.nextLine();
		System.out.println("Cual es seu edade?");
		edad=pregunta.nextInt();
		//Cierra la pregunta epicamente y procede a poner la frase del ejercicio
		pregunta.close();
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
	}

}
