import java.util.Scanner;

public class Ejercicio1 {

/*
 * 1)	En una universidad se hará un relevamiento entre una cantidad no determinada de alumnos.
		Se desea obtener
		a) porcentaje de la población femenina
		b) porcentaje población masculina
		c) mejor promedio cuatrimestral de la población femenina		(Buscar maximo)
		d) mejor promedio cuatrimestral de la población  masculina
		Los datos que se ingresan son: sexo, promedio, matricula. Para indicar el fin se ingresa un 0 como matricula
		
		
Observaciones:
- Se pide varias veces datos.
- No sé cuantos datos son.			----->   while
- Pregunto si son M o F
- Contar cuantos responden M
- Contar cuantos responden F
- Ir guardando el maximo para F
- Ir guardando el maximo para M
- La condicion de corte o fin del while es que se ingrese 0 en matricula, o sea mientras NO sea cero

Notas:
- Promedio es la suma de valores, divido cuantos valores son.  4, 6, 2, la suma es 12, son 3 valores, el promedio es 12/3=4

- Maximos/Minimos
	Vamos viendo los valores, y cada valor que "Veo" lo comparado con el que estoy considerando como maximo o minimo.
 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String sexo;
		float promedio;
		int matricula;
		int cantidadMasculino = 0;  // Contadores
		int cantidadFemenino = 0;
		float maximoPromedioMasc = 0;
		float maximoPromedioFem = 0;

		//1. pedir datos que entran en la condicion del while.
		System.out.println("Ingrese matricula:");
		matricula = teclado.nextInt();
		
		while (matricula != 0) {
			//3. pedir los otros datos.
			
			do {
				System.out.println("Ingrese sexo (f/m):");
				sexo = teclado.next();
			} while ( ! (sexo.equals("f") || sexo.equals("m")) );  // NO sea lo que quiero
			
			//} while ( !sexo.equals("f") && !sexo.equals("m"));  // Es la misma expresion logica reescrita
			
			System.out.println("Ingrese promedio:");  // TODO: Agregar validacion (entre 0 y 10)
			promedio = teclado.nextFloat();
			
			//4. Hago cuentas, procesamiento, etc
			if (sexo.equals("f")) {
				cantidadFemenino++;
				
				if (promedio > maximoPromedioFem) {
					maximoPromedioFem = promedio;
				}
			}
			if (sexo.equals("m")) {
				cantidadMasculino++;

				if (promedio > maximoPromedioMasc) {
					maximoPromedioMasc = promedio;
				}
			}
			
			//5. pedir datos que entran en la condicion del while.
			System.out.println("Ingrese matricula:"); // TODO: Agregar validacion (entre 0 y 100000)
			matricula = teclado.nextInt();
		}
		
//		a) porcentaje de la población femenina
//		b) porcentaje población masculina
		System.out.println("Cantidad Femeninos: " + cantidadFemenino);
		System.out.println("Cantidad Masculinos: " + cantidadMasculino);
		
		int total = cantidadFemenino + cantidadMasculino;
		System.out.println("Porcentaje Femeninos: " + (cantidadFemenino * 100 / total) + "%");
		System.out.println("Porcentaje Masculinos: " + (cantidadMasculino * 100 / total) + "%");
		
		System.out.println("El mejor promedio femenino: " + maximoPromedioFem);
		System.out.println("El mejor promedio masculino: " + maximoPromedioMasc);

/*
Cargar datos con while, la estructura sera:

1. pedir datos que entran en la condicion del while.
2. while (expresion logica)
3. pedir los otros datos.
4. Hago cuentas, procesamiento, etc
5. pedir datos que entran en la condicion del while.

		
		
while: el cuerpo podria no ejecutarse nunca

do...while: el cuerpo SIEMPRE se ejecuta al menos UNA vez


*/
	}

}
