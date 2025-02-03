import java.util.Random;

public class arrays2 {

	public static void main(String[] args) {
		// Generar un array de enteros de 10 posiciones y cargarlos aleatoriamente con numeros entre -10 y 10
		Random rnd = new Random();
		
		int[] datos = new int[10];
		
		for (int i=0; i<datos.length; i++) {
			// i es la posicion (indice) en el array
			
			// rnd.nextInt(10) --> entre 0 y 9
			// rnd.nextInt(20); --> entre 0 y 19
			// rnd.nextInt(20) - 10  -->  0-10 y 19-10 --> -10 y 9
			// rnd.nextInt(21) - 10  -->  0-10 y 20-10 --> -10 y 10
			
			datos[i] = rnd.nextInt(21) - 10;
		}
		
		for (int i = 0; i < datos.length; i++) {
			System.out.print(datos[i] + "   ");
		}
		System.out.println();
		
		// suma de los elementos
		int suma = 0;   // variable acumulador
		for (int i = 0; i < datos.length; i++) {
			suma = suma + datos[i];
		}
		System.out.println("La suma es: " + suma);
		
		// el mayor valor en el array (maximo)
		
		int maximo = datos[0];	// Asumo que el primer elemento es el maximo
		for (int i = 0; i < datos.length; i++) {
			
			System.out.println("Es " + maximo + " menor que " + datos[i]);
			if (maximo < datos[i]) { // Si lo que considero como maximo es menor que datos[i]
				System.out.println("Nuevo maximo " + datos[i]);
				maximo = datos[i];	// voy encontrando un nuevo maximo
			}
		}
		System.out.println("El maximo es: " + maximo);
		
		// Mostrar el o los 2 elementos centrales
		// [1,2,3,4,5,6] -- 3 y 4   (si la cantidad de elementos es par)
		// [1,2,3,4,5]   -- 3		(si la cantidad de elementos es impar)
		
		int[] numeros = {1,2,3,4,5,6,7,8};
		
		if (numeros.length % 2 == 0) {  // La cantidad de elementos es par
			int p = numeros.length / 2;
			int q = numeros.length / 2 - 1;
			
			System.out.println("El numero central son " + numeros[p] + " y " + numeros[q]);
			
		} else { // es impar
			int p = numeros.length / 2; 
			System.out.println("El numero central es " + numeros[p]);
		}
	}
}
