import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * 1.7. Ingresar la medida de un ángulo y determinar si es agudo, obtuso, recto,
		 * nulo o llano. Si el valor ingresado es mayor a 180º mostrar la leyenda
		 * “ángulo no válido”.
		 */

		Scanner teclado = new Scanner(System.in);

		// Condicional: if-else

		System.out.println("Ingrese un numero entero: ");
		int numero = teclado.nextInt();
		
		// (numero > 0)  ---> Expresion logica, vale True o False
		if (numero > 0) {
			// La condicion es True
			System.out.println("El numero es mayor que cero!!");
		}
		
		if (numero % 2 == 0) {
			System.out.println("Es un numero PAR");
		} else {
			System.out.println("Es un numero IMPAR");
		}
		
		System.out.println("Fin");
		
		System.out.println("Ingrese angulo: ");
		int angulo = teclado.nextInt();
		if (angulo == 0) {
			System.out.println("Es un angulo nulo");
		} else if (angulo < 90) {
			System.out.println("Es un angulo agudo");
		} else if (angulo == 90) {
			System.out.println("Es un angulo recto");
		} else if (angulo < 180) {
			System.out.println("Es un angulo obtuso");
		} else if (angulo == 180) {
			System.out.println("Es un angulo llano");
		} else { // angulo > 180
			System.out.println("Angulo no valido");
		}
		
		System.out.println("Fin.");

	}

}
