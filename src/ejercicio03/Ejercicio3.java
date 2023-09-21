package ejercicio03;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println("Oye che, decime el año actual");
		//Pregunta los años con Scanner
		Scanner pregunta1=new Scanner(System.in);
		int respuesta1=pregunta1.nextInt();
		System.out.println("Ahora decime el año en el que naciste");
		Scanner pregunta2=new Scanner(System.in);
		int respuesta2=pregunta2.nextInt();
		int edad=respuesta1-respuesta2;
		System.out.println("Su edad es de " + edad + " años");
		pregunta1.close();
		pregunta2.close();
	}

}
