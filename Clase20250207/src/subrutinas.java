import java.util.Random;

public class subrutinas {

	public static void mostrarArray(int[] v) { // La subrutina espera que le pasemos un array de enteros
		System.out.print("Array: ");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + "  ");
		}
		System.out.println();
	}
	
	public static int sumarElementos(int[] a) {
		int resultado = 0;
		for(int i=0; i<a.length; i++) {
			resultado += a[i];
		}
		
		return resultado;
	}
	
	public static int[] generarArray() {
		Random rnd = new Random();
		int[] a = new int[10];
		
		for(int i=0; i<a.length; i++) {
			a[i] = rnd.nextInt(10);
		}
		
		return a;
	}
	
	// TODO: Mejorar la funcion `generarArray` para que reciba 
	//       la cantidad de elementos que debe tener el array generado.
	
	// TODO: Generar una funcion que cargue desde teclado un array de numeros enteros
	//       de una cantidad determinada.
	
	public static void main(String[] args) {
		int[] a = generarArray();
		int[] b = generarArray();

		mostrarArray(a);  // Le pasamos por argumento el array a
		mostrarArray(b);  // Le pasamos por argumento el array b
		
		int suma = sumarElementos(a);
		System.out.println(suma);
	}

}
