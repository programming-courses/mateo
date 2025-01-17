import java.util.Scanner;

public class Logica {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		
		// Expresiones Logicas son aquellas que son o True o False
		boolean v;	// boolean es el tipo de datos para contener valores logicos
		
		v = true;
		v = false;
		
		/* Expresiones de comparacion:
		 * a igual b			a == b
		 * a distinto b			a != b
		 * a menor b			a < b
		 * a menor o igual b	a <= b
		 * a mayor b			a > b
		 * a mayor o igual b	a >= b
		*/
		System.out.println("Ingrese A: ");
		int a = teclado.nextInt();
		
		System.out.println("Ingrese B: ");
		int b = teclado.nextInt();
		
		System.out.println("Ingrese C: ");
		int c = teclado.nextInt();
		
		if (a == b) {
			System.out.println("Son iguales");
		} else { // (a != b)
			System.out.println("Son distintos");
		}
		
		if (a > b) {
			System.out.println("A es mayor B");
		}
		
		
		// mostrar una leyenda cuando A es mayor a B y ademas A es menor a C
		// AND (Conjuncion) -->  &&
		// OR  (Disjuncion) -->  ||
		// NOT (Negacion)	-->  !
		
		/*
		 * p		q		p && q
		 * true		true	true
		 * true		false	false
		 * false	true	false
		 * false	false	false
		 * 
		 * 
		 * * p		q		p || q
		 * true		true	true
		 * true		false	true
		 * false	true	true
		 * false	false	false
		 * 
		 * 
		 * p			!p
		 * true			false
		 * false		true
		 */
		
		if ((a > b) && (a < c)) {	// primero evalua a>b y solo si es verdadero evalua a<c
			System.out.println("Se cumple");
		}
		
	}

}
