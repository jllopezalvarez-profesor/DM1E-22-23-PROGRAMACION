package es.iesclaradelrey.dm1e2223.ut02.ejemplos;

public class Ejemplo10Constructores {
	// Dos formas de construir una cadena:
	// Declarándola y asignando un valor.
	String cadena1 = "Esto es una cadena";
	// Constructor que recibe otra cadena
	String cadena2 = new String(cadena1);
	
	// Tres formas de crear un StringBuilder (objeto para construir cadenas)
	// Por defecto
	StringBuilder sb1 = new StringBuilder();
	// Capacidad inicial para 100 caracteres
	StringBuilder sb2 = new StringBuilder(100);
	// Con un valor inicial, al que podremos añadir cosas.
	StringBuilder sb3 = new StringBuilder("Valor inicial");

}
