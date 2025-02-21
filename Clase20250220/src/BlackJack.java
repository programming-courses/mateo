import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BlackJack {
	/**
	 * Devuelve un array con los nombres de cada carta
	 */
	public static String[] generarCartasNombre() {
		// Los nombres de las cartas, para agarrar los archivos de imagenes

		// 13 cartas en cada uno de los 4 palos: ♥️ (corazones), ♦️ (diamantes), ♣️
		// (tréboles) y ♠️ (picas).
		String[] mazo = new String[13 * 4];
		String[] palos = { "corazon", "diamante", "trebol", "pica" };

		// Se generan los primeros 10 numeros de las cartas, desde 1 a 10
		for (int j = 0; j < palos.length; j++) {
			for (int i = 1; i <= 10; i++) {
				mazo[i + j * 13 - 1] = i + "-" + palos[j];
			}
		}

		// Se generan las cartas J-Q-K
		String[] jqk = { "J", "Q", "K" };
		for (int j = 0; j < palos.length; j++) {
			for (int i = 0; i < 3; i++) {
				mazo[i + j * 13 + 10] = jqk[i] + "-" + palos[j];
			}
		}

		return mazo;
	}

	/**
	 * Devuelve un array con los valores de cada carta
	 */
	private static int[] generarCartasValor() {
		int[] mazo = new int[13 * 4];

		// Se generan los valores para las cartas desde 1 a 10
		for (int j = 0; j < 4; j++) {
			for (int i = 1; i <= 10; i++) {
				mazo[i + j * 13 - 1] = i;
			}
		}

		// Se generan los valores para las cartas J-Q-K
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 3; i++) {
				mazo[i + j * 13 + 10] = 10;
			}
		}

		return mazo;
	}

	/**
	 * Devuelve el indice de una carta que no fue usada al azar
	 */
	public static int cartaAlAzar(boolean[] cartas) {
		Random rnd = new Random();

		int cartaPosicion;
		do {
			cartaPosicion = rnd.nextInt(0, 52);
		} while (cartas[cartaPosicion]);

		return cartaPosicion;
	}

	public static void mostrarCarta(String nombreCarta, String titulo) {
		JOptionPane.showMessageDialog(null, nombreCarta, titulo, 
				JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/1-corazon.jpg"));

		System.out.println(titulo + "\t" + nombreCarta);
	}

	/**
	 * Genera un texto con los nombres de las cartas en la mano
	 */
	public static String generarManoTexto(String[] cartasNombre, int[] cartas) {
		String mano = "";
		int i = 0;
		do {
			mano += cartasNombre[cartas[i]] + ", ";
			i++;
		} while (cartas[i] != 0);

		return mano;
	}

	public static boolean preguntarOtraCarta(String cartasJugador, String cartaRepartidor) {
		
		String mensaje = "Las cartas del jugador son: " + cartasJugador + "\n";
		mensaje += "La carta del repartidor es: " + cartaRepartidor + "\n";
		mensaje += "Desea otra carta? (s/n)";

        int opcion = JOptionPane.showConfirmDialog(null, mensaje, "BlackJack", JOptionPane.YES_NO_OPTION);
        
		return opcion == JOptionPane.YES_OPTION;
	}

	
	public static void main(String[] args) {
		// Cada array tiene 52 posiciones, cada posicion es una carta
		/*
		 * Por ejemplo, la carta en la posicion 3 es el "4-corazon", su valor es 4 y no
		 * fue usada:
		 * 
		 * cartasNombre[3] --> "4-corazon"
		 * cartasValor[3]  --> 4
		 * cartasUsadas[3] --> false (No usada)
		 */
		String[] cartasNombre = generarCartasNombre();
		int[] cartasValor = generarCartasValor();
		boolean[] cartasUsadas = new boolean[52];

		int[] cartasJugador = new int[10];
		int cantidadCartasJugador = 0;

		int[] cartasRepartidor = new int[10];
		int cantidadCartasRepartidor = 0;

		// Se dan 2 cartas al jugador
		cartasJugador[cantidadCartasJugador++] = cartaAlAzar(cartasUsadas);
		cartasJugador[cantidadCartasJugador++] = cartaAlAzar(cartasUsadas);

		// El repartidor toma 2 cartas y muestra solo 1
		cartasRepartidor[cantidadCartasRepartidor++] = cartaAlAzar(cartasUsadas);
		cartasRepartidor[cantidadCartasRepartidor++] = cartaAlAzar(cartasUsadas);

		// Mostramos las cartas
		mostrarCarta(cartasNombre[cartasJugador[0]], "Carta del jugador");
		mostrarCarta(cartasNombre[cartasJugador[1]], "Carta del jugador");

		mostrarCarta(cartasNombre[cartasRepartidor[0]], "Carta del repartidor");
		
		// Turno del jugador: El jugador puede pedir mas cartas
		boolean pedirOtra;
		do {
			pedirOtra = preguntarOtraCarta(
					generarManoTexto(cartasNombre, cartasJugador),
					cartasNombre[cartasRepartidor[0]]);

			if (pedirOtra) {
				int nuevaCarta = cartaAlAzar(cartasUsadas);
				cartasJugador[cantidadCartasJugador++] = nuevaCarta;
				mostrarCarta(cartasNombre[nuevaCarta], "Carta del jugador");
			}

		} while (cantidadCartasJugador < 10 && pedirOtra);
		
		// Turno del repartidor
		
		
		
	}

}
