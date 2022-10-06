package es.iesclaradelrey.dm1e2223.ut02.ejemplos.ejemplo01;

public class Programa {

	public static void main(String[] args) {
		// Declaramos la variable de tipo "Bicicleta".
		// Bicicleta es un tipo de objeto.
		// Igual que en el caso de los tipos primitivos (int, double, char, etc.), se
		// pone primero el nombre del tipo y luego la variable
		Bicicleta bicicleta01;

		// Hasta que creemos la bicicleta, la variable bicicleta1 no tiene valor, es una
		// referencia nula (null)

		// Para crear la bicicleta, se usa la palabra reservada "new"
		bicicleta01 = new Bicicleta();

		// Una vez creada la bicicleta, podríamos operar con ella, pero esta versión de
		// la clase no tiene nada con lo que podamos trabajar, ni estado ni
		// comportamiento
		
		// También se puede declarar e instanciar en una misma línea:
		Bicicleta bicicleta02 = new Bicicleta(); 
	}
}
