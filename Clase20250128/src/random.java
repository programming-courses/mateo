import java.util.Random;

public class random {

	public static void main(String[] args) {

		Random rnd = new Random(); // Con la variable rnd se pueden generar numeros al azar
		
//		int numero = rnd.nextInt();  // Genera un entero al azar entre -mucho a +mucho
		
		int numero = rnd.nextInt(100000);  // Genera un entero al azar entre 0 y 100000-1
		System.out.println(numero);
		
		
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
