/*
 * Pedir por teclado un numero (validar y no permitir que sea cero o negativo, crear una function para esto), 
 * el cual será la cantidad de numeros que se generaran al azar y se cargaran en un array.
 * Contar cuando numeros de ese array son pares.
 * 
 * Ejemplo de ejecucion:
 * Numero: 5
 * 
 * Se crea un array de 5 elementos: [20, 1, -3, 6, 10]
 * 
 * La cantidad de pares son: 3
 * 
 * Tipos de datos en Java:
 * 	boolean
 *  float
 *  double
 *  int
 *  long
 *  String
 */

import java.util.Random;
import java.util.Scanner;

public class Ejemplo1 {
	
	/*
	 * Lee desde teclado y devuelve un numero positivo
	 */
	public static int leerNumero() {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese un numero entero: ");
		int numero = teclado.nextInt();
		while (numero <= 0) {	// Se repite mientras lo del parentesis sea verdadero (true)
			System.out.print("Ingrese un numero entero: ");
			numero = teclado.nextInt();
		}
		
		return numero;  // La funcion devuelve el valor de numero
	}

	/*
	 * Esta funcion generar un array de entero de longitud numero
	 */
	public static int[] generarArray(int numero) {
		// Se crea la variable `nros` con un array de enteros de long `numero`
		int[] nros = new int[numero];
		Random rnd = new Random();
		
		// Usamos el for, por que sabemos cuantos elementos tenemos que recorrer
		for (int i=0; i<nros.length; i++) {
			// Para cada elemento nros[i]
			nros[i] = rnd.nextInt(50);		// Los posibles valores son desde el 0 hasta el 49
		}
		
		return nros;
	}

	public static void mostrarArray(int[] v) { // La subrutina espera que le pasemos un array de enteros
		System.out.print("Array: ");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + "  ");
		}
		System.out.println();
	}
	
	/*
	 * A partir de array recibido por parametro `v` cuenta los pares y devuelve la cantidad
	 */
	public static int contarPares(int[] v) {
		// Necesitamos una variable donde contar los pares que vamos encontrando
		int pares = 0;
		
		// Recorro cada uno de los elementos del vector
		for (int i=0; i<v.length; i++) {
			// Reviso cada v[i] si (if) es par o no
			if (v[i] % 2 == 0) { // Si el resto de dividir v[i] por 2 es 0, entonces es par
				pares++;
			}
		}
		
		return pares;
	}
	
	public static void main(String[] args) {
		int numero = leerNumero();
		int[] valores = generarArray(numero);
		
		mostrarArray(valores);
		
		int pares = contarPares(valores);
		
		System.out.println("La cantidad de pares son: " + pares);
	}
}
