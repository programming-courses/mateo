import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// 1.3.	Ingresar dos números, calcular el promedio y mostrar el resultado.
		
		// Creo un objeto para leer desde el teclado.
		Scanner teclado = new Scanner(System.in);
		
		// Definir 2 variables de numeros enteros
		int numeroA, numeroB;
		int promedio;
		
		System.out.println("Ingrese el numero A: ");
		numeroA = teclado.nextInt(); // Al teclado le pido un numero entero
		
		System.out.println("Ingrese el numero B: ");
		numeroB = teclado.nextInt();

		// promedio es la suma de valores dividido la cantidad de valores
		promedio = (numeroA + numeroB) / 2;
		System.out.println("El promedio es " + promedio);
	}
}
