import java.util.Scanner;

public class for1 {

	public static void main(String[] args) {
		// Potencia x de y. 
		// 2^3 --> 2 * 2 * 2
		// 5^7 --> 5 * 5 * 5 * 5 * 5 * 5 * 5 7 veces
		// 2^4 --> 2*2*2*2

		// Calcula la potencia X^Y de un número X elevado a otro número Y utilizando un
		// bucle while.
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese X:");
		int x = teclado.nextInt();

		System.out.println("Ingrese Y:");
		int y = teclado.nextInt();

		int resultado = 1; // Como estamos acumulando con multiplicacion, usamos el 1 para inicializar

		// para la variable entera i que empieza en 0
		// mientras que i sea menor a y
		// e incrementado i de a uno
		for (int i=0; i<y; i++) {
			resultado = resultado * x;
		}
		
		System.out.println("El resultado es: " + resultado);

	}

}
