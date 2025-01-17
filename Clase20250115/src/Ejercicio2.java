/*
1.2.	Una persona compra una heladera de pesos X y por 
pagar en efectivo le hacen el 10% de descuento
 ¿Cuánto abona?
*/

// 1. Cuanto paga
// 2. Precio heladera: X, 10% descuento

// calcular el descuento
// importe es precio - el descuento

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Habilitar para leer valores desde teclado
        Scanner teclado = new Scanner(System.in);

        float precioHeladera;
        float descuento;
        float importePaga;

        precioHeladera = teclado.nextFloat();
        descuento = precioHeladera * 0.10f;

        // 0.10  --> double
        // 0.10f --> float
        importePaga = precioHeladera - descuento;
        System.out.println(importePaga);
        
    }
}
