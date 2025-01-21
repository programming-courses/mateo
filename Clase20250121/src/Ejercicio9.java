import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// while: mientras se cumple <una condicion> <hacer algo>
		// Se usa para hacer cosas repetitivas.
		
		/*
		 * Mostrar los 10 primeros numeros enteros 
		 *     |
		 *     v
		 * Dado un numero i que empieza en 1, mientras que i sea menor o igual a 10, mostrarlo-incrementar
		 */
		int i = 1;		// Dado un numero i que empieza en 1

		while (i <= 10) {	// mientras que i sea menor o igual a 10
			System.out.println(i); // mostrarlo-incrementar
			i = i + 1;
		}
		
		System.out.println("Fin.");
		
		// IMPORTANTE!!!!! Estar seguro que las variables en la condicion del while
		//                 se actualicen en el cuerpo del while
		
		// Pedir al usuario que ingrese una `t` o una `f`, si no cumple pedirselo de nuevo
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese A (t/f): ");
		String letra = teclado.next();
		
		// Validacion de ingresos desde teclado
		// mientras NO sea lo que necesito (necesito que letra sea t o sea f)
		
		while (  !  (letra.equals("t") || letra.equals("f")) ) {	// !  --> no
			System.out.print("Re-ingrese A (t/f): ");
			letra = teclado.next();
		}
		
		System.out.println("Fin.");
	}
}
