package ejercicio1p2;
import java.util.Scanner;
public class Ejercicio1P2 {

	public static void main(String[] args) {
		//Registra las variables doubles kilos, manzanas y peras
		double kilos, manzanas, peras;
		//Inicia el Scanner
		Scanner sc= new Scanner (System.in);
		/*Pregunta al usuario los kilos de manzanas y peras
		NOTA: Se multiplicara los kilos por los respectivos €/kilo y se guardaran en las respectivas variables manzanas y peras*/
		System.out.println("¿Cuantos kilos de manzanas se han vendido?");
		kilos=sc.nextDouble();
		manzanas=kilos*2.35;
		System.out.println("¿Cuantos kilos de peras se han vendido?");
		kilos=sc.nextDouble();
		peras=kilos*1.95;
		//Muestra al usuario las ganancias
		System.out.println("Se ha ganado "+manzanas+"€ con las manzanas");
		System.out.println("Se ha ganado "+peras+"€ con las peras");
		//Cierra el Scanner
		sc.close();
	}

}
