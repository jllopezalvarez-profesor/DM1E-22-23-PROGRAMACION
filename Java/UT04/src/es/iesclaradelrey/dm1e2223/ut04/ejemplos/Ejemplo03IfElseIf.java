package es.iesclaradelrey.dm1e2223.ut04.ejemplos;

import javax.swing.JOptionPane;

public class Ejemplo03IfElseIf {

	public static void main(String[] args) {
		// Ejemplo de uso de if, sin alternativa "else"
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Dime un número"));

		// Vamos a mostrar un mensaje distinto para cada caso:
		// Si el número es negativo (<0)
		// Si es positivo (>0)
		// En último caso (==0)
		if (numero < 0) {
			System.out.println("El número introducido es negativo");
		} else if (numero > 0) {
			System.out.println("El número introducido es positivo");
		} else {
			System.out.println("El número introducido es cero");
		}

		System.out.println("Fin del programa.");
	}

}
