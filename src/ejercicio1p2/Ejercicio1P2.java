package ejercicio1p2;
import java.util.Scanner;
public class Ejercicio1P2 {

	public static void main(String[] args) {
		//Registra las variables doubles total, manzanas y peras
		double total, manzanas, peras;
		final double EUROM, EUROP;
		//Dale valor a las variables finales, EUROM y EUROP, con sus respectivos pesos
		EUROM=2.35;
		EUROP=1.95;
		//Inicia el Scanner
		Scanner sc= new Scanner (System.in);
		/*Pregunta al usuario los kilos de manzanas y peras
		NOTA: Se multiplicara los kilos por los respectivos €/kilo y se guardaran en las respectivas variables manzanas y peras*/
		System.out.println("¿Cuantos kilos de manzanas se han vendido?");
		manzanas=sc.nextDouble();
		System.out.println("¿Cuantos kilos de peras se han vendido?");
		peras=sc.nextDouble();
		//Procede a hacer las operaciones respectivas y guardarlas en la variable total
		total=(manzanas*EUROM)+(peras*EUROP);
		//Muestra al usuario las ganancias totales
		System.out.println("Se ha ganado "+total+"€ entre las manzanas y las peras");
		//Cierra el Scanner
		sc.close();
	}

}
