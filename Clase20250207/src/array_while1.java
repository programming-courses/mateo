import java.util.Random;

public class array_while1 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[] a = new int[10];
		
		// Cargar los array con valores
		for(int i=0; i<a.length; i++) {
			a[i] = rnd.nextInt(10);			// Los valores de 'a' deben ser indices validos para 'b'
		}
		
		// Mostrar los array
		System.out.print("Array a: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		
		// Determinar si existe un numero en el array
		int numero = 6;
		
//		int i=0;
//		while (i<a.length) {
//			i++;
//		}
//		
//		for(int i=0; i<a.length; i++) {
//			
//		}
		
		System.out.println();
		
//		int i=0;
//		while (i<a.length) {
//			// Si el numero es igual al elemento del array...
//			if (numero == a[i]) {
//				System.out.println("Lo encontre");
//			} else {
//				System.out.println("No es");
//			}
//			
//			i++;
//		}
		
		
		int i=0;
		// Mientra i sea menor a la longitud del array
		// y numero sea igual al elemento
		while (i<a.length && numero != a[i]) {
			i++;
		}
		
		// Sale del while:
		//  1- Recorrio' todo el array: 	i<a.length		--> False
		//  2- Lo encontró 					 numero != a[i] --> False
		//											o sea numero == a[i]
		
		if (i<a.length) { 
			System.out.println("Encontrado");
		} else {
			System.out.println("No encontrado");
		}

	}

}
