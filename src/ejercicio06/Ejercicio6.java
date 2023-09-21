package ejercicio06;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		//Registra las variables epicamente
		double num1, num2, num12;
		//Enciende el Scanner
		Scanner pregunta=new Scanner(System.in);
		//Procede a preguntar por ambos numeros
		System.out.println("Decime el primer numero che");
		num1=pregunta.nextDouble();
		System.out.println("Decime el segundo numero che");
		num2=pregunta.nextDouble();
		//Cierra el Scanner epicamente
		pregunta.close();
		//Ve cambiando la variable num12 a base de las operaciones de num1 y num2, y despues grita cada resultado a los cuatro vientos
		num12=num1+num2;
		System.out.println("El resultado de la suma es " + num12);
		num12=num1-num2;
		System.out.println("El resultado de la resta es " + num12);
		num12=num1*num2;
		System.out.println("El resultado de la multiplicacion es " + num12);
		num12=num1/num2;
		System.out.println("El resultado de la division es " + num12);
	}

}
