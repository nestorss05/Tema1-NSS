package ejercicio03;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println("Oye che, decime el año actual");
		//Pregunta los años con Scanner
		Scanner sc=new Scanner(System.in);
		int respuesta1=sc.nextInt();
		System.out.println("Ahora decime el año en el que naciste");
		int respuesta2=sc.nextInt();
		int edad=respuesta1-respuesta2;
		System.out.println("Su edad es de " + edad + " años");
		sc.close();
	}

}
