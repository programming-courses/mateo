import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/* 1.4.	Hacer un programa que convierta longitudes de millas a Km. y de pulgadas a cm., si:
				1 milla     = 1.60935 Km.
				1 pulgada = 2.534 cm.
		 */
		
		// Definicion de variables
		Scanner teclado = new Scanner(System.in);
		double millas;
		double km;
		double pulgadas;
		double cm;
		
		// Inicializacion o pedido de datos
		System.out.println("Ingrese las millas: ");
		millas = teclado.nextDouble();
			
		System.out.println("Ingrese las pulgadas: ");
		pulgadas = teclado.nextDouble();
		
		// Procesamiento
		km = millas * 1.60935;
		cm = pulgadas * 2.534;
		
		// Resultados
		System.out.println("Los KMs son: " + km);
		System.out.println("Los CMs son: " + cm);
	}
}
