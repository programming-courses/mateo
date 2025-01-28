import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		// Pedir 50 numero y mostrar la suma de ellos (para probar suponer que se piden 5)
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int suma = 0;		// Variable acumulador
		int i = 0;			// Variable contador
		
		while (i < 5) {
			// hacer algo repetitivo
			System.out.print("Ingrese numero: ");
			numero = teclado.nextInt();
			
			suma = suma + numero;
			
			// Incrementar el contador
			i = i + 1;
		}

		System.out.println("El resultado es " + suma);
		
	}

}
