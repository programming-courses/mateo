import java.util.Scanner;

public class Ejemplo1 {
/*
 1)	Construir un programa que permita realizar operaciones aritméticas elementales con 2 valores, según la clave que se ingresa

                                          Clave                       operación

                                              1                                suma
                                              2                                resta
                                              3                                multiplicación
                                              4                                división
  
 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese valor 1: ");
		int valor1 = teclado.nextInt();
		
		System.out.println("Ingrese valor 2: ");
		int valor2 = teclado.nextInt();
		
		System.out.println("Ingrese clave (1,2,3,4): ");
		int clave = teclado.nextInt();
		
		// "if" es para determinar si se hace algo o no, a partir de una condicion logica 
		if (clave == 1) {  // suma
			System.out.println(valor1 + valor2);
		} else if (clave == 2) { // resta
			System.out.println(valor1 - valor2);
		} else if (clave == 3) {
			System.out.println(valor1 * valor2);
		} else if (clave == 4) {
			System.out.println(valor1 / valor2);
		} else {
			System.out.println("Operacion no valida");
		}
	}
}
