import java.util.Scanner;

public class for1 {

	public static void main(String[] args) {
		// for: es para hacer cosas repetitivamente, X-veces
		// while: es para hacer cosas repetitivamente, No se de antemano cuantas veces
		
		// Pedir 50 numeros y mostrar la suma de ellos (para probar suponer que se piden 5)
		Scanner teclado = new Scanner(System.in);
		int suma = 0;
		int numero;
				
		for (int i=0; i<5; i++) {	// i=i+1   o   i++
			System.out.print("Ingrese numero " + i + ":");
			numero = teclado.nextInt();
			
			suma = suma + numero;
		}
		
		System.out.println("El resultado es " + suma);
	}

}
