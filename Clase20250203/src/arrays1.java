
public class arrays1 {

	public static void main(String[] args) {
		// Definir un array/arreglo/vector
		// <tipo de datos>[] <nombre del array> = new <tipo de datos>[<cuantos
		// elementos>];

		// numeros es un array de enteros
		int[] numeros = new int[6]; // se crea un nuevo array de enteros de 6 posiciones

		numeros[0] = 2;
		numeros[1] = 4;
		numeros[2] = -5;
		numeros[3] = 8;
		numeros[4] = 3;
		numeros[5] = 0;

		// System.out.println(numeros); NO sirve pq muestra la posicion de memoria donde
		// esta el array

		for (int i = 0; i < numeros.length; i++) {  // numeros.length --> nos da la longitud del array, cuantos elementos tiene
			System.out.println(numeros[i]);
		}
		
		float[] temperaturas = {5.3f, 30.1f, 17.0f, 36.8f};
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println(temperaturas[i]);
		}
		

	}

}
