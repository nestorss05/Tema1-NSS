package ejercicio07;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		//Registra las variables epicamente
		int telefono;
		String nombre, direccion;
		//Enciende el Scanner y procede a preguntar por todo lo que se pueda sacar
		Scanner pregunta=new Scanner(System.in);
		System.out.println("Decime tu nombre che");
		nombre=pregunta.nextLine();
		System.out.println("Decime tu direccion para usurparte tu casa");
		direccion=pregunta.nextLine();
		System.out.println("Decime tu numero para petarte de llamadas de Vomistar");
		telefono=pregunta.nextInt();
		//Cierra el Scanner epicamente y procede a revelar su informacion en 4chan
		pregunta.close();
		System.out.println(nombre);
		System.out.println(direccion);
		System.out.println(telefono);
	}

}
