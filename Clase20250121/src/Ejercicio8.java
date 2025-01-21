import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese A (t/f): ");
		String textoA = teclado.next();
		
		System.out.println("Ingrese B (t/f): ");
		String textoB = teclado.next();
		
		System.out.println("Ingrese operacion (and, or)");
		String operacion = teclado.next();
		
		boolean logicoA;
		boolean logicoB;
		
//		if (a == "t") {		// si el valor de A es "t" entonces logicoA es true
//			logicoA = true;
//		} else {
//			logicoA = false;
//		}
//		
		// logicoA = (textoA == "t");  // NO se puede comparar asi los Strings

		logicoA = (textoA.equals("t"));  // Asi se compara textos en Java  
		logicoB = (textoB.equals("t"));

		if (operacion.equals("and")) {
			System.out.println(logicoA && logicoB);

		} else if (operacion.equals("or")){
			System.out.println(logicoA || logicoB);
			
		} else {
			System.out.println("Operacion no valida");
		}
		
		// si <condicion> entonces <que hago cuando es verdadero> sino <cuando no lo es>

	}

}
