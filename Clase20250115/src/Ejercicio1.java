import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
        1.1. Calcular el sueldo de una persona, conociendo 
        la cantidad de horas que trabaja en el mes y el valor 
        de la hora.
        */
        int cantidadHoras = 0;
        float valorHora = 0;
        float sueldo;

        // Habilitar para leer valores desde teclado
        Scanner teclado = new Scanner(System.in);

        // Lee un entero desde teclado
        System.out.print("Ingrese cantidad horas: ");
        cantidadHoras = teclado.nextInt();

        // Lee un numero real desde teclado
        System.out.print("Ingrese valor hora: ");
        valorHora = teclado.nextFloat();

        sueldo = cantidadHoras * valorHora;

        System.out.println(sueldo);
    }
}