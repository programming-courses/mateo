import java.util.Scanner;

public class arrays2 {

	public static void main(String[] args) {
		int[] dni = {10, 20, 30, 40, 50};
		String[] nombres = {"Diez", "Veinte", "Treinta", "Cuarenta", "Cincuenta"};
		
		// Pedir por teclado el dni y mostrar su nombre asociado. En caso
		// que el dni no esté mostrar un mensaje
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el dni a buscar: ");
		int dniBuscado = teclado.nextInt();
		int posicion = -1;
		for(int i=0; i<dni.length; i++) {
			if (dniBuscado == dni[i]) {
				// DNI Encontrado
				posicion = i;
			}
		}
		
		// Mostrar el nombre del dni
		if (posicion>=0) {
			String nombreBuscado = nombres[posicion];
			System.out.println("El nombre es: " + nombreBuscado);
		} else {
			System.out.println("DNI No encontrado");
		}
		

	}

}
