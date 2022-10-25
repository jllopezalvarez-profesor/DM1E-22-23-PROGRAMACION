package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e05basicos3;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Haz un programa en Java que muestre si dos números son o no amigos.
 *         Los números se pedirán por teclado. Explicación: Se dice que dos
 *         números son amigos si la suma de los divisores del primero (excluido
 *         el propio número) es el segundo número y viceversa.
 * 
 *         Ej: Los números 220 y 284 son amigos
 * 
 *         <pre>
 *         - 220: 1+2+4+5+10+11+20+22+44+55+110 = 284
 *         - 284: 1+2+4+71+142 = 220
 *         </pre>
 */
public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		int primerNumero = Integer.parseInt(scanner.nextLine());

		System.out.print("Introduce el segundo número: ");
		int segundoNumero = Integer.parseInt(scanner.nextLine());

		System.out.println("\nProcesando primer número");
		int sumaDivisoresPrimerNumero = 0;
		for (int posibleDivisor = 1; posibleDivisor < primerNumero; posibleDivisor++) {
			if (primerNumero % posibleDivisor == 0) {
				System.out.println(posibleDivisor);
				sumaDivisoresPrimerNumero += posibleDivisor;
			}
		}

		System.out.println("\nProcesando segundo número");
		int sumaDivisoresSegundoNumero = 0;
		for (int posibleDivisor = 1; posibleDivisor < segundoNumero; posibleDivisor++) {
			if (segundoNumero % posibleDivisor == 0) {
				System.out.println(posibleDivisor);
				sumaDivisoresSegundoNumero += posibleDivisor;
			}
		}

		if ((sumaDivisoresPrimerNumero == segundoNumero) && (sumaDivisoresSegundoNumero == primerNumero)) {
			System.out.printf("Los números %d y %d son amigos.\n", primerNumero, segundoNumero);
		} else {
			System.out.printf("Los números %d y %d NO son amigos.\n", primerNumero, segundoNumero);
		}

		scanner.close();
	}

}
