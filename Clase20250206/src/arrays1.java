import java.util.Random;
import java.util.Scanner;

public class arrays1 {

	public static void main(String[] args) {
		// Crea un array de 10 números y permite al usuario ingresar un número para buscarlo en el array e indicar si esta o no. 
		// Para cargar:
		//      * Valores fijos, si son pocos
		//		* Usar el teclado, si son pocos
		// 	    * Usar random
		
		Random rnd = new Random();	// Para inventar numeros
		Scanner teclado = new Scanner(System.in);
		
		int[] pirulo = new int[10];		// Se pone la cantidad que necesito.
		// este array va desde 0 hasta 9 posiciones
		
		// Llenar el array
		for (int i=0; i<pirulo.length; i++) {
			pirulo[i] = rnd.nextInt(20);	// ponemos 20 solo para tener numeros entre 0 y 19
			// pirulo[i] = teclado.nextInt();  // si quiero usar el teclado
		}
		
		for (int i=0; i<pirulo.length; i++) {
			System.out.print(pirulo[i] + "  ");
		}
		
		
		// Pedimos al usuario que ingrese un numero
		System.out.println("\nIngrese el numero a buscar: ");
		int numeroABuscar = teclado.nextInt();
		
		// Buscar el numero en el array
		boolean numeroEncontrado = false; // true o false
		for (int i=0; i<pirulo.length; i++) {		// Recorro elemento por elemento
			if (numeroABuscar == pirulo[i]) {		// Si el numero buscado es el elemento del array
				// Se encuentra el numero
				numeroEncontrado = true;	// Si es true es porque lo encontré
			}
		}
		
		if (numeroEncontrado) {	// porque numeroEncontrado es boolean
			System.out.println("Numero encontrado");
		} else {
			System.out.println("Numero NO encontrado");
		}

	}

}
