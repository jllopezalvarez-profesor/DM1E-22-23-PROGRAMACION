package es.iesclaradelrey.dm1e2223.ut02.ejemplos.ejemplo01;

public class Programa2 {

	public static void main(String[] args) {
		// Creación de variables de tipos primitivos
		int numero;
		numero = 3;

		// Creación de objeto de tipo String.
		// El objeto String es un poco especial, porque es lo que se llama un objeto
		// inmutable. Veremos en la unidad 6 lo que son objetos inmutables.
		String cadena;
		cadena = "Hola";

		// Creación de objetos
		System.out.println("Antes de definir el coche");
		Coche coche1;
		System.out.println("Antes de crear el objeto");
		coche1 = new Coche(7); // ¿Cómo empiezo en velocidad 7?
		System.out.println("Dspues de crear el objeto");

		Coche coche2 = new Coche(100);
		
		

		coche2.acelerar(10);
		System.out.println("La velocidad del coche es " + coche2.getVelocidad());
		coche2.acelerar(20);
		System.out.println("La velocidad del coche es " + coche2.getVelocidad());
		coche2.decelerar(5);
		System.out.println("La velocidad del coche es " + coche2.getVelocidad());
		coche2.acelerar(10);
		System.out.println("La velocidad del coche es " + coche2.getVelocidad());
		coche2.parar();
		System.out.println("La velocidad del coche es " + coche2.getVelocidad());

	}

}
