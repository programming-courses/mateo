import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class imagen {

	public static void mostrarCarta(String nombreCarta) {
		JOptionPane.showMessageDialog(null, "Carta: " + nombreCarta, "Titulo", 
				JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/1-corazon.jpg"));
		
		
		
	}
	
	/**
	 * Devuelve un array con los nombres de cada carta
	 * @return
	 */
	public static String[] generarCartasNombre() {
		// Los nombres de las cartas, para agarrar los archivos de imagenes
		
		// 13 cartas en cada uno de los 4 palos: ♥️ (corazones), ♦️ (diamantes), ♣️ (tréboles) y ♠️ (picas).
		String[] mazo = new String[13*4];
		String[] palos = {"corazon", "diamante", "trebol", "pica" };
		
		// Se generan los primeros 10 numeros de las cartas, desde 1 a 10
		for(int j = 0; j < palos.length; j++) {
			for(int i = 1; i<=10; i++) {
				mazo[i + j * 13 - 1] = i + "-" + palos[j];
			}
		}
		
		// Se generan las cartas J-Q-K
		String[] jqk = { "J", "Q", "K" };
		for(int j = 0; j < palos.length; j++) {
			for(int i = 0; i<3; i++) {
				mazo[i + j * 13 + 10] = jqk[i] + "-" + palos[j];
			}
		}
		
		return mazo;
	}

	/**
	 * Devuelve un array con los valores de cada carta
	 * @return
	 */
	private static int[] generarCartasValor() {
		int[] mazo = new int[13*4];

		// Se generan los valores para las cartas desde 1 a 10
		for(int j = 0; j < 4; j++) {
			for(int i = 1; i<=10; i++) {
				mazo[i + j * 13 - 1] = i;
			}
		}
		
		// Se generan los valores para las cartas J-Q-K
		for(int j = 0; j < 4; j++) {
			for(int i = 0; i<3; i++) {
				mazo[i + j * 13 + 10] = 10;
			}
		}
		
		return mazo;
	}

	/**
	 * Devuelve el indice de una carta que no fue usada
	 */
	public static int cartaAlAzar(boolean[] cartas) {
		Random rnd = new Random();
		
		int cartaPosicion;
		do {
			cartaPosicion = rnd.nextInt(1, 50);
		} while(cartas[cartaPosicion]);
		
		return cartaPosicion;
	}
	
	public static void main(String[] args) {
		String[] cartasNombre = generarCartasNombre();
		int[] cartasValor = generarCartasValor();
		boolean[] cartasUsadas = new boolean[52];
			
		
	
		
		
		int cartaSeleccionada = cartaAlAzar(cartasUsadas);
		
		System.out.println("Carta: " + cartasNombre[cartaSeleccionada]);
		System.out.println("Valor: " + cartasValor[cartaSeleccionada]);

		
		
//		mostrarCarta("A Corazon");
		
	}

}
