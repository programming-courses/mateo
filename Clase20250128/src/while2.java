import java.util.Scanner;

public class while2 {
/*
 * Escribe un programa que invierta los dígitos de un número. (Tip usar el operador %)
 * 
 * 21     -> 12
 * 485933 -> 339584
 * 
 * 
 * 123 % 10 = 3					123/10 = 12 
 * 
 * Si un numero es par ( o sea es divisible por 2 )
 * 24 % 2 = 0 => es par
 * 25 % 2 = 1 => no es par 
 *  
 *  
 *  123
 *  
 *  auxiliar = 123
 *  
 * Paso 1:
 *  resto = 3
 *  auxiliar = 12
 *  resultado = 3
 * 
 * Paso 2:
 *   resto = 2
 *   auxiliar = 1
 *   resultado = 32
 *   
 * Paso 3:
 *   resto = 1
 *   auxiliar = 0
 *   resultado = 321
 *   
 * Fin
 *  
 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese numero a invertir:");
		int numero = teclado.nextInt();
		
		int resto = 0;			// Va a ir quedando el resto de la division entera
		int auxiliar = numero;	// Nos va a ir quedando el numero sin el ultimo digito 
		int resultado = 0;		// Se va a ir formando el numero invertido
		
		while (auxiliar != 0) {
			resto = auxiliar % 10; 			// El resto de la division entera
			auxiliar = auxiliar / 10;		// El resultado de la division entera
			resultado = resultado * 10 + resto;
		}
		
		System.out.println("El numero invertido es: " + resultado);
	}
}
