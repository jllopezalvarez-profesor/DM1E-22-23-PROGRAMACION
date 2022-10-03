package es.iesclaradelrey.dm1e2223.ut03.ejemplos;

public class Ejemplo05Escape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Problema:
		//String cadena = "Voy a poner algo entgre comillas: "Hola"";
		// Solución 1: copmillas simples
		String cadena2 = "Voy a poner algo entre comillas: 'Hola'";
		// Solución 2: escapado
		String cadena3 = "Voy a poner algo \n\tentre comillas: \"Hola\"";
		
		System.out.println(cadena2);
		System.out.println(cadena3);
		
		
		
	}

}
