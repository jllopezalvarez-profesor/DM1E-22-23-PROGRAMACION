package es.iesclaradelrey.dm1e2223.ut02.ejercicios.metodos;

public class Ejercicio2 {

	public static void main(String[] args) {
//	    • Crea un String “cadenaLarga” y asígnale el valor que quieras, pero que sea una oración con varias palabras, y algunas estén repetidas.
//	    • Crea un String “palabra” con un valor inicial igual a una de las palabras que aparecían repetidas en la primera cadena.
//	    • Usa el método indexOf de String para buscar la posición de la primera aparición de “palabra” dentro de “cadenaLarga”.
//	    • Busca en la API de Java qué método podemos usar para buscar la posición de la última aparición de “palabra” en “cadenaLarga”. Úsalo para buscar esa posición y muéstrala en consola.
//	    • Busca en cadenaLarga la primera (o última, lo que prefieras) aparición de una cadena que no aparezca en “cadenaLarga”. Observa lo que devuelve el método y comprueba lo que significa en la API de Java, mirando la referencia del método utilizado.

		String cadenaLarga = "Esto es una oración en la que tengo que poner alguna palabra repetida. No sé si he puesto muchas palabras repetidas en esta oración larga.";
		String palabra = "oración";
		int posicion = cadenaLarga.indexOf(palabra);
		System.out.println("Encontrado en la posición " + posicion + " desde el principio.");
		posicion = cadenaLarga.lastIndexOf(palabra);
		System.out.println("Encontrado en la posición " + posicion + " desde el final.");

		palabra = "palabra";
		posicion = cadenaLarga.indexOf(palabra);
		System.out.println("Encontrado en la posición " + posicion + " desde el principio.");
		posicion = cadenaLarga.lastIndexOf(palabra);
		System.out.println("Encontrado en la posición " + posicion + " desde el final.");

		palabra = "ornitorrinco";
		posicion = cadenaLarga.indexOf(palabra);
		System.out.println("Encontrado en la posición " + posicion + " desde el principio.");
		posicion = cadenaLarga.lastIndexOf(palabra);
		System.out.println("Encontrado en la posición " + posicion + " desde el final.");

		
	}

}
