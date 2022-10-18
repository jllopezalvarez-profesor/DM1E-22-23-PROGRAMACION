package es.iesclaradelrey.dm1e2223.ut04.ejercicios01condicionalespseint;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Escribe un programa que pida un nombre de usuario y una contraseña y
 *         si se ha introducido “pepe” y “asdasd” se indica “Has entrado al
 *         sistema”, si no, se da un error.
 */
public class Ejercicio05 {

	// Constantes para el usuario y la contraseña correctos
	private static final String USUARIO_CORRECTO = "pepe";
	private static final String CONTRASENIA_CORRECTA = "asdasd";

	public static void main(String[] args) {
		// Creamos el scanner para leer datos
		Scanner scanner = new Scanner(System.in);

		// Pedimos el nombre de usuario
		System.out.println("Por favor, introduce tu nombre de usuario.");
		String usuario = scanner.nextLine();

		// Pedimos la contraseña
		System.out.println("Por favor, introduce tu contraseña.");
		String contrasenia = scanner.nextLine();

		// Para compara Strign tenemos que usar equals, no ==
		// == no funciona con objetos (instancias de clase), y String es una clase
		// Hacemos una condición doble, para el usuario y la contraseña
		if (usuario.equals(USUARIO_CORRECTO) && contrasenia.equals(CONTRASENIA_CORRECTA)) {
			System.out.println("Acceso denegado");
		} else {
			System.out.println("Has entrado en el sistema");
		}

		// Cerramos el scanner
		scanner.close();
	}

}
