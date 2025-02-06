import java.util.Random;

public class array3 {

	public static void mostrar(int[] v) {
		
		
	}
	
	public static void main(String[] args) {
		// Dado los siguiente array "a" y "b", tomar cada valor de "a" que representa
		// un indice en el array "b" y sumar esos valores.
		
		/*
		 * a=[2,4,1], b=[10,40,20,45,-3,7]
		 * 
		 * resultado b[a[0]] + b[a[1]] + b[a[2]]
		 *           b[2]    + b[4]    + b[1]
		 *           20		 + -3      + 40
		 *           57    
		 */
		Random rnd = new Random();
		
		int[] a = new int[5];
		int[] b = new int[10];
		
		// Cargar los array con valores
		for(int i=0; i<a.length; i++) {
			a[i] = rnd.nextInt(10);			// Los valores de 'a' deben ser indices validos para 'b'
		}
		
		for(int i=0; i<b.length; i++) {
			b[i] = rnd.nextInt(50);	
		}
		
		// Mostrar los array
		System.out.print("Array a: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.print("\nArray b: ");
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] + "  ");
		}

		int resultado = 0; // Variable para acumular la suma
		
		// Recorro los elementos de a
		for(int i=0; i<a.length; i++) {	// i es el indice de a
			resultado = resultado + b[a[i]];    // a[i] es el indice de b
		}
		
		System.out.println("\nLa suma es: " + resultado);

	}

}
