import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {
		// Pedir numeros hasta que se ingrese un 0 y mostrar la suma de ellos
		Scanner teclado = new Scanner(System.in);
		int suma = 0;
		
		// Inicialice la condicion del while
		System.out.print("Ingrese numero: ");
		int numero = teclado.nextInt();		// Pidiendo el primer valor
		
		while (numero != 0) {
			// La parte repetitiva
			suma = suma + numero;
			
			// Actualiza variables de la condicion
			System.out.print("Ingrese numero: ");
			numero = teclado.nextInt();
		}
		
		System.out.println("El resultado es " + suma);
		
	}

}
