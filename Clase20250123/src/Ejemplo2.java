import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		// while --> lo usamos para hacer algo en forma repetitiva
		
		// Pedir un numero entero y mostrar su tabla de multiplicar
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		int numero = teclado.nextInt();

		int i = 1;
		
		while (i <= 10) {
			System.out.println(numero * i);
			i = i + 1;  // Este incremento nos va a llevar que en algun
						// momento la condicion del while sea false
		}		
	}

}
