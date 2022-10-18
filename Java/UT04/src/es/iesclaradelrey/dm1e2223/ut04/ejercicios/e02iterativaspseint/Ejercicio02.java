package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e02iterativaspseint;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Creamos Scanner para pedir datos al usuario
		Scanner scanner = new Scanner(System.in);

		// Obtenemos un número aleatorio. Usamos la clase Random
		Random rnd = new Random();
		
		// Obtenemos un número entre 0 y 99 (nextInt no devuelve nunca el límite)
		// Sumamos 1 para que el número sea entre 1 y 100 ambos inclusive
		int numeroSecreto = rnd.nextInt(100) + 1;
		
		// Número de intentos restantes. Inicialmente son 9, si excluimos el primero.
		int intentosRestantes = 9;
		
		// Pedimos el número al usuario
		System.out.print("Introduce un número entre 1 y 100 (incluidos): ");
		int numero = Integer.parseInt(scanner.nextLine());
		
		// 
		while((numero != numeroSecreto) && (intentosRestantes > 0)) {
			// Mostramos un mensaje para indicar si el número es mayot o menor que el número secreto
			if (numero > numeroSecreto) {
				System.out.println("El número que has escrito es mayor que el número secreto.");
			}else {
				System.out.println("El número que has escrito es menor que el número secreto.");
			}
			// Volvemos a pedir el número indicando intentos
			System.out.printf("Te quedan %d intentos. Introduce un número entre 1 y 100 (incluidos): ", intentosRestantes);
			numero = Integer.parseInt(scanner.nextLine());
			
			// Reducimos el número de intentos restantes
			intentosRestantes--;
		}
		
		// Al salir, puede haber sido porque:
		// - Se han agotado los intentos
		// - Se ha acertado el número
		// - Las dos cosas: se ha acertado el número en el último intento.
		// Comprobamos si se ha acertado para mostrar un mensaje u otro
		if (numero == numeroSecreto) {
			System.out.printf("Correcto, el número secreto era %d\n", numeroSecreto);
		}else {
			System.out.printf("Has agotado los intentos. El número secreto era %d\n", numeroSecreto);
		}

		// Cerramos Scanner
		scanner.close();
	}

}
