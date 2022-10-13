package es.iesclaradelrey.dm1e2223.ut04.ejemplos;

import javax.swing.JOptionPane;

public class Ejemplo01If {

	public static void main(String[] args) {
		// Ejemplo de uso de if, sin alternativa "else"
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Dime un número"));

		// Sólo vamos a mostrar un mensaje si el número es negativo (<0)
		if (numero < 0) {
			System.out.println("El número introducido es negativo");
		}

		// Si se ha introducido un número >= 0 no se hace nada, se continúa con la
		// primera sentencia despues del cierre del if
		System.out.println("Fin del programa.");
	}

}
