import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
		// Potencia x de y.     2^3 -->  2 * 2 * 2
		//                      5^7 -->  5 * 5 * 5 * 5 * 5 * 5 * 5    7 veces 
		//						2^4 -->  2*2*2*2
		
		// Calcula la potencia X^Y de un número X elevado a otro número Y utilizando un bucle while.
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese X:");
		int x = teclado.nextInt();
		
		System.out.println("Ingrese Y:");
		int y = teclado.nextInt();

		int resultado = 1;	// Como estamos acumulando con multiplicacion, usamos el 1 para inicializar
		
		int i = 0;
		while (i < y) {
			resultado = resultado * x;
			
			i++;			//i = i + 1;
		}
		
		System.out.println("El resultado es: " + resultado);
		
	}

}
