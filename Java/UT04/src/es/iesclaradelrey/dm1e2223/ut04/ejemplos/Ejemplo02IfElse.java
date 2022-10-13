package es.iesclaradelrey.dm1e2223.ut04.ejemplos;

import javax.swing.JOptionPane;

public class Ejemplo02IfElse {

	public static void main(String[] args) {
		// Ejemplo de uso de if, sin alternativa "else"
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Dime un número"));

		// Vamos a mostrar un mensaje si el número es negativo (<0), pero también en
		// caso contrario.
		// Siempre se ejecuta al menos una rama del if/else
		if (numero < 0) {
			System.out.println("El número introducido es negativo");
		} else {
			System.out.println("El número introducido es positivo o cero");
		}

		
		System.out.println("Fin del programa.");
	}

}
