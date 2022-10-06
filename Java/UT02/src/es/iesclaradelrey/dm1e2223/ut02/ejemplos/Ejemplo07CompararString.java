package es.iesclaradelrey.dm1e2223.ut02.ejemplos;

public class Ejemplo07CompararString {

	public static void main(String[] args) {
		String cadenaA = "HOLA";
		String cadenaB = "HOLA";

		// Esto devuelve true porque las cadenas son "constantes", son literales en el
		// programa.
		System.out.println("Si comparamos literales (cadenaA == cadenaB) devuelve: " + (cadenaA == cadenaB));

		String cadenaAA = new String("HOLA");
		String cadenaBB = new String("HOLA");
		// Esto devuelve false porque ya no son constantes, son objetos, y los objetos
		// no se pueden comparar con ==
		System.out.println("Si comparamos objetos con == (cadenaAA == cadenaBB) devuelve: " + (cadenaAA == cadenaBB));
		
		// Pero si usamos el método equals, ya sí funciona:
		System.out.println("Si comparamos objetos con equals (cadenaAA.equals(cadenaBB)) devuelve: " + cadenaA.equals(cadenaB));
		
		// Para cadenas, hay una versión de equals que ignora mayúsculas y minúsculas 
		cadenaA.equalsIgnoreCase(cadenaB);

	

	}

}
