import java.util.Random;

public class random2 {

	public static void main(String[] args) {
		Random rnd = new Random();

		int dado; // rnd.nextInt(6) devuelve un numero entre 0 y 5

		for (int i = 0; i < 10; i++) {
			dado = rnd.nextInt(6) + 1;
			System.out.println(dado);
		}

		// Generar un precio al azar
		float precio;
		for (int i = 0; i < 10; i++) {
			precio = rnd.nextFloat(1000); // rnd.nextFloat() Genera numero entre 0 y 1
			System.out.println(precio);
		}

		// Generar temperatura al azar, -10 y 40 grados ---> 50 = (40- (-10))
		System.out.println("Temperaturas: ");
		float temperatura;
		for (int i = 0; i < 10; i++) {
			temperatura = rnd.nextFloat(50) - 10; // --> valores entre -10 y 40
			System.out.println(temperatura);
		}
	}
}
